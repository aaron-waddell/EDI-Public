package com.shaw.ediorderservices.persistance.sqlserver.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.shaw.ediorderservices.persistance.AuditableEntity;


@Entity @Table(schema = "CSD")
@EntityListeners(AuditingEntityListener.class)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class EdiLine extends AuditableEntity implements Serializable, IEdiLine {

	private static final long serialVersionUID = 1L;

	public EdiLine() {
		// TODO Auto-generated constructor stub
	}

	public EdiLine(String orderType) {
		lineType = orderType;
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

//	@Transient
//	private String type = ""; //for gson factory method
//
	@Column
	private String lineType;
	
	@Column
	private int lineNbr;
	
	@Column(length=5)
	private String style;
	
	@Column(length=5)
	private String color;
	
	@Column(length=3)
	private String ref;

	@Column
	private LocalDate shipDate;

	@Column
	private LocalDate custReqShipDate;

	@ManyToOne(fetch = FetchType.LAZY)
	private volatile EdiOrder ediOrder; //exclude from json

	@OneToMany(mappedBy = "ediLine")
	private List<EdiValidation> validations;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLineType() {
		return lineType;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
//		this.type = lineType; //gson factory
	}

	public int getLineNbr() {
		return lineNbr;
	}

	public void setLineNbr(int lineNbr) {
		this.lineNbr = lineNbr;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public LocalDate getShipDate() {
		return shipDate;
	}

	public void setShipDate(LocalDate shipDate) {
		this.shipDate = shipDate;
	}

	public LocalDate getCustReqShipDate() {
		return custReqShipDate;
	}

	public void setCustReqShipDate(LocalDate custReqShipDate) {
		this.custReqShipDate = custReqShipDate;
	}

	public List<EdiValidation> getValidations() {
		return validations;
	}

	public void setValidations(List<EdiValidation> validations) {
		validations.forEach(this::addValidation);
	}

	public void addValidation(EdiValidation validation) {
		if (validations==null)
			validations = new ArrayList<EdiValidation>();
		validations.add(validation);
		validation.setEdiLine(this);
	}

	public void removeValidation(EdiValidation validation) {
		validations.remove(validation);
		validation.setEdiLine(null);
	}

	public EdiOrder getEdiOrder() {
		return ediOrder;
	}

	public void setEdiOrder(EdiOrder ediOrder) {
		this.ediOrder = ediOrder;
	}

}
