//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 10:29:41 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * <p>Java class for HotelListCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelListCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueryType" type="{}EnumQueryType"/>
 *         &lt;element name="PaymentType" type="{}EnumPaymentType"/>
 *         &lt;element name="ProductProperties" type="{}EnumProductProperty"/>
 *         &lt;element name="Facilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StarRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LowRate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HighRate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DistrictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{}Position" minOccurs="0"/>
 *         &lt;element name="Sort" type="{}EnumSortType"/>
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThemeIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelListCondition", propOrder = {
    "arrivalDate",
    "departureDate",
    "cityId",
    "queryText",
    "queryType",
    "paymentType",
    "productProperties",
    "facilities",
    "starRate",
    "brandId",
    "groupId",
    "lowRate",
    "highRate",
    "districtId",
    "locationId",
    "position",
    "sort",
    "pageIndex",
    "pageSize",
    "customerType",
    "themeIds",
    "resultType"
})
public class HotelListCondition {

    @JSONField(name = "ArrivalDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date arrivalDate;
    @JSONField(name = "DepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date departureDate;
    @JSONField(name = "CityId")
    protected String cityId;
    @JSONField(name = "QueryText")
    protected String queryText;
    @JSONField(name = "QueryType")
    @XmlSchemaType(name = "string")
    protected EnumQueryType queryType;
    @JSONField(name = "PaymentType")
    @XmlSchemaType(name = "string")
    protected EnumPaymentType paymentType;
    @JSONField(name = "ProductProperties")
    @XmlSchemaType(name = "string")
    protected EnumProductProperty productProperties;
    @JSONField(name = "Facilities")
    protected String facilities;
    @JSONField(name = "StarRate")
    protected String starRate;
    @JSONField(name = "BrandId")
    protected String brandId;
    @JSONField(name = "GroupId")
    protected int groupId;
    @JSONField(name = "LowRate")
    protected int lowRate;
    @JSONField(name = "HighRate")
    protected int highRate;
    @JSONField(name = "DistrictId")
    protected String districtId;
    @JSONField(name = "LocationId")
    protected String locationId;
    @JSONField(name = "Position")
    protected Position position;
    @JSONField(name = "Sort")
    @XmlSchemaType(name = "string")
    protected EnumSortType sort;
    @JSONField(name = "PageIndex")
    protected int pageIndex;
    @JSONField(name = "PageSize")
    protected int pageSize;
    @JSONField(name = "CustomerType")
    protected String customerType;
    @JSONField(name = "ThemeIds")
    protected String themeIds;
    @JSONField(name = "ResultType")
    protected String resultType;

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setArrivalDate(java.util.Date value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setDepartureDate(java.util.Date value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the cityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityId(String value) {
        this.cityId = value;
    }

    /**
     * Gets the value of the queryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryText() {
        return queryText;
    }

    /**
     * Sets the value of the queryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryText(String value) {
        this.queryText = value;
    }

    /**
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumQueryType }
     *     
     */
    public EnumQueryType getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumQueryType }
     *     
     */
    public void setQueryType(EnumQueryType value) {
        this.queryType = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPaymentType }
     *     
     */
    public EnumPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPaymentType }
     *     
     */
    public void setPaymentType(EnumPaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the productProperties property.
     * 
     * @return
     *     possible object is
     *     {@link EnumProductProperty }
     *     
     */
    public EnumProductProperty getProductProperties() {
        return productProperties;
    }

    /**
     * Sets the value of the productProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumProductProperty }
     *     
     */
    public void setProductProperties(EnumProductProperty value) {
        this.productProperties = value;
    }

    /**
     * Gets the value of the facilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilities() {
        return facilities;
    }

    /**
     * Sets the value of the facilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilities(String value) {
        this.facilities = value;
    }

    /**
     * Gets the value of the starRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarRate() {
        return starRate;
    }

    /**
     * Sets the value of the starRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarRate(String value) {
        this.starRate = value;
    }

    /**
     * Gets the value of the brandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandId(String value) {
        this.brandId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     */
    public void setGroupId(int value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the lowRate property.
     * 
     */
    public int getLowRate() {
        return lowRate;
    }

    /**
     * Sets the value of the lowRate property.
     * 
     */
    public void setLowRate(int value) {
        this.lowRate = value;
    }

    /**
     * Gets the value of the highRate property.
     * 
     */
    public int getHighRate() {
        return highRate;
    }

    /**
     * Sets the value of the highRate property.
     * 
     */
    public void setHighRate(int value) {
        this.highRate = value;
    }

    /**
     * Gets the value of the districtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictId() {
        return districtId;
    }

    /**
     * Sets the value of the districtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictId(String value) {
        this.districtId = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link EnumSortType }
     *     
     */
    public EnumSortType getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumSortType }
     *     
     */
    public void setSort(EnumSortType value) {
        this.sort = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the themeIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThemeIds() {
        return themeIds;
    }

    /**
     * Sets the value of the themeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThemeIds(String value) {
        this.themeIds = value;
    }

    /**
     * Gets the value of the resultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultType() {
        return resultType;
    }

    /**
     * Sets the value of the resultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultType(String value) {
        this.resultType = value;
    }

}
