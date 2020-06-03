package com.shaw.ediorderservices.persistance.db2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
public class SamplesInfo {
//    ,SMP.STYLE_NBR              AS SAMPLES_STYLE_NBR
//    ,SMP.COLOR_NBR				AS SAMPLES_COLOR_NBR
//    ,SMP.SUBSET
//    ,SMP.PACK_TYPE
//    ,SMP.CARTON_QTY
//    ,SMP.DEL_VEH_NBR
//    ,SMP.SEQUENCE_NBR  AS SAMPLES_SEQ_NBR
//    ,COALESCE(DV.DESCRIPTION,'') AS DEL_VEH_NAME
//    ,COALESCE(SC.PRODUCT_ID,' ') AS INV_STYLE_NBR
//    ,COALESCE(SC.INV_COLOR_NBR,' ') AS INV_COLOR_NBR
//    ,COALESCE(SMP.ITEM_NBR,'')  AS PART_NBR
//    ,COALESCE(SMP2.ITEM_NBR,SMP.ITEM_NBR,'') AS INV_PART_NBR

	@Id
	private String samplesStyleNbr;
	@Column
	private String samplesColorNbr;
	@Column
	private String subset;
	@Column
	private String packType;
	@Column
	private Integer cartonQty;
	@Column
	private String delVehNbr;
	@Column
	private String samplesSeqNbr;
	@Column
	private String delVehName;
	@Column
	private String invStyleNbr;
	@Column
	private String invColorNbr;
	@Column
	private String partNbr;
	@Column
	private String invPartNbr;
	
	
	public SamplesInfo() {
		super();
	}
	
	
	public String getSamplesStyleNbr() {
		return samplesStyleNbr;
	}
	public void setSamplesStyleNbr(String samplesStyleNbr) {
		this.samplesStyleNbr = samplesStyleNbr;
	}
	public String getSamplesColorNbr() {
		return samplesColorNbr;
	}
	public void setSamplesColorNbr(String samplesColorNbr) {
		this.samplesColorNbr = samplesColorNbr;
	}
	public String getSubset() {
		return subset;
	}
	public void setSubset(String subset) {
		this.subset = subset;
	}
	public String getPackType() {
		return packType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}
	public double getCartonQty() {
		return cartonQty;
	}
	public void setCartonQty(Integer cartonQty) {
		this.cartonQty = cartonQty;
	}
	public String getDelVehNbr() {
		return delVehNbr;
	}
	public void setDelVehNbr(String delVehNbr) {
		this.delVehNbr = delVehNbr;
	}
	public String getSamplesSeqNbr() {
		return samplesSeqNbr;
	}
	public void setSamplesSeqNbr(String samplesSeqNbr) {
		this.samplesSeqNbr = samplesSeqNbr;
	}
	public String getDelVehName() {
		return delVehName;
	}
	public void setDelVehName(String delVehName) {
		this.delVehName = delVehName;
	}
	public String getInvStyleNbr() {
		return invStyleNbr;
	}
	public void setInvStyleNbr(String invStyleNbr) {
		this.invStyleNbr = invStyleNbr;
	}
	public String getInvColorNbr() {
		return invColorNbr;
	}
	public void setInvColorNbr(String invColorNbr) {
		this.invColorNbr = invColorNbr;
	}
	public String getPartNbr() {
		return partNbr;
	}
	public void setPartNbr(String partNbr) {
		this.partNbr = partNbr;
	}
	public String getInvPartNbr() {
		return invPartNbr;
	}
	public void setInvPartNbr(String invPartNbr) {
		this.invPartNbr = invPartNbr;
	}
	
	
}
