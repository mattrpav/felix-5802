package io.hyte.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.hyte.api.Service;

public class ComponentService implements Service {

	@Override
	public int getNumber() {
		return Integer.valueOf(44);
	}

	private static final Logger logger = LoggerFactory.getLogger(ComponentService.class);
	
	public ComponentService() { 
		logger.info("ComponentService intialized {} {}", getName(), getNumber());
	}

}