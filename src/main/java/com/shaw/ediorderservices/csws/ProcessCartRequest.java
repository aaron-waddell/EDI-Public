
package com.shaw.ediorderservices.csws;

import java.util.ArrayList;
import java.util.List;

import com.shaw.ediorderservices.service.common.IEntityBody;


public class ProcessCartRequest 
    extends OwsRequest implements IEntityBody
{

    protected double bulkQty;
    protected boolean bulkOrderFlag;
    protected String cartNbr;
    protected List<String> groups;
    protected String poNbr;
    protected ShipInfo shipInfo;
    protected String overrideDupPo;
    protected String orderNbr;
    protected String roleFlag;
    protected String custNbr;
    protected String function;
    protected List<String> status;
    protected List<Double> ratePer;
    protected String parentOrder;
    protected String custEmail;
    protected String eCommTransId;
    protected String eCommGuid;

    /**
     * Gets the value of the bulkQty property.
     * 
     */
    public double getBulkQty() {
        return bulkQty;
    }

    /**
     * Sets the value of the bulkQty property.
     * 
     */
    public void setBulkQty(double value) {
        this.bulkQty = value;
    }

    /**
     * Gets the value of the bulkOrderFlag property.
     * 
     */
    public boolean isBulkOrderFlag() {
        return bulkOrderFlag;
    }

    /**
     * Sets the value of the bulkOrderFlag property.
     * 
     */
    public void setBulkOrderFlag(boolean value) {
        this.bulkOrderFlag = value;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getGroups() {
        if (groups == null) {
            groups = new ArrayList<String>();
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
     * Gets the value of the shipInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ShipInfo }
     *     
     */
    public ShipInfo getShipInfo() {
        return shipInfo;
    }

    /**
     * Sets the value of the shipInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipInfo }
     *     
     */
    public void setShipInfo(ShipInfo value) {
        this.shipInfo = value;
    }

    /**
     * Gets the value of the overrideDupPo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideDupPo() {
        return overrideDupPo;
    }

    /**
     * Sets the value of the overrideDupPo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideDupPo(String value) {
        this.overrideDupPo = value;
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
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatus() {
        if (status == null) {
            status = new ArrayList<String>();
        }
        return this.status;
    }

    /**
     * Gets the value of the ratePer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRatePer() {
        if (ratePer == null) {
            ratePer = new ArrayList<Double>();
        }
        return this.ratePer;
    }

    /**
     * Gets the value of the parentOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrder() {
        return parentOrder;
    }

    /**
     * Sets the value of the parentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrder(String value) {
        this.parentOrder = value;
    }

    /**
     * Gets the value of the custEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * Sets the value of the custEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustEmail(String value) {
        this.custEmail = value;
    }

    /**
     * Gets the value of the eCommTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECommTransId() {
        return eCommTransId;
    }

    /**
     * Sets the value of the eCommTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECommTransId(String value) {
        this.eCommTransId = value;
    }

    /**
     * Gets the value of the eCommGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECommGuid() {
        return eCommGuid;
    }

    /**
     * Sets the value of the eCommGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECommGuid(String value) {
        this.eCommGuid = value;
    }

}
