package com.shaw.ediorderservices.service.csws;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.csws.Cart;
import com.shaw.ediorderservices.csws.CartRequest;

@Service
@Transactional
@Qualifier("cswsHardsurfacesService")
public class CSWSHardsurfacesService extends CSWSService {

	public CSWSHardsurfacesService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Cart createCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected CartRequest createCartRequest() {
		// TODO Auto-generated method stub
		return null;
	}

}
