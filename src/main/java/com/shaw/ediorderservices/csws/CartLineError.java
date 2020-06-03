
package com.shaw.ediorderservices.csws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CartLineError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CartLineError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colorNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dyelot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="styleNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceExplain" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seqNbr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartLineError", propOrder = {
    "colorNbr",
    "dyelot",
    "groupNbr",
    "styleNbr",
    "pricingFlag",
    "priceExplain",
    "errorMessage",
    "errorType",
    "seqNbr"
})
public class CartLineError {

    protected String colorNbr;
    protected String dyelot;
    protected String groupNbr;
    protected String styleNbr;
    protected String pricingFlag;
    protected boolean priceExplain;
    protected String errorMessage;
    protected String errorType;
    protected int seqNbr;

    /**
     * Gets the value of the colorNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorNbr() {
        return colorNbr;
    }

    /**
     * Sets the value of the colorNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorNbr(String value) {
        this.colorNbr = value;
    }

    /**
     * Gets the value of the dyelot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyelot() {
        return dyelot;
    }

    /**
     * Sets the value of the dyelot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyelot(String value) {
        this.dyelot = value;
    }

    /**
     * Gets the value of the groupNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupNbr() {
        return groupNbr;
    }

    /**
     * Sets the value of the groupNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNbr(String value) {
        this.groupNbr = value;
    }

    /**
     * Gets the value of the styleNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleNbr() {
        return styleNbr;
    }

    /**
     * Sets the value of the styleNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleNbr(String value) {
        this.styleNbr = value;
    }

    /**
     * Gets the value of the pricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingFlag() {
        return pricingFlag;
    }

    /**
     * Sets the value of the pricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingFlag(String value) {
        this.pricingFlag = value;
    }

    /**
     * Gets the value of the priceExplain property.
     * 
     */
    public boolean isPriceExplain() {
        return priceExplain;
    }

    /**
     * Sets the value of the priceExplain property.
     * 
     */
    public void setPriceExplain(boolean value) {
        this.priceExplain = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorType(String value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the seqNbr property.
     * 
     */
    public int getSeqNbr() {
        return seqNbr;
    }

    /**
     * Sets the value of the seqNbr property.
     * 
     */
    public void setSeqNbr(int value) {
        this.seqNbr = value;
    }

}
