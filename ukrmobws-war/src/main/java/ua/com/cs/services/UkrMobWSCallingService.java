package ua.com.cs.services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ua.com.cs.helpers.Base64;
import ua.com.cs.helpers.XMLAndMarshallerHelper;
import ua.com.cs.helpers.ZipHelper;
import ua.com.cs.model.ifobswm.WMServiceBean;
import ua.com.cs.model.ifobswm.WMServiceBeanService;
import ua.com.cs.model.wm.request.CallingRequest;
import ua.com.cs.model.wm.request.CardListRequest;
import ua.com.cs.model.wm.request.IFOBSWebServicePacket;
import ua.com.cs.model.wm.response.CallingResponse;
import ua.com.cs.model.wm.response.Response;

import java.net.URL;

/**
 * Created by valeriy_solyanik
 * on 15.12.2015.
 */
@Service
public class UkrMobWSCallingService {
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(UkrMobWSCallingService.class);
	private final static String JAVA_ENCODING = "cp1251";

	@Value("${ws.wsdlUrl}")
	private String wsdlUrl;

	@Autowired
	private XMLAndMarshallerHelper xmlAndMarshallerHelper;

	//Для вызова мобильных сервисов по старинке  - через строку
	public CallingResponse callStringXML(CallingRequest request) {
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

	//Для вызова сервиса CardList
	public Response callCardList(CardListRequest request) {
		String responseParameterValue = "CardListResponseParametersType";
		return call(request, responseParameterValue);
	}

	private String getResponseParametersType(CardListRequest request) {
		String responseParameterValue = request.getIFOBSWebServicePacket().getPacketBody().getCallingService().getParameters().getValue().getClass().getName();
		responseParameterValue = responseParameterValue.substring(responseParameterValue.indexOf("request.") + "request.".length());
		return responseParameterValue;
	}

	private Response call(IFOBSWebServicePacket request, String responseParameterValue) {
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
