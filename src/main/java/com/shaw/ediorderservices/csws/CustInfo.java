
package com.shaw.ediorderservices.csws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addr1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addr2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clericalInst1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clericalInst2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commCust" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cptPriCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cptSecCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custKwic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custSelco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliverySched" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="district2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="districtManager" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faxNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fob" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grpAcct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateAdded" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cptLoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="millCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rugsPriCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rugsSecCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selcoName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesPerson" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specialInst1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specialInst2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specialInst3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specialInst4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="termsCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="termsDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="territory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="territoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="whseCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commCustInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selCo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storeTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cptileId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cptileLoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cptileMillCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cptileWhseCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustInfo", propOrder = {
    "addr1",
    "addr2",
    "area",
    "clericalInst1",
    "clericalInst2",
    "commCust",
    "commName",
    "cptPriCarrier",
    "cptSecCarrier",
    "custKwic",
    "custSelco",
    "deliverySched",
    "district",
    "district2",
    "division",
    "districtManager",
    "faxNbr",
    "fob",
    "grpAcct",
    "dateAdded",
    "loc",
    "cptLoc",
    "millCarrier",
    "plant",
    "refNbr",
    "refName",
    "region",
    "rugsPriCarrier",
    "rugsSecCarrier",
    "selcoName",
    "salesPerson",
    "specialInst1",
    "specialInst2",
    "specialInst3",
    "specialInst4",
    "status",
    "statusMsg",
    "termsCode",
    "termsDesc",
    "territory",
    "territoryName",
    "whseCarrier",
    "commCustInd",
    "city",
    "custName",
    "custNbr",
    "phoneNbr",
    "selCo",
    "state",
    "storeTypeDesc",
    "zip",
    "cptileId",
    "cptileLoc",
    "cptileMillCarrier",
    "cptileWhseCarrier"
})
public class CustInfo {

