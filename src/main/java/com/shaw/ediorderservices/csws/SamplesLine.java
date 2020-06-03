
package com.shaw.ediorderservices.csws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamplesLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamplesLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sidemarkCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemarkCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceRequested" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsetGroupNbr" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unitsPerSubset" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="delVehName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="marketFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="carrServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labelContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labelDefInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labelProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lableShiptoPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cartonQty" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="samplesPrivateStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="weightUom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="seqNbr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bulkOrderNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delVehNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="genericLabelFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="miscItemDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceExplain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reqBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reqPriceUom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="samplesColorNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="samplesCustNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="samplesStyleNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="samplesSeqNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemark1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemark2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemarkType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidemarkType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="styleNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typesetDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invPartNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resDelvFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamplesLine", propOrder = {
    "sidemarkCode1",
    "sidemarkCode2",
    "priceRequested",
    "subset",
    "subsetGroupNbr",
    "unitsPerSubset",
    "delVehName",
    "collateFlag",
    "marketFlag",
    "carrServiceLevel",
    "labelContact",
    "labelDefInfo",
    "labelProjectName",
    "lableShiptoPhone",
    "thirdPartyAcc",
    "cartonQty",
    "height",
    "length",
    "samplesPrivateStyle",
    "weight",
    "weightUom",
    "width",
    "seqNbr",
    "bulkOrderNbr",
    "colorNbr",
    "delVehNbr",
    "discount",
    "genericLabelFlag",
    "grade",
    "location",
    "miscItemDesc",
    "packType",
    "partNbr",
    "priceExplain",
    "pricingFlag",
    "quantity",
    "reqBy",
    "reqPrice",
    "reqPriceUom",
    "samplesColorNbr",
    "samplesCustNbr",
    "samplesStyleNbr",
    "samplesSeqNbr",
    "shipDate",
    "sidemark1",
    "sidemark2",
    "sidemarkType1",
    "sidemarkType2",
    "styleNbr",
    "typesetDesc",
    "uom",
    "invPartNbr",
    "resDelvFlag"
})
public class SamplesLine {

    protected String sidemarkCode1;
    protected String sidemarkCode2;
    protected boolean priceRequested;
    protected String subset;
    protected double subsetGroupNbr;
    protected double unitsPerSubset;
    protected String delVehName;
    protected boolean collateFlag;
    protected boolean marketFlag;
    protected String carrServiceLevel;
    protected String labelContact;
    protected String labelDefInfo;
    protected String labelProjectName;
    protected String lableShiptoPhone;
    protected String thirdPartyAcc;
    protected double cartonQty;
    protected double height;
    protected double length;
    protected String samplesPrivateStyle;
    protected double weight;
    protected String weightUom;
    protected double width;
    protected int seqNbr;
    protected String bulkOrderNbr;
    protected String colorNbr;
    protected String delVehNbr;
    protected double discount;
    protected boolean genericLabelFlag;
    protected String grade;
    protected String location;
    protected String miscItemDesc;
    protected String packType;
    protected String partNbr;
    protected String priceExplain;
    protected String pricingFlag;
    protected double quantity;
    protected String reqBy;
    protected double reqPrice;
    protected String reqPriceUom;
    protected String samplesColorNbr;
    protected String samplesCustNbr;
    protected String samplesStyleNbr;
    protected String samplesSeqNbr;
    protected String shipDate;
    protected String sidemark1;
    protected String sidemark2;
    protected String sidemarkType1;
    protected String sidemarkType2;
    protected String styleNbr;
    protected String typesetDesc;
    protected String uom;
    protected String invPartNbr;
    protected boolean resDelvFlag;

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
     * Gets the value of the priceRequested property.
     * 
     */
    public boolean isPriceRequested() {
        return priceRequested;
    }

    /**
     * Sets the value of the priceRequested property.
     * 
     */
    public void setPriceRequested(boolean value) {
        this.priceRequested = value;
    }

    /**
     * Gets the value of the subset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubset() {
        return subset;
    }

    /**
     * Sets the value of the subset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubset(String value) {
        this.subset = value;
    }

    /**
     * Gets the value of the subsetGroupNbr property.
     * 
     */
    public double getSubsetGroupNbr() {
        return subsetGroupNbr;
    }

    /**
     * Sets the value of the subsetGroupNbr property.
     * 
     */
    public void setSubsetGroupNbr(double value) {
        this.subsetGroupNbr = value;
    }

    /**
     * Gets the value of the unitsPerSubset property.
     * 
     */
    public double getUnitsPerSubset() {
        return unitsPerSubset;
    }

    /**
     * Sets the value of the unitsPerSubset property.
     * 
     */
    public void setUnitsPerSubset(double value) {
        this.unitsPerSubset = value;
    }

