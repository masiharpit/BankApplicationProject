package com.techment.dto;


public class NomineeDto {
	
	
	private int nomineeId;
	
	private String name;
	private String govtId;
	private enum govtIdType{AdharCard , PANCard};
	
	private String phoneNo;
	private enum Relation{Father,Mother,Husband,Wife};
	
	
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
	

}
