package com.shaw.ediorderservices.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.shaw.ediorderservices.mapping.ValidationMapper;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrdValidationRepository;
import com.shaw.ediorderservices.persistance.db2.dao.EdiReasonCodeRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;
import com.shaw.ediorderservices.service.common.AbstractService;
import com.shaw.ediorderservices.service.impl.LegacyService;

@Service
public abstract class ValidationService extends AbstractService<EdiValidation> implements IValidationService {

	@Override
	protected PagingAndSortingRepository<EdiValidation, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

    public static List<EdiReasonCode> systemRules;
    public static List<EdiReasonCode> headerRules;
    public static List<EdiReasonCode> lineRules;


	private static final String ErrorCodeRegEx = "out_err\\w+_c\\w*d\\w*";

	@Autowired
	protected EdiOrderBean ediOrderBean;

	@Autowired
	EdiReasonCodeRepository ediReasonCodeRepository;

	@Autowired
	private EdiOrdValidationRepository ediOrdValidationRepository;

	@Autowired
	LegacyService legacyService;

	@Autowired
	ValidationMapper mapper;

	@PostConstruct
    public void init(){
		logger.info("loading rules...");
		loadRules();
	}

	private void loadRules() {
		List<EdiReasonCode> rules = ediReasonCodeRepository.findAll();
		systemRules = rules.stream().filter(r->r.getLevel().equals("S")).collect(Collectors.toList());
		headerRules = rules.stream().filter(r->r.getLevel().equals("S")).collect(Collectors.toList());
		lineRules = rules.stream().filter(r->r.getLevel().equals("S")).collect(Collectors.toList());
	}

	@Override
	public void fillPreorder()
	{
		logger.info("calling 98...");
		long ediOrderNbr = ediOrderBean.getEdiOrder().getLegacyOrderNumber();
//TODO uncomment 
		Map<String, String> outMap = ediOrdValidationRepository.preorderUpdate(ediOrderNbr );
		logger.info(outMap.toString());
		String errorCode = regExGet(outMap,ErrorCodeRegEx);
		if (errorCode.equals("E"))
			throw new RuntimeException("Preorder update failed: " + outMap.get("out_error_msg"));
		legacyService.getOrder(ediOrderNbr);
		
	}

	public void validate()
	{
		logger.info("calling 94...");
		long legacyId = ediOrderBean.getEdiOrder().getLegacyOrderNumber();
		Map<String, String> outMap = ediOrdValidationRepository.validateEdiOrder(legacyId , "1");		

		logger.info(outMap.toString());
		String errorCode = regExGet(outMap,ErrorCodeRegEx);
		if (errorCode.equals("E"))
			throw new RuntimeException("Preorder update failed: " + outMap.get("out_error_msg"));
		//TODO add validations to EdiOrder
		legacyService.getOrder(legacyId);
		legacyService.convertLegacyOrder();
	};

	private String regExGet(Map<String, String> outMap, String regex) {
		return outMap.entrySet().parallelStream().filter(e->e.getKey().matches(regex)).map(Entry::getValue).findFirst().orElse("");
	}

	public Stream<EdiOrdValidation> processLineRule( EdiReasonCode rule) {
		// TODO Auto-generated method stub
		
		return ediOrderBean.getEdiOrder().getLines().stream().map(l->processLine(l,rule,ediOrderBean.getEdiOrder().getCommCust()));
	}

	public abstract EdiOrdValidation processLine(EdiLine l, EdiReasonCode rule, String commCust);

}
