package com.shaw.ediorderservices.service.shipInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.csws.OrderHeader;
import com.shaw.ediorderservices.mapping.ShipInfoMapper;
import com.shaw.ediorderservices.persistance.db2.dao.EdiShipInfoRepository;
import com.shaw.ediorderservices.persistance.db2.dao.EdiSplStoreXrefRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiSplStoreXref;
import com.shaw.ediorderservices.persistance.sqlserver.entity.address.ShipToAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.service.EdiOrderBean;
import com.shaw.ediorderservices.service.common.AbstractService;
import com.shaw.ediorderservices.service.csws.CSWSService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ShipInfoService extends AbstractService<EdiShipInfo> implements IShipInfoService {

	@Autowired
	EdiShipInfoRepository ediShipInfoRepository;

	@Autowired
	CSWSService cswsService;

	@Autowired
	ShipInfoMapper mapper;
	
	@Autowired
	EdiOrderBean ediOrderBean;
	
	@Autowired
	EdiSplStoreXrefRepository ediSplStoreXrefRepository;

	@Override
	public void createShipInfo() {
		EdiOrderHeader header = ediOrderBean.getLegacyHeader();
		OrderHeader shawHeader = cswsService.getOrderView(header.getShawOrderNumber());
		HashMap<String, String> splMap = getSplValues();
		EdiShipInfo ediShipInfo = mapper.EdiOrderHeaderToShipInfo(header);
		ediShipInfo.setSplBillToStore(splMap.get("splBillToStore"));
		ediShipInfo.setSplShipToStore(splMap.get("splShipToStore"));
		ediShipInfo.setSplXdockCenter(splMap.get("splXdockCenter"));
		ediShipInfo.setCarrCode(shawHeader.getCarrierCode());
		ediShipInfoRepository.save(ediShipInfo);

	}

	public HashMap<String,String> getSplValues() {
		EdiOrder ediOrder = ediOrderBean.getEdiOrder();
		EdiOrderHeader ediHeader = ediOrderBean.getLegacyHeader();

		List<EdiSplStoreXref> xrefs = ediSplStoreXrefRepository.findByIdCustCodeAndIdOrderingSys(ediOrder.getCustomerCode(), ediOrder.getOrderingSystem());
		Map<String, String> custStoreNbrs = xrefs.parallelStream()
				.collect(Collectors.toMap(x->(String)(x.getId().getCustStoreNbr().trim())
													, EdiSplStoreXref::getShawStoreNbr));
		String splShipToStore = "";
		String splXdockCenter = "";

		String splBillToStore = custStoreNbrs.get(ediHeader.getBillToStore());
		
		ShipToAddress shipToAddress = ediOrder.getShipToAddress();
		if (ediHeader.getCrossDockCenter().length()==0)
			if (shipToAddress.getAddressLine1().length()==0)
				splShipToStore = custStoreNbrs.get(ediHeader.getBillToStore());
			else
				splShipToStore = custStoreNbrs.get(ediHeader.getShipToAddress().getStore());				
		else
			if (shipToAddress.getAddressLine1().length()==0)
				splXdockCenter = custStoreNbrs.get(ediHeader.getBillToStore());
			else
				splXdockCenter = custStoreNbrs.get(ediHeader.getShipToAddress().getStore());				

		HashMap<String, String> map = new HashMap<>();
		map.put("splBillToStore",splBillToStore);
		map.put("splShipToStore",splShipToStore);
		map.put("splXdockCenter",splXdockCenter);
		return map;
	}

	@Override
	protected PagingAndSortingRepository<EdiShipInfo, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
