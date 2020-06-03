package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the EDI_ORDER_DATE database table.
 * 
 */
@Entity
@Table(name="EDI_ORDER_DATE")
public class EdiOrderDate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Embeddable
	public static class EdiOrderDatePK implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		@Column(name="DATE_QUALIFIER", nullable=false, length=3)
		private String qualifier;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "edi_order_number")
		private EdiOrderHeader ediOrderHeader;


		public EdiOrderDatePK() {
			super();
		}

		public EdiOrderDatePK(String qualifier, EdiOrderHeader ediOrderHeader) {
			super();
			this.qualifier = qualifier;
			this.ediOrderHeader = ediOrderHeader;
		}

		public String getQualifier() {
			return this.qualifier;
		}

		public void setQualifier(String qualifier) {
			this.qualifier = qualifier;
		}

		public EdiOrderHeader getEdiOrderHeader() {
			return ediOrderHeader;
		}

		public void setEdiOrderHeader(EdiOrderHeader ediOrderHeader) {
			this.ediOrderHeader = ediOrderHeader;		
		}

		@Override
		public String toString() {
			return "EdiOrderDatePK [qualifier=" + qualifier + ", ediOrderHeader=" + (ediOrderHeader!=null?ediOrderHeader.getLegacyOrderNumber():null) + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((ediOrderHeader == null) ? 0 : ediOrderHeader.hashCode());
			result = prime * result + ((qualifier == null) ? 0 : qualifier.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EdiOrderDatePK other = (EdiOrderDatePK) obj;
			if (ediOrderHeader == null) {
				if (other.ediOrderHeader != null)
					return false;
			} else if (!ediOrderHeader.equals(other.ediOrderHeader))
				return false;
			if (qualifier == null) {
				if (other.qualifier != null)
					return false;
			} else if (!qualifier.equals(other.qualifier))
				return false;
			return true;
		}

	}

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
////	@Column(insertable=false, updatable=false, nullable=false)
//	private long id;

	@EmbeddedId
	EdiOrderDatePK pk;
	
	@Column(name="HEADER_DATE", nullable=false)
	private LocalDate dateValue;

	public EdiOrderDate() {
	}

	public EdiOrderDate(EdiOrderDatePK pk, LocalDate dt) {
		this.pk = pk;
		this.dateValue = dt;
	}
	
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}

//	public long getEdiOrderNumber() {
//		return this.ediOrderNumber;
//	}
//
//	public void setEdiOrderNumber(long ediOrderNumber) {
//		this.ediOrderNumber = ediOrderNumber;
//	}

	public EdiOrderDatePK getPk() {
		return pk;
	}

	public void setPk(EdiOrderDatePK pk) {
		this.pk = pk;
	}

	public LocalDate getDateValue() {
		return this.dateValue;
	}

	public void setDateValue(LocalDate dateValue) {
		this.dateValue = dateValue;
	}


	@Override
	public String toString() {
		return "EdiOrderDate [pk =" + pk.toString() 
				+ ", dateValue=" + dateValue + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateValue == null) ? 0 : dateValue.hashCode());
		result = prime * result + ((pk == null) ? 0 : pk.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EdiOrderDate other = (EdiOrderDate) obj;
		if (dateValue == null) {
			if (other.dateValue != null)
				return false;
		} else if (!dateValue.equals(other.dateValue))
			return false;
		if (pk == null) {
			if (other.pk != null)
				return false;
		} else if (!pk.equals(other.pk))
			return false;
		return true;
	}

	
}