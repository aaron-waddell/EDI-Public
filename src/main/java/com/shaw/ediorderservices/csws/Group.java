
package com.shaw.ediorderservices.csws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inventoryLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceExplain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fixUom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="colorNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lines" type="{http://v2.orderentry.csws.shaw.com}CarpetLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reqDyelot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reqPriceUom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqQty" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reqUom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemark1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemark2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemarkType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemarkType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="styleNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuts" type="{http://v2.orderentry.csws.shaw.com}Cut" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reqBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forceBackorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqPriceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cutBound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="replacementFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="swatchFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="quoteNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemarkCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemarkCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "inventoryLocation",
    "priceExplain",
    "fixUom",
    "colorNbr",
    "discount",
    "lines",
    "max",
    "min",
    "reqDyelot",
    "reqPrice",
    "reqPriceUom",
    "reqQty",
    "reqUom",
    "shipDate",
    "sidemark1",
    "sidemark2",
    "sidemarkType1",
    "sidemarkType2",
    "styleNbr",
    "location",
    "cuts",
    "reqBy",
    "forceBackorder",
    "reqPriceFlag",
    "cutBound",
    "replacementFlag",
    "swatchFlag",
    "quoteNbr",
    "sidemarkCode1",
    "sidemarkCode2"
})
public class Group {

    protected String inventoryLocation;
    protected String priceExplain;
    protected boolean fixUom;
    protected String colorNbr;
    protected double discount;
    @XmlElement(nillable = true)
    protected List<CarpetLine> lines;
    protected double max;
    protected double min;
    protected String reqDyelot;
    protected double reqPrice;
    protected String reqPriceUom;
    protected double reqQty;
    protected String reqUom;
    protected String shipDate;
    protected String sidemark1;
    protected String sidemark2;
    protected String sidemarkType1;
    protected String sidemarkType2;
    protected String styleNbr;
    protected String location;
    @XmlElement(nillable = true)
    protected List<Cut> cuts;
    protected String reqBy;
    protected String forceBackorder;
    protected String reqPriceFlag;
    protected boolean cutBound;
    protected boolean replacementFlag;
    protected boolean swatchFlag;
    protected String quoteNbr;
    protected String sidemarkCode1;
    protected String sidemarkCode2;

    /**
     * Gets the value of the inventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryLocation() {
        return inventoryLocation;
    }

    /**
     * Sets the value of the inventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryLocation(String value) {
        this.inventoryLocation = value;
    }

    /**
     * Gets the value of the priceExplain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceExplain() {
        return priceExplain;
    }

    /**
     * Sets the value of the priceExplain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceExplain(String value) {
        this.priceExplain = value;
    }

    /**
     * Gets the value of the fixUom property.
     * 
     */
    public boolean isFixUom() {
        return fixUom;
    }

