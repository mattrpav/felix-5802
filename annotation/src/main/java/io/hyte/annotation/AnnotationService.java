package io.hyte.annotation;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.hyte.api.Service;

@Component(name="AnnotationService", scope=ServiceScope.SINGLETON)
public class AnnotationService implements Service {

	@Override
	public int getNumber() {
		return Integer.valueOf(22);
	}

	private static final Logger logger = LoggerFactory.getLogger(AnnotationService.class);
	
	public AnnotationService() { 
		logger.info("AnnotationService intialized {} {}", getName(), getNumber());
	}

}