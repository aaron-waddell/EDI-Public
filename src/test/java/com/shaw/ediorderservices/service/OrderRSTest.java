package com.shaw.ediorderservices.service;

import static com.shaw.ediorderservices.gson.MyGson.gson;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.google.common.collect.Lists;
import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.service.order.OrderService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@AutoConfigureMockMvc
class OrderRSTest extends MockTest {

	@Autowired
    private MockMvc mockMvc;

	

    @MockBean
    @Qualifier("samplesOrderService")
    private OrderService orderService;
	
	@BeforeAll
	void setup() {
		when(orderService.findById(any(long.class))).thenReturn(samplesEdiOrder);
		when(orderService.findAll()).thenReturn(Lists.newArrayList(samplesEdiOrder));
	}
	
	@Test
	void testPlace() throws Exception {
        String json = gson.toJson(samplesEdiOrder);
		this.mockMvc.perform(post("/orders")
        		.contentType(MediaType.APPLICATION_JSON)
        		.content(json))
        		.andExpect(status().isCreated());
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
//                .andExpect(jsonPath("$['custCode']").value("AA"));
		verify(orderService).place();
	}

	@Test
	void testGetAll() throws Exception {
        this.mockMvc.perform(get("/orders"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
        }

	@Test
	void testGetRequestOrder() throws Exception {
        this.mockMvc.perform(get("/orders/10"))
//        		.param("id", "10"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
//                .andExpect(jsonPath("$[0].custCode").value("HD"));
//                .andExpect(content().json("[]"));
	}

}