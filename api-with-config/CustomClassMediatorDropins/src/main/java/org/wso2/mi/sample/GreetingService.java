package org.wso2.mi.sample;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

public class GreetingService extends AbstractMediator {

	public boolean mediate(MessageContext context) { 
		context.setProperty("mi.greeting.msg", "Greeting from WSO2 Micro Integrator");
		return true;
	}
}
