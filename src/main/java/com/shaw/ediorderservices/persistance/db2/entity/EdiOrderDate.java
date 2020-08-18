package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.shaw.mock.builder.Mockable;


/**
 * The persistent class for the EDI_ORDER_DATE database table.
 * 
 */
@Entity
@Table(name="EDI_ORDER_DATE")
public class EdiOrderDate implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * The primary key class for the EDI_ORDER_DATE database table.
	 * 
	 */
	@Embeddable
	public static class EdiOrderDatePK implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Column(name="EDI_ORDER_NUMBER", insertable=false, updatable=false, nullable=false, precision=10)
		@Mockable(false)
		private Long legacyOrderNumber;

		@Column(name="DATE_QUALIFIER", nullable=false, length=3)
		private String qualifier;
		
		public EdiOrderDatePK() {
		}

		public EdiOrderDatePK(String qualifier, Long legacyOrderNumber) {
			this.qualifier = qualifier;
			this.legacyOrderNumber = legacyOrderNumber;
		}

		public Long getLegacyOrderNumber() {
			return legacyOrderNumber;
		}

		public void setLegacyOrderNumber(Long legacyOrderNumber) {
			this.legacyOrderNumber = legacyOrderNumber;
		}

		public String getQualifier() {
			return this.qualifier;
		}

		public void setQualifier(String qualifier) {
			this.qualifier = qualifier;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (legacyOrderNumber ^ (legacyOrderNumber >>> 32));
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
			if (legacyOrderNumber != other.legacyOrderNumber)
				return false;
			if (qualifier == null) {
				if (other.qualifier != null)
					return false;
			} else if (!qualifier.equals(other.qualifier))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "EdiOrderDatePK [ediOrderHeader=" + legacyOrderNumber + ", qualifier=" + qualifier + "]";
		}
		
		
	}

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
////	@Column(insertable=false, updatable=false, nullable=false)
//	private long id;

	@EmbeddedId
	EdiOrderDatePK id;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@MapsId("legacyOrderNumber")
//	@JoinColumn(name = "EDI_ORDER_NUMBER")
	volatile private EdiOrderHeader ediOrderHeader;
	
	@Column(name="HEADER_DATE", nullable=false)
	private LocalDate dateValue;

	public EdiOrderDate() {
		super();
	}

//	public EdiOrderDate(EdiOrderHeader hdr) {
//		this();
//		this.ediOrderHeader = hdr;
//	}

	public EdiOrderDate(EdiOrderDatePK id, LocalDate dt) {
		this.id = id;
		this.dateValue = dt;
	}
	
	public EdiOrderDatePK getId() {
		return id;
	}

	public void setId(EdiOrderDatePK id) {
		this.id = id;
	}

//	public EdiOrderHeader getEdiOrderHeader() {
//		return ediOrderHeader;
//	}
//
//	public void setEdiOrderHeader(EdiOrderHeader ediOrderHeader) {
//		this.ediOrderHeader = ediOrderHeader;
//	}

	public LocalDate getDateValue() {
		return this.dateValue;
	}

	public void setDateValue(LocalDate dateValue) {
		this.dateValue = dateValue;
	}



	@Override
	public String toString() {
		return "EdiOrderDate [id=" + id + ", dateValue=" + dateValue + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateValue == null) ? 0 : dateValue.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}