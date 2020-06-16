
package com.shaw.ediorderservices.csws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://orderview.csws.shaw.com}OrderHeader"/>
 *         &lt;element name="lines" type="{http://orderview.csws.shaw.com}ArrayOfOrderLine"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderViewResponse" , namespace="http://v3.orderview.csws.shaw.com")
public class OrderViewResponse extends OwsResponse {

    @XmlElement(required = true, nillable = true)
    protected OrderHeader header;
    @XmlElement(required = true, nillable = true)
    protected List<OrderLine> lines;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeader }
     *     
     */
    public OrderHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeader }
     *     
     */
    public void setHeader(OrderHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderLine }
     *     
     */
    public List<OrderLine> getLines() {
    	if (lines == null)
    		lines = new ArrayList<OrderLine>();
    	return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderLine }
     *     
     */
    public void setLines(List<OrderLine> value) 
    {
        this.lines = value;
    }

}
