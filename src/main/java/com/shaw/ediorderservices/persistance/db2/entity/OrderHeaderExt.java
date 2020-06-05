package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_HEADER_EXT database table.
 * 
 */
@Entity
@Table(name="ORDER_HEADER_EXT")
@NamedQuery(name="OrderHeaderExt.findAll", query="SELECT o FROM OrderHeaderExt o")
public class OrderHeaderExt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORDER_NBR", unique=true, nullable=false, length=6)
	private String orderNbr;

	@Column(name="BEFORE_DELV_FLAG", nullable=false, length=1)
	private String beforeDelvFlag;

	@Column(name="BILLING_METHOD", nullable=false, length=1)
	private String billingMethod;

	@Column(name="BULK_ORDER_NBR", nullable=false, length=6)
	private String bulkOrderNbr;

	@Column(name="CARR_SERVICE_LEVEL", nullable=false, length=2)
	private String carrServiceLevel;

	@Column(name="CBD_EMAIL_SENT", nullable=false, length=1)
	private String cbdEmailSent;

	@Column(name="COLLATE_FLAG", nullable=false, length=1)
	private String collateFlag;

	@Column(name="END_USE", nullable=false, length=2)
	private String endUse;

	@Column(name="INCO_TERMS", nullable=false, length=45)
	private String incoTerms;

	@Column(name="LABEL_CONTACT", nullable=false, length=30)
	private String labelContact;

	@Column(name="LABEL_DELV_INFO", nullable=false, length=60)
	private String labelDelvInfo;

	@Column(name="LABEL_PROJECT_NAME", nullable=false, length=30)
	private String labelProjectName;

	@Column(name="LABEL_SHIPTO_PHONE", nullable=false, length=20)
	private String labelShiptoPhone;

	@Column(name="MARKET_FLAG", nullable=false, length=1)
	private String marketFlag;

	@Column(name="ORDER_TIMESTAMP", nullable=false)
	private Timestamp orderTimestamp;

	@Column(name="PARENT_ORDER_NBR", nullable=false, length=6)
	private String parentOrderNbr;

	@Column(name="PROJECT_NAME", nullable=false, length=45)
	private String projectName;

	@Column(name="PROJECT_NBR", nullable=false, length=6)
	private String projectNbr;

	@Column(name="RATING_LANE_DTL", nullable=false, precision=12)
	private BigDecimal ratingLaneDtl;

	@Column(name="RATING_LANE_ID", nullable=false, precision=8)
	private BigDecimal ratingLaneId;

	@Column(name="RATING_METHOD", nullable=false, length=1)
	private String ratingMethod;

	@Column(name="RESIDENTIAL_DELV_FLAG", nullable=false, length=1)
	private String residentialDelvFlag;

	@Column(name="SHIP_TO_ADDR_1", nullable=false, length=45)
	private String shipToAddr1;

	@Column(name="SHIP_TO_ADDR_2", nullable=false, length=45)
	private String shipToAddr2;

	@Column(name="SHIP_TO_CITY", nullable=false, length=30)
	private String shipToCity;

	@Column(name="SHIP_TO_CNTRY_CD", nullable=false, length=2)
	private String shipToCntryCd;

	@Column(name="SHIP_TO_NAME", nullable=false, length=45)
	private String shipToName;

	@Column(name="SHIP_TO_NAME_2", nullable=false, length=45)
	private String shipToName2;

	@Column(name="SHIP_TO_PROVINCE", nullable=false, length=2)
	private String shipToProvince;

	@Column(name="SHIP_TO_STATE", nullable=false, length=2)
	private String shipToState;

	@Column(name="SHIP_TO_ZIP", nullable=false, length=16)
	private String shipToZip;

	@Column(name="THIRD_PARTY_ACCT_NBR", nullable=false, length=15)
	private String thirdPartyAcctNbr;

	@Column(name="THIRD_PARTY_ADDR_1", nullable=false, length=45)
	private String thirdPartyAddr1;

	@Column(name="THIRD_PARTY_ADDR_2", nullable=false, length=45)
	private String thirdPartyAddr2;

	@Column(name="THIRD_PARTY_BILL_FLAG", nullable=false, length=1)
	private String thirdPartyBillFlag;

	@Column(name="THIRD_PARTY_CITY", nullable=false, length=30)
	private String thirdPartyCity;

	@Column(name="THIRD_PARTY_NAME", nullable=false, length=45)
	private String thirdPartyName;

	@Column(name="THIRD_PARTY_NAME_2", nullable=false, length=45)
	private String thirdPartyName2;

	@Column(name="THIRD_PARTY_STATE", nullable=false, length=2)
	private String thirdPartyState;

	@Column(name="THIRD_PARTY_ZIP", nullable=false, length=16)
	private String thirdPartyZip;

	@Column(name="WILL_ADVISE_FLAG", nullable=false, length=1)
	private String willAdviseFlag;

	//bi-directional one-to-one association to OrderHeader
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ORDER_NBR", nullable=false, insertable=false, updatable=false)
	private OrderHeader orderHeader;

	public OrderHeaderExt() {
	}

	public String getOrderNbr() {
		return this.orderNbr;
	}

	public void setOrderNbr(String orderNbr) {
		this.orderNbr = orderNbr;
	}

	public String getBeforeDelvFlag() {
		return this.beforeDelvFlag;
	}

	public void setBeforeDelvFlag(String beforeDelvFlag) {
		this.beforeDelvFlag = beforeDelvFlag;
	}

	public String getBillingMethod() {
		return this.billingMethod;
	}

	public void setBillingMethod(String billingMethod) {
		this.billingMethod = billingMethod;
	}

	public String getBulkOrderNbr() {
		return this.bulkOrderNbr;
	}

	public void setBulkOrderNbr(String bulkOrderNbr) {
		this.bulkOrderNbr = bulkOrderNbr;
	}

	public String getCarrServiceLevel() {
		return this.carrServiceLevel;
	}

	public void setCarrServiceLevel(String carrServiceLevel) {
		this.carrServiceLevel = carrServiceLevel;
	}

	public String getCbdEmailSent() {
		return this.cbdEmailSent;
	}

	public void setCbdEmailSent(String cbdEmailSent) {
		this.cbdEmailSent = cbdEmailSent;
	}

	public String getCollateFlag() {
		return this.collateFlag;
	}

	public void setCollateFlag(String collateFlag) {
		this.collateFlag = collateFlag;
	}

	public String getEndUse() {
		return this.endUse;
	}

	public void setEndUse(String endUse) {
		this.endUse = endUse;
	}

	public String getIncoTerms() {
		return this.incoTerms;
	}

	public void setIncoTerms(String incoTerms) {
		this.incoTerms = incoTerms;
	}

	public String getLabelContact() {
		return this.labelContact;
	}

	public void setLabelContact(String labelContact) {
		this.labelContact = labelContact;
	}

	public String getLabelDelvInfo() {
		return this.labelDelvInfo;
	}

	public void setLabelDelvInfo(String labelDelvInfo) {
		this.labelDelvInfo = labelDelvInfo;
	}

	public String getLabelProjectName() {
		return this.labelProjectName;
	}

	public void setLabelProjectName(String labelProjectName) {
		this.labelProjectName = labelProjectName;
	}

	public String getLabelShiptoPhone() {
		return this.labelShiptoPhone;
	}

	public void setLabelShiptoPhone(String labelShiptoPhone) {
		this.labelShiptoPhone = labelShiptoPhone;
	}

	public String getMarketFlag() {
		return this.marketFlag;
	}

	public void setMarketFlag(String marketFlag) {
		this.marketFlag = marketFlag;
	}

	public Timestamp getOrderTimestamp() {
		return this.orderTimestamp;
	}

	public void setOrderTimestamp(Timestamp orderTimestamp) {
		this.orderTimestamp = orderTimestamp;
	}

	public String getParentOrderNbr() {
		return this.parentOrderNbr;
	}

	public void setParentOrderNbr(String parentOrderNbr) {
		this.parentOrderNbr = parentOrderNbr;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectNbr() {
		return this.projectNbr;
	}

	public void setProjectNbr(String projectNbr) {
		this.projectNbr = projectNbr;
	}

	public BigDecimal getRatingLaneDtl() {
		return this.ratingLaneDtl;
	}

	public void setRatingLaneDtl(BigDecimal ratingLaneDtl) {
		this.ratingLaneDtl = ratingLaneDtl;
	}

	public BigDecimal getRatingLaneId() {
		return this.ratingLaneId;
	}

	public void setRatingLaneId(BigDecimal ratingLaneId) {
		this.ratingLaneId = ratingLaneId;
	}

	public String getRatingMethod() {
		return this.ratingMethod;
	}

	public void setRatingMethod(String ratingMethod) {
		this.ratingMethod = ratingMethod;
	}

	public String getResidentialDelvFlag() {
		return this.residentialDelvFlag;
	}

	public void setResidentialDelvFlag(String residentialDelvFlag) {
		this.residentialDelvFlag = residentialDelvFlag;
	}

	public String getShipToAddr1() {
		return this.shipToAddr1;
	}

	public void setShipToAddr1(String shipToAddr1) {
		this.shipToAddr1 = shipToAddr1;
	}

	public String getShipToAddr2() {
		return this.shipToAddr2;
	}

	public void setShipToAddr2(String shipToAddr2) {
		this.shipToAddr2 = shipToAddr2;
	}

	public String getShipToCity() {
		return this.shipToCity;
	}

	public void setShipToCity(String shipToCity) {
		this.shipToCity = shipToCity;
	}

	public String getShipToCntryCd() {
		return this.shipToCntryCd;
	}

	public void setShipToCntryCd(String shipToCntryCd) {
		this.shipToCntryCd = shipToCntryCd;
	}

	public String getShipToName() {
		return this.shipToName;
	}

	public void setShipToName(String shipToName) {
		this.shipToName = shipToName;
	}

	public String getShipToName2() {
		return this.shipToName2;
	}

	public void setShipToName2(String shipToName2) {
		this.shipToName2 = shipToName2;
	}

	public String getShipToProvince() {
		return this.shipToProvince;
	}

	public void setShipToProvince(String shipToProvince) {
		this.shipToProvince = shipToProvince;
	}

	public String getShipToState() {
		return this.shipToState;
	}

	public void setShipToState(String shipToState) {
		this.shipToState = shipToState;
	}

	public String getShipToZip() {
		return this.shipToZip;
	}

	public void setShipToZip(String shipToZip) {
		this.shipToZip = shipToZip;
	}

	public String getThirdPartyAcctNbr() {
		return this.thirdPartyAcctNbr;
	}

	public void setThirdPartyAcctNbr(String thirdPartyAcctNbr) {
		this.thirdPartyAcctNbr = thirdPartyAcctNbr;
	}

	public String getThirdPartyAddr1() {
		return this.thirdPartyAddr1;
	}

	public void setThirdPartyAddr1(String thirdPartyAddr1) {
		this.thirdPartyAddr1 = thirdPartyAddr1;
	}

	public String getThirdPartyAddr2() {
		return this.thirdPartyAddr2;
	}

	public void setThirdPartyAddr2(String thirdPartyAddr2) {
		this.thirdPartyAddr2 = thirdPartyAddr2;
	}

	public String getThirdPartyBillFlag() {
		return this.thirdPartyBillFlag;
	}

	public void setThirdPartyBillFlag(String thirdPartyBillFlag) {
		this.thirdPartyBillFlag = thirdPartyBillFlag;
	}

	public String getThirdPartyCity() {
		return this.thirdPartyCity;
	}

	public void setThirdPartyCity(String thirdPartyCity) {
		this.thirdPartyCity = thirdPartyCity;
	}

	public String getThirdPartyName() {
		return this.thirdPartyName;
	}

	public void setThirdPartyName(String thirdPartyName) {
		this.thirdPartyName = thirdPartyName;
	}

	public String getThirdPartyName2() {
		return this.thirdPartyName2;
	}

	public void setThirdPartyName2(String thirdPartyName2) {
		this.thirdPartyName2 = thirdPartyName2;
	}

	public String getThirdPartyState() {
		return this.thirdPartyState;
	}

	public void setThirdPartyState(String thirdPartyState) {
		this.thirdPartyState = thirdPartyState;
	}

	public String getThirdPartyZip() {
		return this.thirdPartyZip;
	}

	public void setThirdPartyZip(String thirdPartyZip) {
		this.thirdPartyZip = thirdPartyZip;
	}

	public String getWillAdviseFlag() {
		return this.willAdviseFlag;
	}

	public void setWillAdviseFlag(String willAdviseFlag) {
		this.willAdviseFlag = willAdviseFlag;
	}

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

}