package io.hyte.client1;

import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.hyte.api.Service;

public class Client1 {

	private static final Logger logger = LoggerFactory.getLogger(Client1.class);
	private Service service;
	
	public Client1() { 
		logger.info("Client 1 intialized");
	}
	
	@Reference
	public void setService(Service service) {
		this.service = service;
		logger.info("Client 1 referefenced to service {} number {}", this.service.getName(), this.service.getNumber()); 
	}
}