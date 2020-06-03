
package com.shaw.ediorderservices.csws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CartLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CartLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="demaindLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="demandOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dyelot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="styleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="styleNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="builderFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="selCo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cutBoundFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="replacementFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="swatchFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="totWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="smpColorNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smpStyleNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smpTypeset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smpTypesetDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restricted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="commodity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreignPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreignCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leadTimeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leadTimeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leadTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="demandStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartLine", propOrder = {
    "packType",
    "demaindLine",
    "demandOrder",
    "statusCode",
    "description",
    "colorName",
    "colorNbr",
    "dyelot",
    "extPrice",
    "groupNbr",
    "length",
    "lineNbr",
    "location",
    "qty",
    "rcsCode",
    "shipDate",
    "styleName",
    "styleNbr",
    "unitPrice",
    "uom",
    "width",
    "priceUOM",
    "builderFlag",
    "selCo",
    "cutBoundFlag",
    "replacementFlag",
    "swatchFlag",
    "totWeight",
    "smpColorNbr",
    "smpStyleNbr",
    "smpTypeset",
    "smpTypesetDesc",
    "groupId",
    "restricted",
    "commodity",
    "productCode",
    "foreignPrice",
    "foreignCurrency",
    "leadTimeDate",
    "leadTimeFlag",
    "leadTypeDesc",
    "custStatusCode",
    "demandStatusCode"
})
public class CartLine {

    protected String packType;
    protected String demaindLine;
    protected String demandOrder;
    protected String statusCode;
    protected String description;
    protected String colorName;
    protected String colorNbr;
    protected String dyelot;
    protected String extPrice;
    protected String groupNbr;
    protected String length;
    protected String lineNbr;
    protected String location;
    protected String qty;
    protected String rcsCode;
    protected String shipDate;
    protected String styleName;
    protected String styleNbr;
    protected String unitPrice;
    protected String uom;
    protected String width;
    protected String priceUOM;
    protected boolean builderFlag;
    protected String selCo;
    protected boolean cutBoundFlag;
    protected boolean replacementFlag;
    protected boolean swatchFlag;
    protected double totWeight;
    protected String smpColorNbr;
    protected String smpStyleNbr;
    protected String smpTypeset;
    protected String smpTypesetDesc;
    protected String groupId;
    protected boolean restricted;
    protected String commodity;
    protected String productCode;
    protected String foreignPrice;
    protected String foreignCurrency;
    protected String leadTimeDate;
    protected String leadTimeFlag;
    protected String leadTypeDesc;
    protected String custStatusCode;
    protected String demandStatusCode;

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
     * Gets the value of the demaindLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemaindLine() {
        return demaindLine;
    }

    /**
     * Sets the value of the demaindLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemaindLine(String value) {
        this.demaindLine = value;
    }

    /**
     * Gets the value of the demandOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandOrder() {
        return demandOrder;
    }

    /**
     * Sets the value of the demandOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandOrder(String value) {
        this.demandOrder = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the colorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * Sets the value of the colorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorName(String value) {
        this.colorName = value;
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
     * Gets the value of the extPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtPrice() {
        return extPrice;
    }

    /**
     * Sets the value of the extPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtPrice(String value) {
        this.extPrice = value;
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
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Gets the value of the lineNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNbr() {
        return lineNbr;
    }

    /**
     * Sets the value of the lineNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNbr(String value) {
        this.lineNbr = value;
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
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQty(String value) {
        this.qty = value;
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
     * Gets the value of the styleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * Sets the value of the styleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
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
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
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
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the priceUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceUOM() {
        return priceUOM;
    }

    /**
     * Sets the value of the priceUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceUOM(String value) {
        this.priceUOM = value;
    }

    /**
     * Gets the value of the builderFlag property.
     * 
     */
    public boolean isBuilderFlag() {
        return builderFlag;
    }

    /**
     * Sets the value of the builderFlag property.
     * 
     */
    public void setBuilderFlag(boolean value) {
        this.builderFlag = value;
    }

    /**
     * Gets the value of the selCo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelCo() {
        return selCo;
    }

    /**
     * Sets the value of the selCo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelCo(String value) {
        this.selCo = value;
    }

    /**
     * Gets the value of the cutBoundFlag property.
     * 
     */
    public boolean isCutBoundFlag() {
        return cutBoundFlag;
    }

    /**
     * Sets the value of the cutBoundFlag property.
     * 
     */
    public void setCutBoundFlag(boolean value) {
        this.cutBoundFlag = value;
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
     * Gets the value of the totWeight property.
     * 
     */
    public double getTotWeight() {
        return totWeight;
    }

    /**
     * Sets the value of the totWeight property.
     * 
     */
    public void setTotWeight(double value) {
        this.totWeight = value;
    }

    /**
     * Gets the value of the smpColorNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmpColorNbr() {
        return smpColorNbr;
    }

    /**
     * Sets the value of the smpColorNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmpColorNbr(String value) {
        this.smpColorNbr = value;
    }

    /**
     * Gets the value of the smpStyleNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmpStyleNbr() {
        return smpStyleNbr;
    }

    /**
     * Sets the value of the smpStyleNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmpStyleNbr(String value) {
        this.smpStyleNbr = value;
    }

    /**
     * Gets the value of the smpTypeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmpTypeset() {
        return smpTypeset;
    }

    /**
     * Sets the value of the smpTypeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmpTypeset(String value) {
        this.smpTypeset = value;
    }

    /**
     * Gets the value of the smpTypesetDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmpTypesetDesc() {
        return smpTypesetDesc;
    }

    /**
     * Sets the value of the smpTypesetDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmpTypesetDesc(String value) {
        this.smpTypesetDesc = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the restricted property.
     * 
     */
    public boolean isRestricted() {
        return restricted;
    }

    /**
     * Sets the value of the restricted property.
     * 
     */
    public void setRestricted(boolean value) {
        this.restricted = value;
    }

    /**
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodity() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodity(String value) {
        this.commodity = value;
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
     * Gets the value of the foreignPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignPrice() {
        return foreignPrice;
    }

    /**
     * Sets the value of the foreignPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignPrice(String value) {
        this.foreignPrice = value;
    }

    /**
     * Gets the value of the foreignCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignCurrency() {
        return foreignCurrency;
    }

    /**
     * Sets the value of the foreignCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignCurrency(String value) {
        this.foreignCurrency = value;
    }

    /**
     * Gets the value of the leadTimeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadTimeDate() {
        return leadTimeDate;
    }

    /**
     * Sets the value of the leadTimeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadTimeDate(String value) {
        this.leadTimeDate = value;
    }

    /**
     * Gets the value of the leadTimeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadTimeFlag() {
        return leadTimeFlag;
    }

    /**
     * Sets the value of the leadTimeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadTimeFlag(String value) {
        this.leadTimeFlag = value;
    }

    /**
     * Gets the value of the leadTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadTypeDesc() {
        return leadTypeDesc;
    }

    /**
     * Sets the value of the leadTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadTypeDesc(String value) {
        this.leadTypeDesc = value;
    }

    /**
     * Gets the value of the custStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustStatusCode() {
        return custStatusCode;
    }

    /**
     * Sets the value of the custStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustStatusCode(String value) {
        this.custStatusCode = value;
    }

    /**
     * Gets the value of the demandStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandStatusCode() {
        return demandStatusCode;
    }

    /**
     * Sets the value of the demandStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandStatusCode(String value) {
        this.demandStatusCode = value;
    }

}
