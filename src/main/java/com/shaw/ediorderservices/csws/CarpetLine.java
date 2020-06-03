
package com.shaw.ediorderservices.csws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarpetLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarpetLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dyelot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rollNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarpetLine", propOrder = {
    "dyelot",
    "price",
    "rcsCode",
    "rollNbr",
    "size",
    "pricingFlag"
})
public class CarpetLine {

    protected String dyelot;
    protected String price;
    protected String rcsCode;
    protected String rollNbr;
    protected String size;
    protected String pricingFlag;

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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the rcsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcsCode() {
        return rcsCode;
    }

    /**
     * Sets the value of the rcsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcsCode(String value) {
        this.rcsCode = value;
    }

    /**
     * Gets the value of the rollNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollNbr() {
        return rollNbr;
    }

    /**
     * Sets the value of the rollNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollNbr(String value) {
        this.rollNbr = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
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

}
