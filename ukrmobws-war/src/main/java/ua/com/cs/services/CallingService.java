package ua.com.cs.services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import ua.com.cs.helpers.Base64;
import ua.com.cs.helpers.XMLAndMarshallerHelper;
import ua.com.cs.helpers.ZipHelper;
import ua.com.cs.model.ifobswm.WMServiceBean;
import ua.com.cs.model.ifobswm.WMServiceBeanService;
import ua.com.cs.model.wm.request.CardListRequest;
import ua.com.cs.model.wm.request.IFOBSWebServicePacket;
import ua.com.cs.model.wm.response.Response;

import java.net.URL;

/**
 * Created by valeriy_solyanik
 * on 17.12.2015.
 */
public class CallingService {
	protected final static org.slf4j.Logger logger = LoggerFactory.getLogger(CallingService.class);
	protected final static String JAVA_ENCODING = "cp1251";

	@Value("${ws.wsdlUrl}")
	protected String wsdlUrl;

	@Autowired
	private XMLAndMarshallerHelper xmlAndMarshallerHelper;

	protected String getResponseParametersType(CardListRequest request) {
		String responseParameterValue = request.getIFOBSWebServicePacket().getPacketBody().getCallingService().getParameters().getValue().getClass().getName();
		responseParameterValue = responseParameterValue.substring(responseParameterValue.indexOf("request.") + "request.".length());
		return responseParameterValue;
	}

	protected Response call(IFOBSWebServicePacket request, String responseParameterValue) {
		Response callingResponse = new Response();
		try {
			String encodedRequest;
			String decodedResponse;

			String requestAsString = xmlAndMarshallerHelper.getRequestAsString(request);

			ZipHelper zip = new ZipHelper(JAVA_ENCODING);
			encodedRequest = new String(Base64.encode(zip.CompressGZIP(requestAsString)), JAVA_ENCODING);

			WMServiceBeanService service = new WMServiceBeanService(new URL(wsdlUrl));
			WMServiceBean wmServiceBean = service.getWMServiceBeanPort();
			String response = wmServiceBean.callService(encodedRequest);

			decodedResponse = zip.DecompressGZIP(Base64.decode(response.getBytes(JAVA_ENCODING)));

			decodedResponse = xmlAndMarshallerHelper.geResponseWithParamType(decodedResponse, responseParameterValue);

			callingResponse = (Response) xmlAndMarshallerHelper.unmarshal(decodedResponse);
		} catch (Exception e) {
			logger.error("Error during call ifobs ukrainian WM", e);
		}

		return callingResponse;
	}

}


