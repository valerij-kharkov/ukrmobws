
package ua.com.cs.model.wm.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPictureListResponseParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardPictureListResponseParametersType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cs.com.ua/callingService/}ParametersResponseType">
 *       &lt;sequence>
 *         &lt;element name="CardPictureInfo" type="{http://cs.com.ua/callingService/}CardPictureInfoList" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPictureListResponseParametersType", propOrder = {
    "cardPictureInfo"
})
public class CardPictureListResponseParametersType
    extends ParametersResponseType
{

    @XmlElement(name = "CardPictureInfo", required = true)
    protected List<CardPictureInfoList> cardPictureInfo;

    /**
     * Gets the value of the cardPictureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardPictureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardPictureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPictureInfoList }
     * 
     * 
     */
    public List<CardPictureInfoList> getCardPictureInfo() {
        if (cardPictureInfo == null) {
            cardPictureInfo = new ArrayList<CardPictureInfoList>();
        }
        return this.cardPictureInfo;
    }

}
