package com.techment.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.techment.enum_class.GovtIdType;
import com.techment.enum_class.Relation;

public class NomineeDto {
	
	
	private int nomineeId;
	
	private String name;
	private String govtId;
	private String phoneNo;
	
	@Enumerated(EnumType.ORDINAL)
	private GovtIdType govtIdType;
	
	@Enumerated(EnumType.ORDINAL)
	private  Relation relation;
	
	
	public NomineeDto(int nomineeId, String name, String govtId, GovtIdType govtIdType, String phoneNo) {
		super();
		this.nomineeId = nomineeId;
		this.name = name;
		this.govtId = govtId;
		this.govtIdType = govtIdType;
		this.phoneNo = phoneNo;
	}


	public GovtIdType getGovtIdType() {
		return govtIdType;
	}


	public void setGovtIdType(GovtIdType govtIdType) {
		this.govtIdType = govtIdType;
	}


	public NomineeDto(int nomineeId, String name, String govtId, String phoneNo) {
		super();
		this.nomineeId = nomineeId;
		this.name = name;
		this.govtId = govtId;
		this.phoneNo = phoneNo;
	}	
	
	
	public NomineeDto() {
		super();
	}


	public int getNomineeId() {
		return nomineeId;
	}
	public void setNomineeId(int nomineeId) {
		this.nomineeId = nomineeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGovtId() {
		return govtId;
	}
	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public Relation getRelation() {
		return relation;
	}


	public void setRelation(Relation relation) {
		this.relation = relation;
	}


	public NomineeDto(int nomineeId, String name, String govtId, String phoneNo, GovtIdType govtIdType,
			Relation relation) {
		super();
		this.nomineeId = nomineeId;
		this.name = name;
		this.govtId = govtId;
		this.phoneNo = phoneNo;
		this.govtIdType = govtIdType;
		this.relation = relation;
	}


	@Override
	public String toString() {
		return "NomineeDto [nomineeId=" + nomineeId + ", name=" + name + ", govtId=" + govtId + ", phoneNo=" + phoneNo
				+ ", govtIdType=" + govtIdType + ", relation=" + relation + "]";
	}
	
	
	
	
	
	

}
