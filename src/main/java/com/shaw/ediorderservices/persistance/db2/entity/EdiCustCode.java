package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;


/**
 * The persistent class for the EDI_CUST_CODE database table.
 * 
 */
@Entity
@Immutable @Cacheable
@Table(name="EDI_CUST_CODE")
@NamedQuery(name="EdiCustCode.findAll", query="SELECT e FROM EdiCustCode e")
public class EdiCustCode implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * The primary key class for the EDI_CUST_CODE database table.
	 * 
	 */
	@Embeddable
	public static class EdiCustCodePK implements Serializable {
		//default serial version id, required for serializable classes.
		private static final long serialVersionUID = 1L;

		@Column(name="CUSTOMER_CODE", unique=true, nullable=false, length=2)
		private String customerCode;

		@Column(name="ORDERING_SYS", unique=true, nullable=false, length=2)
		private String orderingSys;

		public EdiCustCodePK() {
		}

		public EdiCustCodePK(String customerCode, String orderingSys) {
			this.customerCode = customerCode;
			this.orderingSys = orderingSys;
		}
		
		public String getCustomerCode() {
			return this.customerCode;
		}
		public void setCustomerCode(String customerCode) {
			this.customerCode = customerCode;
		}
		public String getOrderingSys() {
			return this.orderingSys;
		}
		public void setOrderingSys(String orderingSys) {
			this.orderingSys = orderingSys;
		}

		public boolean equals(Object other) {
			if (this == other) {
				return true;
			}
			if (!(other instanceof EdiCustCodePK)) {
				return false;
			}
			EdiCustCodePK castOther = (EdiCustCodePK)other;
			return 
				this.customerCode.equals(castOther.customerCode)
				&& this.orderingSys.equals(castOther.orderingSys);
		}

		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.customerCode.hashCode();
			hash = hash * prime + this.orderingSys.hashCode();
			
			return hash;
		}
	}

	@EmbeddedId
	private EdiCustCodePK id;

	@Column(name="ACK_FLAG", nullable=false, length=1)
	private String ackFlag;

	@Column(name="COMM_CUST_FLAG", nullable=false, length=1)
	private String commCustFlag;

	@Column(name="CUST_DESCRIPTION", nullable=false, length=30)
	private String custDescription;

	@Column(name="CUSTOMER_NUMBER", unique=true, nullable=false, length=7)
	private String customerNumber;

	@Column(name="DEF_AGENT", nullable=false, length=10)
	private String defAgent;

	@Column(name="VENDOR_NO", nullable=false, length=15)
	private String vendorNo;

	public EdiCustCode() {
	}

	public EdiCustCodePK getId() {
		return this.id;
	}

	public void setId(EdiCustCodePK id) {
		this.id = id;
	}

	public String getAckFlag() {
		return this.ackFlag;
	}

	public void setAckFlag(String ackFlag) {
		this.ackFlag = ackFlag;
	}

	public String getCommCustFlag() {
		return this.commCustFlag;
	}

	public void setCommCustFlag(String commCustFlag) {
		this.commCustFlag = commCustFlag;
	}

	public String getCustDescription() {
		return this.custDescription;
	}

	public void setCustDescription(String custDescription) {
		this.custDescription = custDescription;
	}

	public String getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getDefAgent() {
		return this.defAgent;
	}

	public void setDefAgent(String defAgent) {
		this.defAgent = defAgent;
	}

	public String getVendorNo() {
		return this.vendorNo;
	}

	public void setVendorNo(String vendorNo) {
		this.vendorNo = vendorNo;
	}

}