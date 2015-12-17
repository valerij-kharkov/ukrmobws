
package ua.com.cs.model.wm.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SenderInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Application" type="{http://cs.com.ua/callingService/}ApplicationType"/>
 *         &lt;element name="SessionInfo" type="{http://cs.com.ua/callingService/}SessionInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderInfoType", propOrder = {
    "application",
    "sessionInfo"
})
public class SenderInfoType {

    @XmlElement(name = "Application", required = true)
    protected ApplicationType application;
    @XmlElement(name = "SessionInfo", required = true)
    protected SessionInfoType sessionInfo;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setApplication(ApplicationType value) {
        this.application = value;
    }

    /**
     * Gets the value of the sessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfoType }
     *     
     */
    public SessionInfoType getSessionInfo() {
        return sessionInfo;
    }

    /**
     * Sets the value of the sessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfoType }
     *     
     */
    public void setSessionInfo(SessionInfoType value) {
        this.sessionInfo = value;
    }

}
