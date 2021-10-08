package com.techment.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "beneficiary5")

public class Beneficiary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int beneficiaryId;
	private String beneficiaryName;
	private long beneficiaryAccNumber;
	private String beneficiaryIfsc;
//	private AccountType accountType ;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "accountId")
	private Account account;

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public int getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public long getBeneficiaryAccNumber() {
		return beneficiaryAccNumber;
	}

	public void setBeneficiaryAccNumber(long beneficiaryAccNumber) {
		this.beneficiaryAccNumber = beneficiaryAccNumber;
	}

	public String getBeneficiaryIfsc() {
		return beneficiaryIfsc;
	}

	public void setBeneficiaryIfsc(String beneficiaryIfsc) {
		this.beneficiaryIfsc = beneficiaryIfsc;
	}

	public Beneficiary(int beneficiaryId, String beneficiaryName, long beneficiaryAccNumber, String beneficiaryIfsc) {
		super();
		this.beneficiaryId = beneficiaryId;
		this.beneficiaryName = beneficiaryName;
		this.beneficiaryAccNumber = beneficiaryAccNumber;
		this.beneficiaryIfsc = beneficiaryIfsc;
	}

	public Beneficiary() {
		super();
		// TODO Auto-generated constructor stub
	}

}
