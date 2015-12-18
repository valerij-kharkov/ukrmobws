package ua.com.cs.services;

import ua.com.cs.model.wm.request.IFOBSWebServicePacket;

/**
 * Created by valeriy_solyanik
 * on 17.12.2015.
 */
public abstract class AbstractResponseParameterGetter<Req extends IFOBSWebServicePacket> {
	protected Req request;
	protected String responseParameterValue;

	public AbstractResponseParameterGetter(Req request, String responseParameterValue) {
		this.request = request;
		this.responseParameterValue = responseParameterValue;
	}

	abstract String getResponseWithParametersType(String response, int positionParam,  String responseParameterValue);

	public Req getRequest() {
		return request;
	}

	public void setRequest(Req request) {
		this.request = request;
	}

	public String getResponseParameterValue() {
		return responseParameterValue;
	}

	public void setResponseParameterValue(String responseParameterValue) {
		this.responseParameterValue = responseParameterValue;
	}
}


