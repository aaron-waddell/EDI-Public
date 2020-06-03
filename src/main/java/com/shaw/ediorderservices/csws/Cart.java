package com.shaw.ediorderservices.csws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

public class Cart {
    protected boolean subset;
    protected boolean swatch;
    protected List<CartLineError> cartLineErrors;
    protected String discount;
    protected String cartOrderNbr;
    protected String cartNbr;
    protected List<CartLine> lines;
    protected boolean priceExplain;
    protected String pricingFlag;
    protected String locCode;
    protected String priceReqBy;
    protected XMLGregorianCalendar shipDate;
    protected String prodType;
    protected String freightCode;
    protected String shipPoint;
    protected String countryCode;
    protected String zipcode;

    public boolean isSubset() {
		return subset;
	}
	public void setSubset(boolean subset) {
		this.subset = subset;
	}
	public boolean isSwatch() {
		return swatch;
	}
	public void setSwatch(boolean swatch) {
		this.swatch = swatch;
	}
	public List<CartLineError> getCartLineErrors() {
		return cartLineErrors;
	}
	public void setCartLineErrors(List<CartLineError> cartLineErrors) {
		this.cartLineErrors = cartLineErrors;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getCartOrderNbr() {
		return cartOrderNbr;
	}
	public void setCartOrderNbr(String cartOrderNbr) {
		this.cartOrderNbr = cartOrderNbr;
	}
	public String getCartNbr() {
		return cartNbr;
	}
	public void setCartNbr(String cartNbr) {
		this.cartNbr = cartNbr;
	}
	public List<CartLine> getLines() {
		return lines;
	}
	public void setLines(List<CartLine> lines) {
		this.lines = lines;
	}
	public boolean isPriceExplain() {
		return priceExplain;
	}
	public void setPriceExplain(boolean priceExplain) {
		this.priceExplain = priceExplain;
	}
	public String getPricingFlag() {
		return pricingFlag;
	}
	public void setPricingFlag(String pricingFlag) {
		this.pricingFlag = pricingFlag;
	}
	public String getLocCode() {
		return locCode;
	}
	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}
	public String getPriceReqBy() {
		return priceReqBy;
	}
	public void setPriceReqBy(String priceReqBy) {
		this.priceReqBy = priceReqBy;
	}
	public XMLGregorianCalendar getShipDate() {
		return shipDate;
	}
	public void setShipDate(XMLGregorianCalendar shipDate) {
		this.shipDate = shipDate;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public String getFreightCode() {
		return freightCode;
	}
	public void setFreightCode(String freightCode) {
		this.freightCode = freightCode;
	}
	public String getShipPoint() {
		return shipPoint;
	}
	public void setShipPoint(String shipPoint) {
		this.shipPoint = shipPoint;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public void addLine(CartLine line) {
		if (lines==null)
			lines = new ArrayList<CartLine>();
		lines.add(line);
	}

}