    @XmlElement(required = true, nillable = true)
    protected String addr1;
    @XmlElement(required = true, nillable = true)
    protected String addr2;
    @XmlElement(required = true, nillable = true)
    protected String area;
    @XmlElement(required = true, nillable = true)
    protected String clericalInst1;
    @XmlElement(required = true, nillable = true)
    protected String clericalInst2;
    @XmlElement(required = true, nillable = true)
    protected String commCust;
    @XmlElement(required = true, nillable = true)
    protected String commName;
    @XmlElement(required = true, nillable = true)
    protected String cptPriCarrier;
    @XmlElement(required = true, nillable = true)
    protected String cptSecCarrier;
    @XmlElement(required = true, nillable = true)
    protected String custKwic;
    @XmlElement(required = true, nillable = true)
    protected String custSelco;
    @XmlElement(required = true, nillable = true)
    protected String deliverySched;
    @XmlElement(required = true, nillable = true)
    protected String district;
    @XmlElement(required = true, nillable = true)
    protected String district2;
    @XmlElement(required = true, nillable = true)
    protected String division;
    @XmlElement(required = true, nillable = true)
    protected String districtManager;
    @XmlElement(required = true, nillable = true)
    protected String faxNbr;
    @XmlElement(required = true, nillable = true)
    protected String fob;
    @XmlElement(required = true, nillable = true)
    protected String grpAcct;
    @XmlElement(required = true, nillable = true)
    protected String dateAdded;
    @XmlElement(required = true, nillable = true)
    protected String loc;
    @XmlElement(required = true, nillable = true)
    protected String cptLoc;
    @XmlElement(required = true, nillable = true)
    protected String millCarrier;
    @XmlElement(required = true, nillable = true)
    protected String plant;
    @XmlElement(required = true, nillable = true)
    protected String refNbr;
    @XmlElement(required = true, nillable = true)
    protected String refName;
    @XmlElement(required = true, nillable = true)
    protected String region;
    @XmlElement(required = true, nillable = true)
    protected String rugsPriCarrier;
    @XmlElement(required = true, nillable = true)
    protected String rugsSecCarrier;
    @XmlElement(required = true, nillable = true)
    protected String selcoName;
    @XmlElement(required = true, nillable = true)
    protected String salesPerson;
    @XmlElement(required = true, nillable = true)
    protected String specialInst1;
    @XmlElement(required = true, nillable = true)
    protected String specialInst2;
    @XmlElement(required = true, nillable = true)
    protected String specialInst3;
    @XmlElement(required = true, nillable = true)
    protected String specialInst4;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, nillable = true)
    protected String statusMsg;
    @XmlElement(required = true, nillable = true)
    protected String termsCode;
    @XmlElement(required = true, nillable = true)
    protected String termsDesc;
    @XmlElement(required = true, nillable = true)
    protected String territory;
    @XmlElement(required = true, nillable = true)
    protected String territoryName;
    @XmlElement(required = true, nillable = true)
    protected String whseCarrier;
    protected boolean commCustInd;
    @XmlElement(required = true, nillable = true)
    protected String city;
    @XmlElement(required = true, nillable = true)
    protected String custName;
    @XmlElement(required = true, nillable = true)
    protected String custNbr;
    @XmlElement(required = true, nillable = true)
    protected String phoneNbr;
    @XmlElement(required = true, nillable = true)
    protected String selCo;
    @XmlElement(required = true, nillable = true)
    protected String state;
    @XmlElement(required = true, nillable = true)
    protected String storeTypeDesc;
    @XmlElement(required = true, nillable = true)
    protected String zip;
    @XmlElement(required = true, nillable = true)
    protected String cptileId;
    @XmlElement(required = true, nillable = true)
    protected String cptileLoc;
    @XmlElement(required = true, nillable = true)
    protected String cptileMillCarrier;
    @XmlElement(required = true, nillable = true)
    protected String cptileWhseCarrier;

    /**
     * Gets the value of the addr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr1() {
        return addr1;
    }

    /**
     * Sets the value of the addr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr1(String value) {
        this.addr1 = value;
    }

    /**
     * Gets the value of the addr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr2() {
        return addr2;
    }

    /**
     * Sets the value of the addr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr2(String value) {
        this.addr2 = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the clericalInst1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClericalInst1() {
        return clericalInst1;
    }

    /**
     * Sets the value of the clericalInst1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClericalInst1(String value) {
        this.clericalInst1 = value;
    }

    /**
     * Gets the value of the clericalInst2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClericalInst2() {
        return clericalInst2;
    }

    /**
     * Sets the value of the clericalInst2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClericalInst2(String value) {
        this.clericalInst2 = value;
    }

    /**
     * Gets the value of the commCust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommCust() {
        return commCust;
    }

    /**
     * Sets the value of the commCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommCust(String value) {
        this.commCust = value;
    }

    /**
     * Gets the value of the commName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommName() {
        return commName;
    }

    /**
     * Sets the value of the commName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommName(String value) {
        this.commName = value;
    }

    /**
     * Gets the value of the cptPriCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCptPriCarrier() {
        return cptPriCarrier;
    }

    /**
     * Sets the value of the cptPriCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCptPriCarrier(String value) {
        this.cptPriCarrier = value;
    }

    /**
     * Gets the value of the cptSecCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCptSecCarrier() {
        return cptSecCarrier;
    }

    /**
     * Sets the value of the cptSecCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCptSecCarrier(String value) {
        this.cptSecCarrier = value;
    }

    /**
     * Gets the value of the custKwic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustKwic() {
        return custKwic;
    }

    /**
     * Sets the value of the custKwic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustKwic(String value) {
        this.custKwic = value;
    }

    /**
     * Gets the value of the custSelco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSelco() {
        return custSelco;
    }

    /**
     * Sets the value of the custSelco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSelco(String value) {
        this.custSelco = value;
    }

    /**
     * Gets the value of the deliverySched property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverySched() {
        return deliverySched;
    }

    /**
     * Sets the value of the deliverySched property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverySched(String value) {
        this.deliverySched = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the district2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict2() {
        return district2;
    }

    /**
     * Sets the value of the district2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict2(String value) {
        this.district2 = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the districtManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictManager() {
        return districtManager;
    }

    /**
     * Sets the value of the districtManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictManager(String value) {
        this.districtManager = value;
    }

    /**
     * Gets the value of the faxNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNbr() {
        return faxNbr;
    }

    /**
     * Sets the value of the faxNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNbr(String value) {
        this.faxNbr = value;
    }

    /**
     * Gets the value of the fob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFob() {
        return fob;
    }

    /**
     * Sets the value of the fob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFob(String value) {
        this.fob = value;
    }

    /**
     * Gets the value of the grpAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpAcct() {
        return grpAcct;
    }

    /**
     * Sets the value of the grpAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpAcct(String value) {
        this.grpAcct = value;
    }

    /**
     * Gets the value of the dateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAdded(String value) {
        this.dateAdded = value;
    }

    /**
     * Gets the value of the loc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoc() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoc(String value) {
        this.loc = value;
    }

    /**
     * Gets the value of the cptLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCptLoc() {
        return cptLoc;
    }

    /**
     * Sets the value of the cptLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCptLoc(String value) {
        this.cptLoc = value;
    }

    /**
     * Gets the value of the millCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMillCarrier() {
        return millCarrier;
    }

    /**
     * Sets the value of the millCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMillCarrier(String value) {
        this.millCarrier = value;
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

    /**
     * Gets the value of the refName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefName() {
        return refName;
    }

    /**
     * Sets the value of the refName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefName(String value) {
        this.refName = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the rugsPriCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRugsPriCarrier() {
        return rugsPriCarrier;
    }

    /**
     * Sets the value of the rugsPriCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRugsPriCarrier(String value) {
        this.rugsPriCarrier = value;
    }

    /**
     * Gets the value of the rugsSecCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRugsSecCarrier() {
        return rugsSecCarrier;
    }

    /**
     * Sets the value of the rugsSecCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRugsSecCarrier(String value) {
        this.rugsSecCarrier = value;
    }

    /**
     * Gets the value of the selcoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelcoName() {
        return selcoName;
    }

    /**
     * Sets the value of the selcoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelcoName(String value) {
        this.selcoName = value;
    }

    /**
     * Gets the value of the salesPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPerson() {
        return salesPerson;
    }

    /**
     * Sets the value of the salesPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPerson(String value) {
        this.salesPerson = value;
    }

    /**
     * Gets the value of the specialInst1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInst1() {
        return specialInst1;
    }

    /**
     * Sets the value of the specialInst1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInst1(String value) {
        this.specialInst1 = value;
    }

    /**
     * Gets the value of the specialInst2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInst2() {
        return specialInst2;
    }

    /**
     * Sets the value of the specialInst2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInst2(String value) {
        this.specialInst2 = value;
    }

    /**
     * Gets the value of the specialInst3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInst3() {
        return specialInst3;
    }

    /**
     * Sets the value of the specialInst3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInst3(String value) {
        this.specialInst3 = value;
    }

    /**
     * Gets the value of the specialInst4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInst4() {
        return specialInst4;
    }

    /**
     * Sets the value of the specialInst4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInst4(String value) {
        this.specialInst4 = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMsg() {
        return statusMsg;
    }

    /**
     * Sets the value of the statusMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMsg(String value) {
        this.statusMsg = value;
    }

    /**
     * Gets the value of the termsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsCode() {
        return termsCode;
    }

    /**
     * Sets the value of the termsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsCode(String value) {
        this.termsCode = value;
    }

    /**
     * Gets the value of the termsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsDesc() {
        return termsDesc;
    }

    /**
     * Sets the value of the termsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsDesc(String value) {
        this.termsDesc = value;
    }

    /**
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory(String value) {
        this.territory = value;
    }

    /**
     * Gets the value of the territoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryName() {
        return territoryName;
    }

    /**
     * Sets the value of the territoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryName(String value) {
        this.territoryName = value;
    }

    /**
     * Gets the value of the whseCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhseCarrier() {
        return whseCarrier;
    }

    /**
     * Sets the value of the whseCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhseCarrier(String value) {
        this.whseCarrier = value;
    }

    /**
     * Gets the value of the commCustInd property.
     * 
     */
    public boolean isCommCustInd() {
        return commCustInd;
    }

    /**
     * Sets the value of the commCustInd property.
     * 
     */
    public void setCommCustInd(boolean value) {
        this.commCustInd = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
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
     * Gets the value of the phoneNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNbr() {
        return phoneNbr;
    }

    /**
     * Sets the value of the phoneNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNbr(String value) {
        this.phoneNbr = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the storeTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreTypeDesc() {
        return storeTypeDesc;
    }

    /**
     * Sets the value of the storeTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreTypeDesc(String value) {
        this.storeTypeDesc = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the cptileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCptileId() {
        return cptileId;
    }

    /**
     * Sets the value of the cptileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCptileId(String value) {
        this.cptileId = value;
    }

    /**
     * Gets the value of the cptileLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCptileLoc() {
        return cptileLoc;
    }

    /**
     * Sets the value of the cptileLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCptileLoc(String value) {
        this.cptileLoc = value;
    }

    /**
     * Gets the value of the cptileMillCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCptileMillCarrier() {
        return cptileMillCarrier;
    }

    /**
     * Sets the value of the cptileMillCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCptileMillCarrier(String value) {
        this.cptileMillCarrier = value;
    }

    /**
     * Gets the value of the cptileWhseCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCptileWhseCarrier() {
        return cptileWhseCarrier;
    }

    /**
     * Sets the value of the cptileWhseCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCptileWhseCarrier(String value) {
        this.cptileWhseCarrier = value;
    }

}
