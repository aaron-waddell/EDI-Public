
package com.shaw.ediorderservices.csws;

import javax.xml.datatype.XMLGregorianCalendar;


public class Order
    extends OwsResponse
{

    protected String orderNbr;
    protected boolean restricted;
    protected XMLGregorianCalendar orderDate;

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
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

}
