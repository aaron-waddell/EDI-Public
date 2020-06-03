
package com.shaw.ediorderservices.csws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportingUom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sampleInvType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sampleLabelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="standardLengthInch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="trackingMessage1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackingMessage2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="excepionComments" type="{http://orderview.csws.shaw.com}ArrayOfExceptionComments"/>
 *         &lt;element name="exceptionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exceptionGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exceptionId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="exceptionReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exceptionStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exceptionTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="repromCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="assignUom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cartonQty" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="genericLabelFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="weightUom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invPlant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sampleColorNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="samplePackType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sampleSeqNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sampleSpecCustNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sampleStyleNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sampleSubset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sampleTypeset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sampleTypesetDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idLastChanged" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="atsDateMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineSidemarks" type="{http://orderview.csws.shaw.com}ArrayOfLineSidemark"/>
 *         &lt;element name="assignPerm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="atsDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="colorNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateLastChanged" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dyelotNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dyelotSeqNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dyelotType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fxCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupWidth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="masterRelease" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="misc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qtyOrdered" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rcsCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rollNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="standardLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="standardWidthFeet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="standardWidthInch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="styleNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uomDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="assignDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="assignQty" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custColorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custStyle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custStyleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dyelot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineNbr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderUom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="repromDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="custStyleRefNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dyelotGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inventoryUom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nbrPieces" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="notBeforeDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="palletUom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="retailUom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specifiedDyelot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="demandLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rollsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="demandOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invColorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invColorNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invQty" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="invStyleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invStyleNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ratingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foreignPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}double"/>          
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLine", namespace="http://v3.orderview.csws.shaw.com")
public class OrderLine {

    @XmlElement(required = true, nillable = true)
    protected String productClass = "";
    @XmlElement(required = true, nillable = true)
    protected String productCode = "";
    @XmlElement(required = true, nillable = true)
    protected String reportingUom = "";
    @XmlElement(required = true, nillable = true)
    protected String sampleInvType = "";
    @XmlElement(required = true, nillable = true)
    protected String sampleLabelType = "";
    protected int standardLengthInch;
    @XmlElement(required = true, nillable = true)
    protected String trackingMessage1 = "";
    @XmlElement(required = true, nillable = true)
    protected String trackingMessage2 = "";
    @XmlElement(required = true, nillable = true)
    protected List<ExceptionComments> excepionComments;
    @XmlElement(required = true, nillable = true)
    protected String exceptionDescription = "";
    @XmlElement(required = true, nillable = true)
    protected String exceptionGroup = "";
    protected double exceptionId;
    @XmlElement(required = true, nillable = true)
    protected String exceptionReasonCode = "";
    @XmlElement(required = true, nillable = true)
    protected String exceptionStatus = "";
    @XmlElement(required = true, nillable = true)
    protected String exceptionTimestamp = "";
    protected int repromCount;
    @XmlElement(required = true, nillable = true)
    protected String errorTimestamp = "";
    @XmlElement(required = true, nillable = true)
    protected String assignUom = "";
    protected double cartonQty;
    @XmlElement(required = true, nillable = true)
    protected String genericLabelFlag = "";
    protected double height;
    @XmlElement(required = true, nillable = true)
    protected String weightUom = "";
    @XmlElement(required = true, nillable = true)
    protected String productType = "";
    @XmlElement(required = true, nillable = true)
    protected String invPlant = "";
    @XmlElement(required = true, nillable = true)
    protected String sampleColorNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String samplePackType = "";
    @XmlElement(required = true, nillable = true)
    protected String sampleSeqNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String sampleSpecCustNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String sampleStyleNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String sampleSubset = "";
    @XmlElement(required = true, nillable = true)
    protected String sampleTypeset = "";
    @XmlElement(required = true, nillable = true)
    protected String sampleTypesetDesc = "";
    @XmlElement(required = true, nillable = true)
    protected String userId = "";
    @XmlElement(required = true, nillable = true)
    protected String trackMessage = "";
    @XmlElement(required = true, nillable = true)
    protected String idLastChanged = "";
    @XmlElement(required = true, nillable = true)
    protected String atsDateMessage = "";
    @XmlElement(required = true, nillable = true)
    protected List<LineSidemark> lineSidemarks;
    @XmlElement(required = true, nillable = true)
    protected String assignPerm = "";
    @XmlElement(required = true, nillable = true)
    protected String atsDate = "";
    @XmlElement(required = true, nillable = true)
    protected String colorNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String dateLastChanged = "";
    @XmlElement(required = true, nillable = true)
    protected String dyelotNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String dyelotSeqNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String dyelotType = "";
    @XmlElement(required = true, nillable = true)
    protected String fxCode = "";
    @XmlElement(required = true, nillable = true)
    protected String groupWidth = "";
    protected double length;
    @XmlElement(required = true, nillable = true)
    protected String masterRelease = "";
    protected int maxLength;
    protected int minLength;
    @XmlElement(required = true, nillable = true)
    protected String misc = "";
    @XmlElement(required = true, nillable = true)
    protected String priority = "";
    protected double qtyOrdered;
    @XmlElement(required = true, nillable = true)
    protected String rcsCode = "";
    @XmlElement(required = true, nillable = true)
    protected String rollNbr = "";
    protected int standardLength;
    protected int standardWidthFeet;
    protected int standardWidthInch;
    @XmlElement(required = true, nillable = true)
    protected String styleNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String groupNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String uomDesc = "";
    protected double width;
    @XmlElement(required = true, nillable = true)
    protected String assignDate = "";
    protected double assignQty;
    @XmlElement(required = true, nillable = true)
    protected String bol = "";
    @XmlElement(required = true, nillable = true)
    protected String custColor = "";
    @XmlElement(required = true, nillable = true)
    protected String custColorName = "";
    @XmlElement(required = true, nillable = true)
    protected String custStyle = "";
    @XmlElement(required = true, nillable = true)
    protected String custStyleName = "";
    @XmlElement(required = true, nillable = true)
    protected String deliveryDate = "";
    @XmlElement(required = true, nillable = true)
    protected String dyelot = "";
    @XmlElement(required = true, nillable = true)
    protected String invoiceNbr = "";
    protected int lineNbr;
    @XmlElement(required = true, nillable = true)
    protected String orderUom = "";
    @XmlElement(required = true, nillable = true)
    protected String repromDate = "";
    @XmlElement(required = true, nillable = true)
    protected String shipDate = "";
    @XmlElement(required = true, nillable = true)
    protected String statusCode = "";
    @XmlElement(required = true, nillable = true)
    protected String statusDesc = "";
    protected double totalWeight;
    protected double unitPrice;
    @XmlElement(required = true, nillable = true)
    protected String custStyleRefNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String dyelotGroup = "";
    @XmlElement(required = true, nillable = true)
    protected String grade = "";
    @XmlElement(required = true, nillable = true)
    protected String inventoryUom = "";
    protected int nbrPieces;
    @XmlElement(required = true, nillable = true)
    protected String notBeforeDate = "";
    @XmlElement(required = true, nillable = true)
    protected String palletUom = "";
    @XmlElement(required = true, nillable = true)
    protected String retailUom = "";
    @XmlElement(required = true, nillable = true)
    protected String specifiedDyelot = "";
    @XmlElement(required = true, nillable = true)
    protected String demandLine = "";
    protected boolean rollsOnly;
    @XmlElement(required = true, nillable = true)
    protected String demandOrder = "";
    @XmlElement(required = true, nillable = true)
    protected String invColorName = "";
    @XmlElement(required = true, nillable = true)
    protected String invColorNbr = "";
    protected double invQty;
    @XmlElement(required = true, nillable = true)
    protected String invStyleName = "";
    @XmlElement(required = true, nillable = true)
    protected String invStyleNbr = "";
    @XmlElement(required = true, nillable = true)
    protected String ratingStatus = "";
    @XmlElement(required = true, nillable = true)
    protected String selco = "";
    @XmlElement(required = true, nillable = true)
    protected String currencyCode = "";
    @XmlElement(required = true, nillable = true)
    protected double foreignPrice = 0.00;
    @XmlElement(required = true, nillable = true)
    protected double exchangeRate = 0.00;
    protected int quoteNbr;
    @XmlElement(required = true, nillable = true)
    protected String poNbr = "";
    protected int poLineNbr;
    @XmlElement(required = true, nillable = true)
    protected String primarySKU = "";
    @XmlElement(required = true, nillable = true)
    protected String rawMatOrderNbr = "";
    protected int rawMatLineNbr;
    @XmlElement(required = true, nillable = true)
    protected String styleNameLong = "";
    @XmlElement(required = true, nillable = true)
    protected String styleNameShort = "";
    @XmlElement(required = true, nillable = true)
    protected String colorNameLong = "";
    @XmlElement(required = true, nillable = true)
    protected String colorNameShort = "";
    @XmlElement(required = true, nillable = true)
    protected String leadTimeDate = "";
    @XmlElement(required = true, nillable = true)
    protected String leadTimeFlag = "";
    @XmlElement(required = true, nillable = true)
    protected String leadTypeDesc = "";
    @XmlElement(required = true, nillable = true)
    protected String delvEligible = "";
    @XmlElement(required = true, nillable = true)
    protected String delvRangeStart = "";
    @XmlElement(required = true, nillable = true)
    protected String delvRangeEnd = "";

    /**
     * Gets the value of the productClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClass() {
        return productClass;
    }

    /**
     * Sets the value of the productClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClass(String value) {
        this.productClass = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the reportingUom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingUom() {
        return reportingUom;
    }

    /**
     * Sets the value of the reportingUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingUom(String value) {
        this.reportingUom = value;
    }

    /**
     * Gets the value of the sampleInvType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleInvType() {
        return sampleInvType;
    }

    /**
     * Sets the value of the sampleInvType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleInvType(String value) {
        this.sampleInvType = value;
    }

    /**
     * Gets the value of the sampleLabelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleLabelType() {
        return sampleLabelType;
    }

    /**
     * Sets the value of the sampleLabelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleLabelType(String value) {
        this.sampleLabelType = value;
    }

    /**
     * Gets the value of the standardLengthInch property.
     * 
     */
    public int getStandardLengthInch() {
        return standardLengthInch;
    }

    /**
     * Sets the value of the standardLengthInch property.
     * 
     */
    public void setStandardLengthInch(int value) {
        this.standardLengthInch = value;
    }

    /**
     * Gets the value of the trackingMessage1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingMessage1() {
        return trackingMessage1;
    }

    /**
     * Sets the value of the trackingMessage1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingMessage1(String value) {
        this.trackingMessage1 = value;
    }

    /**
     * Gets the value of the trackingMessage2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingMessage2() {
        return trackingMessage2;
    }

    /**
     * Sets the value of the trackingMessage2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingMessage2(String value) {
        this.trackingMessage2 = value;
    }

	public List<ExceptionComments> getExcepionComments()
	{
        if (excepionComments == null) {
        	this.excepionComments = new ArrayList<ExceptionComments>();
        }		
		return excepionComments;
	}

	public void setExcepionComments(List<ExceptionComments> excepionComments)
	{
		this.excepionComments = excepionComments;
	}

	public String getExceptionDescription()
	{
		return exceptionDescription;
	}

	public void setExceptionDescription(String exceptionDescription)
	{
		this.exceptionDescription = exceptionDescription;
	}

	public String getExceptionGroup()
	{
		return exceptionGroup;
	}

	public void setExceptionGroup(String exceptionGroup)
	{
		this.exceptionGroup = exceptionGroup;
	}

	public double getExceptionId()
	{
		return exceptionId;
	}

	public void setExceptionId(double exceptionId)
	{
		this.exceptionId = exceptionId;
	}

	public String getExceptionReasonCode()
	{
		return exceptionReasonCode;
	}

	public void setExceptionReasonCode(String exceptionReasonCode)
	{
		this.exceptionReasonCode = exceptionReasonCode;
	}

	public String getExceptionStatus()
	{
		return exceptionStatus;
	}

	public void setExceptionStatus(String exceptionStatus)
	{
		this.exceptionStatus = exceptionStatus;
	}

	public String getExceptionTimestamp()
	{
		return exceptionTimestamp;
	}

	public void setExceptionTimestamp(String exceptionTimestamp)
	{
		this.exceptionTimestamp = exceptionTimestamp;
	}

	public int getRepromCount()
	{
		return repromCount;
	}

	public void setRepromCount(int repromCount)
	{
		this.repromCount = repromCount;
	}

	public String getErrorTimestamp()
	{
		return errorTimestamp;
	}

	public void setErrorTimestamp(String errorTimestamp)
	{
		this.errorTimestamp = errorTimestamp;
	}

	public String getAssignUom()
	{
		return assignUom;
	}

	public void setAssignUom(String assignUom)
	{
		this.assignUom = assignUom;
	}

	public double getCartonQty()
	{
		return cartonQty;
	}

	public void setCartonQty(double cartonQty)
	{
		this.cartonQty = cartonQty;
	}

	public String getGenericLabelFlag()
	{
		return genericLabelFlag;
	}

	public void setGenericLabelFlag(String genericLabelFlag)
	{
		this.genericLabelFlag = genericLabelFlag;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public String getWeightUom()
	{
		return weightUom;
	}

	public void setWeightUom(String weightUom)
	{
		this.weightUom = weightUom;
	}

	public String getProductType()
	{
		return productType;
	}

	public void setProductType(String productType)
	{
		this.productType = productType;
	}

	public String getInvPlant()
	{
		return invPlant;
	}

	public void setInvPlant(String invPlant)
	{
		this.invPlant = invPlant;
	}

	public String getSampleColorNbr()
	{
		return sampleColorNbr;
	}

	public void setSampleColorNbr(String sampleColorNbr)
	{
		this.sampleColorNbr = sampleColorNbr;
	}

	public String getSamplePackType()
	{
		return samplePackType;
	}

	public void setSamplePackType(String samplePackType)
	{
		this.samplePackType = samplePackType;
	}

	public String getSampleSeqNbr()
	{
		return sampleSeqNbr;
	}

	public void setSampleSeqNbr(String sampleSeqNbr)
	{
		this.sampleSeqNbr = sampleSeqNbr;
	}

	public String getSampleSpecCustNbr()
	{
		return sampleSpecCustNbr;
	}

	public void setSampleSpecCustNbr(String sampleSpecCustNbr)
	{
		this.sampleSpecCustNbr = sampleSpecCustNbr;
	}

	public String getSampleStyleNbr()
	{
		return sampleStyleNbr;
	}

	public void setSampleStyleNbr(String sampleStyleNbr)
	{
		this.sampleStyleNbr = sampleStyleNbr;
	}

	public String getSampleSubset()
	{
		return sampleSubset;
	}

	public void setSampleSubset(String sampleSubset)
	{
		this.sampleSubset = sampleSubset;
	}

	public String getSampleTypeset()
	{
		return sampleTypeset;
	}

	public void setSampleTypeset(String sampleTypeset)
	{
		this.sampleTypeset = sampleTypeset;
	}

	public String getSampleTypesetDesc()
	{
		return sampleTypesetDesc;
	}

	public void setSampleTypesetDesc(String sampleTypesetDesc)
	{
		this.sampleTypesetDesc = sampleTypesetDesc;
	}

	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public String getTrackMessage()
	{
		return trackMessage;
	}

	public void setTrackMessage(String trackMessage)
	{
		this.trackMessage = trackMessage;
	}

	public String getIdLastChanged()
	{
		return idLastChanged;
	}

	public void setIdLastChanged(String idLastChanged)
	{
		this.idLastChanged = idLastChanged;
	}

	public String getAtsDateMessage()
	{
		return atsDateMessage;
	}

	public void setAtsDateMessage(String atsDateMessage)
	{
		this.atsDateMessage = atsDateMessage;
	}

	public List<LineSidemark> getLineSidemarks()
	{
        if (lineSidemarks == null) {
        	lineSidemarks = new ArrayList<LineSidemark>();
        }		
		
		return lineSidemarks;
	}

	public void setLineSidemarks(List<LineSidemark> lineSidemarks)
	{
		this.lineSidemarks = lineSidemarks;
	}

	public String getAssignPerm()
	{
		return assignPerm;
	}

	public void setAssignPerm(String assignPerm)
	{
		this.assignPerm = assignPerm;
	}

	public String getAtsDate()
	{
		return atsDate;
	}

	public void setAtsDate(String atsDate)
	{
		this.atsDate = atsDate;
	}

	public String getColorNbr()
	{
		return colorNbr;
	}

	public void setColorNbr(String colorNbr)
	{
		this.colorNbr = colorNbr;
	}

	public String getDateLastChanged()
	{
		return dateLastChanged;
	}

	public void setDateLastChanged(String dateLastChanged)
	{
		this.dateLastChanged = dateLastChanged;
	}

	public String getDyelotNbr()
	{
		return dyelotNbr;
	}

	public void setDyelotNbr(String dyelotNbr)
	{
		this.dyelotNbr = dyelotNbr;
	}

	public String getDyelotSeqNbr()
	{
		return dyelotSeqNbr;
	}

	public void setDyelotSeqNbr(String dyelotSeqNbr)
	{
		this.dyelotSeqNbr = dyelotSeqNbr;
	}

	public String getDyelotType()
	{
		return dyelotType;
	}

	public void setDyelotType(String dyelotType)
	{
		this.dyelotType = dyelotType;
	}

	public String getFxCode()
	{
		return fxCode;
	}

	public void setFxCode(String fxCode)
	{
		this.fxCode = fxCode;
	}

	public String getGroupWidth()
	{
		return groupWidth;
	}

	public void setGroupWidth(String groupWidth)
	{
		this.groupWidth = groupWidth;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}

	public String getMasterRelease()
	{
		return masterRelease;
	}

	public void setMasterRelease(String masterRelease)
	{
		this.masterRelease = masterRelease;
	}

	public int getMaxLength()
	{
		return maxLength;
	}

	public void setMaxLength(int maxLength)
	{
		this.maxLength = maxLength;
	}

	public int getMinLength()
	{
		return minLength;
	}

	public void setMinLength(int minLength)
	{
		this.minLength = minLength;
	}

	public String getMisc()
	{
		return misc;
	}

	public void setMisc(String misc)
	{
		this.misc = misc;
	}

	public String getPriority()
	{
		return priority;
	}

	public void setPriority(String priority)
	{
		this.priority = priority;
	}

	public double getQtyOrdered()
	{
		return qtyOrdered;
	}

	public void setQtyOrdered(double qtyOrdered)
	{
		this.qtyOrdered = qtyOrdered;
	}

	public String getRcsCode()
	{
		return rcsCode;
	}

	public void setRcsCode(String rcsCode)
	{
		this.rcsCode = rcsCode;
	}

	public String getRollNbr()
	{
		return rollNbr;
	}

	public void setRollNbr(String rollNbr)
	{
		this.rollNbr = rollNbr;
	}

	public int getStandardLength()
	{
		return standardLength;
	}

	public void setStandardLength(int standardLength)
	{
		this.standardLength = standardLength;
	}

	public int getStandardWidthFeet()
	{
		return standardWidthFeet;
	}

	public void setStandardWidthFeet(int standardWidthFeet)
	{
		this.standardWidthFeet = standardWidthFeet;
	}

	public int getStandardWidthInch()
	{
		return standardWidthInch;
	}

	public void setStandardWidthInch(int standardWidthInch)
	{
		this.standardWidthInch = standardWidthInch;
	}

	public String getStyleNbr()
	{
		return styleNbr;
	}

	public void setStyleNbr(String styleNbr)
	{
		this.styleNbr = styleNbr;
	}

	public String getGroupNbr()
	{
		return groupNbr;
	}

	public void setGroupNbr(String groupNbr)
	{
		this.groupNbr = groupNbr;
	}

	public String getUomDesc()
	{
		return uomDesc;
	}

	public void setUomDesc(String uomDesc)
	{
		this.uomDesc = uomDesc;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	public String getAssignDate()
	{
		return assignDate;
	}

	public void setAssignDate(String assignDate)
	{
		this.assignDate = assignDate;
	}

	public double getAssignQty()
	{
		return assignQty;
	}

	public void setAssignQty(double assignQty)
	{
		this.assignQty = assignQty;
	}

	public String getBol()
	{
		return bol;
	}

	public void setBol(String bol)
	{
		this.bol = bol;
	}

	public String getCustColor()
	{
		return custColor;
	}

	public void setCustColor(String custColor)
	{
		this.custColor = custColor;
	}

	public String getCustColorName()
	{
		return custColorName;
	}

	public void setCustColorName(String custColorName)
	{
		this.custColorName = custColorName;
	}

	public String getCustStyle()
	{
		return custStyle;
	}

	public void setCustStyle(String custStyle)
	{
		this.custStyle = custStyle;
	}

	public String getCustStyleName()
	{
		return custStyleName;
	}

	public void setCustStyleName(String custStyleName)
	{
		this.custStyleName = custStyleName;
	}

	public String getDeliveryDate()
	{
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate)
	{
		this.deliveryDate = deliveryDate;
	}

	public String getDyelot()
	{
		return dyelot;
	}

	public void setDyelot(String dyelot)
	{
		this.dyelot = dyelot;
	}

	public String getInvoiceNbr()
	{
		return invoiceNbr;
	}

	public void setInvoiceNbr(String invoiceNbr)
	{
		this.invoiceNbr = invoiceNbr;
	}

	public int getLineNbr()
	{
		return lineNbr;
	}

	public void setLineNbr(int lineNbr)
	{
		this.lineNbr = lineNbr;
	}

	public String getOrderUom()
	{
		return orderUom;
	}

	public void setOrderUom(String orderUom)
	{
		this.orderUom = orderUom;
	}

	public String getRepromDate()
	{
		return repromDate;
	}

	public void setRepromDate(String repromDate)
	{
		this.repromDate = repromDate;
	}

	public String getShipDate()
	{
		return shipDate;
	}

	public void setShipDate(String shipDate)
	{
		this.shipDate = shipDate;
	}

	public String getStatusCode()
	{
		return statusCode;
	}

	public void setStatusCode(String statusCode)
	{
		this.statusCode = statusCode;
	}

	public String getStatusDesc()
	{
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc)
	{
		this.statusDesc = statusDesc;
	}

	public double getTotalWeight()
	{
		return totalWeight;
	}

	public void setTotalWeight(double totalWeight)
	{
		this.totalWeight = totalWeight;
	}

	public double getUnitPrice()
	{
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice)
	{
		this.unitPrice = unitPrice;
	}

	public String getCustStyleRefNbr()
	{
		return custStyleRefNbr;
	}

	public void setCustStyleRefNbr(String custStyleRefNbr)
	{
		this.custStyleRefNbr = custStyleRefNbr;
	}

	public String getDyelotGroup()
	{
		return dyelotGroup;
	}

	public void setDyelotGroup(String dyelotGroup)
	{
		this.dyelotGroup = dyelotGroup;
	}

	public String getGrade()
	{
		return grade;
	}

	public void setGrade(String grade)
	{
		this.grade = grade;
	}

	public String getInventoryUom()
	{
		return inventoryUom;
	}

	public void setInventoryUom(String inventoryUom)
	{
		this.inventoryUom = inventoryUom;
	}

	public int getNbrPieces()
	{
		return nbrPieces;
	}

	public void setNbrPieces(int nbrPieces)
	{
		this.nbrPieces = nbrPieces;
	}

	public String getNotBeforeDate()
	{
		return notBeforeDate;
	}

	public void setNotBeforeDate(String notBeforeDate)
	{
		this.notBeforeDate = notBeforeDate;
	}

	public String getPalletUom()
	{
		return palletUom;
	}

	public void setPalletUom(String palletUom)
	{
		this.palletUom = palletUom;
	}

	public String getRetailUom()
	{
		return retailUom;
	}

	public void setRetailUom(String retailUom)
	{
		this.retailUom = retailUom;
	}

	public String getSpecifiedDyelot()
	{
		return specifiedDyelot;
	}

	public void setSpecifiedDyelot(String specifiedDyelot)
	{
		this.specifiedDyelot = specifiedDyelot;
	}

	public String getDemandLine()
	{
		return demandLine;
	}

	public void setDemandLine(String demandLine)
	{
		this.demandLine = demandLine;
	}

	public boolean isRollsOnly()
	{
		return rollsOnly;
	}

	public void setRollsOnly(boolean rollsOnly)
	{
		this.rollsOnly = rollsOnly;
	}

	public String getDemandOrder()
	{
		return demandOrder;
	}

	public void setDemandOrder(String demandOrder)
	{
		this.demandOrder = demandOrder;
	}

	public String getInvColorName()
	{
		return invColorName;
	}

	public void setInvColorName(String invColorName)
	{
		this.invColorName = invColorName;
	}

	public String getInvColorNbr()
	{
		return invColorNbr;
	}

	public void setInvColorNbr(String invColorNbr)
	{
		this.invColorNbr = invColorNbr;
	}

	public double getInvQty()
	{
		return invQty;
	}

	public void setInvQty(double invQty)
	{
		this.invQty = invQty;
	}

	public String getInvStyleName()
	{
		return invStyleName;
	}

	public void setInvStyleName(String invStyleName)
	{
		this.invStyleName = invStyleName;
	}

	public String getInvStyleNbr()
	{
		return invStyleNbr;
	}

	public void setInvStyleNbr(String invStyleNbr)
	{
		this.invStyleNbr = invStyleNbr;
	}

	public String getRatingStatus()
	{
		return ratingStatus;
	}

	public void setRatingStatus(String ratingStatus)
	{
		this.ratingStatus = ratingStatus;
	}

	public String getSelco()
	{
		return selco;
	}

	public void setSelco(String selco)
	{
		this.selco = selco;
	}

	public String getCurrencyCode()
	{
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

	public double getForeignPrice()
	{
		return foreignPrice;
	}

	public void setForeignPrice(double foreignPrice)
	{
		this.foreignPrice = foreignPrice;
	}

	public double getExchangeRate()
	{
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate)
	{
		this.exchangeRate = exchangeRate;
	}

	public int getQuoteNbr()
	{
		return quoteNbr;
	}

	public void setQuoteNbr(int quoteNbr)
	{
		this.quoteNbr = quoteNbr;
	}

	public String getPoNbr()
	{
		return poNbr;
	}

	public void setPoNbr(String poNbr)
	{
		this.poNbr = poNbr;
	}

	public int getPoLineNbr()
	{
		return poLineNbr;
	}

	public void setPoLineNbr(int poLineNbr)
	{
		this.poLineNbr = poLineNbr;
	}

	public String getPrimarySKU()
	{
		return primarySKU;
	}

	public void setPrimarySKU(String primarySKU)
	{
		this.primarySKU = primarySKU;
	}

	public String getRawMatOrderNbr()
	{
		return rawMatOrderNbr;
	}

	public void setRawMatOrderNbr(String rawMatOrderNbr)
	{
		this.rawMatOrderNbr = rawMatOrderNbr;
	}

	public int getRawMatLineNbr()
	{
		return rawMatLineNbr;
	}

	public void setRawMatLineNbr(int rawMatLineNbr)
	{
		this.rawMatLineNbr = rawMatLineNbr;
	}

	public String getStyleNameLong()
	{
		return styleNameLong;
	}

	public void setStyleNameLong(String styleNameLong)
	{
		this.styleNameLong = styleNameLong;
	}

	public String getStyleNameShort()
	{
		return styleNameShort;
	}

	public void setStyleNameShort(String styleNameShort)
	{
		this.styleNameShort = styleNameShort;
	}

	public String getColorNameLong()
	{
		return colorNameLong;
	}

	public void setColorNameLong(String colorNameLong)
	{
		this.colorNameLong = colorNameLong;
	}

	public String getColorNameShort()
	{
		return colorNameShort;
	}

	public void setColorNameShort(String colorNameShort)
	{
		this.colorNameShort = colorNameShort;
	}

	public String getLeadTimeDate()
	{
		return leadTimeDate;
	}

	public void setLeadTimeDate(String leadTimeDate)
	{
		this.leadTimeDate = leadTimeDate;
	}

	public String getLeadTimeFlag()
	{
		return leadTimeFlag;
	}

	public void setLeadTimeFlag(String leadTimeFlag)
	{
		this.leadTimeFlag = leadTimeFlag;
	}

	public String getLeadTypeDesc()
	{
		return leadTypeDesc;
	}

	public void setLeadTypeDesc(String leadTypeDesc)
	{
		this.leadTypeDesc = leadTypeDesc;
	}

	public String getDelvEligible()
	{
		return delvEligible;
	}

	public void setDelvEligible(String delvEligible)
	{
		this.delvEligible = delvEligible;
	}

	public String getDelvRangeStart()
	{
		return delvRangeStart;
	}

	public void setDelvRangeStart(String delvRangeStart)
	{
		this.delvRangeStart = delvRangeStart;
	}

	public String getDelvRangeEnd()
	{
		return delvRangeEnd;
	}

	public void setDelvRangeEnd(String delvRangeEnd)
	{
		this.delvRangeEnd = delvRangeEnd;
	}
}
