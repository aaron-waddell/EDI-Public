package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the EDI_ORDER_LINE database table.
 * 
 */
@Entity
@Table(name="EDI_ORDER_LINE")
@NamedQuery(name="EdiOrderLine.findAll", query="SELECT e FROM EdiOrderLine e")
public class EdiOrderLine implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id;

	/**
	 * The primary key class for the EDI_ORDER_LINE database table.
	 * 
	 */
	@Embeddable
	public static class EdiOrderLinePK implements Serializable {
		//default serial version id, required for serializable classes.
		private static final long serialVersionUID = 1L;

//		@Column(name="EDI_ORDER_NUMBER", insertable=false, updatable=false, unique=true, nullable=false, precision=10)
//		private long ediOrderNumber;

		@Column(name="PO_LINE_NO", unique=true, nullable=false, length=10)
		private String poLineNo = "";

		@ManyToOne(optional = false, fetch = FetchType.LAZY)
	    @JoinColumn(name = "edi_order_number")
		private EdiOrderHeader ediOrderHeader;

		public EdiOrderLinePK() {
		}
		
		public EdiOrderLinePK(EdiOrderHeader ediOrderHeader, String poLineNo) {
			this.ediOrderHeader = ediOrderHeader;
			this.poLineNo = poLineNo;
		}

		//	public EdiOrderLinePK(Long ediOrderNbr, String poLineNo) {
//			this.ediOrderNumber = ediOrderNbr;
//			this.poLineNo = poLineNo;
//		}
//		public long getEdiOrderNumber() {
//			return this.ediOrderNumber;
//		}
//		public void setEdiOrderNumber(long ediOrderNumber) {
//			this.ediOrderNumber = ediOrderNumber;
//		}
		public String getPoLineNo() {
			return this.poLineNo;
		}
		public void setPoLineNo(String poLineNo) {
			this.poLineNo = poLineNo;
		}

		public EdiOrderHeader getEdiOrderHeader() {
			return ediOrderHeader;
		}
		public void setEdiOrderHeader(EdiOrderHeader ediOrderHeader) {
			this.ediOrderHeader = ediOrderHeader;
		}
		public boolean equals(Object other) {
			if (this == other) {
				return true;
			}
			if (!(other instanceof EdiOrderLinePK)) {
				return false;
			}
			EdiOrderLinePK castOther = (EdiOrderLinePK)other;
			return 
				(this.ediOrderHeader.getLegacyOrderNumber() == castOther.ediOrderHeader.getLegacyOrderNumber())
				&& this.poLineNo.equals(castOther.poLineNo);
		}

		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.ediOrderHeader.getLegacyOrderNumber() ^ (this.ediOrderHeader.getLegacyOrderNumber() >>> 32)));
			hash = hash * prime + this.poLineNo.hashCode();
			
			return hash;
		}

		@Override
		public String toString() {
			return "EdiOrderLinePK [poLineNo=" + poLineNo 
//					+ ", ediOrderHeader=" + ediOrderHeader!=null?"hdr":"null" 
			+ "]";
		}
	}
	
	@EmbeddedId
	private EdiOrderLinePK id;
	
	@Column(name="ADD_CUST_PROD_INFO", nullable=false, length=40)
	private String addCustProdInfo = "";

	@Column(name="AGREEMENT_PRICE", nullable=false, precision=13, scale=4)
	private Double agreementPrice = 0.0;

	@Column(name="AGREEMENT_UOM", nullable=false, length=3)
	private String agreementUom = "";

	@Column(name="BACKORDERED_FLAG", nullable=false, length=1)
	private String backorderedFlag = "";

	@Column(name="BILL_TO_STORE", nullable=false, length=10)
	private String billToStore = "";

	@Column(name="BINDING_FT", nullable=false, precision=5)
	private Double bindingFt = 0.0;

	@Column(name="CALC_PRICE", nullable=false, precision=9, scale=2)
	private Double calcPrice = 0.0;

	@Column(name="CHNG_LID", nullable=false, length=8)
	private String chngLid = "";

	@Column(name="CHNG_TIMESTAMP")
	private LocalDateTime chngTimestamp;

	@Column(name="CONS_MSG", nullable=false, length=255)
	private String consMsg = "";

	@Column(name="CONV_FACTOR", nullable=false, precision=7, scale=2)
	private Double convFactor = 0.0;

	@Column(name="CONV_QTY", nullable=false, precision=9, scale=2)
	private Double convQty = 0.0;

	@Column(name="CONV_UOM", nullable=false, length=3)
	private String convUom = "";

	@Column(name="CONV_WEIGHT", nullable=false, precision=9, scale=2)
	private Double convWeight = 0.0;

	@Column(name="CUST_PO_LINE_NBR", nullable=false, length=6)
	private String custPoLineNbr = "";

	@Column(name="CUST_PROD_DESC", nullable=false, length=80)
	private String custProdDesc = "";

	@Column(name="CUST_PROD_ID", nullable=false, length=30)
	private String custProdId = "";

	@Column(name="CUST_PROD_QUAL", nullable=false, length=2)
	private String custProdQual = "";

	@Column(name="CUST_REQ_SHIP_DATE", nullable=false)
	private LocalDate custReqShipDate;

	@Column(name="CUST_SZ_DESC", nullable=false, length=40)
	private String custSzDesc = "";

	@Column(name="CUST_UNIT_PRICE", nullable=false, precision=7, scale=2)
	private Double custUnitPrice = 0.0;

	@Column(name="CUSTOMER_CODE", nullable=false, length=2)
	private String customerCode = "";

	@Column(name="CUSTOMER_NUMBER", nullable=false, length=7)
	private String customerNumber = "";

	@Column(name="CUT_LENGTH", nullable=false, precision=5, scale=2)
	private Double cutLength = 0.0;

	@Column(name="DEPT_NBR", nullable=false, length=10)
	private String deptNbr = "";

	@Column(name="DISC_PCT", nullable=false, precision=5, scale=4)
	private Double discPct = 0.0;

	@Column(name="ERROR_CODE", nullable=false, length=2)
	private String errorCode = "";

	@Column(name="ERROR_DESCRIPTION", nullable=false, length=50)
	private String errorDescription = "";

	@Column(name="ERROR_TIMESTAMP")
	private LocalDateTime errorTimestamp;

	@Column(name="GTIN_NBR", nullable=false, length=15)
	private String gtinNbr = "";

	@Column(name="ITEM_NO", nullable=false, length=30)
	private String itemNo = "";

	@Column(name="ITEM_QUAL", nullable=false, length=2)
	private String itemQual = "";

	@Column(name="ITEM_SIZE", nullable=false, precision=8)
	private Double itemSize = 0.0;

	@Column(name="LI_INSTRUCTION", nullable=false, length=60)
	private String liInstruction = "";

	@Column(name="LINE_NUMBER", nullable=false, precision=3)
	private int lineNumber = 0;

	@Column(name="ORDER_NUMBER", nullable=false, length=6)
	private String orderNumber = "";

	@Column(name="ORDER_QUANTITY", nullable=false, precision=9)
	private Double orderQuantity = 0.0;

	@Column(name="ORDER_UOM", nullable=false, length=3)
	private String orderUom = "";

	@Column(name="ORDERING_SYS", nullable=false, length=2)
	private String orderingSys = "";

	@Column(name="PO_CONTROL", nullable=false, length=5)
	private String poControl = "";

	@Column(name="PO_NUMBER", nullable=false, length=22)
	private String poNumber = "";

	@Column(name="PRICE_QUAL", nullable=false, length=2)
	private String priceQual = "";

	@Column(name="PRICE_UOM", nullable=false, length=3)
	private String priceUom = "";

	@Column(name="PROD_STATUS", nullable=false, length=1)
	private String prodStatus = "";

	@Column(name="QUANTITY_ORDERED", nullable=false, precision=13, scale=2)
	private Double quantityOrdered = 0.0;

	@Column(name="RECEIPT_ID", nullable=false, length=50)
	private String receiptId = "";

	@Column(name="REQ_DYELOT", nullable=false, length=20)
	private String reqDyelot = "";

	@Column(name="REQ_DYELOT_QUAL", nullable=false, length=2)
	private String reqDyelotQual = "";

	@Column(name="RESERVED_IND", nullable=false, length=1)
	private String reservedInd = "";

	@Column(name="RET_LN_TOTAL", nullable=false, precision=13, scale=2)
	private Double retLnTotal = 0.0;

	@Column(name="RET_TX_DESC", nullable=false, length=35)
	private String retTxDesc = "";

	@Column(name="RETAIL_ALLOWANCE", nullable=false, precision=13, scale=4)
	private Double retailAllowance = 0.0;

	@Column(name="RETAIL_PRICE", nullable=false, precision=12, scale=4)
	private Double retailPrice = 0.0;

	@Column(name="RETAIL_SH_PRICE", nullable=false, precision=13, scale=4)
	private Double retailShPrice = 0.0;

	@Column(name="RETAIL_TAX", nullable=false, precision=15, scale=4)
	private Double retailTax = 0.0;

	@Column(name="RETURN_MSG", nullable=false, length=45)
	private String returnMsg = "";

	@Column(name="ROLL_LENGTH", nullable=false, precision=7)
	private Double rollLength = 0.0;

	@Column(name="ROLL_MAX", nullable=false, precision=5)
	private Double rollMax = 0.0;

	@Column(name="ROLL_MIN", nullable=false, precision=5)
	private Double rollMin = 0.0;

	@Column(name="ROLL_WIDTH", nullable=false, precision=5, scale=2)
	private Double rollWidth = 0.0;

	@Column(name="ROUNDED_FLAG", nullable=false, length=1)
	private String roundedFlag = "N";

	@Column(name="SAME_DYELOT_IND", nullable=false, length=1)
	private String sameDyelotInd = "";

	@Column(name="SELL_COLOR_NUMBER", nullable=false, length=5)
	private String color = "";

	@Column(name="SELL_STYLE_NUMBER", nullable=false, length=5)
	private String style = "";

	@Column(name="SHIP_DATE")
	private LocalDateTime shipDateTime;

	@Column(name="SHIP_DATE_QUAL", nullable=false, length=3)
	private String shipDateQualifier = "";

	@Column(name="STATUS_CODE", nullable=false, length=1)
	private String statusCode = "";

	@Column(name="SUMMARIZE_FLAG", nullable=false, length=3)
	private String summarizeFlag = "";

	@Column(name="UNIT_PRICE", nullable=false, precision=13, scale=4)
	private Double unitPrice = 0.0;

	@Column(name="UOM_CODE", nullable=false, length=3)
	private String uomCode = "";

	@Column(name="UPC_CODE", nullable=false, length=15)
	private String upcCode = "";
	
	public EdiOrderLine() {
	}

