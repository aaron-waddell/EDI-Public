package com.shaw.ediorderservices.persistance.sqlserver.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

//@JsonTypeInfo(
//		  use = JsonTypeInfo.Id.NAME, 
//		  include = JsonTypeInfo.As.PROPERTY, 
//		  property = "orderType")
//		@JsonSubTypes({ 
//		  @Type(value = SamplesEdiOrder.class, name = "SAMPLES"), 
//		  @Type(value = HardsurfacesEdiOrder.class, name = "HARDSURFACES"), 
//		  @Type(value = CarpetEdiOrder.class, name = "CARPET") 		  
//		})
@Entity @Table(schema = "CSD")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name="orderType", discriminatorType = DiscriminatorType.STRING)
public abstract class EdiOrder implements Serializable,IEdiOrder {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column (length = 10000, nullable = false, insertable = true, updatable = false)
	/**
	 * capture initial request
	 */
	private String requestOrderJson = "";

	@Column(length = 2)
	private String customerCode = "";
	@Column(length = 2)
	private String orderingSystem = "";
	@Transient
	private String type = ""; //for gson factory method
	@Column
	private String orderType = "";

	@Column(nullable = true)
	/**
	 * link to legacy table
	 */
	private Long legacyId;

	@Column (nullable = true)
	private String shawOrderNbr = "";
	@Column (nullable = true, length = 2)
	private String carrierCode = "";
	@Column (nullable = true, length = 6)
	private String customerNumber = "";
	@Column (nullable = true, length = 7)
	private String commCust = "";	
	@Column (nullable = true)
	private String poNumber = "";
	@Column(nullable = true)
	private String freightType = "";
	@Column(nullable = true)
	private String serviceCode = "";
	@Column (nullable = true, length=10)
	private String billToStore = "";
	@Column (nullable = true, length=15)
	private String agreementNumber = "";
	@Column (nullable = true, length = 5)
	private String custDept = "";
	@Column (nullable = true, length=45)
	private String storeName = "";
	@Column (nullable = true, length = 15)
	private String vendorNo = "";
	@Column (nullable = true, length = 15)
	private String dunsNbr = "";
	@Column (nullable = true, length = 5)
	private String beg = "";
	@Column (nullable = true)
	private LocalDate shipCancelDate;
	@Column (nullable = true)
	private LocalDate shipByDate;
	@Column (nullable = true)
	private LocalDate nbDate;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ediOrder")
	private ShipDate shipDate;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ediOrder")
	private CancelDate cancelDate;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ediOrder")
	private PoDate poDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ediOrder")
	private List<GenericDate> dates = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "ediOrder")
	private ShipToAddress shipToAddress;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "ediOrder")
	private ConsumerAddress consumerAddress;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "ediOrder")
	private ThirdPartyAddress thirdPartyAddress;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ediOrder")
	protected List<EdiLine> lines = new ArrayList<EdiLine>();


	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ediOrder")
	private List<Generic> generics = new ArrayList<Generic>();

	@OneToMany(mappedBy = "ediOrder")
	private List<EdiValidation> validations = new ArrayList<EdiValidation>();

	
