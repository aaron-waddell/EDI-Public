package com.shaw.ediorderservices.service.shipInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.csws.OrderHeader;
import com.shaw.ediorderservices.mapping.ShipInfoMapper;
import com.shaw.ediorderservices.persistance.db2.dao.EdiShipInfoRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
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

	@Override
	public void createShipInfo() {
		EdiOrderHeader header = ediOrderBean.getLegacyHeader();
		OrderHeader shawHeader = cswsService.getOrderView(header.getShawOrderNumber());
		EdiShipInfo ediShipInfo = mapper.EdiOrderHeaderToShipInfo(header);
		ediShipInfo.setCarrCode(carrCode);
		ediShipInfoRepository.save(ediShipInfo);

	}

	@Override
	protected PagingAndSortingRepository<EdiShipInfo, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
