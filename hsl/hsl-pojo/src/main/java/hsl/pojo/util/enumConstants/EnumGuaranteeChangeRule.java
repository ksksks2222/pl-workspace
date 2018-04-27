package hsl.pojo.util.enumConstants;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
/**
 * <p>Java class for EnumGuaranteeChangeRule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumGuaranteeChangeRule">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoChange"/>
 *     &lt;enumeration value="NeedSomeDay"/>
 *     &lt;enumeration value="NeedCheckinTime"/>
 *     &lt;enumeration value="NeedCheckin24hour"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumGuaranteeChangeRule")
@XmlEnum
public enum EnumGuaranteeChangeRule {

    @XmlEnumValue("NoChange")
    NoChange("NoChange"),
    @XmlEnumValue("NeedSomeDay")
    NeedSomeDay("NeedSomeDay"),
    @XmlEnumValue("NeedCheckinTime")
    NeedCheckinTime("NeedCheckinTime"),
    @XmlEnumValue("NeedCheckin24hour")
    NeedCheckin24hour("NeedCheckin24hour");
    private final String value;

    EnumGuaranteeChangeRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumGuaranteeChangeRule fromValue(String v) {
        for (EnumGuaranteeChangeRule c: EnumGuaranteeChangeRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
