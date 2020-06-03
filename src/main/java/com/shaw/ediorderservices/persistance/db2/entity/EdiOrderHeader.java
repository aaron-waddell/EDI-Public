package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine.EdiOrderLinePK;


/**
 * The persistent class for the EDI_ORDER_HEADER database table.
 * 
 */
@Entity
@Table(name="EDI_ORDER_HEADER")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class EdiOrderHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(generator = "EDI_ORDER_NBR")
	@SequenceGenerator(name="EDI_ORDER_NBR", sequenceName="SHXP.EDI_ORDER_NBR", allocationSize=1)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SHXP.EDI_ORDER_NBR")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="EDI_ORDER_NUMBER", unique=true, nullable=false, precision=10)
	private Long legacyOrderNumber;

	@Column(name="ACCT_CONTACT", nullable=false, length=45)
	private String acctContact = "";

	@Column(name="ACKNOWLEGE_ORD_IND", nullable=false, length=1)
	private String acknowlegeOrdInd = "";

	@Column(name="ADDR_KEY")
	private Integer addrKey;

	@Column(name="AGREEMENT_NUMBER", nullable=false, length=15)
	private String agreementNumber = "";

	@Column(name="ASSIGNED_AGENT", nullable=false, length=8)
	private String assignedAgent = "";

	@Column(name="AUTH_REP", nullable=false, length=45)
	private String authRep = "";

	@Column(name="AUTHORIZATION_NO", nullable=false, length=10)
	private String authorizationNo = "";

	@Column(nullable=false, length=5)
	private String beg = "";

	@Column(name="BILL_TO_STATE", nullable=false, length=2)
	private String billToState = "";

	@Column(name="BILL_TO_STORE", nullable=false, length=10)
	private String billToStore = "";

	@Column(name="BS_STORE_NBR", nullable=false, length=10)
	private String bsStoreNbr = "";

	@Column(name="CANCEL_DATE_QUAL", nullable=false, length=3)
	private String cancelDateQualifier = "";

	@Column(name="CARRIER_CODE", nullable=false, length=2)
	private String carrierCode = "";

	@Column(name="CB_CUT_LENGTH", nullable=false, precision=5)
	private Double cbCutLength = 0.0;

	@Column(name="CHNG_LID", nullable=false, length=8)
	private String chngLid = "";

	@Column(name="CHNG_TIMESTAMP")
	private LocalDateTime chngTimestamp;

	@Column(name="COMM_CUST", nullable=false, length=7)
	private String commCust = "";

	@Column(name="CONS_STATUS_MSG", nullable=false, length=35)
	private String consStatusMsg = "";

	@Column(name="CONTRACT_USAGE_IND", nullable=false, length=1)
	private String contractUsageInd = "";

	@Column(name="CROSS_DOCK_CENTER", nullable=false, length=10)
	private String crossDockCenter = "";

	@Column(name="CUST_DEPT", nullable=false, length=5)
	private String custDept = "";

	@Column(name="CUST_PMT_METH", nullable=false, length=30)
	private String custPmtMeth = "";

	@Column(name="CUST_SP_INST", nullable=false, length=45)
	private String custSpInst = "";

	@Column(name="CUST_WH_NBR", nullable=false, length=4)
	private String custWhNbr = "";

	@Column(name="CUSTOMER_CODE", nullable=false, length=2)
	private String customerCode = "";

	@Column(name="CUSTOMER_NUMBER", nullable=false, length=7)
	private String custNbr = "";

	@Column(name="CUSTOMER_REF_NBR", nullable=false, length=3)
	private String customerRefNbr = "";

	@Column(name="CUSTOMER_SIDEMARK", nullable=false, length=36)
	private String customerSidemark = "";

	@Column(name="DELIVERY_DATE")
	private LocalDate deliveryDate;

	@Column(name="DELV_CUT_OFF_DT")
	private LocalDate delvCutOffDt;

	@Column(name="DIV_DESC", nullable=false, length=20)
	private String divDesc = "";

	@Column(name="DUNS_NBR", nullable=false, length=15)
	private String dunsNbr = "";

	@Column(name="ERROR_CODE", nullable=false, length=3)
	private String errorCode = "";

	@Column(name="ERROR_DESCRIPTION", nullable=false, length=50)
	private String errorDescription = "";

	@Column(name="ERROR_TIMESTAMP")
	private LocalDateTime errorTimestamp;

	@Column(name="EVENT_INFO", nullable=false, length=15)
	private String eventInfo = "";

	@Column(name="EXPLODE_FLAG", nullable=false, length=1)
	private String explodeFlag = "";

	@Column(name="FOB_POINT", nullable=false, length=2)
	private String fobPoint = "";

	@Column(name="FRT_CODE", nullable=false, length=1)
	private String frtCode = "";

	@Column(name="GIFT_MESSAGE_1", nullable=false, length=45)
	private String giftMessage1 = "";

	@Column(name="GIFT_MESSAGE_2", nullable=false, length=45)
	private String giftMessage2 = "";

	@Column(name="HOST_ALERT_FLAG", nullable=false, length=1)
	private String hostAlertFlag = "";

	@Column(name="INPUT_METHOD", nullable=false, length=10)
	private String inputMethod = "";

	@Column(name="MARK_FOR_STORE", nullable=false, length=10)
	private String markForStore = "";

	@Column(name="MEDIA_EVENT_CODE", nullable=false, length=2)
	private String mediaEventCode = "";

	@Column(name="NB_DATE")
	private LocalDate nbDate;

	@Column(name="NEW_STORE_IND", nullable=false, length=1)
	private String newStoreInd = "";

	@Column(name="NO_ASN_FLAG", nullable=false, length=1)
	private String noAsnFlag = "";


	@Column(name="OH_CANCEL_DATE")
	private LocalDate ohCancelDateValue;

	@Column(name="OH_STATUS_CODE", nullable=false, length=1)
	private String ohStatusCode = "";

	@Column(name="ON_NOTE", nullable=false, length=60)
	private String onNote = "";

	@Column(name="ONLINE_TYPE", nullable=false, length=1)
	private String onlineType = "";


	@Column(name="ORDER_DATE")
	private LocalDate orderDate;

	@Column(name="ORDER_LOC", nullable=false, length=2)
	private String orderLoc = "";

	@Column(name="ORDER_MER_COST", nullable=false, precision=13, scale=4)
	private Double orderMerCost = 0.0;

	@Column(name="ORDER_NUMBER", nullable=false, length=6)
	private String shawOrderNumber = "";

	@Column(name="ORDER_RET_HAND", nullable=false, precision=13, scale=4)
	private Double orderRetHand = 0.0;

	@Column(name="ORDER_RET_SH", nullable=false, precision=13, scale=4)
	private Double orderRetSh = 0.0;

	@Column(name="ORDER_RET_TAX", nullable=false, precision=13, scale=4)
	private Double orderRetTax = 0.0;

	@Column(name="ORDER_RET_TOTAL", nullable=false, precision=13, scale=4)
	private Double orderRetTotal = 0.0;

	@Column(name="ORDER_TYPE", nullable=false, length=1)
	private String orderType = "";

	@Column(name="ORDER_TYPE_DESC", nullable=false, length=15)
	private String orderTypeDesc = "";

	@Column(name="ORDER_WEIGHT", nullable=false, precision=9, scale=2)
	private Double orderWeight = 0.0;

	@Column(name="ORDERING_SYSTEM", nullable=false, length=2)
	private String orderingSystem = "";

	@Column(name="PHONE_NUMBER", nullable=false, length=11)
	private String phoneNumber = "";

	@Column(name="PO_CONTROL", nullable=false, length=5)
	private String poControl = "";


	@Column(name="PO_DATE")
	private LocalDate poDateValue;

	@Column(name="PO_DATE_QUAL", nullable=false, length=3)
	private String poDateQualifier = "";

	@Column(name="PO_NUMBER", nullable=false, length=22)
	private String poNumber = "";

	@Column(name="PO_QUAL", nullable=false, length=2)
	private String poQual = "";

	@Column(name="PO_TYPE", nullable=false, length=5)
	private String poType = "";

	@Column(name="PO_TYPE_SUFFIX", nullable=false, length=10)
	private String poTypeSuffix = "";

	@Column(name="PS_MSG", nullable=false, length=255)
	private String psMsg = "";

	@Column(name="PURCHASED_BY", nullable=false, length=45)
	private String purchasedBy = "";

	@Column(name="RCD_CODE", nullable=false, length=1)
	private String rcdCode = "";

	@Column(name="RECEIVED_TIMESTAMP")
	private LocalDateTime receivedTimestamp;

	@Column(name="REF_TC_NBR", nullable=false, length=20)
	private String refTcNbr = "";

	@Column(name="RESERVE_ORDER_IND", nullable=false, length=1)
	private String reserveOrderInd = "";

	@Column(name="RETURN_MSG", nullable=false, length=35)
	private String returnMsg = "";


	@Column(name="ROUTE_BY_DATE")
	private LocalDate routeByDate;

	@Column(name="SALES_CHECK_NUMBER", nullable=false, length=30)
	private String salesCheckNumber = "";

	@Column(name="SALES_REQ_CODE", nullable=false, length=2)
	private String salesReqCode = "";

	@Column(name="SELL_CO", nullable=false, length=2)
	private String sellCo = "";

	@Column(name="SEQ_NBR")
	private Integer seqNbr;


	@Column(name="SHIP_BY_CUT_OFF_DT")
	private LocalDate shipByCutOffDt;


	@Column(name="SHIP_BY_DATE")
	private LocalDate shipByDate;

	@Column(name="SHIP_CANCEL_DATE", nullable=false)
	private LocalDate shipCancelDate;

	@Column(name="SHIP_COMPLETE", nullable=false, length=1)
	private String shipComplete = "";

	@Column(name="SHIP_DATE")
	private LocalDate shipDateValue;

	@Column(name="SHIP_DATE_QUAL", nullable=false, length=3)
	private String shipDateQualifier = "";

	@Column(name="SHIP_INSTRUCTION", nullable=false, length=60)
	private String shipInstruction = "";

	@Column(name="SHIP_PART_COMP_IND", nullable=false, length=1)
	private String shipPartCompInd = "";

	@Column(name="SHIP_PT", nullable=false, length=2)
	private String shipPt = "";


	@Column(name="SPECIAL_INSTRUCT_1", nullable=false, length=45)
	private String specialInstruct1 = "";

	@Column(name="SPECIAL_INSTRUCT_2", nullable=false, length=45)
	private String specialInstruct2 = "";

	@Column(name="SPECIAL_INSTRUCT_3", nullable=false, length=45)
	private String specialInstruct3 = "";

	@Column(name="SPECIAL_INSTRUCT_4", nullable=false, length=45)
	private String specialInstruct4 = "";

	@Column(name="SPECIAL_PO_NO", nullable=false, length=20)
	private String specialPoNo = "";

	@Column(name="SRV_LEVEL", nullable=false, length=2)
	private String srvLevel = "";

	@Column(name="STATUS_CODE", nullable=false, length=1)
	private String statusCode = "";

	@Column(name="STD_CARR_ALPHA_IND", nullable=false, length=4)
	private String stdCarrAlphaInd = "";

	@Column(name="STORE_NAME", nullable=false, length=45)
	private String storeName = "";

	@Column(name="TERMS_NET_DAYS", nullable=false, length=3)
	private String termsNetDays = "";

	@Column(name="TERMS_TYPE_FLAG", nullable=false, length=2)
	private String termsTypeFlag = "";

	@Column(name="TOTAL_BINDING_FT", nullable=false, precision=5)
	private Double totalBindingFt = 0.0;

	@Column(name="USER_ID", nullable=false, length=8)
	private String userId = "";

	@Column(name="VENDOR_NO", nullable=false, length=15)
	private String vendorNo = "";

	@Column(name="WC_STORE", nullable=false, length=10)
	private String wcStore = "";

	@Embedded
	private LegacyConsumerAddress consumerAddress;

	@Embedded
	private LegacyShipToAddress shipToAddress;

	@Embedded
	private LegacyThirdPartyAddress thirdPartyAddress;
	
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "id.ediOrderHeader", orphanRemoval = true)
    private List<EdiOrderDate> dates = new ArrayList<EdiOrderDate>();

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "id.ediOrderHeader", orphanRemoval = true)
	private List<EdiOrderLine> lines = new ArrayList<EdiOrderLine>();


	public EdiOrderHeader() {
		consumerAddress = new LegacyConsumerAddress();
		shipToAddress = new LegacyShipToAddress();
		thirdPartyAddress = new LegacyThirdPartyAddress();
	}

	public Long getLegacyOrderNumber() {
		return this.legacyOrderNumber;
	}

	public void setLegacyOrderNumber(Long legacyOrderNumber) {
		this.legacyOrderNumber = legacyOrderNumber;
	}

	public String getAcctContact() {
		return acctContact;
	}

	public void setAcctContact(String acctContact) {
		this.acctContact = acctContact;
	}

	public String getAcknowlegeOrdInd() {
		return acknowlegeOrdInd;
	}

	public void setAcknowlegeOrdInd(String acknowlegeOrdInd) {
		this.acknowlegeOrdInd = acknowlegeOrdInd;
	}

	public Integer getAddrKey() {
		return addrKey;
	}

	public void setAddrKey(Integer addrKey) {
		this.addrKey = addrKey;
	}

	public String getAgreementNumber() {
		return agreementNumber;
	}

	public void setAgreementNumber(String agreementNumber) {
		this.agreementNumber = agreementNumber;
	}

	public String getAssignedAgent() {
		return assignedAgent;
	}

	public void setAssignedAgent(String assignedAgent) {
		this.assignedAgent = assignedAgent;
	}

	public String getAuthRep() {
		return authRep;
	}

	public void setAuthRep(String authRep) {
		this.authRep = authRep;
	}

	public String getAuthorizationNo() {
		return authorizationNo;
	}

	public void setAuthorizationNo(String authorizationNo) {
		this.authorizationNo = authorizationNo;
	}

	public String getBeg() {
		return beg;
	}

	public void setBeg(String beg) {
		this.beg = beg;
	}

	public String getBillToState() {
		return billToState;
	}

	public void setBillToState(String billToState) {
		this.billToState = billToState;
	}

	public String getBillToStore() {
		return billToStore;
	}

	public void setBillToStore(String billToStore) {
		this.billToStore = billToStore;
	}

	public String getBsStoreNbr() {
		return bsStoreNbr;
	}

	public void setBsStoreNbr(String bsStoreNbr) {
		this.bsStoreNbr = bsStoreNbr;
	}

	public String getCancelDateQualifier() {
		return cancelDateQualifier;
	}

	public void setCancelDateQualifier(String cancelDateQualifier) {
		this.cancelDateQualifier = cancelDateQualifier;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public Double getCbCutLength() {
		return cbCutLength;
	}

	public void setCbCutLength(Double cbCutLength) {
		this.cbCutLength = cbCutLength;
	}

	public String getChngLid() {
		return chngLid;
	}

	public void setChngLid(String chngLid) {
		this.chngLid = chngLid;
	}

	public LocalDateTime getChngTimestamp() {
		return chngTimestamp;
	}

	public void setChngTimestamp(LocalDateTime chngTimestamp) {
		this.chngTimestamp = chngTimestamp;
	}

	public String getCommCust() {
		return commCust;
	}

	public void setCommCust(String commCust) {
		this.commCust = commCust;
	}

	public String getConsStatusMsg() {
		return consStatusMsg;
	}

	public void setConsStatusMsg(String consStatusMsg) {
		this.consStatusMsg = consStatusMsg;
	}

	public String getContractUsageInd() {
		return contractUsageInd;
	}

	public void setContractUsageInd(String contractUsageInd) {
		this.contractUsageInd = contractUsageInd;
	}

	public String getCrossDockCenter() {
		return crossDockCenter;
	}

	public void setCrossDockCenter(String crossDockCenter) {
		this.crossDockCenter = crossDockCenter;
	}

	public String getCustDept() {
		return custDept;
	}

	public void setCustDept(String custDept) {
		this.custDept = custDept;
	}

	public String getCustPmtMeth() {
		return custPmtMeth;
	}

	public void setCustPmtMeth(String custPmtMeth) {
		this.custPmtMeth = custPmtMeth;
	}

	public String getCustSpInst() {
		return custSpInst;
	}

	public void setCustSpInst(String custSpInst) {
		this.custSpInst = custSpInst;
	}

	public String getCustWhNbr() {
		return custWhNbr;
	}

	public void setCustWhNbr(String custWhNbr) {
		this.custWhNbr = custWhNbr;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustNbr() {
		return custNbr;
	}

	public void setCustNbr(String custNbr) {
		this.custNbr = custNbr;
	}

	public String getCustomerRefNbr() {
		return customerRefNbr;
	}

	public void setCustomerRefNbr(String customerRefNbr) {
		this.customerRefNbr = customerRefNbr;
	}

	public String getCustomerSidemark() {
		return customerSidemark;
	}

	public void setCustomerSidemark(String customerSidemark) {
		this.customerSidemark = customerSidemark;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public LocalDate getDelvCutOffDt() {
		return delvCutOffDt;
	}

	public void setDelvCutOffDt(LocalDate delvCutOffDt) {
		this.delvCutOffDt = delvCutOffDt;
	}

	public String getDivDesc() {
		return divDesc;
	}

	public void setDivDesc(String divDesc) {
		this.divDesc = divDesc;
	}

	public String getDunsNbr() {
		return dunsNbr;
	}

	public void setDunsNbr(String dunsNbr) {
		this.dunsNbr = dunsNbr;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public LocalDateTime getErrorTimestamp() {
		return errorTimestamp;
	}

	public void setErrorTimestamp(LocalDateTime errorTimestamp) {
		this.errorTimestamp = errorTimestamp;
	}

	public String getEventInfo() {
		return eventInfo;
	}

	public void setEventInfo(String eventInfo) {
		this.eventInfo = eventInfo;
	}

	public String getExplodeFlag() {
		return explodeFlag;
	}

	public void setExplodeFlag(String explodeFlag) {
		this.explodeFlag = explodeFlag;
	}

	public String getFobPoint() {
		return fobPoint;
	}

	public void setFobPoint(String fobPoint) {
		this.fobPoint = fobPoint;
	}

	public String getFrtCode() {
		return frtCode;
	}

	public void setFrtCode(String frtCode) {
		this.frtCode = frtCode;
	}

	public String getGiftMessage1() {
		return giftMessage1;
	}

	public void setGiftMessage1(String giftMessage1) {
		this.giftMessage1 = giftMessage1;
	}

	public String getGiftMessage2() {
		return giftMessage2;
	}

	public void setGiftMessage2(String giftMessage2) {
		this.giftMessage2 = giftMessage2;
	}

	public String getHostAlertFlag() {
		return hostAlertFlag;
	}

	public void setHostAlertFlag(String hostAlertFlag) {
		this.hostAlertFlag = hostAlertFlag;
	}

	public String getInputMethod() {
		return inputMethod;
	}

	public void setInputMethod(String inputMethod) {
		this.inputMethod = inputMethod;
	}

	public String getMarkForStore() {
		return markForStore;
	}

	public void setMarkForStore(String markForStore) {
		this.markForStore = markForStore;
	}

	public String getMediaEventCode() {
		return mediaEventCode;
	}

	public void setMediaEventCode(String mediaEventCode) {
		this.mediaEventCode = mediaEventCode;
	}

	public LocalDate getNbDate() {
		return nbDate;
	}

	public void setNbDate(LocalDate nbDate) {
		this.nbDate = nbDate;
	}

	public String getNewStoreInd() {
		return newStoreInd;
	}

	public void setNewStoreInd(String newStoreInd) {
		this.newStoreInd = newStoreInd;
	}

	public String getNoAsnFlag() {
		return noAsnFlag;
	}

	public void setNoAsnFlag(String noAsnFlag) {
		this.noAsnFlag = noAsnFlag;
	}

	public LocalDate getOhCancelDateValue() {
		return ohCancelDateValue;
	}

	public void setOhCancelDateValue(LocalDate ohCancelDateValue) {
		this.ohCancelDateValue = ohCancelDateValue;
	}

	public String getOhStatusCode() {
		return ohStatusCode;
	}

	public void setOhStatusCode(String ohStatusCode) {
		this.ohStatusCode = ohStatusCode;
	}

	public String getOnNote() {
		return onNote;
	}

	public void setOnNote(String onNote) {
		this.onNote = onNote;
	}

	public String getOnlineType() {
		return onlineType;
	}

	public void setOnlineType(String onlineType) {
		this.onlineType = onlineType;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderLoc() {
		return orderLoc;
	}

	public void setOrderLoc(String orderLoc) {
		this.orderLoc = orderLoc;
	}

	public Double getOrderMerCost() {
		return orderMerCost;
	}

	public void setOrderMerCost(Double orderMerCost) {
		this.orderMerCost = orderMerCost;
	}

	public String getShawOrderNumber() {
		return shawOrderNumber;
	}

	public void setShawOrderNumber(String shawOrderNumber) {
		this.shawOrderNumber = shawOrderNumber;
	}

	public Double getOrderRetHand() {
		return orderRetHand;
	}

	public void setOrderRetHand(Double orderRetHand) {
		this.orderRetHand = orderRetHand;
	}

	public Double getOrderRetSh() {
		return orderRetSh;
	}

	public void setOrderRetSh(Double orderRetSh) {
		this.orderRetSh = orderRetSh;
	}

	public Double getOrderRetTax() {
		return orderRetTax;
	}

	public void setOrderRetTax(Double orderRetTax) {
		this.orderRetTax = orderRetTax;
	}

	public Double getOrderRetTotal() {
		return orderRetTotal;
	}

	public void setOrderRetTotal(Double orderRetTotal) {
		this.orderRetTotal = orderRetTotal;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderTypeDesc() {
		return orderTypeDesc;
	}

	public void setOrderTypeDesc(String orderTypeDesc) {
		this.orderTypeDesc = orderTypeDesc;
	}

	public Double getOrderWeight() {
		return orderWeight;
	}

	public void setOrderWeight(Double orderWeight) {
		this.orderWeight = orderWeight;
	}

	public String getOrderingSystem() {
		return orderingSystem;
	}

	public void setOrderingSystem(String orderingSystem) {
		this.orderingSystem = orderingSystem;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPoControl() {
		return poControl;
	}

	public void setPoControl(String poControl) {
		this.poControl = poControl;
	}

	public LocalDate getPoDateValue() {
		return poDateValue;
	}

	public void setPoDateValue(LocalDate poDateValue) {
		this.poDateValue = poDateValue;
	}

	public String getPoDateQualifier() {
		return poDateQualifier;
	}

	public void setPoDateQualifier(String poDateQualifier) {
		this.poDateQualifier = poDateQualifier;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getPoQual() {
		return poQual;
	}

	public void setPoQual(String poQual) {
		this.poQual = poQual;
	}

	public String getPoType() {
		return poType;
	}

	public void setPoType(String poType) {
		this.poType = poType;
	}

	public String getPoTypeSuffix() {
		return poTypeSuffix;
	}

	public void setPoTypeSuffix(String poTypeSuffix) {
		this.poTypeSuffix = poTypeSuffix;
	}

	public String getPsMsg() {
		return psMsg;
	}

	public void setPsMsg(String psMsg) {
		this.psMsg = psMsg;
	}

	public String getPurchasedBy() {
		return purchasedBy;
	}

	public void setPurchasedBy(String purchasedBy) {
		this.purchasedBy = purchasedBy;
	}

	public String getRcdCode() {
		return rcdCode;
	}

	public void setRcdCode(String rcdCode) {
		this.rcdCode = rcdCode;
	}

	public LocalDateTime getReceivedTimestamp() {
		return receivedTimestamp;
	}

	public void setReceivedTimestamp(LocalDateTime receivedTimestamp) {
		this.receivedTimestamp = receivedTimestamp;
	}

	public String getRefTcNbr() {
		return refTcNbr;
	}

	public void setRefTcNbr(String refTcNbr) {
		this.refTcNbr = refTcNbr;
	}

	public String getReserveOrderInd() {
		return reserveOrderInd;
	}

	public void setReserveOrderInd(String reserveOrderInd) {
		this.reserveOrderInd = reserveOrderInd;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public LocalDate getRouteByDate() {
		return routeByDate;
	}

	public void setRouteByDate(LocalDate routeByDate) {
		this.routeByDate = routeByDate;
	}

	public String getSalesCheckNumber() {
		return salesCheckNumber;
	}

	public void setSalesCheckNumber(String salesCheckNumber) {
		this.salesCheckNumber = salesCheckNumber;
	}

	public String getSalesReqCode() {
		return salesReqCode;
	}

	public void setSalesReqCode(String salesReqCode) {
		this.salesReqCode = salesReqCode;
	}

	public String getSellCo() {
		return sellCo;
	}

	public void setSellCo(String sellCo) {
		this.sellCo = sellCo;
	}

	public Integer getSeqNbr() {
		return seqNbr;
	}

	public void setSeqNbr(Integer seqNbr) {
		this.seqNbr = seqNbr;
	}

	public LocalDate getShipByCutOffDt() {
		return shipByCutOffDt;
	}

	public void setShipByCutOffDt(LocalDate shipByCutOffDt) {
		this.shipByCutOffDt = shipByCutOffDt;
	}

	public LocalDate getShipByDate() {
		return shipByDate;
	}

	public void setShipByDate(LocalDate shipByDate) {
		this.shipByDate = shipByDate;
	}

	public LocalDate getShipCancelDate() {
		return shipCancelDate;
	}

	public void setShipCancelDate(LocalDate shipCancelDate) {
		this.shipCancelDate = shipCancelDate;
	}

	public String getShipComplete() {
		return shipComplete;
	}

	public void setShipComplete(String shipComplete) {
		this.shipComplete = shipComplete;
	}

	public LocalDate getShipDateValue() {
		return shipDateValue;
	}

	public void setShipDateValue(LocalDate shipDateValue) {
		this.shipDateValue = shipDateValue;
	}

	public String getShipDateQualifier() {
		return shipDateQualifier;
	}

	public void setShipDateQualifier(String shipDateQualifier) {
		this.shipDateQualifier = shipDateQualifier;
	}

	public String getShipInstruction() {
		return shipInstruction;
	}

	public void setShipInstruction(String shipInstruction) {
		this.shipInstruction = shipInstruction;
	}

	public String getShipPartCompInd() {
		return shipPartCompInd;
	}

	public void setShipPartCompInd(String shipPartCompInd) {
		this.shipPartCompInd = shipPartCompInd;
	}

	public String getShipPt() {
		return shipPt;
	}

	public void setShipPt(String shipPt) {
		this.shipPt = shipPt;
	}

	public String getSpecialInstruct1() {
		return specialInstruct1;
	}

	public void setSpecialInstruct1(String specialInstruct1) {
		this.specialInstruct1 = specialInstruct1;
	}

	public String getSpecialInstruct2() {
		return specialInstruct2;
	}

	public void setSpecialInstruct2(String specialInstruct2) {
		this.specialInstruct2 = specialInstruct2;
	}

	public String getSpecialInstruct3() {
		return specialInstruct3;
	}

	public void setSpecialInstruct3(String specialInstruct3) {
		this.specialInstruct3 = specialInstruct3;
	}

	public String getSpecialInstruct4() {
		return specialInstruct4;
	}

	public void setSpecialInstruct4(String specialInstruct4) {
		this.specialInstruct4 = specialInstruct4;
	}

	public String getSpecialPoNo() {
		return specialPoNo;
	}

	public void setSpecialPoNo(String specialPoNo) {
		this.specialPoNo = specialPoNo;
	}

	public String getSrvLevel() {
		return srvLevel;
	}

	public void setSrvLevel(String srvLevel) {
		this.srvLevel = srvLevel;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStdCarrAlphaInd() {
		return stdCarrAlphaInd;
	}

	public void setStdCarrAlphaInd(String stdCarrAlphaInd) {
		this.stdCarrAlphaInd = stdCarrAlphaInd;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getTermsNetDays() {
		return termsNetDays;
	}

	public void setTermsNetDays(String termsNetDays) {
		this.termsNetDays = termsNetDays;
	}

	public String getTermsTypeFlag() {
		return termsTypeFlag;
	}

	public void setTermsTypeFlag(String termsTypeFlag) {
		this.termsTypeFlag = termsTypeFlag;
	}

	public Double getTotalBindingFt() {
		return totalBindingFt;
	}

	public void setTotalBindingFt(Double totalBindingFt) {
		this.totalBindingFt = totalBindingFt;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVendorNo() {
		return vendorNo;
	}

	public void setVendorNo(String vendorNo) {
		this.vendorNo = vendorNo;
	}

	public String getWcStore() {
		return wcStore;
	}

	public void setWcStore(String wcStore) {
		this.wcStore = wcStore;
	}

	public LegacyConsumerAddress getConsumerAddress() {
		return consumerAddress;
	}

	public void setConsumerAddress(LegacyConsumerAddress consumerAddress) {
		this.consumerAddress = consumerAddress;
	}

	public LegacyShipToAddress getShipToAddress() {
		return shipToAddress;
	}

	public void setShipToAddress(LegacyShipToAddress shipToAddress) {
		this.shipToAddress = shipToAddress;
	}

	public LegacyThirdPartyAddress getThirdPartyAddress() {
		return thirdPartyAddress;
	}

	public void setThirdPartyAddress(LegacyThirdPartyAddress thirdPartyAddress) {
		this.thirdPartyAddress = thirdPartyAddress;
	}

	public List<EdiOrderDate> getDates() {
		return dates;
	}

	private void setDates(List<EdiOrderDate> dates) {
		this.dates = dates;
//		this.dates = new ArrayList<EdiOrderDate>();
//		if (dates!=null)
//			dates.stream().forEach(this::addDate);
	}

	public void addDate(EdiOrderDate d) {
		if (dates==null)
			this.dates = new ArrayList<EdiOrderDate>();			
		dates.add(d);
	    d.id.setEdiOrderHeader(this);
	}
	 
	public void removeDate(EdiOrderDate d) {
	    dates.remove(d);
	    d.id.setEdiOrderHeader(null);
	}

	public List<EdiOrderLine> getLines() {
		return lines;
	}

	private void setLines(List<EdiOrderLine> lines) {
		this.lines= lines;
//		this.lines = new ArrayList<EdiOrderLine>();
//		lines.stream().forEach(this::addLine);
	}
	public void addLine(EdiOrderLine l) {
		if (lines==null)
			this.lines = new ArrayList<EdiOrderLine>();			
		lines.add(l);
		l.setPk(new EdiOrderLinePK(this,Integer.toString(l.getLineNumber())));
	}
	 
	public void removeLine(EdiOrderLine l) {
		lines.remove(l);
	    l.getPk().setEdiOrderHeader(null);
	}

	@Override
	public String toString() {
		return "EdiOrderHeader [legacyOrderNumber=" + legacyOrderNumber + ", acctContact=" + acctContact
				+ ", acknowlegeOrdInd=" + acknowlegeOrdInd + ", addrKey=" + addrKey + ", agreementNumber="
				+ agreementNumber + ", assignedAgent=" + assignedAgent + ", authRep=" + authRep + ", authorizationNo="
				+ authorizationNo + ", beg=" + beg + ", billToState=" + billToState + ", billToStore=" + billToStore
				+ ", bsStoreNbr=" + bsStoreNbr + ", cancelDateQualifier=" + cancelDateQualifier + ", carrierCode="
				+ carrierCode + ", cbCutLength=" + cbCutLength + ", chngLid=" + chngLid + ", chngTimestamp="
				+ chngTimestamp + ", commCust=" + commCust + ", consStatusMsg=" + consStatusMsg + ", contractUsageInd="
				+ contractUsageInd + ", crossDockCenter=" + crossDockCenter + ", custDept=" + custDept
				+ ", custPmtMeth=" + custPmtMeth + ", custSpInst=" + custSpInst + ", custWhNbr=" + custWhNbr
				+ ", customerCode=" + customerCode + ", custNbr=" + custNbr + ", customerRefNbr="
				+ customerRefNbr + ", customerSidemark=" + customerSidemark + ", deliveryDate=" + deliveryDate
				+ ", delvCutOffDt=" + delvCutOffDt + ", divDesc=" + divDesc + ", dunsNbr=" + dunsNbr + ", errorCode="
				+ errorCode + ", errorDescription=" + errorDescription + ", errorTimestamp=" + errorTimestamp
				+ ", eventInfo=" + eventInfo + ", explodeFlag=" + explodeFlag + ", fobPoint=" + fobPoint + ", frtCode="
				+ frtCode + ", giftMessage1=" + giftMessage1 + ", giftMessage2=" + giftMessage2 + ", hostAlertFlag="
				+ hostAlertFlag + ", inputMethod=" + inputMethod + ", markForStore=" + markForStore
				+ ", mediaEventCode=" + mediaEventCode + ", nbDate=" + nbDate + ", newStoreInd=" + newStoreInd
				+ ", noAsnFlag=" + noAsnFlag + ", ohCancelDateValue=" + ohCancelDateValue + ", ohStatusCode="
				+ ohStatusCode + ", onNote=" + onNote + ", onlineType=" + onlineType + ", orderDate=" + orderDate
				+ ", orderLoc=" + orderLoc + ", orderMerCost=" + orderMerCost + ", shawOrderNumber=" + shawOrderNumber
				+ ", orderRetHand=" + orderRetHand + ", orderRetSh=" + orderRetSh + ", orderRetTax=" + orderRetTax
				+ ", orderRetTotal=" + orderRetTotal + ", orderType=" + orderType + ", orderTypeDesc=" + orderTypeDesc
				+ ", orderWeight=" + orderWeight + ", orderingSystem=" + orderingSystem + ", phoneNumber=" + phoneNumber
				+ ", poControl=" + poControl + ", poDateValue=" + poDateValue + ", poDateQualifier=" + poDateQualifier
				+ ", poNumber=" + poNumber + ", poQual=" + poQual + ", poType=" + poType + ", poTypeSuffix="
				+ poTypeSuffix + ", psMsg=" + psMsg + ", purchasedBy=" + purchasedBy + ", rcdCode=" + rcdCode
				+ ", receivedTimestamp=" + receivedTimestamp + ", refTcNbr=" + refTcNbr + ", reserveOrderInd="
				+ reserveOrderInd + ", returnMsg=" + returnMsg + ", routeByDate=" + routeByDate
				+ ", salesCheckNumber=" + salesCheckNumber + ", salesReqCode=" + salesReqCode + ", sellCo=" + sellCo
				+ ", seqNbr=" + seqNbr + ", shipByCutOffDt=" + shipByCutOffDt + ", shipByDate=" + shipByDate
				+ ", shipCancelDate=" + shipCancelDate + ", shipComplete=" + shipComplete + ", shipDateValue="
				+ shipDateValue + ", shipDateQualifier=" + shipDateQualifier + ", shipInstruction=" + shipInstruction
				+ ", shipPartCompInd=" + shipPartCompInd + ", shipPt=" + shipPt + ", specialInstruct1="
				+ specialInstruct1 + ", specialInstruct2=" + specialInstruct2 + ", specialInstruct3=" + specialInstruct3
				+ ", specialInstruct4=" + specialInstruct4 + ", specialPoNo=" + specialPoNo + ", srvLevel=" + srvLevel
				+ ", statusCode=" + statusCode + ", stdCarrAlphaInd=" + stdCarrAlphaInd + ", storeName=" + storeName
				+ ", termsNetDays=" + termsNetDays + ", termsTypeFlag=" + termsTypeFlag + ", totalBindingFt="
				+ totalBindingFt + ", userId=" + userId + ", vendorNo=" + vendorNo + ", wcStore=" + wcStore
				+ ", consumerAddress=" + consumerAddress + ", shipToAddress=" + shipToAddress + ", thirdPartyAddress="
				+ thirdPartyAddress + ", dates=" + dates + ", lines=" + lines + "]";
	}

	
}