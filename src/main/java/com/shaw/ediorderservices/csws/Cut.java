
package com.shaw.ediorderservices.csws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="half" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rollNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="size1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="size2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="size3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sizeBal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cut", propOrder = {
    "action",
    "group",
    "half",
    "length",
    "rollNbr",
    "size1",
    "size2",
    "size3",
    "sizeBal",
    "quantity",
    "size"
})
public class Cut {

    protected String action;
    protected String group;
    protected String half;
    protected double length;
    protected String rollNbr;
    protected double size1;
    protected double size2;
    protected double size3;
    protected double sizeBal;
    protected double quantity;
    protected double size;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the half property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalf() {
        return half;
    }

    /**
     * Sets the value of the half property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalf(String value) {
        this.half = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(double value) {
        this.length = value;
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
     * Gets the value of the size1 property.
     * 
     */
    public double getSize1() {
        return size1;
    }

    /**
     * Sets the value of the size1 property.
     * 
     */
    public void setSize1(double value) {
        this.size1 = value;
    }

    /**
     * Gets the value of the size2 property.
     * 
     */
    public double getSize2() {
        return size2;
    }

    /**
     * Sets the value of the size2 property.
     * 
     */
    public void setSize2(double value) {
        this.size2 = value;
    }

    /**
     * Gets the value of the size3 property.
     * 
     */
    public double getSize3() {
        return size3;
    }

    /**
     * Sets the value of the size3 property.
     * 
     */
    public void setSize3(double value) {
        this.size3 = value;
    }

    /**
     * Gets the value of the sizeBal property.
     * 
     */
    public double getSizeBal() {
        return sizeBal;
    }

    /**
     * Sets the value of the sizeBal property.
     * 
     */
    public void setSizeBal(double value) {
        this.sizeBal = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(double value) {
        this.size = value;
    }

}
