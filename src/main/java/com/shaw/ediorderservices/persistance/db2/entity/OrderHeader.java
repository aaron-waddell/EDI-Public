package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_HEADER database table.
 * 
 */
@Entity
@Table(name="ORDER_HEADER")
@NamedQuery(name="OrderHeader.findAll", query="SELECT o FROM OrderHeader o")
public class OrderHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORDER_NBR", unique=true, nullable=false, length=6)
	private String orderNbr;

	@Column(name="ACK_PRNT", nullable=false, length=1)
	private String ackPrnt;

	@Column(name="ADDR_KEY")
	private int addrKey;

	@Column(name="BILL_SHIP_TO", nullable=false, length=1)
	private String billShipTo;

	@Column(name="BKORDR_PRI")
	private short bkordrPri;

	@Column(name="BKORDR_PRI_SET_BY", nullable=false, length=8)
	private String bkordrPriSetBy;

	@Column(name="CALL_BEFORE_FLAG", nullable=false, length=1)
	private String callBeforeFlag;

	@Column(name="CARR_CODE", nullable=false, length=2)
	private String carrCode;

	@Column(name="CNTRY_CODE", nullable=false, precision=2)
	private BigDecimal cntryCode;

	@Column(name="COMM_CUST", nullable=false, length=7)
	private String commCust;

	@Column(name="CONFIRM_CONTACT", nullable=false, length=40)
	private String confirmContact;

	@Column(name="CONFIRM_EMAIL", nullable=false, length=40)
	private String confirmEmail;

	@Column(name="CONFIRM_FAX", nullable=false, length=20)
	private String confirmFax;

	@Column(name="CONFIRM_FLAG", nullable=false, length=1)
	private String confirmFlag;

	@Column(name="CONFIRM_REQ")
	private Timestamp confirmReq;

	@Column(name="CONFIRM_SENT")
	private Timestamp confirmSent;

	@Column(name="CONFIRM_TYPE", nullable=false, length=1)
	private String confirmType;

	@Column(name="CRED_APP_CODE", nullable=false, length=1)
	private String credAppCode;

	@Column(name="CRED_APP_REJ_DATE", nullable=false, precision=6)
	private BigDecimal credAppRejDate;

	@Column(name="CRED_APP_REJ_TIME", nullable=false, precision=4)
	private BigDecimal credAppRejTime;

	@Column(name="CS_CONSOLIDATE_CD", nullable=false, length=4)
	private String csConsolidateCd;

	@Column(name="CUST_NBR", length=7)
	private String custNbr;

	@Column(name="CUST_PO", unique=true, nullable=false, length=12)
	private String custPo;

	@Column(name="DAS_PRIORITY_CODE", nullable=false, length=1)
	private String dasPriorityCode;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_ORDER_BOOKED")
	private Date dateOrderBooked;

	@Column(name="DAYS_IN_CREDIT", nullable=false, precision=2)
	private BigDecimal daysInCredit;

	@Temporal(TemporalType.DATE)
	@Column(name="DELIVERY_DATE")
	private Date deliveryDate;

	@Column(name="DELIVERY_FLAG", nullable=false, length=1)
	private String deliveryFlag;

	@Column(nullable=false, length=5)
	private String dept;

	@Column(name="DEST_COUNTRY_CODE", length=2)
	private String destCountryCode;

	@Column(nullable=false, length=3)
	private String district;

	@Column(name="EDI_ALLOCATED_870", nullable=false, length=1)
	private String ediAllocated870;

	@Column(name="EDI_ASN_FLAG", nullable=false, length=1)
	private String ediAsnFlag;

	@Column(name="EDI_SHIPPED_870", nullable=false, length=1)
	private String ediShipped870;

	@Column(name="EXTRA_FREIGHT", nullable=false, precision=3, scale=2)
	private BigDecimal extraFreight;

	@Column(name="FREIGHT_ERROR_IND", nullable=false, length=1)
	private String freightErrorInd;

	@Column(name="FRT_CODE", nullable=false, length=1)
	private String frtCode;

	@Temporal(TemporalType.DATE)
	@Column(name="GUARANTEE_DATE")
	private Date guaranteeDate;

	@Column(name="LOAD_FREIGHT", nullable=false, precision=3, scale=2)
	private BigDecimal loadFreight;

	@Column(nullable=false, length=2)
	private String loc;

	@Column(name="MAX_DISC", nullable=false, precision=4, scale=4)
	private BigDecimal maxDisc;

	@Column(name="NB_DATE", nullable=false, precision=6)
	private BigDecimal nbDate;

	@Column(name="NBR_DTLS", nullable=false, precision=3)
	private BigDecimal nbrDtls;

	@Column(name="OCAR_FLAG", nullable=false, length=1)
	private String ocarFlag;

	@Column(name="OPER_ID", nullable=false, length=4)
	private String operId;

	@Column(name="ORDER_DATE", nullable=false, precision=6)
	private BigDecimal orderDate;

	@Column(name="ORDER_ENTRY_FLAG", nullable=false, length=1)
	private String orderEntryFlag;

	@Column(name="ORDER_PRICED", nullable=false, precision=1)
	private BigDecimal orderPriced;

	@Column(name="ORDER_TIME", nullable=false, precision=4)
	private BigDecimal orderTime;

	@Column(name="ORDER_TYPE", nullable=false, length=1)
	private String orderType;

	@Column(name="ORDERING_LOC", nullable=false, length=2)
	private String orderingLoc;

	@Temporal(TemporalType.DATE)
	@Column(name="ORG_DELIVERY_DATE")
	private Date orgDeliveryDate;

	@Column(name="OVAL_CODE1", nullable=false, length=1)
	private String ovalCode1;

	@Column(name="OVAL_CODE2", nullable=false, length=1)
	private String ovalCode2;

	@Column(name="OVAL_CODE3", nullable=false, length=1)
	private String ovalCode3;

	@Column(name="OVAL_CODE4", nullable=false, length=1)
	private String ovalCode4;

	@Column(name="OVRBL_ADV", nullable=false, precision=4, scale=2)
	private BigDecimal ovrblAdv;

	@Column(name="OVRBL_ADV_PCT", nullable=false, precision=4, scale=4)
	private BigDecimal ovrblAdvPct;

	@Column(name="OVRBL_COMM", nullable=false, precision=4, scale=2)
	private BigDecimal ovrblComm;

	@Column(name="OVRBL_COMM_PCT", nullable=false, precision=4, scale=4)
	private BigDecimal ovrblCommPct;

	@Column(name="OVRBL_SAMPLE_PCT", nullable=false, precision=4, scale=4)
	private BigDecimal ovrblSamplePct;

	@Column(name="OVRBL_SMP", nullable=false, precision=4, scale=2)
	private BigDecimal ovrblSmp;

	@Column(name="PE_CODE", nullable=false, length=2)
	private String peCode;

	@Column(name="PERSON_PLACING_ORD", nullable=false, length=28)
	private String personPlacingOrd;

	@Column(name="PLT_NBR", nullable=false, length=2)
	private String pltNbr;

	@Column(name="PRICING_DATE", nullable=false, precision=6)
	private BigDecimal pricingDate;

	@Column(name="PRICING_TIME", nullable=false, precision=4)
	private BigDecimal pricingTime;

	@Column(nullable=false, length=2)
	private String priority;

	@Column(name="PROB_CODE", nullable=false, length=4)
	private String probCode;

	@Column(name="PRODUCT_CODE", nullable=false, length=2)
	private String productCode;

	@Column(name="PRODUCT_TYPE", nullable=false, length=1)
	private String productType;

	@Column(name="RAP_ORDER_TYPE", nullable=false, length=2)
	private String rapOrderType;

	@Column(nullable=false, length=2)
	private String region;

	@Column(name="REPLACEMENT_FLAG", nullable=false, length=1)
	private String replacementFlag;

	@Column(name="REQ_DELIVERY_FLAG", nullable=false, length=1)
	private String reqDeliveryFlag;

	@Column(nullable=false, length=2)
	private String route;

	@Temporal(TemporalType.DATE)
	@Column(name="ROUTE_BY_DATE")
	private Date routeByDate;

	@Column(name="RSVTN_EXT_CNTR", nullable=false, precision=2)
	private BigDecimal rsvtnExtCntr;

	@Column(name="RUSH_FLAG", nullable=false, length=1)
	private String rushFlag;

	@Column(nullable=false, precision=2)
	private BigDecimal selco;

	@Column(name="SEQ_NBR")
	private int seqNbr;

	@Column(name="SERVICE_CATEGORY", nullable=false, length=2)
	private String serviceCategory;

	@Column(name="SHIP_ACNT_NBR", nullable=false, length=7)
	private String shipAcntNbr;

	@Temporal(TemporalType.DATE)
	@Column(name="SHIP_CANCEL_DATE")
	private Date shipCancelDate;

	@Column(name="SHIP_COMP", nullable=false, length=1)
	private String shipComp;

	@Column(name="SHIP_PT", nullable=false, length=2)
	private String shipPt;

	@Column(name="SHIP_TO_CUST_NBR", length=7)
	private String shipToCustNbr;

	@Column(name="SHIP_TO_FLG", nullable=false, precision=1)
	private BigDecimal shipToFlg;

	@Column(name="SHIP_TO_NAME", nullable=false, length=45)
	private String shipToName;

	@Column(name="SHOP_CART_END_TMSTMP", nullable=false)
	private Timestamp shopCartEndTmstmp;

	@Column(name="SHOP_CART_TYPE", nullable=false, length=1)
	private String shopCartType;

	@Column(name="STATUS_CODE", nullable=false, length=1)
	private String statusCode;

	@Column(name="TAX_CODE", nullable=false, precision=1)
	private BigDecimal taxCode;

	@Column(name="TAX_PCT", nullable=false, precision=4, scale=4)
	private BigDecimal taxPct;

	@Column(name="TERMS_CODE", nullable=false, length=2)
	private String termsCode;

	@Column(nullable=false, length=4)
	private String territory;

	@Column(name="THIRD_PARTY_FLAG", nullable=false, length=1)
	private String thirdPartyFlag;

	@Column(name="TIME_STAMP", nullable=false)
	private Timestamp timeStamp;

	@Column(name="TM_PLACED_ORDR", nullable=false, length=1)
	private String tmPlacedOrdr;

	@Column(name="TUFTEX_FLAG", nullable=false, length=1)
	private String tuftexFlag;

	@Column(name="USER_ID", nullable=false, length=8)
	private String userId;

	//bi-directional one-to-one association to OrderHeaderExt
	@OneToOne(mappedBy="orderHeader", fetch=FetchType.LAZY)
	private OrderHeaderExt orderHeaderExt;

	public OrderHeader() {
	}

	public String getOrderNbr() {
		return this.orderNbr;
	}

	public void setOrderNbr(String orderNbr) {
		this.orderNbr = orderNbr;
	}

	public String getAckPrnt() {
		return this.ackPrnt;
	}

	public void setAckPrnt(String ackPrnt) {
		this.ackPrnt = ackPrnt;
	}

	public int getAddrKey() {
		return this.addrKey;
	}

	public void setAddrKey(int addrKey) {
		this.addrKey = addrKey;
	}

	public String getBillShipTo() {
		return this.billShipTo;
	}

	public void setBillShipTo(String billShipTo) {
		this.billShipTo = billShipTo;
	}

	public short getBkordrPri() {
		return this.bkordrPri;
	}

	public void setBkordrPri(short bkordrPri) {
		this.bkordrPri = bkordrPri;
	}

	public String getBkordrPriSetBy() {
		return this.bkordrPriSetBy;
	}

	public void setBkordrPriSetBy(String bkordrPriSetBy) {
		this.bkordrPriSetBy = bkordrPriSetBy;
	}

	public String getCallBeforeFlag() {
		return this.callBeforeFlag;
	}

	public void setCallBeforeFlag(String callBeforeFlag) {
		this.callBeforeFlag = callBeforeFlag;
	}

	public String getCarrCode() {
		return this.carrCode;
	}

	public void setCarrCode(String carrCode) {
		this.carrCode = carrCode;
	}

	public BigDecimal getCntryCode() {
		return this.cntryCode;
	}

	public void setCntryCode(BigDecimal cntryCode) {
		this.cntryCode = cntryCode;
	}

	public String getCommCust() {
		return this.commCust;
	}

	public void setCommCust(String commCust) {
		this.commCust = commCust;
	}

	public String getConfirmContact() {
		return this.confirmContact;
	}

	public void setConfirmContact(String confirmContact) {
		this.confirmContact = confirmContact;
	}

	public String getConfirmEmail() {
		return this.confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	public String getConfirmFax() {
		return this.confirmFax;
	}

	public void setConfirmFax(String confirmFax) {
		this.confirmFax = confirmFax;
	}

	public String getConfirmFlag() {
		return this.confirmFlag;
	}

	public void setConfirmFlag(String confirmFlag) {
		this.confirmFlag = confirmFlag;
	}

	public Timestamp getConfirmReq() {
		return this.confirmReq;
	}

	public void setConfirmReq(Timestamp confirmReq) {
		this.confirmReq = confirmReq;
	}

	public Timestamp getConfirmSent() {
		return this.confirmSent;
	}

	public void setConfirmSent(Timestamp confirmSent) {
		this.confirmSent = confirmSent;
	}

	public String getConfirmType() {
		return this.confirmType;
	}

	public void setConfirmType(String confirmType) {
		this.confirmType = confirmType;
	}

	public String getCredAppCode() {
		return this.credAppCode;
	}

	public void setCredAppCode(String credAppCode) {
		this.credAppCode = credAppCode;
	}

	public BigDecimal getCredAppRejDate() {
		return this.credAppRejDate;
	}

	public void setCredAppRejDate(BigDecimal credAppRejDate) {
		this.credAppRejDate = credAppRejDate;
	}

	public BigDecimal getCredAppRejTime() {
		return this.credAppRejTime;
	}

	public void setCredAppRejTime(BigDecimal credAppRejTime) {
		this.credAppRejTime = credAppRejTime;
	}

	public String getCsConsolidateCd() {
		return this.csConsolidateCd;
	}

	public void setCsConsolidateCd(String csConsolidateCd) {
		this.csConsolidateCd = csConsolidateCd;
	}

	public String getCustNbr() {
		return this.custNbr;
	}

	public void setCustNbr(String custNbr) {
		this.custNbr = custNbr;
	}

	public String getCustPo() {
		return this.custPo;
	}

	public void setCustPo(String custPo) {
		this.custPo = custPo;
	}

	public String getDasPriorityCode() {
		return this.dasPriorityCode;
	}

	public void setDasPriorityCode(String dasPriorityCode) {
		this.dasPriorityCode = dasPriorityCode;
	}

	public Date getDateOrderBooked() {
		return this.dateOrderBooked;
	}

	public void setDateOrderBooked(Date dateOrderBooked) {
		this.dateOrderBooked = dateOrderBooked;
	}

	public BigDecimal getDaysInCredit() {
		return this.daysInCredit;
	}

	public void setDaysInCredit(BigDecimal daysInCredit) {
		this.daysInCredit = daysInCredit;
	}

	public Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryFlag() {
		return this.deliveryFlag;
	}

	public void setDeliveryFlag(String deliveryFlag) {
		this.deliveryFlag = deliveryFlag;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDestCountryCode() {
		return this.destCountryCode;
	}

	public void setDestCountryCode(String destCountryCode) {
		this.destCountryCode = destCountryCode;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getEdiAllocated870() {
		return this.ediAllocated870;
	}

	public void setEdiAllocated870(String ediAllocated870) {
		this.ediAllocated870 = ediAllocated870;
	}

	public String getEdiAsnFlag() {
		return this.ediAsnFlag;
	}

	public void setEdiAsnFlag(String ediAsnFlag) {
		this.ediAsnFlag = ediAsnFlag;
	}

	public String getEdiShipped870() {
		return this.ediShipped870;
	}

	public void setEdiShipped870(String ediShipped870) {
		this.ediShipped870 = ediShipped870;
	}

	public BigDecimal getExtraFreight() {
		return this.extraFreight;
	}

	public void setExtraFreight(BigDecimal extraFreight) {
		this.extraFreight = extraFreight;
	}

	public String getFreightErrorInd() {
		return this.freightErrorInd;
	}

	public void setFreightErrorInd(String freightErrorInd) {
		this.freightErrorInd = freightErrorInd;
	}

	public String getFrtCode() {
		return this.frtCode;
	}

	public void setFrtCode(String frtCode) {
		this.frtCode = frtCode;
	}

	public Date getGuaranteeDate() {
		return this.guaranteeDate;
	}

	public void setGuaranteeDate(Date guaranteeDate) {
		this.guaranteeDate = guaranteeDate;
	}

	public BigDecimal getLoadFreight() {
		return this.loadFreight;
	}

	public void setLoadFreight(BigDecimal loadFreight) {
		this.loadFreight = loadFreight;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public BigDecimal getMaxDisc() {
		return this.maxDisc;
	}

	public void setMaxDisc(BigDecimal maxDisc) {
		this.maxDisc = maxDisc;
	}

	public BigDecimal getNbDate() {
		return this.nbDate;
	}

	public void setNbDate(BigDecimal nbDate) {
		this.nbDate = nbDate;
	}

	public BigDecimal getNbrDtls() {
		return this.nbrDtls;
	}

	public void setNbrDtls(BigDecimal nbrDtls) {
		this.nbrDtls = nbrDtls;
	}

	public String getOcarFlag() {
		return this.ocarFlag;
	}

	public void setOcarFlag(String ocarFlag) {
		this.ocarFlag = ocarFlag;
	}

	public String getOperId() {
		return this.operId;
	}

	public void setOperId(String operId) {
		this.operId = operId;
	}

	public BigDecimal getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(BigDecimal orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderEntryFlag() {
		return this.orderEntryFlag;
	}

	public void setOrderEntryFlag(String orderEntryFlag) {
		this.orderEntryFlag = orderEntryFlag;
	}

	public BigDecimal getOrderPriced() {
		return this.orderPriced;
	}

	public void setOrderPriced(BigDecimal orderPriced) {
		this.orderPriced = orderPriced;
	}

	public BigDecimal getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(BigDecimal orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderingLoc() {
		return this.orderingLoc;
	}

	public void setOrderingLoc(String orderingLoc) {
		this.orderingLoc = orderingLoc;
	}

	public Date getOrgDeliveryDate() {
		return this.orgDeliveryDate;
	}

	public void setOrgDeliveryDate(Date orgDeliveryDate) {
		this.orgDeliveryDate = orgDeliveryDate;
	}

	public String getOvalCode1() {
		return this.ovalCode1;
	}

	public void setOvalCode1(String ovalCode1) {
		this.ovalCode1 = ovalCode1;
	}

	public String getOvalCode2() {
		return this.ovalCode2;
	}

	public void setOvalCode2(String ovalCode2) {
		this.ovalCode2 = ovalCode2;
	}

	public String getOvalCode3() {
		return this.ovalCode3;
	}

	public void setOvalCode3(String ovalCode3) {
		this.ovalCode3 = ovalCode3;
	}

	public String getOvalCode4() {
		return this.ovalCode4;
	}

	public void setOvalCode4(String ovalCode4) {
		this.ovalCode4 = ovalCode4;
	}

	public BigDecimal getOvrblAdv() {
		return this.ovrblAdv;
	}

	public void setOvrblAdv(BigDecimal ovrblAdv) {
		this.ovrblAdv = ovrblAdv;
	}

	public BigDecimal getOvrblAdvPct() {
		return this.ovrblAdvPct;
	}

	public void setOvrblAdvPct(BigDecimal ovrblAdvPct) {
		this.ovrblAdvPct = ovrblAdvPct;
	}

	public BigDecimal getOvrblComm() {
		return this.ovrblComm;
	}

	public void setOvrblComm(BigDecimal ovrblComm) {
		this.ovrblComm = ovrblComm;
	}

	public BigDecimal getOvrblCommPct() {
		return this.ovrblCommPct;
	}

	public void setOvrblCommPct(BigDecimal ovrblCommPct) {
		this.ovrblCommPct = ovrblCommPct;
	}

	public BigDecimal getOvrblSamplePct() {
		return this.ovrblSamplePct;
	}

	public void setOvrblSamplePct(BigDecimal ovrblSamplePct) {
		this.ovrblSamplePct = ovrblSamplePct;
	}

	public BigDecimal getOvrblSmp() {
		return this.ovrblSmp;
	}

	public void setOvrblSmp(BigDecimal ovrblSmp) {
		this.ovrblSmp = ovrblSmp;
	}

	public String getPeCode() {
		return this.peCode;
	}

	public void setPeCode(String peCode) {
		this.peCode = peCode;
	}

	public String getPersonPlacingOrd() {
		return this.personPlacingOrd;
	}

	public void setPersonPlacingOrd(String personPlacingOrd) {
		this.personPlacingOrd = personPlacingOrd;
	}

	public String getPltNbr() {
		return this.pltNbr;
	}

	public void setPltNbr(String pltNbr) {
		this.pltNbr = pltNbr;
	}

	public BigDecimal getPricingDate() {
		return this.pricingDate;
	}

	public void setPricingDate(BigDecimal pricingDate) {
		this.pricingDate = pricingDate;
	}

	public BigDecimal getPricingTime() {
		return this.pricingTime;
	}

	public void setPricingTime(BigDecimal pricingTime) {
		this.pricingTime = pricingTime;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getProbCode() {
		return this.probCode;
	}

	public void setProbCode(String probCode) {
		this.probCode = probCode;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getRapOrderType() {
		return this.rapOrderType;
	}

	public void setRapOrderType(String rapOrderType) {
		this.rapOrderType = rapOrderType;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getReplacementFlag() {
		return this.replacementFlag;
	}

	public void setReplacementFlag(String replacementFlag) {
		this.replacementFlag = replacementFlag;
	}

	public String getReqDeliveryFlag() {
		return this.reqDeliveryFlag;
	}

	public void setReqDeliveryFlag(String reqDeliveryFlag) {
		this.reqDeliveryFlag = reqDeliveryFlag;
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Date getRouteByDate() {
		return this.routeByDate;
	}

	public void setRouteByDate(Date routeByDate) {
		this.routeByDate = routeByDate;
	}

	public BigDecimal getRsvtnExtCntr() {
		return this.rsvtnExtCntr;
	}

	public void setRsvtnExtCntr(BigDecimal rsvtnExtCntr) {
		this.rsvtnExtCntr = rsvtnExtCntr;
	}

	public String getRushFlag() {
		return this.rushFlag;
	}

	public void setRushFlag(String rushFlag) {
		this.rushFlag = rushFlag;
	}

	public BigDecimal getSelco() {
		return this.selco;
	}

	public void setSelco(BigDecimal selco) {
		this.selco = selco;
	}

	public int getSeqNbr() {
		return this.seqNbr;
	}

	public void setSeqNbr(int seqNbr) {
		this.seqNbr = seqNbr;
	}

	public String getServiceCategory() {
		return this.serviceCategory;
	}

	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public String getShipAcntNbr() {
		return this.shipAcntNbr;
	}

	public void setShipAcntNbr(String shipAcntNbr) {
		this.shipAcntNbr = shipAcntNbr;
	}

	public Date getShipCancelDate() {
		return this.shipCancelDate;
	}

	public void setShipCancelDate(Date shipCancelDate) {
		this.shipCancelDate = shipCancelDate;
	}

	public String getShipComp() {
		return this.shipComp;
	}

	public void setShipComp(String shipComp) {
		this.shipComp = shipComp;
	}

	public String getShipPt() {
		return this.shipPt;
	}

	public void setShipPt(String shipPt) {
		this.shipPt = shipPt;
	}

	public String getShipToCustNbr() {
		return this.shipToCustNbr;
	}

	public void setShipToCustNbr(String shipToCustNbr) {
		this.shipToCustNbr = shipToCustNbr;
	}

	public BigDecimal getShipToFlg() {
		return this.shipToFlg;
	}

	public void setShipToFlg(BigDecimal shipToFlg) {
		this.shipToFlg = shipToFlg;
	}

	public String getShipToName() {
		return this.shipToName;
	}

	public void setShipToName(String shipToName) {
		this.shipToName = shipToName;
	}

	public Timestamp getShopCartEndTmstmp() {
		return this.shopCartEndTmstmp;
	}

	public void setShopCartEndTmstmp(Timestamp shopCartEndTmstmp) {
		this.shopCartEndTmstmp = shopCartEndTmstmp;
	}

	public String getShopCartType() {
		return this.shopCartType;
	}

	public void setShopCartType(String shopCartType) {
		this.shopCartType = shopCartType;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public BigDecimal getTaxCode() {
		return this.taxCode;
	}

	public void setTaxCode(BigDecimal taxCode) {
		this.taxCode = taxCode;
	}

	public BigDecimal getTaxPct() {
		return this.taxPct;
	}

	public void setTaxPct(BigDecimal taxPct) {
		this.taxPct = taxPct;
	}

	public String getTermsCode() {
		return this.termsCode;
	}

	public void setTermsCode(String termsCode) {
		this.termsCode = termsCode;
	}

	public String getTerritory() {
		return this.territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getThirdPartyFlag() {
		return this.thirdPartyFlag;
	}

	public void setThirdPartyFlag(String thirdPartyFlag) {
		this.thirdPartyFlag = thirdPartyFlag;
	}

	public Timestamp getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getTmPlacedOrdr() {
		return this.tmPlacedOrdr;
	}

	public void setTmPlacedOrdr(String tmPlacedOrdr) {
		this.tmPlacedOrdr = tmPlacedOrdr;
	}

	public String getTuftexFlag() {
		return this.tuftexFlag;
	}

	public void setTuftexFlag(String tuftexFlag) {
		this.tuftexFlag = tuftexFlag;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public OrderHeaderExt getOrderHeaderExt() {
		return this.orderHeaderExt;
	}

	public void setOrderHeaderExt(OrderHeaderExt orderHeaderExt) {
		this.orderHeaderExt = orderHeaderExt;
	}

}