package ua.com.cs.helpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import ua.com.cs.model.wm.request.IFOBSWebServicePacket;
import ua.com.cs.model.wm.request.IFOBSWebServicePacketType;
import ua.com.cs.services.AbstractResponseParameterGetter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by valeriy_solyanik
 * on 18.12.2015.
 */
@Service
public class XMLAndMarshallerHelper {
	@Autowired
	private Jaxb2Marshaller jaxb2Marshaller;

	public String marshal(Object object) throws IOException {
		StringWriter stringWriter = new StringWriter();
		jaxb2Marshaller.marshal(object, new StreamResult(stringWriter));
		return stringWriter.toString();
	}

	public Document marshalToDocument(Object object) throws IOException, ParserConfigurationException {
		DocumentBuilder documentBuilder = createDocumentBuilder();
		Document doc = documentBuilder.newDocument();
		jaxb2Marshaller.marshal(object, new DOMResult(doc));
		return doc;
	}


	public Object unmarshal(String xml) throws IOException {
		return jaxb2Marshaller.unmarshal(new StreamSource(new StringReader(xml)));
	}

	//Строим хмл из обьекта и преобразовываем в строку
	public String getRequestAsString(IFOBSWebServicePacket request) throws Exception {
		Document doc = marshalToDocument(request);
		Element element = (Element) doc.getElementsByTagName("iFOBSWebServicePacket").item(0);

		return transformXMLToString(element);
	}

	private String transformXMLToString(Element element) throws TransformerException {
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

		StringWriter sw = new StringWriter();
		StreamResult result = new StreamResult(sw);
		DOMSource source = new DOMSource(element);
		transformer.transform(source, result);

		return sw.toString();
	}

	//Строим хмл и преобразовываем в строку
	public String getModifiyedResponseAsXML(String response, String responseParamType) throws Exception {
		DocumentBuilder builder = createDocumentBuilder();
		Document doc = builder.parse(new InputSource(new StringReader(response)));
		Element element = (Element) doc.getElementsByTagName("Response").item(0);

		Attr attr = doc.createAttribute("xmlns");
		attr.setValue("http://cs.com.ua/callingService/");
		element.setAttributeNode(attr);

		Element elementParameters = (Element) doc.getElementsByTagName("Parameters").item(0);
		if(elementParameters != null){
			Attr attrParam = doc.createAttribute("xsi:type");
			attrParam.setValue(responseParamType);
			element.setAttributeNode(attrParam);

			Attr attrParam2 = doc.createAttribute("xmlns:xsi");
			attrParam2.setValue("http://www.w3.org/2001/XMLSchema-instance");
			element.setAttributeNode(attrParam2);
		}
		return transformXMLToString(doc.getDocumentElement());

	}
	private DocumentBuilder createDocumentBuilder() throws ParserConfigurationException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		return dbf.newDocumentBuilder();
	}
}