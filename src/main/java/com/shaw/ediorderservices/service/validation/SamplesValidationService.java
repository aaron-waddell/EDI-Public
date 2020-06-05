package com.shaw.ediorderservices.service.validation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.exception.ResourceNotFoundException;
import com.shaw.ediorderservices.mapping.ValidationMapper;
import com.shaw.ediorderservices.persistance.db2.dao.EdiCustCodeRepository;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrderHeaderRepository;
import com.shaw.ediorderservices.persistance.db2.dao.SamplesInfoRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiCustCode;
import com.shaw.ediorderservices.persistance.db2.entity.EdiCustCode.EdiCustCodePK;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.service.legacy.ILegacyService;

@Service
@Qualifier("samplesValidationService")
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class SamplesValidationService extends ValidationService {

	@Autowired
	ValidationMapper mapper;
	
	@Autowired
	EdiOrderHeaderRepository ediOrderHeaderRepository;

	@Autowired
	EdiCustCodeRepository ediCustCodeRepository;

	@Autowired
	SamplesInfoRepository samplesInfoRepository;

	@Override
	public void validate() {
		logger.info("validate samples order");
		EdiOrder ediOrder = ediOrderBean.getEdiOrder();
		if (ediOrder.getOrderType().equals(OrderType.SAMPLES.toString())==false)
			//TODO add validation to order
			throw new ResourceNotFoundException("Invalid Order Type: " + ediOrder.getOrderType());

		long legacyId = ediOrder.getLegacyOrderNumber();
//		EdiOrderHeader header = this.getLegacyOrderHeader();
		EdiCustCode ediCustCode = ediCustCodeRepository.findById(new EdiCustCodePK(ediOrder.getCustomerCode()
				,ediOrder.getOrderingSystem())).orElse(null);
		List<EdiOrdValidation> validations = new ArrayList<EdiOrdValidation>();
//		db2Service.updateValidationStatus("R",ediOrderNbr );
		
		validations.addAll(processSystemRules(systemRules));
		validations.addAll(processHeaderRules(headerRules));
		validations.addAll(processLineRules(lineRules));
		
		EdiValidation v = null;
		if (validations.isEmpty()==false)
		{
			validations.parallelStream()
				.sorted(EdiOrdValidation.comparator)
				.map(mapper::legacyToValidation).forEach(ediOrder::addValidation);
//			v = validations.parallelStream().sorted(EdiOrdValidation.comparator).findFirst().orElse(null);

			String agent = ediCustCode.getCustomerNumber().equals(ediOrder.getCustomerNumber())
					|| ediCustCode.getCustomerNumber().equals(ediOrder.getCommCust())
					?ediCustCode.getDefAgent():"";
			v = ediOrder.getValidations().get(0);
			v.setAssignedTo(agent);
			ediOrderHeaderRepository.updateAgent(legacyId,v.getActionCode(),v.getDescription(), agent );
		}
		else
			ediOrder.addValidation(new EdiValidation("ACCEPTED","ACCEPTED"));
	}

	@Override
	public EdiOrdValidation processSystemRule( EdiReasonCode rule) {
		EdiOrder ediOrder = ediOrderBean.getEdiOrder();
		if (rule.getDescription().equals("CUST CODE OR OS INVALID"))
		{
			if (ediCustCodeRepository.findById(new EdiCustCodePK(ediOrder.getCustomerCode()
														,ediOrder.getOrderingSystem()))==null)
				return new EdiOrdValidation(ediOrder.getLegacyOrderNumber(),rule);			
		}
		if (rule.getDescription().equals("CUST NUMBER INVALID"))
		{
			if (ediOrder.getCustomerNumber().length()==0)
				return new EdiOrdValidation(ediOrder.getLegacyOrderNumber(),rule);
		}
		return null;  //no exception
	}

	@Override
	public EdiOrdValidation processHeaderRule( EdiReasonCode rule) {
		// TODO Auto-generated method stub
		EdiOrder ediOrder = ediOrderBean.getEdiOrder();
		if (rule.getDescription().equals("MISSING ADDRESS"))
		{
			if (ediOrder.getShipToAddress().getAddressLine1().length()==0
				|| ediOrder.getShipToAddress().getCity().length()==0
				|| ediOrder.getShipToAddress().getZip().length()==0)
				return new EdiOrdValidation(ediOrder.getLegacyOrderNumber(),rule);			
		}
		if (rule.getDescription().equals("INVALID CARRIER"))
		{
			if (ediOrder.getCarrierCode().length()==0)
				return new EdiOrdValidation(ediOrder.getLegacyOrderNumber(),rule);
		}
		return null;  //no exception

//		    WHILE v_endofcursor = 'N' DO
//
//		        IF v_action_code = '' THEN
//		            SET v_action_code = 'R';
//		        END IF;
//
//		        IF v_ret_code IN ('R','E') THEN
//		            SET out_ret_code = v_ret_code;
//		            SET out_ret_desc = v_reason_desc;
//		            IF v_endofcursor = 'N' THEN
//		              SET v_endofcursor = 'Y';
//		              CLOSE c_getorderrules;
//		            END IF;
//		        ELSEIF v_ret_code = 'Z' THEN
//		            SET out_ret_code = v_ret_code;
//		            SET out_ret_desc = v_reason_desc;
//		        ELSEIF v_ret_code = 'A' AND out_ret_code <> 'Z' THEN
//		            SET out_ret_code = v_ret_code;
//		            SET out_ret_desc = v_reason_desc;
//		        END IF;
//
//		    END WHILE;
	}

	@Override
	public EdiOrdValidation processLine(EdiLine ediLine, EdiReasonCode rule, String commCust) {
			// TODO Auto-generated method stub
			if (rule.getDescription().equals("INVALID VENDOR ITEM OR COLOR CODE"))
			{
				if (isValidSKU(ediLine, commCust))
					return new EdiOrdValidation(ediLine.getEdiOrder().getLegacyOrderNumber(),rule);
			}
			return null;  //no exception
		}

	boolean isValidSKU(EdiLine ediLine, String commCust) {
		List<String> customers = samplesInfoRepository.checkValidSKU(ediLine.getStyle()
				, ediLine.getColor()
				, ediLine.getEdiOrder().getCustomerCode()
				, ediLine.getEdiOrder().getOrderingSystem());
//					, line.getCommCust(), line.getCustNbr());
		return customers.contains(commCust)
				|| customers.contains(ediLine.getEdiOrder().getCustomerNumber())
				|| customers.contains("");
	}

}
