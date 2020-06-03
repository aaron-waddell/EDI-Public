
package com.shaw.ediorderservices.csws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.shaw.ediorderservices.service.common.IEntityBody;


public class CartRequest extends OwsRequest implements IEntityBody
{

    protected String orderStatus;
    @XmlElement(nillable = true)
    protected List<UnitsLine> unitsLines;
    protected String productType;
    protected Builder builder;
    protected String orderNbr;
    protected String discType;
    protected String cartNbr;
    protected String custNbr;
    @XmlElement(nillable = true)
    protected List<Group> groups;
    protected String poNbr;
    protected String selco;
    protected String pricingFlag;
    @XmlElement(nillable = true)
    protected List<SamplesLine> samplesLines;
    protected String lid;
    protected String roleFlag;
    protected boolean manualAssignment;
    protected String refNbr;

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the unitsLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitsLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitsLine }
     * 
     * 
     */
    public List<UnitsLine> getUnitsLines() {
        if (unitsLines == null) {
            unitsLines = new ArrayList<UnitsLine>();
        }
        return this.unitsLines;
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
     * Gets the value of the builder property.
     * 
     * @return
     *     possible object is
     *     {@link Builder }
     *     
     */
    public Builder getBuilder() {
        return builder;
    }

    /**
     * Sets the value of the builder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Builder }
     *     
     */
    public void setBuilder(Builder value) {
        this.builder = value;
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
     * Gets the value of the discType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscType() {
        return discType;
    }

    /**
     * Sets the value of the discType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscType(String value) {
        this.discType = value;
    }

    /**
     * Gets the value of the cartNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartNbr() {
        return cartNbr;
    }

    /**
     * Sets the value of the cartNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartNbr(String value) {
        this.cartNbr = value;
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
     * Gets the value of the groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * 
     * 
     */
    public List<Group> getGroups() {
        if (groups == null) {
            groups = new ArrayList<Group>();
        }
        return this.groups;
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
     * Gets the value of the samplesLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the samplesLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSamplesLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SamplesLine }
     * 
     * 
     */
    public List<SamplesLine> getSamplesLines() {
        if (samplesLines == null) {
            samplesLines = new ArrayList<SamplesLine>();
        }
        return this.samplesLines;
    }

    /**
     * Gets the value of the lid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLid() {
        return lid;
    }

    /**
     * Sets the value of the lid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLid(String value) {
        this.lid = value;
    }

    /**
     * Gets the value of the roleFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleFlag() {
        return roleFlag;
    }

    /**
     * Sets the value of the roleFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleFlag(String value) {
        this.roleFlag = value;
    }

    /**
     * Gets the value of the manualAssignment property.
     * 
     */
    public boolean isManualAssignment() {
        return manualAssignment;
    }

    /**
     * Sets the value of the manualAssignment property.
     * 
     */
    public void setManualAssignment(boolean value) {
        this.manualAssignment = value;
    }

    /**
     * Gets the value of the refNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNbr() {
        return refNbr;
    }

    /**
     * Sets the value of the refNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNbr(String value) {
        this.refNbr = value;
    }

}
