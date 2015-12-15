package ua.com.cs.services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ua.com.cs.helpers.Base64;
import ua.com.cs.helpers.ZipHelper;
import ua.com.cs.model.ifobswm.WMServiceBean;
import ua.com.cs.model.ifobswm.WMServiceBeanService;
import ua.com.cs.model.wm.CallingRequest;
import ua.com.cs.model.wm.CallingResponse;

import java.net.URL;

/**
 * Created by valeriy_solyanik
 * on 15.12.2015.
 */
@Service
public class UkrMobWSCallingService {
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(UkrMobWSCallingService.class);
	private final static String JAVA_ENCODING = "cp1251";

	@Value("${ws.wsdlUrl:http://localhost:8080/WMService/services/WMService?wsdl}")
	private String wsdlUrl;

	public CallingResponse callIfobsWM(CallingRequest request) {
		CallingResponse callingResponse = new CallingResponse();
		try {
			WMServiceBeanService service = new WMServiceBeanService(new URL(wsdlUrl));
			WMServiceBean wmServiceBean = service.getWMServiceBeanPort();

			String encodedRequest;
			String decodedResponse;

			ZipHelper zip = new ZipHelper(JAVA_ENCODING);
			encodedRequest = new String(Base64.encode(zip.CompressGZIP(request.getRequest())), JAVA_ENCODING);

			String response = wmServiceBean.callService(encodedRequest);
			decodedResponse = zip.DecompressGZIP(Base64.decode(response.getBytes(JAVA_ENCODING)));

			callingResponse.setResponse(decodedResponse);
		} catch (Exception e) {
			logger.error("Error during call ifobs ukrainian WM", e);
		}
		return callingResponse;
	}
}
