//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 10:29:41 AM CST 
//


package plfx.jd.pojo.system.enumConstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumGuaranteeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumGuaranteeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoneInRule"/>
 *     &lt;enumeration value="NoneInManual"/>
 *     &lt;enumeration value="VouchInRule"/>
 *     &lt;enumeration value="VouchInManual"/>
 *     &lt;enumeration value="VouchByElong"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumGuaranteeType")
@XmlEnum
public enum EnumGuaranteeType {

    @XmlEnumValue("NoneInRule")
    NoneInRule("NoneInRule"),
    @XmlEnumValue("NoneInManual")
    NoneInManual("NoneInManual"),
    @XmlEnumValue("VouchInRule")
    VouchInRule("VouchInRule"),
    @XmlEnumValue("VouchInManual")
    VouchInManual("VouchInManual"),
    @XmlEnumValue("VouchByElong")
    VouchByElong("VouchByElong");
    private final String value;

    EnumGuaranteeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumGuaranteeType fromValue(String v) {
        for (EnumGuaranteeType c: EnumGuaranteeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
