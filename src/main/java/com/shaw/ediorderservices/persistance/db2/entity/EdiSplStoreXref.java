package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the EDI_SPL_STORE_XREF database table.
 * 
 */
@Entity
@Table(name="EDI_SPL_STORE_XREF")
@NamedQuery(name="EdiSplStoreXref.findAll", query="SELECT e FROM EdiSplStoreXref e")
public class EdiSplStoreXref implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3888094062088523911L;

	@Embeddable
	public static class EdiSplStoreXrefPK implements Serializable {
		//default serial version id, required for serializable classes.
		private static final long serialVersionUID = 1L;

		@Column(name="CUST_CODE", insertable=false, updatable=false, unique=true, nullable=false, length=2)
		private String custCode;

		@Column(name="ORDERING_SYS", insertable=false, updatable=false, unique=true, nullable=false, length=2)
		private String orderingSys;

		@Column(name="CUST_STORE_NBR", unique=true, nullable=false, length=20)
		private String custStoreNbr;

		public EdiSplStoreXrefPK() {
		}
		public String getCustCode() {
			return this.custCode;
		}
		public void setCustCode(String custCode) {
			this.custCode = custCode;
		}
		public String getOrderingSys() {
			return this.orderingSys;
		}
		public void setOrderingSys(String orderingSys) {
			this.orderingSys = orderingSys;
		}
		public String getCustStoreNbr() {
			return this.custStoreNbr;
		}
		public void setCustStoreNbr(String custStoreNbr) {
			this.custStoreNbr = custStoreNbr;
		}

		public boolean equals(Object other) {
			if (this == other) {
				return true;
			}
			if (!(other instanceof EdiSplStoreXrefPK)) {
				return false;
			}
			EdiSplStoreXrefPK castOther = (EdiSplStoreXrefPK)other;
			return 
				this.custCode.equals(castOther.custCode)
				&& this.orderingSys.equals(castOther.orderingSys)
				&& this.custStoreNbr.equals(castOther.custStoreNbr);
		}

		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.custCode.hashCode();
			hash = hash * prime + this.orderingSys.hashCode();
			hash = hash * prime + this.custStoreNbr.hashCode();
			
			return hash;
		}
	}
	
	@EmbeddedId
	private EdiSplStoreXrefPK id;

	@Column(name="CUST_NBR", nullable=false, length=7)
	private String custNbr;

	@Column(name="LAST_CHNG_DATE", nullable=false)
	private LocalDateTime lastChngDate;

	@Column(name="LAST_CHNG_ID", nullable=false, length=8)
	private String lastChngId;

	@Column(name="RFID_FLAG", nullable=false, length=1)
	private String rfidFlag;

	@Column(name="SHAW_STORE_NBR", nullable=false, length=20)
	private String shawStoreNbr;

	@Column(name="STORE_DESC", nullable=false, length=35)
	private String storeDesc;

	public EdiSplStoreXref() {
	}

	public EdiSplStoreXrefPK getId() {
		return this.id;
	}

	public void setId(EdiSplStoreXrefPK id) {
		this.id = id;
	}

	public String getCustNbr() {
		return this.custNbr;
	}

	public void setCustNbr(String custNbr) {
		this.custNbr = custNbr;
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

	public String getRfidFlag() {
		return this.rfidFlag;
	}

	public void setRfidFlag(String rfidFlag) {
		this.rfidFlag = rfidFlag;
	}

	public String getShawStoreNbr() {
		return this.shawStoreNbr.trim();
	}

	public void setShawStoreNbr(String shawStoreNbr) {
		this.shawStoreNbr = shawStoreNbr;
	}

	public String getStoreDesc() {
		return this.storeDesc;
	}

	public void setStoreDesc(String storeDesc) {
		this.storeDesc = storeDesc;
	}

	@Override
	public String toString() {
		return "EdiSplStoreXref [id=" + id + ", custNbr=" + custNbr + ", lastChngDate=" + lastChngDate + ", lastChngId="
				+ lastChngId + ", rfidFlag=" + rfidFlag + ", shawStoreNbr=" + shawStoreNbr + ", storeDesc=" + storeDesc
				+ "]";
	}

}