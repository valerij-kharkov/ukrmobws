package ua.com.cs.services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.xml.transform.StringSource;
import ua.com.cs.helpers.Base64;
import ua.com.cs.helpers.ZipHelper;
import ua.com.cs.model.ifobswm.WMServiceBean;
import ua.com.cs.model.ifobswm.WMServiceBeanService;
import ua.com.cs.model.wm.request.CallingRequest;
import ua.com.cs.model.wm.request.CardListRequest;
import ua.com.cs.model.wm.response.CallingResponse;
import ua.com.cs.model.wm.response.Response;

import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
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
	private Jaxb2Marshaller jaxb2Marshaller;

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

	public Response callCardList(CardListRequest request) {
		Response callingResponse = new Response();
		try {
			String encodedRequest;
			String decodedResponse;

			StringWriter sw = new StringWriter();
			jaxb2Marshaller.marshal(request, new StreamResult(sw));

			String requestToTrim = sw.toString();
			int from = requestToTrim.indexOf("<iFOBSWebServicePacket");
			int to = requestToTrim.lastIndexOf("iFOBSWebServicePacket>") + "iFOBSWebServicePacket>".length();
			requestToTrim = requestToTrim.substring(from, to);

			ZipHelper zip = new ZipHelper(JAVA_ENCODING);
			encodedRequest = new String(Base64.encode(zip.CompressGZIP(requestToTrim)), JAVA_ENCODING);

			WMServiceBeanService service = new WMServiceBeanService(new URL(wsdlUrl));
			WMServiceBean wmServiceBean = service.getWMServiceBeanPort();
			String response = wmServiceBean.callService(encodedRequest);
			decodedResponse = zip.DecompressGZIP(Base64.decode(response.getBytes(JAVA_ENCODING)));

			int positionResponse = decodedResponse.indexOf("Response") + "Response".length();
			String firstPartResponse = decodedResponse.substring(0, positionResponse);
			String secondPartResponse = decodedResponse.substring(positionResponse);
			decodedResponse = firstPartResponse + " xmlns=\"http://cs.com.ua/callingService/\"" + secondPartResponse;

			int positionParam = decodedResponse.indexOf("Parameters");
			if (positionParam > 0) {
				positionParam = positionParam + "Parameters".length();
				String firstPartParam = decodedResponse.substring(0, positionParam);
				String secondPartParam = decodedResponse.substring(positionParam);
				decodedResponse = firstPartParam + " xsi:type=\"CardListResponseParametersType\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + secondPartParam;

			}

			callingResponse = (Response) jaxb2Marshaller.unmarshal(new StringSource(decodedResponse));

		} catch (Exception e) {
			logger.error("Error during call ifobs ukrainian WM", e);
		}
		return callingResponse;
	}
}
