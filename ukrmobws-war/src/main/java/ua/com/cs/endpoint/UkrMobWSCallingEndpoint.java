package ua.com.cs.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ua.com.cs.model.wm.CallingRequest;
import ua.com.cs.model.wm.CallingResponse;
import ua.com.cs.services.UkrMobWSCallingService;

/**
 * Created by valeriy_solyanik
 * on 15.12.2015.
 */
@Endpoint
public class UkrMobWSCallingEndpoint {
	public final static String NAMESPACE = "http://cs.com.ua/callingService/";

	@Autowired
	UkrMobWSCallingService service;

	@PayloadRoot(localPart = "CallingRequest", namespace = NAMESPACE)
	@ResponsePayload
	public CallingResponse callIfobsWM(@RequestPayload CallingRequest request) {
		return service.callIfobsWM(request);
	}

}
