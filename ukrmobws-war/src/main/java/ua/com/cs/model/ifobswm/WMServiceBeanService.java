
package ua.com.cs.model.ifobswm;

import org.springframework.beans.factory.annotation.Value;

import java.net.MalformedURLException;
import java.net.URL;
import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WMServiceBeanService", targetNamespace = "http://wm.webservices.ifobs.cs.com/", wsdlLocation = "http://localhost:8080/WMService/services/WMService?wsdl")
@HandlerChain(file= "handlers.xml")
public class WMServiceBeanService
    extends Service
{

    private final static URL WMSERVICEBEANSERVICE_WSDL_LOCATION;
    private final static WebServiceException WMSERVICEBEANSERVICE_EXCEPTION;
    private final static QName WMSERVICEBEANSERVICE_QNAME = new QName("http://wm.webservices.ifobs.cs.com/", "WMServiceBeanService");
    @Value("")
    private String uri;

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WMService/services/WMService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WMSERVICEBEANSERVICE_WSDL_LOCATION = url;
        WMSERVICEBEANSERVICE_EXCEPTION = e;
    }

    public WMServiceBeanService() {
        super(__getWsdlLocation(), WMSERVICEBEANSERVICE_QNAME);
    }

    public WMServiceBeanService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WMSERVICEBEANSERVICE_QNAME, features);
    }

    public WMServiceBeanService(URL wsdlLocation) {
        super(wsdlLocation, WMSERVICEBEANSERVICE_QNAME);
    }

    public WMServiceBeanService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WMSERVICEBEANSERVICE_QNAME, features);
    }

    public WMServiceBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WMServiceBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WMServiceBean
     */
    @WebEndpoint(name = "WMServiceBeanPort")
    public WMServiceBean getWMServiceBeanPort() {
        return super.getPort(new QName("http://wm.webservices.ifobs.cs.com/", "WMServiceBeanPort"), WMServiceBean.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WMServiceBean
     */
    @WebEndpoint(name = "WMServiceBeanPort")
    public WMServiceBean getWMServiceBeanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wm.webservices.ifobs.cs.com/", "WMServiceBeanPort"), WMServiceBean.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WMSERVICEBEANSERVICE_EXCEPTION!= null) {
            throw WMSERVICEBEANSERVICE_EXCEPTION;
        }
        return WMSERVICEBEANSERVICE_WSDL_LOCATION;
    }

}
