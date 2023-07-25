package org.wso2.mi.sample;

import org.apache.synapse.MessageContext;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

public class ServerNameMediator extends AbstractMediator { 

	public boolean mediate(MessageContext context) { 
		// TODO Implement your mediation logic here
		String server = ((Axis2MessageContext) context).getAxis2MessageContext().getConfigurationContext()
				.getAxisConfiguration().getParameter("server").getValue().toString();
		context.setProperty("ServerName", server);
		return true;
	}
}
