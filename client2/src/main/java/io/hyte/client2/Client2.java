package io.hyte.client2;

import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.hyte.api.Service;

public class Client2 {

	private static final Logger logger = LoggerFactory.getLogger(Client2.class);
	private Service service;
	
	public Client2() { 
		logger.info("Client 2 intialized");
	}
	
	@Reference
	public void setService(Service service) {
		this.service = service;
		logger.info("Client 2 referefenced to service {} number {}", this.service.getName(), this.service.getNumber()); 
	}
}