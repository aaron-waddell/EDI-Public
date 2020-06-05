package com.shaw.ediorderservices.service.legacy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Qualifier("hardsurfacesLegacyService")
@Primary
public class HardsurfacesLegacyService extends LegacyService {

}
