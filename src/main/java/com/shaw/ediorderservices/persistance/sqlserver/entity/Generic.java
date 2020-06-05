package com.shaw.ediorderservices.persistance.sqlserver.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.shaw.ediorderservices.persistance.AuditableEntity;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@Entity @Table(schema = "CSD")
@EntityListeners(AuditingEntityListener.class)
public class Generic extends AuditableEntity implements Serializable {

	/**
	 * give extensibility to EdiOrder 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	@Column
	private String type;
	@Column
	private String value;

	@ManyToOne
	private EdiOrder ediOrder;

	public Generic() {
		// TODO Auto-generated constructor stub
	}

}
