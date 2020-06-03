
package com.shaw.ediorderservices.csws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderSidemark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderSidemark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="chargeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiced" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipToCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adEndUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adFirm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderSidemark", namespace="http://v3.orderview.csws.shaw.com")

public class HeaderSidemark {

    protected double charge;
    @XmlElement(required = true, nillable = true)
    protected String chargeCode = "";
    protected int invoiced;
    @XmlElement(required = true, nillable = true)
    protected String shipCode = "";
    @XmlElement(required = true, nillable = true)
    protected String shipMessage = "";
    protected int shipToCode;
    @XmlElement(required = true, nillable = true)
    protected String timeStamp = "";
    @XmlElement(required = true, nillable = true)
    protected String adEndUser = "";
    @XmlElement(required = true, nillable = true)
    protected String adFirm = "";

    /**
     * Gets the value of the charge property.
     * 
     */
    public double getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     */
    public void setCharge(double value) {
        this.charge = value;
    }

    /**
     * Gets the value of the chargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * Sets the value of the chargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCode(String value) {
        this.chargeCode = value;
    }

    /**
     * Gets the value of the invoiced property.
     * 
     */
    public int getInvoiced() {
        return invoiced;
    }

    /**
     * Sets the value of the invoiced property.
     * 
     */
    public void setInvoiced(int value) {
        this.invoiced = value;
    }

    /**
     * Gets the value of the shipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCode() {
        return shipCode;
    }

    /**
     * Sets the value of the shipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCode(String value) {
        this.shipCode = value;
    }

    /**
     * Gets the value of the shipMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipMessage() {
        return shipMessage;
    }

    /**
     * Sets the value of the shipMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipMessage(String value) {
        this.shipMessage = value;
    }

    /**
     * Gets the value of the shipToCode property.
     * 
     */
    public int getShipToCode() {
        return shipToCode;
    }

    /**
     * Sets the value of the shipToCode property.
     * 
     */
    public void setShipToCode(int value) {
        this.shipToCode = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the adEndUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdEndUser() {
        return adEndUser;
    }

    /**
     * Sets the value of the adEndUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdEndUser(String value) {
        this.adEndUser = value;
    }

    /**
     * Gets the value of the adFirm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdFirm() {
        return adFirm;
    }

    /**
     * Sets the value of the adFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdFirm(String value) {
        this.adFirm = value;
    }

}
