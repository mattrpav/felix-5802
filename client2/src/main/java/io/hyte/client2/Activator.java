/** 
 * HYTE TECHNOLOGIES, INC. CONFIDENTIAL
 * 
 * Copyright © 2017 - 2018 HYTE Technologies, Inc. All Rights Reserved.
 *  
 * NOTICE:  All information contained herein is, and remains the property of HYTE Technologies, Inc. 
 * and its suppliers, if any.  The intellectual and technical concepts contained herein are 
 * proprietary to HYTE Technologies, Inc. and its suppliers and may be covered by U.S. and Foreign 
 * Patents, patents in process, and are protected by trade secret or copyright law.  Dissemination 
 * of this information or reproduction of this material is strictly forbidden unless prior written 
 * permission is obtained from HYTE Technologies, Inc.
 */
package io.hyte.client2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import io.hyte.api.Service;

public class Activator implements BundleActivator {

	protected ServiceReference<Service> serviceReference = null;
	
	@Override
	public void start(BundleContext context) throws Exception {
		serviceReference = context.getServiceReference(Service.class);
		
		Client2 client2 = new Client2();
		client2.setService(context.getService(serviceReference));
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		if(serviceReference != null) {
			context.ungetService(serviceReference);
		}
	}

}
