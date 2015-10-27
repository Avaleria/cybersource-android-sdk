package com.visa.inappsdk.connectors.inapp.services;

import com.visa.inappsdk.soap.model.SDKXMLParentNode;

/**
 * 
 * @author fzubair
 *
 */
public abstract class InAppBaseService {
	/**
	 * 
	 * Updates request with fields needed in WebService request.
	 * 
	 * @param request
	 *            original request that is being created to be sent to the
	 *            gateway
	 */
	public abstract void updateEnvelope(SDKXMLParentNode request);
}
