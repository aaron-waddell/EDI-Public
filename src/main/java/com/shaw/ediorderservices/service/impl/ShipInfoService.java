package com.shaw.ediorderservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.shaw.ediorderservices.mapping.ShipInfoMapper;
import com.shaw.ediorderservices.persistance.db2.dao.EdiShipInfoRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.service.EdiOrderBean;
import com.shaw.ediorderservices.service.IShipInfoService;
import com.shaw.ediorderservices.service.common.AbstractService;

public class ShipInfoService extends AbstractService<EdiShipInfo> implements IShipInfoService {

	@Autowired
	EdiShipInfoRepository ediShipInfoRepository;

	@Autowired
	ShipInfoMapper shipInfoMapper;
	
	@Autowired
	EdiOrderBean ediOrderBean;

	@Override
	public void createShipInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	protected PagingAndSortingRepository<EdiShipInfo, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
