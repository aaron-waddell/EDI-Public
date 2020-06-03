
package com.shaw.ediorderservices.csws;

public class ShipInfo
    extends OwsResponse
{

    protected String ratingLaneDetail;
    protected String ratingLaneId;
    protected boolean cashBefDeliv;
    protected boolean shipPartInv;
    protected boolean shipWithRugs;
    protected String orderStatus;
    protected String custNbr;
    protected String billtoAddr1;
    protected String billtoAddr2;
    protected String billtoCity;
    protected String billtoName;
    protected String billtoState;
    protected String billtoZip;
    protected String hsmChargeCode1;
    protected String headerSidemark1;
    protected double hsmChargeAmount1;
    protected String hsmChargeCode2;
    protected String headerSidemark2;
    protected double hsmChargeAmount2;
    protected String shipAddr1;
    protected String shipAddr2;
    protected String shipCity;
    protected String shipCityI;
    protected String shipCountry;
    protected String shipName1;
    protected String shipName2;
    protected String shipState;
    protected String shipStateI;
    protected String shipToHeader;
    protected String shipZip;
    protected String shipZipI;
    protected String specialInst1;
    protected String specialInst2;
    protected String specialInst3;
    protected String specialInst4;
    protected String shipCustNbr;
    protected int addrKey;
    protected int seqNbr;
    protected String carrier;
    protected String statusCode;
    protected String discountType;
    protected String airFreight;
    protected String blanketOrder;
    protected String callBeforeDelivery;
    protected String revRollWrap;
    protected String callWithRollSizes;
    protected String cpu;
    protected String cutBound;
    protected String cutDown;
    protected String holdForInstructions;
    protected String peddleRush;
    protected String prodRequest;
    protected String replacement;
    protected String rush;
    protected String shipWithRacks;
    protected String specialTerms;
    protected String swatchRequest;
    protected String thirdPartyBilling;
    protected String dept;
    protected String destCountry;
    protected String typeInCarrierName;
    protected String freightType;
    protected String orderType;
    protected String requestedBy;
    protected String serviceCode;
    protected String shipComplete;
    protected String territory;
    protected String typeInCarrier;
    protected String warehouseCPU;
    protected String dealerName;
    protected String dealerRelationship;
    protected String storeAddress;
    protected String storeNbr;
    protected String adFlag;
    protected String endUser;
    protected String firmCode;
    protected String firmName;
    protected String projectReference;
    protected String holdData;
    protected String airFreightData;
    protected String callBeforeDelData;
    protected String callRollSizeData;
    protected String cpuData;
    protected String replacementData;
    protected String specialTermsData;
    protected String swatchData;
    protected String thirdPartyData;
    protected String thirdPartyAcctNbr;
    protected String poNbr;
    protected String shipCountryName;
    protected String poNeeded;
    protected boolean collateFlag;
    protected boolean marketHoldFlag;
    protected String labelContact;
    protected String labelProjectName;
    protected String labelDefvInfo;
    protected String labelShipToPhone;
    protected String allowCanadianAddress;
    protected double totalWeight;
    protected boolean resDelvFlag;
    protected String shipDate;
    protected String extraFrt;
    protected String insideDelFlag;
    protected String jobSiteResidFlag;
    protected String jobSiteResidSidemark1;
    protected String jobSiteResidSidemark2;
    protected String liftGateFlag;
    protected double manualDrop;
    protected double manualFreight;
    protected double manualFuel;
    protected String modeCode;
    protected String shipPoint;
    protected String residentialDelivFlag;
    protected String headerSidemarkCode1;
    protected String headerSidemarkCode2;
    protected String district;
    protected String region;
    protected String endUse;
    protected String incoTerms;
    protected String projectName;
    protected String projectNbr;
    protected Builder builder;

    /**
     * Gets the value of the ratingLaneDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingLaneDetail() {
        return ratingLaneDetail;
    }

    /**
     * Sets the value of the ratingLaneDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingLaneDetail(String value) {
        this.ratingLaneDetail = value;
    }

    /**
     * Gets the value of the ratingLaneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingLaneId() {
        return ratingLaneId;
    }

    /**
     * Sets the value of the ratingLaneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingLaneId(String value) {
        this.ratingLaneId = value;
    }

    /**
     * Gets the value of the cashBefDeliv property.
     * 
     */
    public boolean isCashBefDeliv() {
        return cashBefDeliv;
    }

    /**
     * Sets the value of the cashBefDeliv property.
     * 
     */
    public void setCashBefDeliv(boolean value) {
        this.cashBefDeliv = value;
    }

    /**
     * Gets the value of the shipPartInv property.
     * 
     */
    public boolean isShipPartInv() {
        return shipPartInv;
    }

    /**
     * Sets the value of the shipPartInv property.
     * 
     */
    public void setShipPartInv(boolean value) {
        this.shipPartInv = value;
    }

    /**
     * Gets the value of the shipWithRugs property.
     * 
     */
    public boolean isShipWithRugs() {
        return shipWithRugs;
    }

    /**
     * Sets the value of the shipWithRugs property.
     * 
     */
    public void setShipWithRugs(boolean value) {
        this.shipWithRugs = value;
    }

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
     * Gets the value of the billtoAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltoAddr1() {
        return billtoAddr1;
    }

    /**
     * Sets the value of the billtoAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltoAddr1(String value) {
        this.billtoAddr1 = value;
    }

    /**
     * Gets the value of the billtoAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltoAddr2() {
        return billtoAddr2;
    }

    /**
     * Sets the value of the billtoAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltoAddr2(String value) {
        this.billtoAddr2 = value;
    }

    /**
     * Gets the value of the billtoCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltoCity() {
        return billtoCity;
    }

    /**
     * Sets the value of the billtoCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltoCity(String value) {
        this.billtoCity = value;
    }

    /**
     * Gets the value of the billtoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltoName() {
        return billtoName;
    }

    /**
     * Sets the value of the billtoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltoName(String value) {
        this.billtoName = value;
    }

    /**
     * Gets the value of the billtoState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltoState() {
        return billtoState;
    }

    /**
     * Sets the value of the billtoState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltoState(String value) {
        this.billtoState = value;
    }

    /**
     * Gets the value of the billtoZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltoZip() {
        return billtoZip;
    }

    /**
     * Sets the value of the billtoZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltoZip(String value) {
        this.billtoZip = value;
    }

    /**
     * Gets the value of the hsmChargeCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsmChargeCode1() {
        return hsmChargeCode1;
    }

    /**
     * Sets the value of the hsmChargeCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsmChargeCode1(String value) {
        this.hsmChargeCode1 = value;
    }

    /**
     * Gets the value of the headerSidemark1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderSidemark1() {
        return headerSidemark1;
    }

    /**
     * Sets the value of the headerSidemark1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderSidemark1(String value) {
        this.headerSidemark1 = value;
    }

    /**
     * Gets the value of the hsmChargeAmount1 property.
     * 
     */
    public double getHsmChargeAmount1() {
        return hsmChargeAmount1;
    }

    /**
     * Sets the value of the hsmChargeAmount1 property.
     * 
     */
    public void setHsmChargeAmount1(double value) {
        this.hsmChargeAmount1 = value;
    }

    /**
     * Gets the value of the hsmChargeCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsmChargeCode2() {
        return hsmChargeCode2;
    }

    /**
     * Sets the value of the hsmChargeCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsmChargeCode2(String value) {
        this.hsmChargeCode2 = value;
    }

    /**
     * Gets the value of the headerSidemark2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderSidemark2() {
        return headerSidemark2;
    }

    /**
     * Sets the value of the headerSidemark2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderSidemark2(String value) {
        this.headerSidemark2 = value;
    }

    /**
     * Gets the value of the hsmChargeAmount2 property.
     * 
     */
    public double getHsmChargeAmount2() {
        return hsmChargeAmount2;
    }

    /**
     * Sets the value of the hsmChargeAmount2 property.
     * 
     */
    public void setHsmChargeAmount2(double value) {
        this.hsmChargeAmount2 = value;
    }

    /**
     * Gets the value of the shipAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAddr1() {
        return shipAddr1;
    }

    /**
     * Sets the value of the shipAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAddr1(String value) {
        this.shipAddr1 = value;
    }

    /**
     * Gets the value of the shipAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAddr2() {
        return shipAddr2;
    }

    /**
     * Sets the value of the shipAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAddr2(String value) {
        this.shipAddr2 = value;
    }

    /**
     * Gets the value of the shipCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCity() {
        return shipCity;
    }

    /**
     * Sets the value of the shipCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCity(String value) {
        this.shipCity = value;
    }

    /**
     * Gets the value of the shipCityI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCityI() {
        return shipCityI;
    }

    /**
     * Sets the value of the shipCityI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCityI(String value) {
        this.shipCityI = value;
    }

    /**
     * Gets the value of the shipCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCountry() {
        return shipCountry;
    }

    /**
     * Sets the value of the shipCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCountry(String value) {
        this.shipCountry = value;
    }

    /**
     * Gets the value of the shipName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipName1() {
        return shipName1;
    }

    /**
     * Sets the value of the shipName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipName1(String value) {
        this.shipName1 = value;
    }

    /**
     * Gets the value of the shipName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipName2() {
        return shipName2;
    }

    /**
     * Sets the value of the shipName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipName2(String value) {
        this.shipName2 = value;
    }

    /**
     * Gets the value of the shipState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipState() {
        return shipState;
    }

    /**
     * Sets the value of the shipState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipState(String value) {
        this.shipState = value;
    }

    /**
     * Gets the value of the shipStateI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipStateI() {
        return shipStateI;
    }

    /**
     * Sets the value of the shipStateI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipStateI(String value) {
        this.shipStateI = value;
    }

    /**
     * Gets the value of the shipToHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToHeader() {
        return shipToHeader;
    }

    /**
     * Sets the value of the shipToHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToHeader(String value) {
        this.shipToHeader = value;
    }

    /**
     * Gets the value of the shipZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipZip() {
        return shipZip;
    }

    /**
     * Sets the value of the shipZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipZip(String value) {
        this.shipZip = value;
    }

    /**
     * Gets the value of the shipZipI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipZipI() {
        return shipZipI;
    }

    /**
     * Sets the value of the shipZipI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipZipI(String value) {
        this.shipZipI = value;
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
     * Gets the value of the shipCustNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCustNbr() {
        return shipCustNbr;
    }

    /**
     * Sets the value of the shipCustNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCustNbr(String value) {
        this.shipCustNbr = value;
    }

    /**
     * Gets the value of the addrKey property.
     * 
     */
    public int getAddrKey() {
        return addrKey;
    }

    /**
     * Sets the value of the addrKey property.
     * 
     */
    public void setAddrKey(int value) {
        this.addrKey = value;
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
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
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
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountType(String value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the airFreight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirFreight() {
        return airFreight;
    }

    /**
     * Sets the value of the airFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirFreight(String value) {
        this.airFreight = value;
    }

    /**
     * Gets the value of the blanketOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlanketOrder() {
        return blanketOrder;
    }

    /**
     * Sets the value of the blanketOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlanketOrder(String value) {
        this.blanketOrder = value;
    }

    /**
     * Gets the value of the callBeforeDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBeforeDelivery() {
        return callBeforeDelivery;
    }

    /**
     * Sets the value of the callBeforeDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBeforeDelivery(String value) {
        this.callBeforeDelivery = value;
    }

    /**
     * Gets the value of the revRollWrap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevRollWrap() {
        return revRollWrap;
    }

    /**
     * Sets the value of the revRollWrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevRollWrap(String value) {
        this.revRollWrap = value;
    }

    /**
     * Gets the value of the callWithRollSizes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallWithRollSizes() {
        return callWithRollSizes;
    }

    /**
     * Sets the value of the callWithRollSizes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallWithRollSizes(String value) {
        this.callWithRollSizes = value;
    }

    /**
     * Gets the value of the cpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * Sets the value of the cpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpu(String value) {
        this.cpu = value;
    }

    /**
     * Gets the value of the cutBound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutBound() {
        return cutBound;
    }

    /**
     * Sets the value of the cutBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutBound(String value) {
        this.cutBound = value;
    }

    /**
     * Gets the value of the cutDown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutDown() {
        return cutDown;
    }

    /**
     * Sets the value of the cutDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutDown(String value) {
        this.cutDown = value;
    }

    /**
     * Gets the value of the holdForInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldForInstructions() {
        return holdForInstructions;
    }

    /**
     * Sets the value of the holdForInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldForInstructions(String value) {
        this.holdForInstructions = value;
    }

    /**
     * Gets the value of the peddleRush property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeddleRush() {
        return peddleRush;
    }

    /**
     * Sets the value of the peddleRush property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeddleRush(String value) {
        this.peddleRush = value;
    }

    /**
     * Gets the value of the prodRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdRequest() {
        return prodRequest;
    }

    /**
     * Sets the value of the prodRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdRequest(String value) {
        this.prodRequest = value;
    }

    /**
     * Gets the value of the replacement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacement() {
        return replacement;
    }

    /**
     * Sets the value of the replacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacement(String value) {
        this.replacement = value;
    }

    /**
     * Gets the value of the rush property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRush() {
        return rush;
    }

    /**
     * Sets the value of the rush property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRush(String value) {
        this.rush = value;
    }

    /**
     * Gets the value of the shipWithRacks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipWithRacks() {
        return shipWithRacks;
    }

    /**
     * Sets the value of the shipWithRacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipWithRacks(String value) {
        this.shipWithRacks = value;
    }

    /**
     * Gets the value of the specialTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialTerms() {
        return specialTerms;
    }

    /**
     * Sets the value of the specialTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialTerms(String value) {
        this.specialTerms = value;
    }

    /**
     * Gets the value of the swatchRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwatchRequest() {
        return swatchRequest;
    }

    /**
     * Sets the value of the swatchRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwatchRequest(String value) {
        this.swatchRequest = value;
    }

    /**
     * Gets the value of the thirdPartyBilling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyBilling() {
        return thirdPartyBilling;
    }

    /**
     * Sets the value of the thirdPartyBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyBilling(String value) {
        this.thirdPartyBilling = value;
    }

    /**
     * Gets the value of the dept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * Gets the value of the destCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCountry() {
        return destCountry;
    }

    /**
     * Sets the value of the destCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCountry(String value) {
        this.destCountry = value;
    }

    /**
     * Gets the value of the typeInCarrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeInCarrierName() {
        return typeInCarrierName;
    }

    /**
     * Sets the value of the typeInCarrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeInCarrierName(String value) {
        this.typeInCarrierName = value;
    }

    /**
     * Gets the value of the freightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightType() {
        return freightType;
    }

    /**
     * Sets the value of the freightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightType(String value) {
        this.freightType = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the requestedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedBy() {
        return requestedBy;
    }

    /**
     * Sets the value of the requestedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedBy(String value) {
        this.requestedBy = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the shipComplete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipComplete() {
        return shipComplete;
    }

    /**
     * Sets the value of the shipComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipComplete(String value) {
        this.shipComplete = value;
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
     * Gets the value of the typeInCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeInCarrier() {
        return typeInCarrier;
    }

    /**
     * Sets the value of the typeInCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeInCarrier(String value) {
        this.typeInCarrier = value;
    }

    /**
     * Gets the value of the warehouseCPU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseCPU() {
        return warehouseCPU;
    }

    /**
     * Sets the value of the warehouseCPU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseCPU(String value) {
        this.warehouseCPU = value;
    }

    /**
     * Gets the value of the dealerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * Sets the value of the dealerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerName(String value) {
        this.dealerName = value;
    }

    /**
     * Gets the value of the dealerRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerRelationship() {
        return dealerRelationship;
    }

    /**
     * Sets the value of the dealerRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerRelationship(String value) {
        this.dealerRelationship = value;
    }

    /**
     * Gets the value of the storeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreAddress() {
        return storeAddress;
    }

    /**
     * Sets the value of the storeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreAddress(String value) {
        this.storeAddress = value;
    }

    /**
     * Gets the value of the storeNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNbr() {
        return storeNbr;
    }

    /**
     * Sets the value of the storeNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNbr(String value) {
        this.storeNbr = value;
    }

    /**
     * Gets the value of the adFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdFlag() {
        return adFlag;
    }

    /**
     * Sets the value of the adFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdFlag(String value) {
        this.adFlag = value;
    }

    /**
     * Gets the value of the endUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUser() {
        return endUser;
    }

    /**
     * Sets the value of the endUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUser(String value) {
        this.endUser = value;
    }

    /**
     * Gets the value of the firmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmCode() {
        return firmCode;
    }

    /**
     * Sets the value of the firmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmCode(String value) {
        this.firmCode = value;
    }

    /**
     * Gets the value of the firmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmName() {
        return firmName;
    }

    /**
     * Sets the value of the firmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmName(String value) {
        this.firmName = value;
    }

    /**
     * Gets the value of the projectReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectReference() {
        return projectReference;
    }

    /**
     * Sets the value of the projectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectReference(String value) {
        this.projectReference = value;
    }

    /**
     * Gets the value of the holdData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldData() {
        return holdData;
    }

    /**
     * Sets the value of the holdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldData(String value) {
        this.holdData = value;
    }

    /**
     * Gets the value of the airFreightData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirFreightData() {
        return airFreightData;
    }

    /**
     * Sets the value of the airFreightData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirFreightData(String value) {
        this.airFreightData = value;
    }

    /**
     * Gets the value of the callBeforeDelData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBeforeDelData() {
        return callBeforeDelData;
    }

    /**
     * Sets the value of the callBeforeDelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBeforeDelData(String value) {
        this.callBeforeDelData = value;
    }

    /**
     * Gets the value of the callRollSizeData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallRollSizeData() {
        return callRollSizeData;
    }

    /**
     * Sets the value of the callRollSizeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallRollSizeData(String value) {
        this.callRollSizeData = value;
    }

    /**
     * Gets the value of the cpuData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpuData() {
        return cpuData;
    }

    /**
     * Sets the value of the cpuData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpuData(String value) {
        this.cpuData = value;
    }

    /**
     * Gets the value of the replacementData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementData() {
        return replacementData;
    }

    /**
     * Sets the value of the replacementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementData(String value) {
        this.replacementData = value;
    }

    /**
     * Gets the value of the specialTermsData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialTermsData() {
        return specialTermsData;
    }

    /**
     * Sets the value of the specialTermsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialTermsData(String value) {
        this.specialTermsData = value;
    }

    /**
     * Gets the value of the swatchData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwatchData() {
        return swatchData;
    }

    /**
     * Sets the value of the swatchData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwatchData(String value) {
        this.swatchData = value;
    }

    /**
     * Gets the value of the thirdPartyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyData() {
        return thirdPartyData;
    }

    /**
     * Sets the value of the thirdPartyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyData(String value) {
        this.thirdPartyData = value;
    }

    /**
     * Gets the value of the thirdPartyAcctNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAcctNbr() {
        return thirdPartyAcctNbr;
    }

    /**
     * Sets the value of the thirdPartyAcctNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAcctNbr(String value) {
        this.thirdPartyAcctNbr = value;
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
     * Gets the value of the shipCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCountryName() {
        return shipCountryName;
    }

    /**
     * Sets the value of the shipCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCountryName(String value) {
        this.shipCountryName = value;
    }

    /**
     * Gets the value of the poNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNeeded() {
        return poNeeded;
    }

    /**
     * Sets the value of the poNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNeeded(String value) {
        this.poNeeded = value;
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
     * Gets the value of the marketHoldFlag property.
     * 
     */
    public boolean isMarketHoldFlag() {
        return marketHoldFlag;
    }

    /**
     * Sets the value of the marketHoldFlag property.
     * 
     */
    public void setMarketHoldFlag(boolean value) {
        this.marketHoldFlag = value;
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
     * Gets the value of the labelDefvInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelDefvInfo() {
        return labelDefvInfo;
    }

    /**
     * Sets the value of the labelDefvInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelDefvInfo(String value) {
        this.labelDefvInfo = value;
    }

    /**
     * Gets the value of the labelShipToPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelShipToPhone() {
        return labelShipToPhone;
    }

    /**
     * Sets the value of the labelShipToPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelShipToPhone(String value) {
        this.labelShipToPhone = value;
    }

    /**
     * Gets the value of the allowCanadianAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowCanadianAddress() {
        return allowCanadianAddress;
    }

    /**
     * Sets the value of the allowCanadianAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowCanadianAddress(String value) {
        this.allowCanadianAddress = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     */
    public double getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     */
    public void setTotalWeight(double value) {
        this.totalWeight = value;
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
     * Gets the value of the extraFrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraFrt() {
        return extraFrt;
    }

    /**
     * Sets the value of the extraFrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraFrt(String value) {
        this.extraFrt = value;
    }

    /**
     * Gets the value of the insideDelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideDelFlag() {
        return insideDelFlag;
    }

    /**
     * Sets the value of the insideDelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideDelFlag(String value) {
        this.insideDelFlag = value;
    }

    /**
     * Gets the value of the jobSiteResidFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobSiteResidFlag() {
        return jobSiteResidFlag;
    }

    /**
     * Sets the value of the jobSiteResidFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobSiteResidFlag(String value) {
        this.jobSiteResidFlag = value;
    }

    /**
     * Gets the value of the jobSiteResidSidemark1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobSiteResidSidemark1() {
        return jobSiteResidSidemark1;
    }

    /**
     * Sets the value of the jobSiteResidSidemark1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobSiteResidSidemark1(String value) {
        this.jobSiteResidSidemark1 = value;
    }

    /**
     * Gets the value of the jobSiteResidSidemark2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobSiteResidSidemark2() {
        return jobSiteResidSidemark2;
    }

    /**
     * Sets the value of the jobSiteResidSidemark2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobSiteResidSidemark2(String value) {
        this.jobSiteResidSidemark2 = value;
    }

    /**
     * Gets the value of the liftGateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiftGateFlag() {
        return liftGateFlag;
    }

    /**
     * Sets the value of the liftGateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiftGateFlag(String value) {
        this.liftGateFlag = value;
    }

    /**
     * Gets the value of the manualDrop property.
     * 
     */
    public double getManualDrop() {
        return manualDrop;
    }

    /**
     * Sets the value of the manualDrop property.
     * 
     */
    public void setManualDrop(double value) {
        this.manualDrop = value;
    }

    /**
     * Gets the value of the manualFreight property.
     * 
     */
    public double getManualFreight() {
        return manualFreight;
    }

    /**
     * Sets the value of the manualFreight property.
     * 
     */
    public void setManualFreight(double value) {
        this.manualFreight = value;
    }

    /**
     * Gets the value of the manualFuel property.
     * 
     */
    public double getManualFuel() {
        return manualFuel;
    }

    /**
     * Sets the value of the manualFuel property.
     * 
     */
    public void setManualFuel(double value) {
        this.manualFuel = value;
    }

    /**
     * Gets the value of the modeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeCode() {
        return modeCode;
    }

    /**
     * Sets the value of the modeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeCode(String value) {
        this.modeCode = value;
    }

    /**
     * Gets the value of the shipPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipPoint() {
        return shipPoint;
    }

    /**
     * Sets the value of the shipPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipPoint(String value) {
        this.shipPoint = value;
    }

    /**
     * Gets the value of the residentialDelivFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialDelivFlag() {
        return residentialDelivFlag;
    }

    /**
     * Sets the value of the residentialDelivFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialDelivFlag(String value) {
        this.residentialDelivFlag = value;
    }

    /**
     * Gets the value of the headerSidemarkCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderSidemarkCode1() {
        return headerSidemarkCode1;
    }

    /**
     * Sets the value of the headerSidemarkCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderSidemarkCode1(String value) {
        this.headerSidemarkCode1 = value;
    }

    /**
     * Gets the value of the headerSidemarkCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderSidemarkCode2() {
        return headerSidemarkCode2;
    }

    /**
     * Sets the value of the headerSidemarkCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderSidemarkCode2(String value) {
        this.headerSidemarkCode2 = value;
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
     * Gets the value of the endUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUse() {
        return endUse;
    }

    /**
     * Sets the value of the endUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUse(String value) {
        this.endUse = value;
    }

    /**
     * Gets the value of the incoTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoTerms() {
        return incoTerms;
    }

    /**
     * Sets the value of the incoTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoTerms(String value) {
        this.incoTerms = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the projectNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectNbr() {
        return projectNbr;
    }

    /**
     * Sets the value of the projectNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectNbr(String value) {
        this.projectNbr = value;
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

}
