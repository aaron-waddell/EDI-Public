
package com.shaw.ediorderservices.csws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitsLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitsLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forceBackOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="end1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="end2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endCap1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endCap2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitDiscPerc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unitLineSidemark1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitLineSidemark2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitPriceExplain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitPriceReq" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unitPriceUom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitReqBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitSidem1Gs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitSidem2Gs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seqNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dyelot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceExplain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="replacementFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reqBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reqPriceUom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemark1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemark2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemarkType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemarkType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="styleNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemarkCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemarkCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quoteNbr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="poNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poLineNbr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="primarySKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rawMatOrderNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rawMatLineNbr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sqYds" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="styleNameLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="styleNameShort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorNameLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorNameShort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitsLine", propOrder = {
    "forceBackOrder",
    "collection",
    "end1",
    "end2",
    "endCap1",
    "endCap2",
    "location",
    "plant",
    "shipDate",
    "unitDiscPerc",
    "unitLineSidemark1",
    "unitLineSidemark2",
    "unitPriceExplain",
    "unitPriceReq",
    "unitPriceUom",
    "unitReqBy",
    "unitSidem1Gs",
    "unitSidem2Gs",
    "seqNbr",
    "colorNbr",
    "discount",
    "dyelot",
    "grade",
    "priceExplain",
    "quantity",
    "replacementFlag",
    "reqBy",
    "reqPrice",
    "reqPriceUom",
    "sidemark1",
    "sidemark2",
    "sidemarkType1",
    "sidemarkType2",
    "styleNbr",
    "uom",
    "pricingFlag",
    "sidemarkCode1",
    "sidemarkCode2",
    "quoteNbr",
    "poNbr",
    "poLineNbr",
    "primarySKU",
    "rawMatOrderNbr",
    "rawMatLineNbr",
    "sqYds",
    "styleNameLong",
    "styleNameShort",
    "colorNameLong",
    "colorNameShort",
    "length",
    "width"
})
public class UnitsLine {

    protected String forceBackOrder;
    protected String collection;
    protected String end1;
    protected String end2;
    protected String endCap1;
    protected String endCap2;
    protected String location;
    protected String plant;
    protected String shipDate;
    protected double unitDiscPerc;
    protected String unitLineSidemark1;
    protected String unitLineSidemark2;
    protected String unitPriceExplain;
    protected double unitPriceReq;
    protected String unitPriceUom;
    protected String unitReqBy;
    protected String unitSidem1Gs;
    protected String unitSidem2Gs;
    protected String seqNbr;
    protected String colorNbr;
    protected double discount;
    protected String dyelot;
    protected String grade;
    protected String priceExplain;
    protected double quantity;
    protected boolean replacementFlag;
    protected String reqBy;
    protected double reqPrice;
    protected String reqPriceUom;
    protected String sidemark1;
    protected String sidemark2;
    protected String sidemarkType1;
    protected String sidemarkType2;
    protected String styleNbr;
    protected String uom;
    protected String pricingFlag;
    protected String sidemarkCode1;
    protected String sidemarkCode2;
    protected int quoteNbr;
    protected String poNbr;
    protected int poLineNbr;
    protected String primarySKU;
    protected String rawMatOrderNbr;
    protected int rawMatLineNbr;
    protected double sqYds;
    protected String styleNameLong;
    protected String styleNameShort;
    protected String colorNameLong;
    protected String colorNameShort;
    protected double length;
    protected double width;

    /**
     * Gets the value of the forceBackOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceBackOrder() {
        return forceBackOrder;
    }

    /**
     * Sets the value of the forceBackOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceBackOrder(String value) {
        this.forceBackOrder = value;
    }

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollection() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollection(String value) {
        this.collection = value;
    }

    /**
     * Gets the value of the end1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd1() {
        return end1;
    }

    /**
     * Sets the value of the end1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd1(String value) {
        this.end1 = value;
    }

    /**
     * Gets the value of the end2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd2() {
        return end2;
    }

    /**
     * Sets the value of the end2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd2(String value) {
        this.end2 = value;
    }

    /**
     * Gets the value of the endCap1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndCap1() {
        return endCap1;
    }

    /**
     * Sets the value of the endCap1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndCap1(String value) {
        this.endCap1 = value;
    }

    /**
     * Gets the value of the endCap2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndCap2() {
        return endCap2;
    }

    /**
     * Sets the value of the endCap2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndCap2(String value) {
        this.endCap2 = value;
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
     * Gets the value of the plant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlant() {
        return plant;
    }

    /**
     * Sets the value of the plant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlant(String value) {
        this.plant = value;
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
     * Gets the value of the unitDiscPerc property.
     * 
     */
    public double getUnitDiscPerc() {
        return unitDiscPerc;
    }

    /**
     * Sets the value of the unitDiscPerc property.
     * 
     */
    public void setUnitDiscPerc(double value) {
        this.unitDiscPerc = value;
    }

