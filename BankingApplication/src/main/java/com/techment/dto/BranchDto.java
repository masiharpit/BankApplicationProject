package com.techment.dto;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.techment.entity.Admin;

public class BranchDto {

	@Id
	private long branchId;
	private String branchName;
	private String branchCity;
	private String branchState;
	private String branchCode;
	private int branchZipCode;

	public BranchDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getBranchId() {
		return branchId;
	}



	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}



	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCity() {
		return branchCity;
	}

	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}

	public String getBranchState() {
		return branchState;
	}

	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public int getBranchZipCode() {
		return branchZipCode;
	}

	public void setBranchZipCode(int branchZipCode) {
		this.branchZipCode = branchZipCode;
	}



	public BranchDto(long branchId, String branchName, String branchCity, String branchState, String branchCode,
			int branchZipCode) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchCity = branchCity;
		this.branchState = branchState;
		this.branchCode = branchCode;
		this.branchZipCode = branchZipCode;
	}



	public BranchDto(String branchName, String branchCity, String branchState, String branchCode, int branchZipCode) {
		super();
		this.branchName = branchName;
		this.branchCity = branchCity;
		this.branchState = branchState;
		this.branchCode = branchCode;
		this.branchZipCode = branchZipCode;
	}

	
	
	 
	 
	 
	 
	 
	
	
	
}