//	public long getId() {
//		return this.id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}

	public EdiOrderLinePK getId() {
		return id;
	}

	public void setId(EdiOrderLinePK id) {
		this.id = id;
	}

	public String getAddCustProdInfo() {
		return this.addCustProdInfo;
	}

	public void setAddCustProdInfo(String addCustProdInfo) {
		this.addCustProdInfo = addCustProdInfo;
	}

	public Double getAgreementPrice() {
		return this.agreementPrice;
	}

	public void setAgreementPrice(Double agreementPrice) {
		this.agreementPrice = agreementPrice;
	}

	public String getAgreementUom() {
		return this.agreementUom;
	}

	public void setAgreementUom(String agreementUom) {
		this.agreementUom = agreementUom;
	}

	public String getBackorderedFlag() {
		return this.backorderedFlag;
	}

	public void setBackorderedFlag(String backorderedFlag) {
		this.backorderedFlag = backorderedFlag;
	}

	public String getBillToStore() {
		return this.billToStore;
	}

	public void setBillToStore(String billToStore) {
		this.billToStore = billToStore;
	}

	public Double getBindingFt() {
		return this.bindingFt;
	}

	public void setBindingFt(Double bindingFt) {
		this.bindingFt = bindingFt;
	}

	public Double getCalcPrice() {
		return this.calcPrice;
	}

	public void setCalcPrice(Double calcPrice) {
		this.calcPrice = calcPrice;
	}

	public String getChngLid() {
		return this.chngLid;
	}

	public void setChngLid(String chngLid) {
		this.chngLid = chngLid;
	}

	public LocalDateTime getChngTimestamp() {
		return this.chngTimestamp;
	}

	public void setChngTimestamp(LocalDateTime chngTimestamp) {
		this.chngTimestamp = chngTimestamp;
	}

	public String getConsMsg() {
		return this.consMsg;
	}

	public void setConsMsg(String consMsg) {
		this.consMsg = consMsg;
	}

	public Double getConvFactor() {
		return this.convFactor;
	}

	public void setConvFactor(Double convFactor) {
		this.convFactor = convFactor;
	}

	public Double getConvQty() {
		return this.convQty;
	}

	public void setConvQty(Double convQty) {
		this.convQty = convQty;
	}

	public String getConvUom() {
		return this.convUom;
	}

	public void setConvUom(String convUom) {
		this.convUom = convUom;
	}

	public Double getConvWeight() {
		return this.convWeight;
	}

	public void setConvWeight(Double convWeight) {
		this.convWeight = convWeight;
	}

	public String getCustPoLineNbr() {
		return this.custPoLineNbr;
	}

	public void setCustPoLineNbr(String custPoLineNbr) {
		this.custPoLineNbr = custPoLineNbr;
	}

	public String getCustProdDesc() {
		return this.custProdDesc;
	}

	public void setCustProdDesc(String custProdDesc) {
		this.custProdDesc = custProdDesc;
	}

	public String getCustProdId() {
		return this.custProdId;
	}

	public void setCustProdId(String custProdId) {
		this.custProdId = custProdId;
	}

	public String getCustProdQual() {
		return this.custProdQual;
	}

	public void setCustProdQual(String custProdQual) {
		this.custProdQual = custProdQual;
	}

	public LocalDate getCustReqShipDate() {
		return this.custReqShipDate;
	}

	public void setCustReqShipDate(LocalDate custReqShipDate) {
		this.custReqShipDate = custReqShipDate;
	}

	public String getCustSzDesc() {
		return this.custSzDesc;
	}

	public void setCustSzDesc(String custSzDesc) {
		this.custSzDesc = custSzDesc;
	}

	public Double getCustUnitPrice() {
		return this.custUnitPrice;
	}

	public void setCustUnitPrice(Double custUnitPrice) {
		this.custUnitPrice = custUnitPrice;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public Double getCutLength() {
		return this.cutLength;
	}

	public void setCutLength(Double cutLength) {
		this.cutLength = cutLength;
	}

	public String getDeptNbr() {
		return this.deptNbr;
	}

	public void setDeptNbr(String deptNbr) {
		this.deptNbr = deptNbr;
	}

	public Double getDiscPct() {
		return this.discPct;
	}

	public void setDiscPct(Double discPct) {
		this.discPct = discPct;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return this.errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public LocalDateTime getErrorTimestamp() {
		return this.errorTimestamp;
	}

	public void setErrorTimestamp(LocalDateTime errorTimestamp) {
		this.errorTimestamp = errorTimestamp;
	}

	public String getGtinNbr() {
		return this.gtinNbr;
	}

	public void setGtinNbr(String gtinNbr) {
		this.gtinNbr = gtinNbr;
	}

	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemQual() {
		return this.itemQual;
	}

	public void setItemQual(String itemQual) {
		this.itemQual = itemQual;
	}

	public Double getItemSize() {
		return this.itemSize;
	}

	public void setItemSize(Double itemSize) {
		this.itemSize = itemSize;
	}

	public String getLiInstruction() {
		return this.liInstruction;
	}

	public void setLiInstruction(String liInstruction) {
		this.liInstruction = liInstruction;
	}

	public int getLineNumber() {
		return this.lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Double getOrderQuantity() {
		return this.orderQuantity;
	}

	public void setOrderQuantity(Double orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public String getOrderUom() {
		return this.orderUom;
	}

	public void setOrderUom(String orderUom) {
		this.orderUom = orderUom;
	}

	public String getOrderingSys() {
		return this.orderingSys;
	}

	public void setOrderingSys(String orderingSys) {
		this.orderingSys = orderingSys;
	}

	public String getPoControl() {
		return this.poControl;
	}

	public void setPoControl(String poControl) {
		this.poControl = poControl;
	}

	public String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getPriceQual() {
		return this.priceQual;
	}

	public void setPriceQual(String priceQual) {
		this.priceQual = priceQual;
	}

	public String getPriceUom() {
		return this.priceUom;
	}

	public void setPriceUom(String priceUom) {
		this.priceUom = priceUom;
	}

	public String getProdStatus() {
		return this.prodStatus;
	}

	public void setProdStatus(String prodStatus) {
		this.prodStatus = prodStatus;
	}

	public Double getQuantityOrdered() {
		return this.quantityOrdered;
	}

	public void setQuantityOrdered(Double quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public String getReceiptId() {
		return this.receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

	public String getReqDyelot() {
		return this.reqDyelot;
	}

	public void setReqDyelot(String reqDyelot) {
		this.reqDyelot = reqDyelot;
	}

	public String getReqDyelotQual() {
		return this.reqDyelotQual;
	}

	public void setReqDyelotQual(String reqDyelotQual) {
		this.reqDyelotQual = reqDyelotQual;
	}

	public String getReservedInd() {
		return this.reservedInd;
	}

	public void setReservedInd(String reservedInd) {
		this.reservedInd = reservedInd;
	}

	public Double getRetLnTotal() {
		return this.retLnTotal;
	}

	public void setRetLnTotal(Double retLnTotal) {
		this.retLnTotal = retLnTotal;
	}

	public String getRetTxDesc() {
		return this.retTxDesc;
	}

	public void setRetTxDesc(String retTxDesc) {
		this.retTxDesc = retTxDesc;
	}

	public Double getRetailAllowance() {
		return this.retailAllowance;
	}

	public void setRetailAllowance(Double retailAllowance) {
		this.retailAllowance = retailAllowance;
	}

	public Double getRetailPrice() {
		return this.retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Double getRetailShPrice() {
		return this.retailShPrice;
	}

	public void setRetailShPrice(Double retailShPrice) {
		this.retailShPrice = retailShPrice;
	}

	public Double getRetailTax() {
		return this.retailTax;
	}

	public void setRetailTax(Double retailTax) {
		this.retailTax = retailTax;
	}

	public String getReturnMsg() {
		return this.returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public Double getRollLength() {
		return this.rollLength;
	}

	public void setRollLength(Double rollLength) {
		this.rollLength = rollLength;
	}

	public Double getRollMax() {
		return this.rollMax;
	}

	public void setRollMax(Double rollMax) {
		this.rollMax = rollMax;
	}

	public Double getRollMin() {
		return this.rollMin;
	}

	public void setRollMin(Double rollMin) {
		this.rollMin = rollMin;
	}

	public Double getRollWidth() {
		return this.rollWidth;
	}

	public void setRollWidth(Double rollWidth) {
		this.rollWidth = rollWidth;
	}

	public String getRoundedFlag() {
		return this.roundedFlag;
	}

	public void setRoundedFlag(String roundedFlag) {
		this.roundedFlag = roundedFlag;
	}

	public String getSameDyelotInd() {
		return this.sameDyelotInd;
	}

	public void setSameDyelotInd(String sameDyelotInd) {
		this.sameDyelotInd = sameDyelotInd;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public LocalDateTime getShipDateTime() {
		return this.shipDateTime;
	}

	public void setShipDateTime(LocalDateTime shipDateTime) {
		this.shipDateTime = shipDateTime;
	}

	public String getShipDateQualifier() {
		return this.shipDateQualifier;
	}

	public void setShipDateQualifier(String shipDateQualifier) {
		this.shipDateQualifier = shipDateQualifier;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getSummarizeFlag() {
		return this.summarizeFlag;
	}

	public void setSummarizeFlag(String summarizeFlag) {
		this.summarizeFlag = summarizeFlag;
	}

	public Double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUomCode() {
		return this.uomCode;
	}

	public void setUomCode(String uomCode) {
		this.uomCode = uomCode;
	}

	public String getUpcCode() {
		return this.upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

//	public EdiOrderHeader getEdiOrderHeader() {
//		return ediOrderHeader;
//	}
//
//	public void setEdiOrderHeader(EdiOrderHeader ediOrderHeader) {
//		this.ediOrderHeader = ediOrderHeader;
//	}

	@Override
	public String toString() {
//		return "EdiOrderLine [id=" + id + ", poLineNo=" + pk.getPoLineNo() + ", addCustProdInfo=" + addCustProdInfo + ", agreementPrice="
		return "EdiOrderLine [:id=" + id + ", addCustProdInfo=" + addCustProdInfo + ", agreementPrice="
				+ agreementPrice + ", agreementUom=" + agreementUom + ", backorderedFlag=" + backorderedFlag
				+ ", billToStore=" + billToStore + ", bindingFt=" + bindingFt + ", calcPrice=" + calcPrice
				+ ", chngLid=" + chngLid + ", chngTimestamp=" + chngTimestamp + ", consMsg=" + consMsg + ", convFactor="
				+ convFactor + ", convQty=" + convQty + ", convUom=" + convUom + ", convWeight=" + convWeight
				+ ", custPoLineNbr=" + custPoLineNbr + ", custProdDesc=" + custProdDesc + ", custProdId=" + custProdId
				+ ", custProdQual=" + custProdQual + ", custReqShipDate=" + custReqShipDate + ", custSzDesc="
				+ custSzDesc + ", custUnitPrice=" + custUnitPrice + ", customerCode=" + customerCode
				+ ", customerNumber=" + customerNumber + ", cutLength=" + cutLength + ", deptNbr=" + deptNbr
				+ ", discPct=" + discPct + ", errorCode=" + errorCode + ", errorDescription=" + errorDescription
				+ ", errorTimestamp=" + errorTimestamp + ", gtinNbr=" + gtinNbr + ", itemNo=" + itemNo + ", itemQual="
				+ itemQual + ", itemSize=" + itemSize + ", liInstruction=" + liInstruction + ", lineNumber="
				+ lineNumber + ", orderNumber=" + orderNumber + ", orderQuantity=" + orderQuantity + ", orderUom="
				+ orderUom + ", orderingSys=" + orderingSys + ", poControl=" + poControl + ", poNumber=" + poNumber
				+ ", priceQual=" + priceQual + ", priceUom=" + priceUom + ", prodStatus=" + prodStatus
				+ ", quantityOrdered=" + quantityOrdered + ", receiptId=" + receiptId + ", reqDyelot=" + reqDyelot
				+ ", reqDyelotQual=" + reqDyelotQual + ", reservedInd=" + reservedInd + ", retLnTotal=" + retLnTotal
				+ ", retTxDesc=" + retTxDesc + ", retailAllowance=" + retailAllowance + ", retailPrice=" + retailPrice
				+ ", retailShPrice=" + retailShPrice + ", retailTax=" + retailTax + ", returnMsg=" + returnMsg
				+ ", rollLength=" + rollLength + ", rollMax=" + rollMax + ", rollMin=" + rollMin + ", rollWidth="
				+ rollWidth + ", roundedFlag=" + roundedFlag + ", sameDyelotInd=" + sameDyelotInd + ", color="
				+ color + ", style=" + style + ", shipDate=" + shipDateTime
				+ ", shipDateQualifier=" + shipDateQualifier + ", statusCode=" + statusCode + ", summarizeFlag="
				+ summarizeFlag + ", unitPrice=" + unitPrice + ", uomCode=" + uomCode + ", upcCode=" + upcCode
//				+ ", ediOrderHeader=" + (id.getEdiOrderHeader()!=null?id.getEdiOrderHeader().getLegacyOrderNumber():"null") 
				+ "]";
	}

}