//	<xs:element name="acknowledgeOrderInd" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="crossDock" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="fobPoint" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="markForStore" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="newStoreInd" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="reserveOrderInd" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="salesCheckNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="shipToConsFlag" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="stdCarrierAlphaCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="hostAlertFlag" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="shipPartCompInd" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="authorizationNo" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="carrMethCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="noAsnFlag" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="shipToStore" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="bsStore" type="xs:string" minOccurs="0" maxOccurs="1"/>
//	<xs:element name="packingSlipMessage" type="tns:Message"/>
//	<xs:element name="retailCharge" type="tns:RetailCharge"/>
		
	//TODO add custInfo - transient?
	//TODO add shipInfo - transient?
	
	public EdiOrder() {
		// TODO Auto-generated constructor stub
		this.dates = new ArrayList<GenericDate>();
		this.generics = new ArrayList<Generic>();
	}

	protected EdiOrder(String orderType) {
		// TODO Auto-generated constructor stub
		this.dates = new ArrayList<GenericDate>();
		this.generics = new ArrayList<Generic>();
		this.orderType = orderType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRequestOrderJson() {
		return requestOrderJson;
	}

	public void setRequestOrderJson(String requestOrderJson) {
		this.requestOrderJson = requestOrderJson;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getOrderingSystem() {
		return orderingSystem;
	}

	public void setOrderingSystem(String orderingSystem) {
		this.orderingSystem = orderingSystem;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		this.type = orderType; //gson factory
	}

	public Long getLegacyId() {
		return legacyId;
	}

	public void setLegacyId(Long legacyId) {
		this.legacyId = legacyId;
	}

	public String getShawOrderNbr() {
		return shawOrderNbr;
	}

	public void setShawOrderNbr(String shawOrderNbr) {
		this.shawOrderNbr = shawOrderNbr;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCommCust() {
		return commCust;
	}

	public void setCommCust(String commCust) {
		this.commCust = commCust;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getFreightType() {
		return freightType;
	}

	public void setFreightType(String freightType) {
		this.freightType = freightType;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getBillToStore() {
		return billToStore;
	}

	public void setBillToStore(String billToStore) {
		this.billToStore = billToStore;
	}

	public String getAgreementNumber() {
		return agreementNumber;
	}

	public void setAgreementNumber(String agreementNumber) {
		this.agreementNumber = agreementNumber;
	}

	public String getCustDept() {
		return custDept;
	}

	public void setCustDept(String custDept) {
		this.custDept = custDept;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getVendorNo() {
		return vendorNo;
	}

	public void setVendorNo(String vendorNo) {
		this.vendorNo = vendorNo;
	}

	public String getDunsNbr() {
		return dunsNbr;
	}

	public void setDunsNbr(String dunsNbr) {
		this.dunsNbr = dunsNbr;
	}

	public String getBeg() {
		return beg;
	}

	public void setBeg(String beg) {
		this.beg = beg;
	}

	public LocalDate getShipCancelDate() {
		return shipCancelDate;
	}

	public void setShipCancelDate(LocalDate shipCancelDate) {
		this.shipCancelDate = shipCancelDate;
	}

	public LocalDate getShipByDate() {
		return shipByDate;
	}

	public void setShipByDate(LocalDate shipByDate) {
		this.shipByDate = shipByDate;
	}

	public LocalDate getNbDate() {
		return nbDate;
	}

	public void setNbDate(LocalDate nbDate) {
		this.nbDate = nbDate;
	}

	public ShipDate getShipDate() {
		return shipDate;
	}

	public void setShipDate(ShipDate shipDate) {
		this.shipDate = shipDate;
	}

	public CancelDate getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(CancelDate cancelDate) {
		this.cancelDate = cancelDate;
	}

	public PoDate getPoDate() {
		return poDate;
	}

	public void setPoDate(PoDate poDate) {
		this.poDate = poDate;
	}

	public void setShipToAddress(ShipToAddress shipToAddress) {
		this.shipToAddress = shipToAddress;
	}

	public void setConsumerAddress(ConsumerAddress consumerAddress) {
		this.consumerAddress = consumerAddress;
	}

	public void setThirdPartyAddress(ThirdPartyAddress thirdPartyAddress) {
		this.thirdPartyAddress = thirdPartyAddress;
	}

	public List<GenericDate> getDates() {
		return dates;
	}

	public void setDates(List<GenericDate> dates) {
		dates.stream().forEach(this::addDate);
	}

	public void addDate(GenericDate date) {
		if (dates==null)
			dates = new ArrayList<GenericDate>();
		this.dates.add(date);
		date.setEdiOrder(this);
	}

	public List<Generic> getGenerics() {
		return generics;
	}

	public void setGenerics(List<Generic> generics) {
		generics.forEach(this::addGeneric);
	}

	public void addGeneric(Generic generic) {
		if (generics==null)
			generics = new ArrayList<Generic>();
		this.generics.add(generic);
	}

	@Override
	public List<EdiLine> getLines() {
		return lines;
	}

	@Override
	public void setLines(List<EdiLine> lines) {
		lines.stream().forEach(this::addLine);
	}

	public List<EdiValidation> getValidations() {
		return validations;
	}

	@Override
	public void setValidations(List<EdiValidation> validations) {
		validations.forEach(this::addValidation);
	}

	@Override
	public void addValidation(EdiValidation v) {
		if (validations==null);
			validations = new ArrayList<EdiValidation>();
		if (v.getEdiLine()==null)
		{
			validations.add(v);
			v.setEdiOrder(this);
		}
		else if (this.getLines()!=null)
		{
			int i = this.getLines().indexOf(v.getEdiLine());
			this.getLines().get(i).addValidation(v);
		}
	}

	public ConsumerAddress getConsumerAddress() {
		return consumerAddress!=null?consumerAddress:new ConsumerAddress();
	}

	public ShipToAddress getShipToAddress() {
		return shipToAddress!=null?shipToAddress:new ShipToAddress();
	}

	public ThirdPartyAddress getThirdPartyAddress() {
		return thirdPartyAddress!=null?thirdPartyAddress:new ThirdPartyAddress();
	}

	@Override
	public String toString() {
		return "EdiOrder [id=" + id + ", customerCode=" + customerCode
				+ ", orderingSystem=" + orderingSystem + ", type=" + orderType + ", legacyId=" + legacyId + ", shawOrderNbr="
				+ shawOrderNbr + ", carrierCode=" + carrierCode + ", customerNumber=" + customerNumber + ", commCust="
				+ commCust + ", poNumber=" + poNumber + ", freightType=" + freightType + ", serviceCode=" + serviceCode
				+ ", billToStore=" + billToStore + ", agreementNumber=" + agreementNumber + ", custDept=" + custDept
				+ ", storeName=" + storeName + ", vendorNo=" + vendorNo + ", dunsNbr=" + dunsNbr + ", beg=" + beg
				+ ", shipCancelDate=" + shipCancelDate + ", shipByDate=" + shipByDate + ", nbDate=" + nbDate
				+ ", shipDate=" + shipDate + ", cancelDate=" + cancelDate + ", poDate=" + poDate + ", dates=" + dates
				+ ", shipToAddress=" + shipToAddress + ", consumerAddress=" + consumerAddress + ", thirdPartyAddress="
				+ thirdPartyAddress + ", lines=" + lines + ", generics=" + generics + ", validations=" + validations
				+ "]";
	}
}
