//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 10:29:41 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumPrepayCutPayment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumPrepayCutPayment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Money"/>
 *     &lt;enumeration value="Percent"/>
 *     &lt;enumeration value="FristNight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumPrepayCutPayment")
@XmlEnum
public enum EnumPrepayCutPayment {

    @XmlEnumValue("Money")
    Money("Money"),
    @XmlEnumValue("Percent")
    Percent("Percent"),
    @XmlEnumValue("FristNight")
    FristNight("FristNight");
    private final String value;

    EnumPrepayCutPayment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPrepayCutPayment fromValue(String v) {
        for (EnumPrepayCutPayment c: EnumPrepayCutPayment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
