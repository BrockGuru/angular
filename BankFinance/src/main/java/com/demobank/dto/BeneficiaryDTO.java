package com.demobank.dto;

public class BeneficiaryDTO {
	private String beneficiaryName;
	private Long beneficiaryccountNo;
	private Long accountNo_Id;

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public Long getBeneficiaryccountNo() {
		return beneficiaryccountNo;
	}

	public void setBeneficiaryccountNo(Long beneficiaryccountNo) {
		this.beneficiaryccountNo = beneficiaryccountNo;
	}

	public Long getAccountNo_Id() {
		return accountNo_Id;
	}

	public void setAccountNo_Id(Long accountNo_Id) {
		this.accountNo_Id = accountNo_Id;
	}

}
