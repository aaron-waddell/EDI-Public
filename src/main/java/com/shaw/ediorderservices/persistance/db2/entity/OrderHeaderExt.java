package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the ORDER_HEADER_EXT database table.
 * 
 */
@Entity
@Table(name="ORDER_HEADER_EXT")
@NamedQuery(name="OrderHeaderExt.findAll", query="SELECT o FROM OrderHeaderExt o")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
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
	private LocalDateTime orderTimestamp;

	@Column(name="PARENT_ORDER_NBR", nullable=false, length=6)
	private String parentOrderNbr;

	@Column(name="PROJECT_NAME", nullable=false, length=45)
	private String projectName;

	@Column(name="PROJECT_NBR", nullable=false, length=6)
	private String projectNbr;

	@Column(name="RATING_LANE_DTL", nullable=false, precision=12)
	private int ratingLaneDtl;

	@Column(name="RATING_LANE_ID", nullable=false, precision=8)
	private int ratingLaneId;

	@Column(name="RATING_METHOD", nullable=false, length=1)
	private String ratingMethod;

	@Column(name="RESIDENTIAL_DELV_FLAG", nullable=false, length=1)
	private String residentialDelvFlag;

	@Embedded
	private LegacyShipToAddress shipToAddress;

	@Embedded
	private LegacyThirdPartyAddress thirdPartyAddress;

	@Column(name="WILL_ADVISE_FLAG", nullable=false, length=1)
	private String willAdviseFlag;

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

	public LocalDateTime getOrderTimestamp() {
		return this.orderTimestamp;
	}

	public void setOrderTimestamp(LocalDateTime orderTimestamp) {
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

	public int getRatingLaneDtl() {
		return this.ratingLaneDtl;
	}

	public void setRatingLaneDtl(int ratingLaneDtl) {
		this.ratingLaneDtl = ratingLaneDtl;
	}

	public int getRatingLaneId() {
		return this.ratingLaneId;
	}

	public void setRatingLaneId(int ratingLaneId) {
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

	public String getWillAdviseFlag() {
		return this.willAdviseFlag;
	}

	public void setWillAdviseFlag(String willAdviseFlag) {
		this.willAdviseFlag = willAdviseFlag;
	}

}