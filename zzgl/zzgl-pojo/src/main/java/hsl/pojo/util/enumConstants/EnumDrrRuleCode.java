package hsl.pojo.util.enumConstants;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
/**
 * <p>Java class for EnumDrrRuleCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumDrrRuleCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="DRRBookAhead"/>
 *     &lt;enumeration value="DRRStayPerRoomPerNight"/>
 *     &lt;enumeration value="DRRStayLastNight"/>
 *     &lt;enumeration value="DRRStayTheNightAndAfter"/>
 *     &lt;enumeration value="DRRStayPerLastNight"/>
 *     &lt;enumeration value="DRRStayWeekDay"/>
 *     &lt;enumeration value="DRRCheckInWeekDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumDrrRuleCode")
@XmlEnum
public enum EnumDrrRuleCode {

    @XmlEnumValue("None")
    None("None"),
    @XmlEnumValue("DRRBookAhead")
    DRRBookAhead("DRRBookAhead"),
    @XmlEnumValue("DRRStayPerRoomPerNight")
    DRRStayPerRoomPerNight("DRRStayPerRoomPerNight"),
    @XmlEnumValue("DRRStayLastNight")
    DRRStayLastNight("DRRStayLastNight"),
    @XmlEnumValue("DRRStayTheNightAndAfter")
    DRRStayTheNightAndAfter("DRRStayTheNightAndAfter"),
    @XmlEnumValue("DRRStayPerLastNight")
    DRRStayPerLastNight("DRRStayPerLastNight"),
    @XmlEnumValue("DRRStayWeekDay")
    DRRStayWeekDay("DRRStayWeekDay"),
    @XmlEnumValue("DRRCheckInWeekDay")
    DRRCheckInWeekDay("DRRCheckInWeekDay");
    private final String value;

    EnumDrrRuleCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumDrrRuleCode fromValue(String v) {
        for (EnumDrrRuleCode c: EnumDrrRuleCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}