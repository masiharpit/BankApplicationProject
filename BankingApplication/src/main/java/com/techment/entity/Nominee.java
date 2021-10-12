package com.techment.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.techment.enum_class.GovtIdType;
import com.techment.enum_class.Relation;

@Entity
@Table(name="nominee")
public class Nominee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int nomineeId;
	private String name;
	private String govtId;
    private String phoneNo;
	
	@Enumerated(EnumType.ORDINAL)
	private Relation relation;
	
	@Enumerated(EnumType.ORDINAL)
	private GovtIdType govtIdType;
	
    
	public Nominee() {
		super();
	}

	public Nominee(int nomineeId, String name, String govtId, String phoneNo) {
		super();
		this.nomineeId = nomineeId;
		this.name = name;
		this.govtId = govtId;
		this.phoneNo = phoneNo;
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

	public GovtIdType getGovtIdType() {
		return govtIdType;
	}

	public void setGovtIdType(GovtIdType govtIdType) {
		this.govtIdType = govtIdType;
	}
		


	public Relation getRelation() {
		return relation;
	}

	public void setRelation(Relation relation) {
		this.relation = relation;
	}

	public Nominee(int nomineeId, String name, String govtId, String phoneNo, Relation relation,
			GovtIdType govtIdType) {
		super();
		this.nomineeId = nomineeId;
		this.name = name;
		this.govtId = govtId;
		this.phoneNo = phoneNo;
		this.relation = relation;
		this.govtIdType = govtIdType;
	}
	
	

}
