package com.techment.dto;


public class BeneficiaryDto {

		private int beneficiaryId;
		private String beneficiaryName;
		private long beneficiaryAccNumber;
		private String beneficiaryIfsc;
		//private AccountType accountType ;
		public BeneficiaryDto(int beneficiaryId, String beneficiaryName, long beneficiaryAccNumber,
				String beneficiaryIfsc) {
			super();
			this.beneficiaryId = beneficiaryId;
			this.beneficiaryName = beneficiaryName;
			this.beneficiaryAccNumber = beneficiaryAccNumber;
			this.beneficiaryIfsc = beneficiaryIfsc;
		}
		public BeneficiaryDto() {
			super();
			// TODO Auto-generated constructor stub
		}
	
		public int getBeneficiaryId() {
			return beneficiaryId;
		}
		public void setBeneficiaryId(int beneficiaryId) {
			this.beneficiaryId = beneficiaryId;
		}
		public String getBeneficiaryName() {
			return beneficiaryName;
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
		
		
		
		
		
		
	}

	
	
	

