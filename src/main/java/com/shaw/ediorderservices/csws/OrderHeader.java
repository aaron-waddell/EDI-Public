
package com.shaw.ediorderservices.csws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subset" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="swatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="residentialDelvFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thirdPartyAdd1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thirdPartyAdd2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thirdPartyCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thirdPartyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thirdPartyName2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thirdPartyState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thirdPartyZip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipToName2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastLineNbr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="beforeDeliveryFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bulkOrderNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="collateFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="labelContact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="labelDeliveryInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="labelProjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="labelShiptoPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thirdPartyAcc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thirdPartyBillFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callBefDelFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thirdPartyFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="repFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rushFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalLines" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="carrierFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="demand" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="honeyWell" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specialInst" type="{http://orderview.csws.shaw.com}ArrayOf_xsd_nillable_string"/>
 *         &lt;element name="shipToAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipToCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipToState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipToZipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipToName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="headerSidemarks" type="{http://orderview.csws.shaw.com}ArrayOfHeaderSidemark"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="billAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billToName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billZipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrierName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commCust" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="confirmStat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custKwic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custRefNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtlsNbr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="freightCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="headerStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nbDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operatorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ovalCode1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ovalCode2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ovalCode3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ovalCode4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ovalDesc3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ovalDesc1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ovalDesc2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ovalDesc4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pricingDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selcoDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="smNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="termsCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="termsDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="territory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shippingType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addrKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="addrSeq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ratingMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderPriced" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="incoTerms" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="projectNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endUseDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderHeader", namespace="http://v3.orderview.csws.shaw.com")
public class OrderHeader {

    @XmlElement(required = true, nillable = true)
    protected String projectName = "";
    protected boolean subset;
    protected boolean swatch;
    @XmlElement(required = true, nillable = true)
    protected String residentialDelvFlag = "";
    @XmlElement(required = true, nillable = true)
    protected String thirdPartyAdd1 = "";
    @XmlElement(required = true, nillable = true)
    protected String thirdPartyAdd2 = "";
    @XmlElement(required = true, nillable = true)
    protected String thirdPartyCity = "";
    @XmlElement(required = true, nillable = true)
    protected String thirdPartyName = "";
    @XmlElement(required = true, nillable = true)
    protected String thirdPartyName2 = "";
    @XmlElement(required = true, nillable = true)
    protected String thirdPartyState = "";
    @XmlElement(required = true, nillable = true)
    protected String thirdPartyZip = "";
    @XmlElement(required = true, nillable = true)
    protected String shipToName2 = "";
    protected int lastLineNbr;
    @XmlElement(required = true, nillable = true)
    protected String beforeDeliveryFlag = "";
    @XmlElement(required = true, nillable = true)
    protected String bulkOrderNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String carrServiceLevel = "";
    @XmlElement(required = true, nillable = true)
    protected String collateFlag = "";
    @XmlElement(required = true, nillable = true)
    protected String labelContact = "";
    @XmlElement(required = true, nillable = true)
    protected String labelDeliveryInfo = "";
    @XmlElement(required = true, nillable = true)
    protected String labelProjectName = "";
    @XmlElement(required = true, nillable = true)
    protected String labelShiptoPhone = "";
    @XmlElement(required = true, nillable = true)
    protected String location = "";
    @XmlElement(required = true, nillable = true)
    protected String locationName = "";
    @XmlElement(required = true, nillable = true)
    protected String marketFlag = "";
    @XmlElement(required = true, nillable = true)
    protected String thirdPartyAcc = "";
    @XmlElement(required = true, nillable = true)
    protected String thirdPartyBillFlag = "";
    @XmlElement(required = true, nillable = true)
    protected String callBefDelFlag = "";
    @XmlElement(required = true, nillable = true)
    protected String thirdPartyFlag = "";
    @XmlElement(required = true, nillable = true)
    protected String repFlag = "";
    @XmlElement(required = true, nillable = true)
    protected String rushFlag = "";
    protected int totalLines;
    protected double totalWeight;
    @XmlElement(required = true, nillable = true)
    protected String carrierFlag = "";
    protected boolean demand;
    protected boolean honeyWell;
    @XmlElement(required = true, nillable = true)
    protected String orderLocation = "";
    @XmlElement(required = true, nillable = true)
    protected String creditMessage = "";
    @XmlElement(required = true, nillable = true)
    protected List<String> specialInst;
    @XmlElement(required = true, nillable = true)
    protected String shipToAddress1 = "";
    @XmlElement(required = true, nillable = true)
    protected String shipToAddress2 = "";
    @XmlElement(required = true, nillable = true)
    protected String shipToCity = "";
    @XmlElement(required = true, nillable = true)
    protected String shipToState = "";
    @XmlElement(required = true, nillable = true)
    protected String shipToZipcode = "";
    @XmlElement(required = true, nillable = true)
    protected String shipToName = "";
    @XmlElement(required = true, nillable = true)
    protected String billCity = "";
    @XmlElement(required = true, nillable = true)
    protected List<HeaderSidemark> headerSidemarks;
    @XmlElement(required = true, nillable = true)
    protected String serviceCode = "";
    @XmlElement(required = true, nillable = true)
    protected String custName = "";
    protected int area;
    @XmlElement(required = true, nillable = true)
    protected String billAddress1 = "";
    @XmlElement(required = true, nillable = true)
    protected String billAddress2 = "";
    @XmlElement(required = true, nillable = true)
    protected String billState = "";
    @XmlElement(required = true, nillable = true)
    protected String billToName = "";
    @XmlElement(required = true, nillable = true)
    protected String billZipcode = "";
    @XmlElement(required = true, nillable = true)
    protected String carrierCode = "";
    @XmlElement(required = true, nillable = true)
    protected String carrierName = "";
    @XmlElement(required = true, nillable = true)
    protected String commCust = "";
    @XmlElement(required = true, nillable = true)
    protected String confirmStat = "";
    @XmlElement(required = true, nillable = true)
    protected String countryCode = "";
    @XmlElement(required = true, nillable = true)
    protected String destCountryCode = "";
    @XmlElement(required = true, nillable = true)
    protected String creditCode = "";
    @XmlElement(required = true, nillable = true)
    protected String creditDate = "";
    @XmlElement(required = true, nillable = true)
    protected String creditDesc = "";
    @XmlElement(required = true, nillable = true)
    protected String custKwic = "";
    @XmlElement(required = true, nillable = true)
    protected String custNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String custRefNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String deliveryDate = "";
    @XmlElement(required = true, nillable = true)
    protected String department = "";
    @XmlElement(required = true, nillable = true)
    protected String district = "";
    protected int dtlsNbr;
    @XmlElement(required = true, nillable = true)
    protected String freightCode = "";
    @XmlElement(required = true, nillable = true)
    protected String headerStatus = "";
    @XmlElement(required = true, nillable = true)
    protected String nbDate = "";
    @XmlElement(required = true, nillable = true)
    protected String operatorId = "";
    @XmlElement(required = true, nillable = true)
    protected String orderDate = "";
    @XmlElement(required = true, nillable = true)
    protected String orderNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String orderTime = "";
    @XmlElement(required = true, nillable = true)
    protected String orderType = "";
    @XmlElement(required = true, nillable = true)
    protected String orderTypeDesc = "";
    @XmlElement(required = true, nillable = true)
    protected String ovalCode1 = "";
    @XmlElement(required = true, nillable = true)
    protected String ovalCode2 = "";
    @XmlElement(required = true, nillable = true)
    protected String ovalCode3 = "";
    @XmlElement(required = true, nillable = true)
    protected String ovalCode4 = "";
    @XmlElement(required = true, nillable = true)
    protected String ovalDesc3 = "";
    @XmlElement(required = true, nillable = true)
    protected String ovalDesc1 = "";
    @XmlElement(required = true, nillable = true)
    protected String ovalDesc2 = "";
    @XmlElement(required = true, nillable = true)
    protected String ovalDesc4 = "";
    @XmlElement(required = true, nillable = true)
    protected String poNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String pricingDate = "";
    @XmlElement(required = true, nillable = true)
    protected String productDesc = "";
    @XmlElement(required = true, nillable = true)
    protected String productType = "";
    @XmlElement(required = true, nillable = true)
    protected String region = "";
    @XmlElement(required = true, nillable = true)
    protected String route = "";
    @XmlElement(required = true, nillable = true)
    protected String selco = "";
    @XmlElement(required = true, nillable = true)
    protected String selcoDesc = "";
    @XmlElement(required = true, nillable = true)
    protected String serviceDate = "";
    @XmlElement(required = true, nillable = true)
    protected String shipPoint = "";
    @XmlElement(required = true, nillable = true)
    protected String smNote = "";
    @XmlElement(required = true, nillable = true)
    protected String statusCode = "";
    @XmlElement(required = true, nillable = true)
    protected String termsCode = "";
    @XmlElement(required = true, nillable = true)
    protected String termsDesc = "";
    @XmlElement(required = true, nillable = true)
    protected String territory = "";
    @XmlElement(required = true, nillable = true)
    protected String userId = "";
    @XmlElement(required = true, nillable = true)
    protected String shippingType = "";
    protected int addrKey;
    protected int addrSeq;
    @XmlElement(required = true, nillable = true)
    protected String ratingMethod = "";
    protected int orderPriced;
    @XmlElement(required = true, nillable = true)
    protected String endUse = "";
    @XmlElement(required = true, nillable = true)
    protected String incoTerms = "";
    @XmlElement(required = true, nillable = true)
    protected String projectNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String endUseDesc = "";
    @XmlElement(required = true, nillable = true)
    protected String parentOrderNbr = "";    

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the subset property.
     * 
     */
    public boolean isSubset() {
        return subset;
    }

    /**
     * Sets the value of the subset property.
     * 
     */
    public void setSubset(boolean value) {
        this.subset = value;
    }

    /**
     * Gets the value of the swatch property.
     * 
     */
    public boolean isSwatch() {
        return swatch;
    }

    /**
     * Sets the value of the swatch property.
     * 
     */
    public void setSwatch(boolean value) {
        this.swatch = value;
    }

    /**
     * Gets the value of the residentialDelvFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialDelvFlag() {
        return residentialDelvFlag;
    }

    /**
     * Sets the value of the residentialDelvFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialDelvFlag(String value) {
        this.residentialDelvFlag = value;
    }

    /**
     * Gets the value of the thirdPartyAdd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAdd1() {
        return thirdPartyAdd1;
    }

    /**
     * Sets the value of the thirdPartyAdd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAdd1(String value) {
        this.thirdPartyAdd1 = value;
    }

    /**
     * Gets the value of the thirdPartyAdd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAdd2() {
        return thirdPartyAdd2;
    }

    /**
     * Sets the value of the thirdPartyAdd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAdd2(String value) {
        this.thirdPartyAdd2 = value;
    }

    /**
     * Gets the value of the thirdPartyCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyCity() {
        return thirdPartyCity;
    }

    /**
     * Sets the value of the thirdPartyCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyCity(String value) {
        this.thirdPartyCity = value;
    }

    /**
     * Gets the value of the thirdPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyName() {
        return thirdPartyName;
    }

    /**
     * Sets the value of the thirdPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyName(String value) {
        this.thirdPartyName = value;
    }

    /**
     * Gets the value of the thirdPartyName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyName2() {
        return thirdPartyName2;
    }

    /**
     * Sets the value of the thirdPartyName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyName2(String value) {
        this.thirdPartyName2 = value;
    }

    /**
     * Gets the value of the thirdPartyState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyState() {
        return thirdPartyState;
    }

    /**
     * Sets the value of the thirdPartyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyState(String value) {
        this.thirdPartyState = value;
    }

    /**
     * Gets the value of the thirdPartyZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyZip() {
        return thirdPartyZip;
    }

    /**
     * Sets the value of the thirdPartyZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyZip(String value) {
        this.thirdPartyZip = value;
    }

    /**
     * Gets the value of the shipToName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToName2() {
        return shipToName2;
    }

    /**
     * Sets the value of the shipToName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToName2(String value) {
        this.shipToName2 = value;
    }

    /**
     * Gets the value of the lastLineNbr property.
     * 
     */
    public int getLastLineNbr() {
        return lastLineNbr;
    }

    /**
     * Sets the value of the lastLineNbr property.
     * 
     */
    public void setLastLineNbr(int value) {
        this.lastLineNbr = value;
    }

    /**
     * Gets the value of the beforeDeliveryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeforeDeliveryFlag() {
        return beforeDeliveryFlag;
    }

    /**
     * Sets the value of the beforeDeliveryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeforeDeliveryFlag(String value) {
        this.beforeDeliveryFlag = value;
    }

    /**
     * Gets the value of the bulkOrderNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkOrderNbr() {
        return bulkOrderNbr;
    }

    /**
     * Sets the value of the bulkOrderNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkOrderNbr(String value) {
        this.bulkOrderNbr = value;
    }

    /**
     * Gets the value of the carrServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrServiceLevel() {
        return carrServiceLevel;
    }

    /**
     * Sets the value of the carrServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrServiceLevel(String value) {
        this.carrServiceLevel = value;
    }

    /**
     * Gets the value of the collateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateFlag() {
        return collateFlag;
    }

    /**
     * Sets the value of the collateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateFlag(String value) {
        this.collateFlag = value;
    }

    /**
     * Gets the value of the labelContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelContact() {
        return labelContact;
    }

    /**
     * Sets the value of the labelContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelContact(String value) {
        this.labelContact = value;
    }

    /**
     * Gets the value of the labelDeliveryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelDeliveryInfo() {
        return labelDeliveryInfo;
    }

    /**
     * Sets the value of the labelDeliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelDeliveryInfo(String value) {
        this.labelDeliveryInfo = value;
    }

    /**
     * Gets the value of the labelProjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelProjectName() {
        return labelProjectName;
    }

    /**
     * Sets the value of the labelProjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelProjectName(String value) {
        this.labelProjectName = value;
    }

    /**
     * Gets the value of the labelShiptoPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelShiptoPhone() {
        return labelShiptoPhone;
    }

    /**
     * Sets the value of the labelShiptoPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelShiptoPhone(String value) {
        this.labelShiptoPhone = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the marketFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketFlag() {
        return marketFlag;
    }

    /**
     * Sets the value of the marketFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketFlag(String value) {
        this.marketFlag = value;
    }

    /**
     * Gets the value of the thirdPartyAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAcc() {
        return thirdPartyAcc;
    }

    /**
     * Sets the value of the thirdPartyAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAcc(String value) {
        this.thirdPartyAcc = value;
    }

    /**
     * Gets the value of the thirdPartyBillFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyBillFlag() {
        return thirdPartyBillFlag;
    }

    /**
     * Sets the value of the thirdPartyBillFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyBillFlag(String value) {
        this.thirdPartyBillFlag = value;
    }

    /**
     * Gets the value of the callBefDelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBefDelFlag() {
        return callBefDelFlag;
    }

    /**
     * Sets the value of the callBefDelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBefDelFlag(String value) {
        this.callBefDelFlag = value;
    }

    /**
     * Gets the value of the thirdPartyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyFlag() {
        return thirdPartyFlag;
    }

    /**
     * Sets the value of the thirdPartyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyFlag(String value) {
        this.thirdPartyFlag = value;
    }

    /**
     * Gets the value of the repFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepFlag() {
        return repFlag;
    }

    /**
     * Sets the value of the repFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepFlag(String value) {
        this.repFlag = value;
    }

    /**
     * Gets the value of the rushFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRushFlag() {
        return rushFlag;
    }

    /**
     * Sets the value of the rushFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRushFlag(String value) {
        this.rushFlag = value;
    }

    /**
     * Gets the value of the totalLines property.
     * 
     */
    public int getTotalLines() {
        return totalLines;
    }

    /**
     * Sets the value of the totalLines property.
     * 
     */
    public void setTotalLines(int value) {
        this.totalLines = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     */
    public double getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     */
    public void setTotalWeight(double value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the carrierFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierFlag() {
        return carrierFlag;
    }

    /**
     * Sets the value of the carrierFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierFlag(String value) {
        this.carrierFlag = value;
    }

    /**
     * Gets the value of the demand property.
     * 
     */
    public boolean isDemand() {
        return demand;
    }

    /**
     * Sets the value of the demand property.
     * 
     */
    public void setDemand(boolean value) {
        this.demand = value;
    }

    /**
     * Gets the value of the honeyWell property.
     * 
     */
    public boolean isHoneyWell() {
        return honeyWell;
    }

    /**
     * Sets the value of the honeyWell property.
     * 
     */
    public void setHoneyWell(boolean value) {
        this.honeyWell = value;
    }

    /**
     * Gets the value of the orderLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLocation() {
        return orderLocation;
    }

    /**
     * Sets the value of the orderLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLocation(String value) {
        this.orderLocation = value;
    }

    /**
     * Gets the value of the creditMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditMessage() {
        return creditMessage;
    }

    /**
     * Sets the value of the creditMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditMessage(String value) {
        this.creditMessage = value;
    }


    /**
     * Gets the value of the shipToAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress1() {
        return shipToAddress1;
    }

    /**
     * Sets the value of the shipToAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress1(String value) {
        this.shipToAddress1 = value;
    }

    /**
     * Gets the value of the shipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Sets the value of the shipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress2(String value) {
        this.shipToAddress2 = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState(String value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToZipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToZipcode() {
        return shipToZipcode;
    }

    /**
     * Sets the value of the shipToZipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToZipcode(String value) {
        this.shipToZipcode = value;
    }

    /**
     * Gets the value of the shipToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToName() {
        return shipToName;
    }

    /**
     * Sets the value of the shipToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToName(String value) {
        this.shipToName = value;
    }

    /**
     * Gets the value of the billCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCity() {
        return billCity;
    }

    /**
     * Sets the value of the billCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCity(String value) {
        this.billCity = value;
    }


    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the area property.
     * 
     */
    public int getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     */
    public void setArea(int value) {
        this.area = value;
    }

    /**
     * Gets the value of the billAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddress1() {
        return billAddress1;
    }

    /**
     * Sets the value of the billAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddress1(String value) {
        this.billAddress1 = value;
    }

    /**
     * Gets the value of the billAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddress2() {
        return billAddress2;
    }

    /**
     * Sets the value of the billAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddress2(String value) {
        this.billAddress2 = value;
    }

    /**
     * Gets the value of the billState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillState() {
        return billState;
    }

    /**
     * Sets the value of the billState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillState(String value) {
        this.billState = value;
    }

    /**
     * Gets the value of the billToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToName() {
        return billToName;
    }

    /**
     * Sets the value of the billToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToName(String value) {
        this.billToName = value;
    }

    /**
     * Gets the value of the billZipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillZipcode() {
        return billZipcode;
    }

    /**
     * Sets the value of the billZipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillZipcode(String value) {
        this.billZipcode = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the commCust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommCust() {
        return commCust;
    }

    /**
     * Sets the value of the commCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommCust(String value) {
        this.commCust = value;
    }

    /**
     * Gets the value of the confirmStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmStat() {
        return confirmStat;
    }

    /**
     * Sets the value of the confirmStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmStat(String value) {
        this.confirmStat = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the destCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCountryCode() {
        return destCountryCode;
    }

    /**
     * Sets the value of the destCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCountryCode(String value) {
        this.destCountryCode = value;
    }

    /**
     * Gets the value of the creditCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCode() {
        return creditCode;
    }

    /**
     * Sets the value of the creditCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCode(String value) {
        this.creditCode = value;
    }

    /**
     * Gets the value of the creditDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditDate() {
        return creditDate;
    }

    /**
     * Sets the value of the creditDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditDate(String value) {
        this.creditDate = value;
    }

    /**
     * Gets the value of the creditDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditDesc() {
        return creditDesc;
    }

    /**
     * Sets the value of the creditDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditDesc(String value) {
        this.creditDesc = value;
    }

    /**
     * Gets the value of the custKwic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustKwic() {
        return custKwic;
    }

    /**
     * Sets the value of the custKwic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustKwic(String value) {
        this.custKwic = value;
    }

    /**
     * Gets the value of the custNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNbr() {
        return custNbr;
    }

    /**
     * Sets the value of the custNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNbr(String value) {
        this.custNbr = value;
    }

    /**
     * Gets the value of the custRefNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustRefNbr() {
        return custRefNbr;
    }

    /**
     * Sets the value of the custRefNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustRefNbr(String value) {
        this.custRefNbr = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDate(String value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the dtlsNbr property.
     * 
     */
    public int getDtlsNbr() {
        return dtlsNbr;
    }

    /**
     * Sets the value of the dtlsNbr property.
     * 
     */
    public void setDtlsNbr(int value) {
        this.dtlsNbr = value;
    }

    /**
     * Gets the value of the freightCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightCode() {
        return freightCode;
    }

    /**
     * Sets the value of the freightCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightCode(String value) {
        this.freightCode = value;
    }

    /**
     * Gets the value of the headerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderStatus() {
        return headerStatus;
    }

    /**
     * Sets the value of the headerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderStatus(String value) {
        this.headerStatus = value;
    }

    /**
     * Gets the value of the nbDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbDate() {
        return nbDate;
    }

    /**
     * Sets the value of the nbDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbDate(String value) {
        this.nbDate = value;
    }

    /**
     * Gets the value of the operatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Sets the value of the operatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorId(String value) {
        this.operatorId = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNbr() {
        return orderNbr;
    }

    /**
     * Sets the value of the orderNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNbr(String value) {
        this.orderNbr = value;
    }

    /**
     * Gets the value of the orderTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTime() {
        return orderTime;
    }

    /**
     * Sets the value of the orderTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTime(String value) {
        this.orderTime = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the orderTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTypeDesc() {
        return orderTypeDesc;
    }

    /**
     * Sets the value of the orderTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTypeDesc(String value) {
        this.orderTypeDesc = value;
    }

    /**
     * Gets the value of the ovalCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvalCode1() {
        return ovalCode1;
    }

    /**
     * Sets the value of the ovalCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvalCode1(String value) {
        this.ovalCode1 = value;
    }

    /**
     * Gets the value of the ovalCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvalCode2() {
        return ovalCode2;
    }

    /**
     * Sets the value of the ovalCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvalCode2(String value) {
        this.ovalCode2 = value;
    }

    /**
     * Gets the value of the ovalCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvalCode3() {
        return ovalCode3;
    }

    /**
     * Sets the value of the ovalCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvalCode3(String value) {
        this.ovalCode3 = value;
    }

    /**
     * Gets the value of the ovalCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvalCode4() {
        return ovalCode4;
    }

    /**
     * Sets the value of the ovalCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvalCode4(String value) {
        this.ovalCode4 = value;
    }

    /**
     * Gets the value of the ovalDesc3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvalDesc3() {
        return ovalDesc3;
    }

    /**
     * Sets the value of the ovalDesc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvalDesc3(String value) {
        this.ovalDesc3 = value;
    }

    /**
     * Gets the value of the ovalDesc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvalDesc1() {
        return ovalDesc1;
    }

    /**
     * Sets the value of the ovalDesc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvalDesc1(String value) {
        this.ovalDesc1 = value;
    }

    /**
     * Gets the value of the ovalDesc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvalDesc2() {
        return ovalDesc2;
    }

    /**
     * Sets the value of the ovalDesc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvalDesc2(String value) {
        this.ovalDesc2 = value;
    }

    /**
     * Gets the value of the ovalDesc4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvalDesc4() {
        return ovalDesc4;
    }

    /**
     * Sets the value of the ovalDesc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvalDesc4(String value) {
        this.ovalDesc4 = value;
    }

    /**
     * Gets the value of the poNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNbr() {
        return poNbr;
    }

    /**
     * Sets the value of the poNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNbr(String value) {
        this.poNbr = value;
    }

    /**
     * Gets the value of the pricingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingDate() {
        return pricingDate;
    }

    /**
     * Sets the value of the pricingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingDate(String value) {
        this.pricingDate = value;
    }

    /**
     * Gets the value of the productDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * Sets the value of the productDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDesc(String value) {
        this.productDesc = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the selco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelco() {
        return selco;
    }

    /**
     * Sets the value of the selco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelco(String value) {
        this.selco = value;
    }

    /**
     * Gets the value of the selcoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelcoDesc() {
        return selcoDesc;
    }

    /**
     * Sets the value of the selcoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelcoDesc(String value) {
        this.selcoDesc = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDate(String value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the shipPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipPoint() {
        return shipPoint;
    }

    /**
     * Sets the value of the shipPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipPoint(String value) {
        this.shipPoint = value;
    }

    /**
     * Gets the value of the smNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmNote() {
        return smNote;
    }

    /**
     * Sets the value of the smNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmNote(String value) {
        this.smNote = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the termsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsCode() {
        return termsCode;
    }

    /**
     * Sets the value of the termsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsCode(String value) {
        this.termsCode = value;
    }

    /**
     * Gets the value of the termsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsDesc() {
        return termsDesc;
    }

    /**
     * Sets the value of the termsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsDesc(String value) {
        this.termsDesc = value;
    }

    /**
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory(String value) {
        this.territory = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the shippingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingType() {
        return shippingType;
    }

    /**
     * Sets the value of the shippingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingType(String value) {
        this.shippingType = value;
    }

    /**
     * Gets the value of the addrKey property.
     * 
     */
    public int getAddrKey() {
        return addrKey;
    }

    /**
     * Sets the value of the addrKey property.
     * 
     */
    public void setAddrKey(int value) {
        this.addrKey = value;
    }

    /**
     * Gets the value of the addrSeq property.
     * 
     */
    public int getAddrSeq() {
        return addrSeq;
    }

    /**
     * Sets the value of the addrSeq property.
     * 
     */
    public void setAddrSeq(int value) {
        this.addrSeq = value;
    }

    /**
     * Gets the value of the ratingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingMethod() {
        return ratingMethod;
    }

    /**
     * Sets the value of the ratingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingMethod(String value) {
        this.ratingMethod = value;
    }

    /**
     * Gets the value of the orderPriced property.
     * 
     */
    public int getOrderPriced() {
        return orderPriced;
    }

    /**
     * Sets the value of the orderPriced property.
     * 
     */
    public void setOrderPriced(int value) {
        this.orderPriced = value;
    }

    /**
     * Gets the value of the endUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUse() {
        return endUse;
    }

    /**
     * Sets the value of the endUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUse(String value) {
        this.endUse = value;
    }

    /**
     * Gets the value of the incoTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoTerms() {
        return incoTerms;
    }

    /**
     * Sets the value of the incoTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoTerms(String value) {
        this.incoTerms = value;
    }

    /**
     * Gets the value of the projectNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectNbr() {
        return projectNbr;
    }

    /**
     * Sets the value of the projectNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectNbr(String value) {
        this.projectNbr = value;
    }

    /**
     * Gets the value of the endUseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUseDesc() {
        return endUseDesc;
    }

    /**
     * Sets the value of the endUseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUseDesc(String value) {
        this.endUseDesc = value;
    }

	public List<String> getSpecialInst()
	{
        if (specialInst == null) {
        	this.specialInst = new ArrayList<String>();
        }
		return specialInst;
	}

	public void setSpecialInst(List<String> specialInst)
	{
		this.specialInst = specialInst;
	}

	public List<HeaderSidemark> getHeaderSidemarks()
	{
        if (headerSidemarks == null) 
        {
        	this.headerSidemarks = new ArrayList<HeaderSidemark>();
        }

		return headerSidemarks;
	}

	public void setHeaderSidemarks(List<HeaderSidemark> headerSidemarks)
	{
		this.headerSidemarks = headerSidemarks;		
	}

	public String getParentOrderNbr()
	{
		return parentOrderNbr;
	}

	public void setParentOrderNbr(String parentOrderNbr)
	{
		this.parentOrderNbr = parentOrderNbr;
	}

	
	
	
}
