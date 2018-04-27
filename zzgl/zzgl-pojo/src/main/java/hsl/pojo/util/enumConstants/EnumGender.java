package hsl.pojo.util.enumConstants;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for EnumGender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumGender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Female"/>
 *     &lt;enumeration value="Maile"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumGender")
@XmlEnum
public enum EnumGender {

    @XmlEnumValue("Female")
    Female("Female"),
    @XmlEnumValue("Maile")
    Maile("Maile"),
    @XmlEnumValue("Unknown")
    Unknown("Unknown");
    private final String value;

    EnumGender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumGender fromValue(String v) {
        for (EnumGender c: EnumGender.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}