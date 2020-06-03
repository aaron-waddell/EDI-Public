	package com.shaw.ediorderservices.service;

import static com.shaw.ediorderservices.gson.myGson.gson;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.google.common.base.Preconditions;
import com.google.gson.JsonSyntaxException;
import com.shaw.ediorderservices.enums.OrderType;
import com.shaw.ediorderservices.exception.ResourceNotFoundException;
import com.shaw.ediorderservices.factory.EdiOrderFactory;
import com.shaw.ediorderservices.factory.OrderServiceFactory;
import com.shaw.ediorderservices.mapping.OrderMapper;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.util.RestPreconditions;

@RestController
@RequestMapping(value = "/orders")
public class OrderRS {


	@Autowired
	EdiOrderBean ediOrderBean;
	
	@Autowired
	OrderServiceFactory orderServiceFactory;

	@Autowired
	ILegacyOrderService legacyService;

	@Autowired
	EdiOrderFactory ediOrderFactory;

	@Autowired
	OrderMapper mapper;

	public OrderRS() {
		super();
	}

//	@PostMapping("/create")
//	@ResponseStatus(HttpStatus.CREATED)
//	public @ResponseBody RequestOrder create(@RequestBody RequestOrder request, final HttpServletResponse response)
//	{
////		Preconditions.checkNotNull(order);
//		final RequestOrder order = requestService.create(request);
//		
//		return order;
//	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody String place(@RequestBody String request, final HttpServletResponse response)
	{
//		ObjectMapper om = new ObjectMapper();
		EdiOrder ediOrder = null;
		try {
			ediOrder = gson.fromJson(request, EdiOrder.class);
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Problem processing input",e);
		}
		ediOrderBean.setEdiOrder(ediOrder);
		OrderService orderService = orderServiceFactory.getInstance(ediOrder.getOrderType());
//		Preconditions.checkNotNull(order);
		orderService.place();
		
		return gson.toJson(ediOrderBean.getEdiOrder());
	}

	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody String submit(@PathVariable long id)
	{
		legacyService.getOrder(id);
		OrderService orderService = orderServiceFactory.getInstance(ediOrderBean.getEdiOrder().getOrderType());
		Preconditions.checkNotNull(ediOrderBean.getEdiOrder());
		orderService.place();
		
		return gson.toJson(ediOrderBean.getEdiOrder());
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getAll()
	{
		OrderService orderService = orderServiceFactory.getInstance(OrderType.SAMPLES.toString());
        return gson.toJson(orderService.findAll());		
	}
	
	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getEdiOrder(@PathVariable long id)
	{
		OrderService orderService = orderServiceFactory.getInstance(OrderType.SAMPLES.toString());
        try {
            final EdiOrder resourceById = RestPreconditions.checkFound(orderService.findById(id));

            return gson.toJson(resourceById);
        }
        catch (ResourceNotFoundException exc) {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Order Request Not Found", exc);
        }

	}
	
}
