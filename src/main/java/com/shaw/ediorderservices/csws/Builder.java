
package com.shaw.ediorderservices.csws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Builder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Builder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="builderStyleFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="builderHdrSidemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="builderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="builderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="builderStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbrOfHomes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subdivisionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Builder", propOrder = {
    "builderStyleFlag",
    "builderHdrSidemark",
    "builderId",
    "builderName",
    "builderStreetAddress",
    "lot",
    "nbrOfHomes",
    "subdivisionName"
})
public class Builder {

    protected boolean builderStyleFlag;
    protected String builderHdrSidemark;
    protected String builderId;
    protected String builderName;
    protected String builderStreetAddress;
    protected String lot;
    protected int nbrOfHomes;
    protected String subdivisionName;

    /**
     * Gets the value of the builderStyleFlag property.
     * 
     */
    public boolean isBuilderStyleFlag() {
        return builderStyleFlag;
    }

    /**
     * Sets the value of the builderStyleFlag property.
     * 
     */
    public void setBuilderStyleFlag(boolean value) {
        this.builderStyleFlag = value;
    }

    /**
     * Gets the value of the builderHdrSidemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilderHdrSidemark() {
        return builderHdrSidemark;
    }

    /**
     * Sets the value of the builderHdrSidemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilderHdrSidemark(String value) {
        this.builderHdrSidemark = value;
    }

    /**
     * Gets the value of the builderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilderId() {
        return builderId;
    }

    /**
     * Sets the value of the builderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilderId(String value) {
        this.builderId = value;
    }

    /**
     * Gets the value of the builderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilderName() {
        return builderName;
    }

    /**
     * Sets the value of the builderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilderName(String value) {
        this.builderName = value;
    }

    /**
     * Gets the value of the builderStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilderStreetAddress() {
        return builderStreetAddress;
    }

    /**
     * Sets the value of the builderStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilderStreetAddress(String value) {
        this.builderStreetAddress = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLot(String value) {
        this.lot = value;
    }

    /**
     * Gets the value of the nbrOfHomes property.
     * 
     */
    public int getNbrOfHomes() {
        return nbrOfHomes;
    }

    /**
     * Sets the value of the nbrOfHomes property.
     * 
     */
    public void setNbrOfHomes(int value) {
        this.nbrOfHomes = value;
    }

    /**
     * Gets the value of the subdivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdivisionName() {
        return subdivisionName;
    }

    /**
     * Sets the value of the subdivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdivisionName(String value) {
        this.subdivisionName = value;
    }

}
