package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn.EdiShipInfoLnPK;


/**
 * The persistent class for the EDI_SHIP_INFO database table.
 * 
 */
@Entity
@Table(name="EDI_SHIP_INFO")
@NamedQuery(name="EdiShipInfo.findAll", query="SELECT e FROM EdiShipInfo e")
public class EdiShipInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * The primary key class for the EDI_SHIP_INFO database table.
	 * 
	 */
	@Embeddable
	public static class EdiShipInfoPK implements Serializable {
		//default serial version id, required for serializable classes.
		private static final long serialVersionUID = 1L;

		@Column(name="ORDER_NBR", unique=true, nullable=false, length=6)
		private String orderNbr;

		@Column(name="DATE_STAMP", unique=true, nullable=false)
		private LocalDate dateStamp;

		public EdiShipInfoPK() {
		}
		public EdiShipInfoPK(String shawOrderNbr, LocalDate orderDate) {
			orderNbr = shawOrderNbr;
			dateStamp = orderDate;
		}
		
		public String getOrderNbr() {
			return this.orderNbr;
		}
		public void setOrderNbr(String orderNbr) {
			this.orderNbr = orderNbr;
		}
		public LocalDate getDateStamp() {
			return this.dateStamp;
		}
		public void setDateStamp(LocalDate dateStamp) {
			this.dateStamp = dateStamp;
		}

		public boolean equals(Object other) {
			if (this == other) {
				return true;
			}
			if (!(other instanceof EdiShipInfoPK)) {
				return false;
			}
			EdiShipInfoPK castOther = (EdiShipInfoPK)other;
			return 
				this.orderNbr.equals(castOther.orderNbr)
				&& this.dateStamp.equals(castOther.dateStamp);
		}

		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.orderNbr.hashCode();
			hash = hash * prime + this.dateStamp.hashCode();
			
			return hash;
		}
	}
	
	@EmbeddedId
	private EdiShipInfoPK id;

	@Column(name="ACCT_CONTACT", nullable=false, length=45)
	private String acctContact;

	@Column(name="AGREEMENT_NBR", nullable=false, length=15)
	private String agreementNbr;

	@Column(name="AUTH_REP", nullable=false, length=45)
	private String authRep;

	@Column(name="AUTHORIZATION_NO", nullable=false, length=10)
	private String authorizationNo;

	@Column(name="BILL_TO_STORE_NBR", nullable=false, length=20)
	private String billToStoreNbr;

	@Column(name="BS_STORE_NBR", nullable=false, length=10)
	private String bsStoreNbr;

	@Column(name="CARR_CODE", nullable=false, length=2)
	private String carrCode;

	@Column(name="COMM_CUST", nullable=false, length=7)
	private String commCust;

	@Column(name="CONS_STATUS_MSG", nullable=false, length=35)
	private String consStatusMsg;

	@Column(name="CONSUMER_ADDR", nullable=false, length=35)
	private String consumerAddr;

	@Column(name="CONSUMER_ADDR2", nullable=false, length=35)
	private String consumerAddr2;

	@Column(name="CONSUMER_CARRIER", nullable=false, length=4)
	private String consumerCarrier;

	@Column(name="CONSUMER_CITY", nullable=false, length=19)
	private String consumerCity;

	@Column(name="CONSUMER_NAME", nullable=false, length=20)
	private String consumerName;

	@Column(name="CONSUMER_PHONE_NO", nullable=false, length=11)
	private String consumerPhoneNo;

	@Column(name="CONSUMER_PO_DATE", nullable=false)
	private LocalDate consumerPoDate;

	@Column(name="CONSUMER_STATE", nullable=false, length=2)
	private String consumerState;

	@Column(name="CONSUMER_ZIP", nullable=false, length=9)
	private String consumerZip;

	@Column(name="CONTRACT_NBR", nullable=false, length=15)
	private String contractNbr;

	@Column(name="CROSS_DOCK", nullable=false, length=10)
	private String crossDock;

	@Column(name="CUST_NBR", nullable=false, length=7)
	private String custNbr;

	@Column(name="CUST_PMT_METH", nullable=false, length=30)
	private String custPmtMeth;

	@Column(name="CUST_PO", nullable=false, length=22)
	private String custPo;

	@Column(name="CUST_SP_INST", nullable=false, length=45)
	private String custSpInst;

	@Column(name="CUST_WH_NBR", nullable=false, length=4)
	private String custWhNbr;

	@Column(name="CUSTOMER_CODE", nullable=false, length=2)
	private String customerCode;

	@Column(name="DELIVERY_DATE")
	private LocalDate deliveryDate;

	@Column(name="DELV_REQST_DATE")
	private LocalDate delvReqstDate;

	@Column(nullable=false, length=5)
	private String department;

	@Column(name="DIV_DESC", nullable=false, length=20)
	private String divDesc;

	@Column(name="DUNS_NBR", nullable=false, length=15)
	private String dunsNbr;

	@Column(name="EDI_ORDER_NUMBER", precision=10)
	private long ediOrderNumber;

	@Column(name="EVENT_INFO", nullable=false, length=15)
	private String eventInfo;

	@Column(name="GIFT_MESSAGE_1", nullable=false, length=45)
	private String giftMessage1;

	@Column(name="GIFT_MESSAGE_2", nullable=false, length=45)
	private String giftMessage2;

	@Column(name="HDR_DROP_DATE", nullable=false)
	private LocalDate hdrDropDate;

	@Column(name="LAST_CHNG_DATE", nullable=false)
	private LocalDateTime lastChngDate;

	@Column(name="LAST_CHNG_ID", nullable=false, length=8)
	private String lastChngId;

	@Column(name="NB_DATE", nullable=false)
	private LocalDate nbDate;

	@Column(name="NO_ASN_FLAG", nullable=false, length=1)
	private String noAsnFlag;

	@Column(name="ONLINE_TYPE", nullable=false, length=1)
	private String onlineType;

	@Column(name="ORDER_MER_COST", nullable=false, precision=13, scale=4)
	private long orderMerCost;

	@Column(name="ORDER_RET_HAND", nullable=false, precision=13, scale=4)
	private long orderRetHand;

	@Column(name="ORDER_RET_SH", nullable=false, precision=13, scale=4)
	private long orderRetSh;

	@Column(name="ORDER_RET_TAX", nullable=false, precision=13, scale=4)
	private long orderRetTax;

	@Column(name="ORDER_RET_TOTAL", nullable=false, precision=13, scale=4)
	private long orderRetTotal;

	@Column(name="ORDER_TYPE", nullable=false, length=1)
	private String orderType;

	@Column(name="ORDER_TYPE_DESC", nullable=false, length=15)
	private String orderTypeDesc;

	@Column(name="ORDERING_SYS", nullable=false, length=2)
	private String orderingSys;

	@Column(name="PO_DATE", nullable=false)
	private LocalDate poDate;

	@Column(name="PO_TYPE_SUFFIX", nullable=false, length=10)
	private String poTypeSuffix;

	@Column(name="PS_MSG", nullable=false, length=255)
	private String psMsg;

	@Column(name="PURCHASED_BY", nullable=false, length=45)
	private String purchasedBy;

	@Column(name="RECEIVING_STORE", nullable=false, length=10)
	private String receivingStore;

	@Column(name="REF_TC_NBR", nullable=false, length=20)
	private String refTcNbr;

	@Column(name="RETURN_MSG", nullable=false, length=35)
	private String returnMsg;

	@Column(name="ROUTE_BY_DATE", nullable=false)
	private LocalDate routeByDate;

	@Column(name="SALES_CHECK_NO", nullable=false, length=30)
	private String salesCheckNo;

	@Column(name="SALES_REQ_CODE", nullable=false, length=2)
	private String salesReqCode;

	@Column(name="SHIP_BY_DATE")
	private LocalDate shipByDate;

	@Column(name="SHIP_CANCEL_DATE", nullable=false)
	private LocalDate shipCancelDate;

	@Column(name="SHIP_TO_DEST_CODE", nullable=false, length=2)
	private String shipToDestCode;

	@Column(name="SPEC_PO_NUMBER", nullable=false, length=20)
	private String specPoNumber;

	@Column(name="SPL_BILL_TO_STORE", nullable=false, length=10)
	private String splBillToStore;

	@Column(name="SPL_SHIP_TO_STORE", nullable=false, length=10)
	private String splShipToStore;

	@Column(name="SPL_XDOCK_CENTER", nullable=false, length=10)
	private String splXdockCenter;

	@Column(name="STORE_NAME", nullable=false, length=45)
	private String storeName;

	@Column(name="VENDOR_NO", nullable=false, length=15)
	private String vendorNo;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "pk.ediShipInfo", orphanRemoval = true)
	private List<EdiShipInfoLn> lines;

	public EdiShipInfo() {
	}

	public EdiShipInfoPK getId() {
		return this.id;
	}

	public void setId(EdiShipInfoPK id) {
		this.id = id;
	}

	public String getAcctContact() {
		return this.acctContact;
	}

	public void setAcctContact(String acctContact) {
		this.acctContact = acctContact;
	}

	public String getAgreementNbr() {
		return this.agreementNbr;
	}

	public void setAgreementNbr(String agreementNbr) {
		this.agreementNbr = agreementNbr;
	}

	public String getAuthRep() {
		return this.authRep;
	}

	public void setAuthRep(String authRep) {
		this.authRep = authRep;
	}

	public String getAuthorizationNo() {
		return this.authorizationNo;
	}

	public void setAuthorizationNo(String authorizationNo) {
		this.authorizationNo = authorizationNo;
	}

	public String getBillToStoreNbr() {
		return this.billToStoreNbr;
	}

	public void setBillToStoreNbr(String billToStoreNbr) {
		this.billToStoreNbr = billToStoreNbr;
	}

	public String getBsStoreNbr() {
		return this.bsStoreNbr;
	}

	public void setBsStoreNbr(String bsStoreNbr) {
		this.bsStoreNbr = bsStoreNbr;
	}

	public String getCarrCode() {
		return this.carrCode;
	}

	public void setCarrCode(String carrCode) {
		this.carrCode = carrCode;
	}

	public String getCommCust() {
		return this.commCust;
	}

	public void setCommCust(String commCust) {
		this.commCust = commCust;
	}

	public String getConsStatusMsg() {
		return this.consStatusMsg;
	}

	public void setConsStatusMsg(String consStatusMsg) {
		this.consStatusMsg = consStatusMsg;
	}

	public String getConsumerAddr() {
		return this.consumerAddr;
	}

	public void setConsumerAddr(String consumerAddr) {
		this.consumerAddr = consumerAddr;
	}

	public String getConsumerAddr2() {
		return this.consumerAddr2;
	}

	public void setConsumerAddr2(String consumerAddr2) {
		this.consumerAddr2 = consumerAddr2;
	}

	public String getConsumerCarrier() {
		return this.consumerCarrier;
	}

	public void setConsumerCarrier(String consumerCarrier) {
		this.consumerCarrier = consumerCarrier;
	}

	public String getConsumerCity() {
		return this.consumerCity;
	}

	public void setConsumerCity(String consumerCity) {
		this.consumerCity = consumerCity;
	}

	public String getConsumerName() {
		return this.consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getConsumerPhoneNo() {
		return this.consumerPhoneNo;
	}

	public void setConsumerPhoneNo(String consumerPhoneNo) {
		this.consumerPhoneNo = consumerPhoneNo;
	}

	public LocalDate getConsumerPoDate() {
		return this.consumerPoDate;
	}

	public void setConsumerPoDate(LocalDate consumerPoDate) {
		this.consumerPoDate = consumerPoDate;
	}

	public String getConsumerState() {
		return this.consumerState;
	}

	public void setConsumerState(String consumerState) {
		this.consumerState = consumerState;
	}

	public String getConsumerZip() {
		return this.consumerZip;
	}

	public void setConsumerZip(String consumerZip) {
		this.consumerZip = consumerZip;
	}

	public String getContractNbr() {
		return this.contractNbr;
	}

	public void setContractNbr(String contractNbr) {
		this.contractNbr = contractNbr;
	}

	public String getCrossDock() {
		return this.crossDock;
	}

	public void setCrossDock(String crossDock) {
		this.crossDock = crossDock;
	}

	public String getCustNbr() {
		return this.custNbr;
	}

	public void setCustNbr(String custNbr) {
		this.custNbr = custNbr;
	}

	public String getCustPmtMeth() {
		return this.custPmtMeth;
	}

	public void setCustPmtMeth(String custPmtMeth) {
		this.custPmtMeth = custPmtMeth;
	}

	public String getCustPo() {
		return this.custPo;
	}

	public void setCustPo(String custPo) {
		this.custPo = custPo;
	}

	public String getCustSpInst() {
		return this.custSpInst;
	}

	public void setCustSpInst(String custSpInst) {
		this.custSpInst = custSpInst;
	}

	public String getCustWhNbr() {
		return this.custWhNbr;
	}

	public void setCustWhNbr(String custWhNbr) {
		this.custWhNbr = custWhNbr;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public LocalDate getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public LocalDate getDelvReqstDate() {
		return this.delvReqstDate;
	}

	public void setDelvReqstDate(LocalDate delvReqstDate) {
		this.delvReqstDate = delvReqstDate;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDivDesc() {
		return this.divDesc;
	}

	public void setDivDesc(String divDesc) {
		this.divDesc = divDesc;
	}

	public String getDunsNbr() {
		return this.dunsNbr;
	}

	public void setDunsNbr(String dunsNbr) {
		this.dunsNbr = dunsNbr;
	}

	public long getEdiOrderNumber() {
		return this.ediOrderNumber;
	}

	public void setEdiOrderNumber(long ediOrderNumber) {
		this.ediOrderNumber = ediOrderNumber;
	}

	public String getEventInfo() {
		return this.eventInfo;
	}

	public void setEventInfo(String eventInfo) {
		this.eventInfo = eventInfo;
	}

	public String getGiftMessage1() {
		return this.giftMessage1;
	}

	public void setGiftMessage1(String giftMessage1) {
		this.giftMessage1 = giftMessage1;
	}

	public String getGiftMessage2() {
		return this.giftMessage2;
	}

	public void setGiftMessage2(String giftMessage2) {
		this.giftMessage2 = giftMessage2;
	}

	public LocalDate getHdrDropDate() {
		return this.hdrDropDate;
	}

	public void setHdrDropDate(LocalDate hdrDropDate) {
		this.hdrDropDate = hdrDropDate;
	}

	public LocalDateTime getLastChngDate() {
		return this.lastChngDate;
	}

	public void setLastChngDate(LocalDateTime lastChngDate) {
		this.lastChngDate = lastChngDate;
	}

	public String getLastChngId() {
		return this.lastChngId;
	}

	public void setLastChngId(String lastChngId) {
		this.lastChngId = lastChngId;
	}

	public LocalDate getNbDate() {
		return this.nbDate;
	}

	public void setNbDate(LocalDate nbDate) {
		this.nbDate = nbDate;
	}

	public String getNoAsnFlag() {
		return this.noAsnFlag;
	}

	public void setNoAsnFlag(String noAsnFlag) {
		this.noAsnFlag = noAsnFlag;
	}

	public String getOnlineType() {
		return this.onlineType;
	}

	public void setOnlineType(String onlineType) {
		this.onlineType = onlineType;
	}

	public long getOrderMerCost() {
		return this.orderMerCost;
	}

	public void setOrderMerCost(long orderMerCost) {
		this.orderMerCost = orderMerCost;
	}

	public long getOrderRetHand() {
		return this.orderRetHand;
	}

	public void setOrderRetHand(long orderRetHand) {
		this.orderRetHand = orderRetHand;
	}

	public long getOrderRetSh() {
		return this.orderRetSh;
	}

	public void setOrderRetSh(long orderRetSh) {
		this.orderRetSh = orderRetSh;
	}

	public long getOrderRetTax() {
		return this.orderRetTax;
	}

	public void setOrderRetTax(long orderRetTax) {
		this.orderRetTax = orderRetTax;
	}

	public long getOrderRetTotal() {
		return this.orderRetTotal;
	}

	public void setOrderRetTotal(long orderRetTotal) {
		this.orderRetTotal = orderRetTotal;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderTypeDesc() {
		return this.orderTypeDesc;
	}

	public void setOrderTypeDesc(String orderTypeDesc) {
		this.orderTypeDesc = orderTypeDesc;
	}

	public String getOrderingSys() {
		return this.orderingSys;
	}

	public void setOrderingSys(String orderingSys) {
		this.orderingSys = orderingSys;
	}

	public LocalDate getPoDate() {
		return this.poDate;
	}

	public void setPoDate(LocalDate poDate) {
		this.poDate = poDate;
	}

	public String getPoTypeSuffix() {
		return this.poTypeSuffix;
	}

	public void setPoTypeSuffix(String poTypeSuffix) {
		this.poTypeSuffix = poTypeSuffix;
	}

	public String getPsMsg() {
		return this.psMsg;
	}

	public void setPsMsg(String psMsg) {
		this.psMsg = psMsg;
	}

	public String getPurchasedBy() {
		return this.purchasedBy;
	}

	public void setPurchasedBy(String purchasedBy) {
		this.purchasedBy = purchasedBy;
	}

	public String getReceivingStore() {
		return this.receivingStore;
	}

	public void setReceivingStore(String receivingStore) {
		this.receivingStore = receivingStore;
	}

	public String getRefTcNbr() {
		return this.refTcNbr;
	}

	public void setRefTcNbr(String refTcNbr) {
		this.refTcNbr = refTcNbr;
	}

	public String getReturnMsg() {
		return this.returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public LocalDate getRouteByDate() {
		return this.routeByDate;
	}

	public void setRouteByDate(LocalDate routeByDate) {
		this.routeByDate = routeByDate;
	}

	public String getSalesCheckNo() {
		return this.salesCheckNo;
	}

	public void setSalesCheckNo(String salesCheckNo) {
		this.salesCheckNo = salesCheckNo;
	}

	public String getSalesReqCode() {
		return this.salesReqCode;
	}

	public void setSalesReqCode(String salesReqCode) {
		this.salesReqCode = salesReqCode;
	}

	public LocalDate getShipByDate() {
		return this.shipByDate;
	}

	public void setShipByDate(LocalDate shipByDate) {
		this.shipByDate = shipByDate;
	}

	public LocalDate getShipCancelDate() {
		return this.shipCancelDate;
	}

	public void setShipCancelDate(LocalDate shipCancelDate) {
		this.shipCancelDate = shipCancelDate;
	}

	public String getShipToDestCode() {
		return this.shipToDestCode;
	}

	public void setShipToDestCode(String shipToDestCode) {
		this.shipToDestCode = shipToDestCode;
	}

	public String getSpecPoNumber() {
		return this.specPoNumber;
	}

	public void setSpecPoNumber(String specPoNumber) {
		this.specPoNumber = specPoNumber;
	}

	public String getSplBillToStore() {
		return this.splBillToStore;
	}

	public void setSplBillToStore(String splBillToStore) {
		this.splBillToStore = splBillToStore;
	}

	public String getSplShipToStore() {
		return this.splShipToStore;
	}

	public void setSplShipToStore(String splShipToStore) {
		this.splShipToStore = splShipToStore;
	}

	public String getSplXdockCenter() {
		return this.splXdockCenter;
	}

	public void setSplXdockCenter(String splXdockCenter) {
		this.splXdockCenter = splXdockCenter;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getVendorNo() {
		return this.vendorNo;
	}

	public void setVendorNo(String vendorNo) {
		this.vendorNo = vendorNo;
	}

	public List<EdiShipInfoLn> getLines() {
		return lines;
	}

	public void setLines(List<EdiShipInfoLn> lines) {
		this.lines = new ArrayList<EdiShipInfoLn>();
		lines.stream().forEach(this::addLine);
	}
	public void addLine(EdiShipInfoLn l) {
		if (lines==null)
			this.lines = new ArrayList<EdiShipInfoLn>();			
		lines.add(l);
		l.setId(new EdiShipInfoLnPK(this,l.getId().getLineNbr()));
	}
	 
	public void removeLine(EdiShipInfoLn l) {
		lines.remove(l);
	    l.getId().setEdiShipInfo(null);
	}

	@Override
	public String toString() {
		return "EdiShipInfo [id=" + id + ", acctContact=" + acctContact + ", agreementNbr=" + agreementNbr
				+ ", authRep=" + authRep + ", authorizationNo=" + authorizationNo + ", billToStoreNbr=" + billToStoreNbr
				+ ", bsStoreNbr=" + bsStoreNbr + ", carrCode=" + carrCode + ", commCust=" + commCust
				+ ", consStatusMsg=" + consStatusMsg + ", consumerAddr=" + consumerAddr + ", consumerAddr2="
				+ consumerAddr2 + ", consumerCarrier=" + consumerCarrier + ", consumerCity=" + consumerCity
				+ ", consumerName=" + consumerName + ", consumerPhoneNo=" + consumerPhoneNo + ", consumerPoDate="
				+ consumerPoDate + ", consumerState=" + consumerState + ", consumerZip=" + consumerZip
				+ ", contractNbr=" + contractNbr + ", crossDock=" + crossDock + ", custNbr=" + custNbr
				+ ", custPmtMeth=" + custPmtMeth + ", custPo=" + custPo + ", custSpInst=" + custSpInst + ", custWhNbr="
				+ custWhNbr + ", customerCode=" + customerCode + ", deliveryDate=" + deliveryDate + ", delvReqstDate="
				+ delvReqstDate + ", department=" + department + ", divDesc=" + divDesc + ", dunsNbr=" + dunsNbr
				+ ", ediOrderNumber=" + ediOrderNumber + ", eventInfo=" + eventInfo + ", giftMessage1=" + giftMessage1
				+ ", giftMessage2=" + giftMessage2 + ", hdrDropDate=" + hdrDropDate + ", lastChngDate=" + lastChngDate
				+ ", lastChngId=" + lastChngId + ", nbDate=" + nbDate + ", noAsnFlag=" + noAsnFlag + ", onlineType="
				+ onlineType + ", orderMerCost=" + orderMerCost + ", orderRetHand=" + orderRetHand + ", orderRetSh="
				+ orderRetSh + ", orderRetTax=" + orderRetTax + ", orderRetTotal=" + orderRetTotal + ", orderType="
				+ orderType + ", orderTypeDesc=" + orderTypeDesc + ", orderingSys=" + orderingSys + ", poDate=" + poDate
				+ ", poTypeSuffix=" + poTypeSuffix + ", psMsg=" + psMsg + ", purchasedBy=" + purchasedBy
				+ ", receivingStore=" + receivingStore + ", refTcNbr=" + refTcNbr + ", returnMsg=" + returnMsg
				+ ", routeByDate=" + routeByDate + ", salesCheckNo=" + salesCheckNo + ", salesReqCode=" + salesReqCode
				+ ", shipByDate=" + shipByDate + ", shipCancelDate=" + shipCancelDate + ", shipToDestCode="
				+ shipToDestCode + ", specPoNumber=" + specPoNumber + ", splBillToStore=" + splBillToStore
				+ ", splShipToStore=" + splShipToStore + ", splXdockCenter=" + splXdockCenter + ", storeName="
				+ storeName + ", vendorNo=" + vendorNo + ", lines=" + lines + "]";
	}

	
}