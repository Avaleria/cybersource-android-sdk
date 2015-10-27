package com.visa.inappsdk.connectors.inapp.services;

import com.visa.inappsdk.soap.model.SDKXMLParentNode;

/**
 * Describes fields of "encryptPaymentDataService" object in WebService request
 * 
 * Created by fzubair on 10/8/2015.
 */
public class InAppEncryptPaymentDataService extends InAppBaseService {

	public final String OBJECT_NAME = "encryptPaymentDataService";
	public final String RUN = "run";
	public final String COMMERCE_INDICATOR = "commerceIndicator";
	public final String BILL_PAYMENT = "billPayment";

	public String run;
    String commerceIndicator;

	/**
	 * All fields in constructor are required
	 * 
	 * @param run
	 */
	public InAppEncryptPaymentDataService(boolean run, String commerceIndicator) {
		this.run = String.valueOf(run);
        this.commerceIndicator = commerceIndicator;
	}

	@Override
	public void updateEnvelope(SDKXMLParentNode request) {
		if (validateObject()) {
			SDKXMLParentNode sdkxmlParentNode = request.addNode(request.getNamespace(), OBJECT_NAME);
			if (this.run != null) {
				sdkxmlParentNode.addAttribute(null, RUN, this.run);
			}
			if (this.commerceIndicator != null) {
				sdkxmlParentNode.addTextNode(sdkxmlParentNode.getNamespace(), COMMERCE_INDICATOR, commerceIndicator);
			}
		}
	}

	private boolean validateObject() {
		if (this.run == null) {
			return false;
		} else {
			return true;
		}
	}
}
