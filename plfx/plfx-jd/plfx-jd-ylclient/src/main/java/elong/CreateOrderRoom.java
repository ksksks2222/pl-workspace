//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 10:29:41 AM CST 
//


package elong;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * <p>Java class for CreateOrderRoom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOrderRoom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customers" type="{}ArrayOfCustomer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderRoom", propOrder = {
    "customers"
})
public class CreateOrderRoom implements Serializable{

    protected List<Customer> customers;

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link List<Customer> }
     *     
     */
    public List<Customer> getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<Customer> }
     *     
     */
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

}