    /**
     * Gets the value of the unitLineSidemark1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitLineSidemark1() {
        return unitLineSidemark1;
    }

    /**
     * Sets the value of the unitLineSidemark1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitLineSidemark1(String value) {
        this.unitLineSidemark1 = value;
    }

    /**
     * Gets the value of the unitLineSidemark2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitLineSidemark2() {
        return unitLineSidemark2;
    }

    /**
     * Sets the value of the unitLineSidemark2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitLineSidemark2(String value) {
        this.unitLineSidemark2 = value;
    }

    /**
     * Gets the value of the unitPriceExplain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPriceExplain() {
        return unitPriceExplain;
    }

    /**
     * Sets the value of the unitPriceExplain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPriceExplain(String value) {
        this.unitPriceExplain = value;
    }

    /**
     * Gets the value of the unitPriceReq property.
     * 
     */
    public double getUnitPriceReq() {
        return unitPriceReq;
    }

    /**
     * Sets the value of the unitPriceReq property.
     * 
     */
    public void setUnitPriceReq(double value) {
        this.unitPriceReq = value;
    }

    /**
     * Gets the value of the unitPriceUom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPriceUom() {
        return unitPriceUom;
    }

    /**
     * Sets the value of the unitPriceUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPriceUom(String value) {
        this.unitPriceUom = value;
    }

    /**
     * Gets the value of the unitReqBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitReqBy() {
        return unitReqBy;
    }

    /**
     * Sets the value of the unitReqBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitReqBy(String value) {
        this.unitReqBy = value;
    }

    /**
     * Gets the value of the unitSidem1Gs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitSidem1Gs() {
        return unitSidem1Gs;
    }

    /**
     * Sets the value of the unitSidem1Gs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitSidem1Gs(String value) {
        this.unitSidem1Gs = value;
    }

    /**
     * Gets the value of the unitSidem2Gs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitSidem2Gs() {
        return unitSidem2Gs;
    }

    /**
     * Sets the value of the unitSidem2Gs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitSidem2Gs(String value) {
        this.unitSidem2Gs = value;
    }

    /**
     * Gets the value of the seqNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNbr() {
        return seqNbr;
    }

    /**
     * Sets the value of the seqNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNbr(String value) {
        this.seqNbr = value;
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
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
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
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
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

    /**
     * Gets the value of the quoteNbr property.
     * 
     */
    public int getQuoteNbr() {
        return quoteNbr;
    }

    /**
     * Sets the value of the quoteNbr property.
     * 
     */
    public void setQuoteNbr(int value) {
        this.quoteNbr = value;
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
     * Gets the value of the poLineNbr property.
     * 
     */
    public int getPoLineNbr() {
        return poLineNbr;
    }

    /**
     * Sets the value of the poLineNbr property.
     * 
     */
    public void setPoLineNbr(int value) {
        this.poLineNbr = value;
    }

    /**
     * Gets the value of the primarySKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySKU() {
        return primarySKU;
    }

    /**
     * Sets the value of the primarySKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySKU(String value) {
        this.primarySKU = value;
    }

    /**
     * Gets the value of the rawMatOrderNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawMatOrderNbr() {
        return rawMatOrderNbr;
    }

    /**
     * Sets the value of the rawMatOrderNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawMatOrderNbr(String value) {
        this.rawMatOrderNbr = value;
    }

    /**
     * Gets the value of the rawMatLineNbr property.
     * 
     */
    public int getRawMatLineNbr() {
        return rawMatLineNbr;
    }

    /**
     * Sets the value of the rawMatLineNbr property.
     * 
     */
    public void setRawMatLineNbr(int value) {
        this.rawMatLineNbr = value;
    }

    /**
     * Gets the value of the sqYds property.
     * 
     */
    public double getSqYds() {
        return sqYds;
    }

    /**
     * Sets the value of the sqYds property.
     * 
     */
    public void setSqYds(double value) {
        this.sqYds = value;
    }

    /**
     * Gets the value of the styleNameLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleNameLong() {
        return styleNameLong;
    }

    /**
     * Sets the value of the styleNameLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleNameLong(String value) {
        this.styleNameLong = value;
    }

    /**
     * Gets the value of the styleNameShort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleNameShort() {
        return styleNameShort;
    }

    /**
     * Sets the value of the styleNameShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleNameShort(String value) {
        this.styleNameShort = value;
    }

    /**
     * Gets the value of the colorNameLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorNameLong() {
        return colorNameLong;
    }

    /**
     * Sets the value of the colorNameLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorNameLong(String value) {
        this.colorNameLong = value;
    }

    /**
     * Gets the value of the colorNameShort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorNameShort() {
        return colorNameShort;
    }

    /**
     * Sets the value of the colorNameShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorNameShort(String value) {
        this.colorNameShort = value;
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
     * Gets the value of the width property.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

}
