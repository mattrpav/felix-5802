package io.hyte.service;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.hyte.api.Service;

public class ComponentService implements Service {

	private static final Logger logger = LoggerFactory.getLogger(ComponentService.class);
	private String myName = UUID.randomUUID().toString();
	
	public ComponentService() {
		logger.info("ComponentService intialized {} {}", myName, getNumber());
	}

	@Override
	public String getName() {
		return getClass().getName() + "--" + myName;
	}

	@Override
	public int getNumber() {
		return Integer.valueOf(44);
	}
}