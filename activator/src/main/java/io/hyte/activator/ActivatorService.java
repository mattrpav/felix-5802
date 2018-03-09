package io.hyte.activator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.hyte.api.Service;

public class ActivatorService implements Service {

	@Override
	public int getNumber() {
		return Integer.valueOf(33);
	}

	private static final Logger logger = LoggerFactory.getLogger(ActivatorService.class);
	
	public ActivatorService() { 
		logger.info("ActivatorService intialized {} {}", getName(), getNumber());
	}

}