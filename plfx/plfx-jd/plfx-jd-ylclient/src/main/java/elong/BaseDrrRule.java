//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 10:29:41 AM CST 
//


package elong;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * <p>Java class for BaseDrrRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseDrrRule">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseRule">
 *       &lt;sequence>
 *         &lt;element name="TypeCode" type="{}EnumDrrRuleCode"/>
 *         &lt;element name="DateType" type="{}EnumDateType"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DayNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CheckInNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EveryCheckInNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastDayNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WhichDayNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CashScale" type="{}EnumDrrPreferential"/>
 *         &lt;element name="DeductNum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="WeekSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeType" type="{}EnumDrrFeeType"/>
 *         &lt;element name="RoomTypeIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDrrRule", propOrder = {
    "typeCode",
    "dateType",
    "startDate",
    "endDate",
    "dayNum",
    "checkInNum",
    "everyCheckInNum",
    "lastDayNum",
    "whichDayNum",
    "cashScale",
    "deductNum",
    "weekSet",
    "feeType",
    "roomTypeIds"
})
@XmlSeeAlso({
    DrrRule.class
})
public class BaseDrrRule
    extends BaseRule
{

    @JSONField(name = "TypeCode")
    @XmlSchemaType(name = "string")
    protected EnumDrrRuleCode typeCode;
    @JSONField(name = "DateType")
    @XmlSchemaType(name = "string")
    protected EnumDateType dateType;
    @JSONField(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date startDate;
    @JSONField(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date endDate;
    @JSONField(name = "DayNum")
    protected int dayNum;
    @JSONField(name = "CheckInNum")
    protected int checkInNum;
    @JSONField(name = "EveryCheckInNum")
    protected int everyCheckInNum;
    @JSONField(name = "LastDayNum")
    protected int lastDayNum;
    @JSONField(name = "WhichDayNum")
    protected int whichDayNum;
    @JSONField(name = "CashScale")
    @XmlSchemaType(name = "string")
    protected EnumDrrPreferential cashScale;
    @JSONField(name = "DeductNum")
    protected BigDecimal deductNum;
    @JSONField(name = "WeekSet")
    protected String weekSet;
    @JSONField(name = "FeeType")
    @XmlSchemaType(name = "string")
    protected EnumDrrFeeType feeType;
    @JSONField(name = "RoomTypeIds")
    protected String roomTypeIds;

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDrrRuleCode }
     *     
     */
    public EnumDrrRuleCode getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDrrRuleCode }
     *     
     */
    public void setTypeCode(EnumDrrRuleCode value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDateType }
     *     
     */
    public EnumDateType getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDateType }
     *     
     */
    public void setDateType(EnumDateType value) {
        this.dateType = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setStartDate(java.util.Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setEndDate(java.util.Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the dayNum property.
     * 
     */
    public int getDayNum() {
        return dayNum;
    }

    /**
     * Sets the value of the dayNum property.
     * 
     */
    public void setDayNum(int value) {
        this.dayNum = value;
    }

    /**
     * Gets the value of the checkInNum property.
     * 
     */
    public int getCheckInNum() {
        return checkInNum;
    }

    /**
     * Sets the value of the checkInNum property.
     * 
     */
    public void setCheckInNum(int value) {
        this.checkInNum = value;
    }

    /**
     * Gets the value of the everyCheckInNum property.
     * 
     */
    public int getEveryCheckInNum() {
        return everyCheckInNum;
    }

    /**
     * Sets the value of the everyCheckInNum property.
     * 
     */
    public void setEveryCheckInNum(int value) {
        this.everyCheckInNum = value;
    }

    /**
     * Gets the value of the lastDayNum property.
     * 
     */
    public int getLastDayNum() {
        return lastDayNum;
    }

    /**
     * Sets the value of the lastDayNum property.
     * 
     */
    public void setLastDayNum(int value) {
        this.lastDayNum = value;
    }

    /**
     * Gets the value of the whichDayNum property.
     * 
     */
    public int getWhichDayNum() {
        return whichDayNum;
    }

    /**
     * Sets the value of the whichDayNum property.
     * 
     */
    public void setWhichDayNum(int value) {
        this.whichDayNum = value;
    }

    /**
     * Gets the value of the cashScale property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDrrPreferential }
     *     
     */
    public EnumDrrPreferential getCashScale() {
        return cashScale;
    }

    /**
     * Sets the value of the cashScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDrrPreferential }
     *     
     */
    public void setCashScale(EnumDrrPreferential value) {
        this.cashScale = value;
    }

    /**
     * Gets the value of the deductNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductNum() {
        return deductNum;
    }

    /**
     * Sets the value of the deductNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductNum(BigDecimal value) {
        this.deductNum = value;
    }

    /**
     * Gets the value of the weekSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekSet() {
        return weekSet;
    }

    /**
     * Sets the value of the weekSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekSet(String value) {
        this.weekSet = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDrrFeeType }
     *     
     */
    public EnumDrrFeeType getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDrrFeeType }
     *     
     */
    public void setFeeType(EnumDrrFeeType value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the roomTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeIds() {
        return roomTypeIds;
    }

    /**
     * Sets the value of the roomTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeIds(String value) {
        this.roomTypeIds = value;
    }

}
