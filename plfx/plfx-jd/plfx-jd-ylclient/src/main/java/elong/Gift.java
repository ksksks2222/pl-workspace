//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 10:29:41 AM CST 
//


package elong;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * <p>Java class for Gift complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gift">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseGiftRule">
 *       &lt;sequence>
 *         &lt;element name="GiftId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gift", propOrder = {
    "giftId"
})
public class Gift
    extends BaseGiftRule
{

    @JSONField(name = "GiftId")
    protected int giftId;

    /**
     * Gets the value of the giftId property.
     * 
     */
    public int getGiftId() {
        return giftId;
    }

    /**
     * Sets the value of the giftId property.
     * 
     */
    public void setGiftId(int value) {
        this.giftId = value;
    }

}