    /**
     * Sets the value of the fixUom property.
     * 
     */
    public void setFixUom(boolean value) {
        this.fixUom = value;
    }

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
     * Gets the value of the discount property.
     * 
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     */
    public void setDiscount(double value) {
        this.discount = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarpetLine }
     * 
     * 
     */
    public List<CarpetLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<CarpetLine>();
        }
        return this.lines;
    }

    /**
     * Gets the value of the max property.
     * 
     */
    public double getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     */
    public void setMax(double value) {
        this.max = value;
    }

    /**
     * Gets the value of the min property.
     * 
     */
    public double getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     */
    public void setMin(double value) {
        this.min = value;
    }

    /**
     * Gets the value of the reqDyelot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqDyelot() {
        return reqDyelot;
    }

    /**
     * Sets the value of the reqDyelot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqDyelot(String value) {
        this.reqDyelot = value;
    }

    /**
     * Gets the value of the reqPrice property.
     * 
     */
    public double getReqPrice() {
        return reqPrice;
    }

    /**
     * Sets the value of the reqPrice property.
     * 
     */
    public void setReqPrice(double value) {
        this.reqPrice = value;
    }

    /**
     * Gets the value of the reqPriceUom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqPriceUom() {
        return reqPriceUom;
    }

    /**
     * Sets the value of the reqPriceUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqPriceUom(String value) {
        this.reqPriceUom = value;
    }

    /**
     * Gets the value of the reqQty property.
     * 
     */
    public double getReqQty() {
        return reqQty;
    }

    /**
     * Sets the value of the reqQty property.
     * 
     */
    public void setReqQty(double value) {
        this.reqQty = value;
    }

    /**
     * Gets the value of the reqUom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqUom() {
        return reqUom;
    }

    /**
     * Sets the value of the reqUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqUom(String value) {
        this.reqUom = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipDate(String value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the sidemark1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSidemark1() {
        return sidemark1;
    }

    /**
     * Sets the value of the sidemark1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSidemark1(String value) {
        this.sidemark1 = value;
    }

    /**
     * Gets the value of the sidemark2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSidemark2() {
        return sidemark2;
    }

    /**
     * Sets the value of the sidemark2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSidemark2(String value) {
        this.sidemark2 = value;
    }

    /**
     * Gets the value of the sidemarkType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSidemarkType1() {
        return sidemarkType1;
    }

    /**
     * Sets the value of the sidemarkType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSidemarkType1(String value) {
        this.sidemarkType1 = value;
    }

    /**
     * Gets the value of the sidemarkType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSidemarkType2() {
        return sidemarkType2;
    }

    /**
     * Sets the value of the sidemarkType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSidemarkType2(String value) {
        this.sidemarkType2 = value;
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
     * Gets the value of the cuts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cut }
     * 
     * 
     */
    public List<Cut> getCuts() {
        if (cuts == null) {
            cuts = new ArrayList<Cut>();
        }
        return this.cuts;
    }

    /**
     * Gets the value of the reqBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqBy() {
        return reqBy;
    }

    /**
     * Sets the value of the reqBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqBy(String value) {
        this.reqBy = value;
    }

    /**
     * Gets the value of the forceBackorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceBackorder() {
        return forceBackorder;
    }

    /**
     * Sets the value of the forceBackorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceBackorder(String value) {
        this.forceBackorder = value;
    }

    /**
     * Gets the value of the reqPriceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqPriceFlag() {
        return reqPriceFlag;
    }

    /**
     * Sets the value of the reqPriceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqPriceFlag(String value) {
        this.reqPriceFlag = value;
    }

    /**
     * Gets the value of the cutBound property.
     * 
     */
    public boolean isCutBound() {
        return cutBound;
    }

    /**
     * Sets the value of the cutBound property.
     * 
     */
    public void setCutBound(boolean value) {
        this.cutBound = value;
    }

    /**
     * Gets the value of the replacementFlag property.
     * 
     */
    public boolean isReplacementFlag() {
        return replacementFlag;
    }

    /**
     * Sets the value of the replacementFlag property.
     * 
     */
    public void setReplacementFlag(boolean value) {
        this.replacementFlag = value;
    }

    /**
     * Gets the value of the swatchFlag property.
     * 
     */
    public boolean isSwatchFlag() {
        return swatchFlag;
    }

    /**
     * Sets the value of the swatchFlag property.
     * 
     */
    public void setSwatchFlag(boolean value) {
        this.swatchFlag = value;
    }

    /**
     * Gets the value of the quoteNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNbr() {
        return quoteNbr;
    }

    /**
     * Sets the value of the quoteNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNbr(String value) {
        this.quoteNbr = value;
    }

    /**
     * Gets the value of the sidemarkCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSidemarkCode1() {
        return sidemarkCode1;
    }

    /**
     * Sets the value of the sidemarkCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSidemarkCode1(String value) {
        this.sidemarkCode1 = value;
    }

    /**
     * Gets the value of the sidemarkCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSidemarkCode2() {
        return sidemarkCode2;
    }

    /**
     * Sets the value of the sidemarkCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSidemarkCode2(String value) {
        this.sidemarkCode2 = value;
    }

}
