package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


/**
 * The persistent class for the EDI_SHIP_INFO_LN database table.
 * 
 */
@Entity
@Table(name="EDI_SHIP_INFO_LN")
@NamedQuery(name="EdiShipInfoLn.findAll", query="SELECT e FROM EdiShipInfoLn e")
public class EdiShipInfoLn implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * The primary key class for the EDI_SHIP_INFO_LN database table.
	 * 
	 */
	@Embeddable
	public static class EdiShipInfoLnPK implements Serializable {
		//default serial version id, required for serializable classes.
		private static final long serialVersionUID = 1L;

		@NotNull
		@ManyToOne
		@JoinColumns(value = { @JoinColumn(name="ORDER_NBR"),@JoinColumn(name="DATE_STAMP")})
		EdiShipInfo ediShipInfo;

		@Column(name="LINE_NBR", unique=true, nullable=false, precision=3)
		private long lineNbr;

		public EdiShipInfoLnPK() {
		}

		public EdiShipInfoLnPK(EdiShipInfo ediShipInfo, long lineNbr) {
			this.ediShipInfo = ediShipInfo;
			this.lineNbr = lineNbr;
		}

		public EdiShipInfo getEdiShipInfo() {
			return ediShipInfo;
		}

		public void setEdiShipInfo(EdiShipInfo ediShipInfo) {
			this.ediShipInfo = ediShipInfo;
		}

		public long getLineNbr() {
			return this.lineNbr;
		}
		public void setLineNbr(long lineNbr) {
			this.lineNbr = lineNbr;
		}

		public boolean equals(Object other) {
			if (this == other) {
				return true;
			}
			if (!(other instanceof EdiShipInfoLnPK)) {
				return false;
			}
			EdiShipInfoLnPK castOther = (EdiShipInfoLnPK)other;
			return 
				this.ediShipInfo.equals(castOther.ediShipInfo)
				&& (this.lineNbr == castOther.lineNbr);
		}

		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.ediShipInfo.hashCode();
			hash = hash * prime + ((int) (this.lineNbr ^ (this.lineNbr >>> 32)));
			
			return hash;
		}
	}

	@EmbeddedId
	private EdiShipInfoLnPK id;

	@Column(name="ADD_CUST_PROD_INFO", nullable=false, length=40)
	private String addCustProdInfo;

	@Column(name="COLOR_NBR", nullable=false, length=5)
	private String colorNbr;

	@Column(name="CONS_MSG", nullable=false, length=255)
	private String consMsg;

	@Column(name="CUST_PROD_DESC", nullable=false, length=80)
	private String custProdDesc;

	@Column(name="CUST_PROD_ID", nullable=false, length=20)
	private String custProdId;

	@Column(name="CUST_QTY", nullable=false, precision=12, scale=2)
	private BigDecimal custQty;

	@Temporal(TemporalType.DATE)
	@Column(name="CUST_REQ_SHIP_DATE", nullable=false)
	private Date custReqShipDate;

	@Column(name="CUST_SZ_DESC", nullable=false, length=40)
	private String custSzDesc;

	@Column(name="DEPT_NBR", nullable=false, length=10)
	private String deptNbr;

	@Column(nullable=false, length=6)
	private String dyelot;

	@Column(name="EDI_ITEM_NBR", nullable=false, length=30)
	private String ediItemNbr;

	@Column(name="GTIN_NBR", nullable=false, length=15)
	private String gtinNbr;

	@Column(name="LAST_CHNG_DATE", nullable=false)
	private Timestamp lastChngDate;

	@Column(name="LAST_CHNG_ID", nullable=false, length=8)
	private String lastChngId;

	@Column(name="\"LENGTH\"", nullable=false, precision=12, scale=2)
	private BigDecimal length;

	@Column(name="ORDER_QTY_FT", nullable=false, precision=7)
	private BigDecimal orderQtyFt;

	@Column(name="ORDER_QTY_IN", nullable=false, precision=2)
	private BigDecimal orderQtyIn;

	@Column(name="PO_LINE_NBR", nullable=false, length=6)
	private String poLineNbr;

	@Column(nullable=false, precision=12, scale=4)
	private BigDecimal price;

	@Column(name="PRICE_UOM", nullable=false, length=3)
	private String priceUom;

	@Column(name="RECEIPT_ID", nullable=false, length=50)
	private String receiptId;

	@Temporal(TemporalType.DATE)
	@Column(name="REPROM_DATE", nullable=false)
	private Date repromDate;

	@Column(name="REQ_DYELOT", nullable=false, length=20)
	private String reqDyelot;

	@Column(name="REQ_DYELOT_QUAL", nullable=false, length=2)
	private String reqDyelotQual;

	@Column(name="REQ_PRICE", precision=12, scale=4)
	private BigDecimal reqPrice;

	@Column(name="RET_LN_TOTAL", nullable=false, precision=13, scale=2)
	private BigDecimal retLnTotal;

	@Column(name="RET_TX_DESC", nullable=false, length=35)
	private String retTxDesc;

	@Column(name="RETAIL_ALLOWANCE", nullable=false, precision=13, scale=4)
	private BigDecimal retailAllowance;

	@Column(name="RETAIL_PRICE", nullable=false, precision=13, scale=4)
	private BigDecimal retailPrice;

	@Column(name="RETAIL_SH_PRICE", nullable=false, precision=13, scale=4)
	private BigDecimal retailShPrice;

	@Column(name="RETAIL_TAX", nullable=false, precision=15, scale=4)
	private BigDecimal retailTax;

	@Column(name="RETURN_MSG", nullable=false, length=45)
	private String returnMsg;

	@Column(name="ROLL_NBR", nullable=false, length=7)
	private String rollNbr;

	@Column(nullable=false, length=1)
	private String status;

	@Column(name="STYLE_NBR", nullable=false, length=5)
	private String styleNbr;

	@Column(name="UNIT_PRICE", nullable=false, precision=13, scale=4)
	private BigDecimal unitPrice;

	@Column(nullable=false, length=2)
	private String uom;

	@Column(name="UPC_CODE", nullable=false, length=15)
	private String upcCode;

	@Column(nullable=false, precision=5, scale=2)
	private BigDecimal width;

	public EdiShipInfoLn() {
	}

	public EdiShipInfoLnPK getId() {
		return this.id;
	}

	public void setId(EdiShipInfoLnPK id) {
		this.id = id;
	}

	public String getAddCustProdInfo() {
		return this.addCustProdInfo;
	}

	public void setAddCustProdInfo(String addCustProdInfo) {
		this.addCustProdInfo = addCustProdInfo;
	}

	public String getColorNbr() {
		return this.colorNbr;
	}

	public void setColorNbr(String colorNbr) {
		this.colorNbr = colorNbr;
	}

	public String getConsMsg() {
		return this.consMsg;
	}

	public void setConsMsg(String consMsg) {
		this.consMsg = consMsg;
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

	public BigDecimal getCustQty() {
		return this.custQty;
	}

	public void setCustQty(BigDecimal custQty) {
		this.custQty = custQty;
	}

	public Date getCustReqShipDate() {
		return this.custReqShipDate;
	}

	public void setCustReqShipDate(Date custReqShipDate) {
		this.custReqShipDate = custReqShipDate;
	}

	public String getCustSzDesc() {
		return this.custSzDesc;
	}

	public void setCustSzDesc(String custSzDesc) {
		this.custSzDesc = custSzDesc;
	}

	public String getDeptNbr() {
		return this.deptNbr;
	}

	public void setDeptNbr(String deptNbr) {
		this.deptNbr = deptNbr;
	}

	public String getDyelot() {
		return this.dyelot;
	}

	public void setDyelot(String dyelot) {
		this.dyelot = dyelot;
	}

	public String getEdiItemNbr() {
		return this.ediItemNbr;
	}

	public void setEdiItemNbr(String ediItemNbr) {
		this.ediItemNbr = ediItemNbr;
	}

	public String getGtinNbr() {
		return this.gtinNbr;
	}

	public void setGtinNbr(String gtinNbr) {
		this.gtinNbr = gtinNbr;
	}

	public Timestamp getLastChngDate() {
		return this.lastChngDate;
	}

	public void setLastChngDate(Timestamp lastChngDate) {
		this.lastChngDate = lastChngDate;
	}

	public String getLastChngId() {
		return this.lastChngId;
	}

	public void setLastChngId(String lastChngId) {
		this.lastChngId = lastChngId;
	}

	public BigDecimal getLength() {
		return this.length;
	}

	public void setLength(BigDecimal length) {
		this.length = length;
	}

	public BigDecimal getOrderQtyFt() {
		return this.orderQtyFt;
	}

	public void setOrderQtyFt(BigDecimal orderQtyFt) {
		this.orderQtyFt = orderQtyFt;
	}

	public BigDecimal getOrderQtyIn() {
		return this.orderQtyIn;
	}

	public void setOrderQtyIn(BigDecimal orderQtyIn) {
		this.orderQtyIn = orderQtyIn;
	}

	public String getPoLineNbr() {
		return this.poLineNbr;
	}

	public void setPoLineNbr(String poLineNbr) {
		this.poLineNbr = poLineNbr;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getPriceUom() {
		return this.priceUom;
	}

	public void setPriceUom(String priceUom) {
		this.priceUom = priceUom;
	}

	public String getReceiptId() {
		return this.receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

	public Date getRepromDate() {
		return this.repromDate;
	}

	public void setRepromDate(Date repromDate) {
		this.repromDate = repromDate;
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

	public BigDecimal getReqPrice() {
		return this.reqPrice;
	}

	public void setReqPrice(BigDecimal reqPrice) {
		this.reqPrice = reqPrice;
	}

	public BigDecimal getRetLnTotal() {
		return this.retLnTotal;
	}

	public void setRetLnTotal(BigDecimal retLnTotal) {
		this.retLnTotal = retLnTotal;
	}

	public String getRetTxDesc() {
		return this.retTxDesc;
	}

	public void setRetTxDesc(String retTxDesc) {
		this.retTxDesc = retTxDesc;
	}

	public BigDecimal getRetailAllowance() {
		return this.retailAllowance;
	}

	public void setRetailAllowance(BigDecimal retailAllowance) {
		this.retailAllowance = retailAllowance;
	}

	public BigDecimal getRetailPrice() {
		return this.retailPrice;
	}

	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}

	public BigDecimal getRetailShPrice() {
		return this.retailShPrice;
	}

	public void setRetailShPrice(BigDecimal retailShPrice) {
		this.retailShPrice = retailShPrice;
	}

	public BigDecimal getRetailTax() {
		return this.retailTax;
	}

	public void setRetailTax(BigDecimal retailTax) {
		this.retailTax = retailTax;
	}

	public String getReturnMsg() {
		return this.returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public String getRollNbr() {
		return this.rollNbr;
	}

	public void setRollNbr(String rollNbr) {
		this.rollNbr = rollNbr;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStyleNbr() {
		return this.styleNbr;
	}

	public void setStyleNbr(String styleNbr) {
		this.styleNbr = styleNbr;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUom() {
		return this.uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getUpcCode() {
		return this.upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public BigDecimal getWidth() {
		return this.width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "EdiShipInfoLn [addCustProdInfo=" + addCustProdInfo + ", colorNbr=" + colorNbr + ", consMsg=" + consMsg
				+ ", custProdDesc=" + custProdDesc + ", custProdId=" + custProdId + ", custQty=" + custQty
				+ ", custReqShipDate=" + custReqShipDate + ", custSzDesc=" + custSzDesc + ", deptNbr=" + deptNbr
				+ ", dyelot=" + dyelot + ", ediItemNbr=" + ediItemNbr + ", gtinNbr=" + gtinNbr + ", lastChngDate="
				+ lastChngDate + ", lastChngId=" + lastChngId + ", length=" + length + ", orderQtyFt=" + orderQtyFt
				+ ", orderQtyIn=" + orderQtyIn + ", poLineNbr=" + poLineNbr + ", price=" + price + ", priceUom="
				+ priceUom + ", receiptId=" + receiptId + ", repromDate=" + repromDate + ", reqDyelot=" + reqDyelot
				+ ", reqDyelotQual=" + reqDyelotQual + ", reqPrice=" + reqPrice + ", retLnTotal=" + retLnTotal
				+ ", retTxDesc=" + retTxDesc + ", retailAllowance=" + retailAllowance + ", retailPrice=" + retailPrice
				+ ", retailShPrice=" + retailShPrice + ", retailTax=" + retailTax + ", returnMsg=" + returnMsg
				+ ", rollNbr=" + rollNbr + ", status=" + status + ", styleNbr=" + styleNbr + ", unitPrice=" + unitPrice
				+ ", uom=" + uom + ", upcCode=" + upcCode + ", width=" + width + "]";
	}

}