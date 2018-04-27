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
 * <p>Java class for EnumBookingRule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumBookingRule">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoneRule"/>
 *     &lt;enumeration value="NeedNationality"/>
 *     &lt;enumeration value="PerRoomPerName"/>
 *     &lt;enumeration value="ForeignerNeedEnName"/>
 *     &lt;enumeration value="RejectCheckinTime"/>
 *     &lt;enumeration value="NeedPhoneNo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumBookingRule")
@XmlEnum
public enum EnumBookingRule {

    @XmlEnumValue("NoneRule")
    NoneRule("NoneRule"),
    @XmlEnumValue("NeedNationality")
    NeedNationality("NeedNationality"),
    @XmlEnumValue("PerRoomPerName")
    PerRoomPerName("PerRoomPerName"),
    @XmlEnumValue("ForeignerNeedEnName")
    ForeignerNeedEnName("ForeignerNeedEnName"),
    @XmlEnumValue("RejectCheckinTime")
    RejectCheckinTime("RejectCheckinTime"),
    @XmlEnumValue("NeedPhoneNo")
    NeedPhoneNo("NeedPhoneNo");
    private final String value;

    EnumBookingRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumBookingRule fromValue(String v) {
        for (EnumBookingRule c: EnumBookingRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