    /**
     * Gets the value of the delVehName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelVehName() {
        return delVehName;
    }

    /**
     * Sets the value of the delVehName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelVehName(String value) {
        this.delVehName = value;
    }

    /**
     * Gets the value of the collateFlag property.
     * 
     */
    public boolean isCollateFlag() {
        return collateFlag;
    }

    /**
     * Sets the value of the collateFlag property.
     * 
     */
    public void setCollateFlag(boolean value) {
        this.collateFlag = value;
    }

    /**
     * Gets the value of the marketFlag property.
     * 
     */
    public boolean isMarketFlag() {
        return marketFlag;
    }

    /**
     * Sets the value of the marketFlag property.
     * 
     */
    public void setMarketFlag(boolean value) {
        this.marketFlag = value;
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
     * Gets the value of the labelDefInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelDefInfo() {
        return labelDefInfo;
    }

    /**
     * Sets the value of the labelDefInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelDefInfo(String value) {
        this.labelDefInfo = value;
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
     * Gets the value of the lableShiptoPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLableShiptoPhone() {
        return lableShiptoPhone;
    }

    /**
     * Sets the value of the lableShiptoPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLableShiptoPhone(String value) {
        this.lableShiptoPhone = value;
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
     * Gets the value of the cartonQty property.
     * 
     */
    public double getCartonQty() {
        return cartonQty;
    }

    /**
     * Sets the value of the cartonQty property.
     * 
     */
    public void setCartonQty(double value) {
        this.cartonQty = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
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
     * Gets the value of the samplesPrivateStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplesPrivateStyle() {
        return samplesPrivateStyle;
    }

    /**
     * Sets the value of the samplesPrivateStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplesPrivateStyle(String value) {
        this.samplesPrivateStyle = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the weightUom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUom() {
        return weightUom;
    }

    /**
     * Sets the value of the weightUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUom(String value) {
        this.weightUom = value;
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
     * Gets the value of the delVehNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelVehNbr() {
        return delVehNbr;
    }

    /**
     * Sets the value of the delVehNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelVehNbr(String value) {
        this.delVehNbr = value;
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
     * Gets the value of the genericLabelFlag property.
     * 
     */
    public boolean isGenericLabelFlag() {
        return genericLabelFlag;
    }

    /**
     * Sets the value of the genericLabelFlag property.
     * 
     */
    public void setGenericLabelFlag(boolean value) {
        this.genericLabelFlag = value;
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
     * Gets the value of the miscItemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscItemDesc() {
        return miscItemDesc;
    }

    /**
     * Sets the value of the miscItemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscItemDesc(String value) {
        this.miscItemDesc = value;
    }

    /**
     * Gets the value of the packType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackType() {
        return packType;
    }

    /**
     * Sets the value of the packType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackType(String value) {
        this.packType = value;
    }

    /**
     * Gets the value of the partNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNbr() {
        return partNbr;
    }

    /**
     * Sets the value of the partNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNbr(String value) {
        this.partNbr = value;
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
     * Gets the value of the samplesColorNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplesColorNbr() {
        return samplesColorNbr;
    }

    /**
     * Sets the value of the samplesColorNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplesColorNbr(String value) {
        this.samplesColorNbr = value;
    }

    /**
     * Gets the value of the samplesCustNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplesCustNbr() {
        return samplesCustNbr;
    }

    /**
     * Sets the value of the samplesCustNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplesCustNbr(String value) {
        this.samplesCustNbr = value;
    }

    /**
     * Gets the value of the samplesStyleNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplesStyleNbr() {
        return samplesStyleNbr;
    }

    /**
     * Sets the value of the samplesStyleNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplesStyleNbr(String value) {
        this.samplesStyleNbr = value;
    }

    /**
     * Gets the value of the samplesSeqNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplesSeqNbr() {
        return samplesSeqNbr;
    }

    /**
     * Sets the value of the samplesSeqNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplesSeqNbr(String value) {
        this.samplesSeqNbr = value;
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
     * Gets the value of the typesetDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypesetDesc() {
        return typesetDesc;
    }

    /**
     * Sets the value of the typesetDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypesetDesc(String value) {
        this.typesetDesc = value;
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
     * Gets the value of the invPartNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvPartNbr() {
        return invPartNbr;
    }

    /**
     * Sets the value of the invPartNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvPartNbr(String value) {
        this.invPartNbr = value;
    }

    /**
     * Gets the value of the resDelvFlag property.
     * 
     */
    public boolean isResDelvFlag() {
        return resDelvFlag;
    }

    /**
     * Sets the value of the resDelvFlag property.
     * 
     */
    public void setResDelvFlag(boolean value) {
        this.resDelvFlag = value;
    }

	public SamplesLine addShipDate(String shipDate) {
		// TODO Auto-generated method stub
		this.shipDate = shipDate;
		return this;
	}

}
