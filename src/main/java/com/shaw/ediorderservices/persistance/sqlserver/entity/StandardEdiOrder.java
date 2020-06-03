package com.shaw.ediorderservices.persistance.sqlserver.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public abstract class StandardEdiOrder extends EdiOrder implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column (nullable = true, length=5)
	private String poQualifier = "";
	@Column (nullable = true, length=30)
	private String salesCheckNumber = "";
	@Column (nullable = true, length = 1)
	private String newStoreInd = "";
	@Column (nullable = true, length = 1)
	private String hostAlertFlag = "";
	@Column (nullable = true, length = 1)
	private String shipToConsFlag = "";
	@Column (nullable = true, length = 4)
	private String stdCarrierAlphaCode = "";
	@Column (nullable = true, length = 2)
	private String fobPoint = "";
	@Column (nullable = true, length=1)
	private String acknowledgeOrdInd = "";
	@Column (nullable = true, length=1)
	private String shipPartCompInd = "";
	@Column (nullable = true, length=1)
	private String reserveOrderInd = "";
	@Column (nullable = true, length=10)
	private String authorizationNo = "";
	@Column (nullable = true)
	private String carrMethCode = "";
	@Column (nullable = true, length=1)
	private String noAsnFlag = "";
	@Column (nullable = true, length=10)
	private String shipToStore = "";
	@Column (nullable = true, length=10)
	private String crossDock = "";
	@Column (nullable = true, length=10)
	private String markForStore = "";
	@Column (nullable = true, length=10)
	private String bsStore = "";

	@Column (nullable = true)
	private LocalDate consumerPoDate;
	@Column (nullable = true)
	private LocalDate deliveryDate;
	@Column (nullable = true)
	private LocalDate deliveryCutOffDate;
	@Column (nullable = true)
	private LocalDate routeByDate;

	@Column (nullable = true, length=35)
	private String consStatusMessage = "";
	@Column (nullable = true, length=255)
	private String packingSlipMessage = "";
	@Column (nullable = true, length=45)
	private String gift1Message = "";
	@Column (nullable = true, length=45)
	private String gift2Message = "";
	@Column (nullable = true, length=45)
	private String returnMessage = "";
	
	//TODO add custInfo - transient?
	//TODO add shipInfo - transient?
	
	public StandardEdiOrder() {
		super();		
	}
	
	public StandardEdiOrder(String orderType) {
		super(orderType);
	}

	public String getPoQualifier() {
		return poQualifier;
	}

	public void setPoQualifier(String poQualifier) {
		this.poQualifier = poQualifier;
	}

	public String getSalesCheckNumber() {
		return salesCheckNumber;
	}

	public void setSalesCheckNumber(String salesCheckNumber) {
		this.salesCheckNumber = salesCheckNumber;
	}

	public String getNewStoreInd() {
		return newStoreInd;
	}

	public void setNewStoreInd(String newStoreInd) {
		this.newStoreInd = newStoreInd;
	}

	public String getHostAlertFlag() {
		return hostAlertFlag;
	}

	public void setHostAlertFlag(String hostAlertFlag) {
		this.hostAlertFlag = hostAlertFlag;
	}

	public String getShipToConsFlag() {
		return shipToConsFlag;
	}

	public void setShipToConsFlag(String shipToConsFlag) {
		this.shipToConsFlag = shipToConsFlag;
	}

	public String getStdCarrierAlphaCode() {
		return stdCarrierAlphaCode;
	}

	public void setStdCarrierAlphaCode(String stdCarrierAlphaCode) {
		this.stdCarrierAlphaCode = stdCarrierAlphaCode;
	}

	public String getFobPoint() {
		return fobPoint;
	}

	public void setFobPoint(String fobPoint) {
		this.fobPoint = fobPoint;
	}

	public String getAcknowledgeOrdInd() {
		return acknowledgeOrdInd;
	}

	public void setAcknowledgeOrdInd(String acknowledgeOrdInd) {
		this.acknowledgeOrdInd = acknowledgeOrdInd;
	}

	public String getShipPartCompInd() {
		return shipPartCompInd;
	}

	public void setShipPartCompInd(String shipPartCompInd) {
		this.shipPartCompInd = shipPartCompInd;
	}

	public String getReserveOrderInd() {
		return reserveOrderInd;
	}

	public void setReserveOrderInd(String reserveOrderInd) {
		this.reserveOrderInd = reserveOrderInd;
	}

	public String getAuthorizationNo() {
		return authorizationNo;
	}

	public void setAuthorizationNo(String authorizationNo) {
		this.authorizationNo = authorizationNo;
	}

	public String getCarrMethCode() {
		return carrMethCode;
	}

	public void setCarrMethCode(String carrMethCode) {
		this.carrMethCode = carrMethCode;
	}

	public String getNoAsnFlag() {
		return noAsnFlag;
	}

	public void setNoAsnFlag(String noAsnFlag) {
		this.noAsnFlag = noAsnFlag;
	}

	public String getShipToStore() {
		return shipToStore;
	}

	public void setShipToStore(String shipToStore) {
		this.shipToStore = shipToStore;
	}

	public String getCrossDock() {
		return crossDock;
	}

	public void setCrossDock(String crossDock) {
		this.crossDock = crossDock;
	}

	public String getMarkForStore() {
		return markForStore;
	}

	public void setMarkForStore(String markForStore) {
		this.markForStore = markForStore;
	}

	public String getBsStore() {
		return bsStore;
	}

	public void setBsStore(String bsStore) {
		this.bsStore = bsStore;
	}

	public String getConsStatusMessage() {
		return consStatusMessage;
	}

	public void setConsStatusMessage(String consStatusMessage) {
		this.consStatusMessage = consStatusMessage;
	}

	public String getPackingSlipMessage() {
		return packingSlipMessage;
	}

	public void setPackingSlipMessage(String packingSlipMessage) {
		this.packingSlipMessage = packingSlipMessage;
	}

	public String getGift1Message() {
		return gift1Message;
	}

	public void setGift1Message(String gift1Message) {
		this.gift1Message = gift1Message;
	}

	public String getGift2Message() {
		return gift2Message;
	}

	public void setGift2Message(String gift2Message) {
		this.gift2Message = gift2Message;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public LocalDate getConsumerPoDate() {
		return consumerPoDate;
	}

	public void setConsumerPoDate(LocalDate consumerPoDate) {
		this.consumerPoDate = consumerPoDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public LocalDate getDeliveryCutOffDate() {
		return deliveryCutOffDate;
	}

	public void setDeliveryCutOffDate(LocalDate deliveryCutOffDate) {
		this.deliveryCutOffDate = deliveryCutOffDate;
	}

	public LocalDate getRouteByDate() {
		return routeByDate;
	}

	public void setRouteByDate(LocalDate routeByDate) {
		this.routeByDate = routeByDate;
	}
}
