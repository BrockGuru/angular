package com.demobank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Beneficiary")
public class Beneficiary {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long benefiaryId;
	private String beneficiaryName;
	private Long beneficiaryAccountNo;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Account account;
	
	public Long getBenefiaryId() {
		return benefiaryId;
	}
	public void setBenefiaryId(Long benefiaryId) {
		this.benefiaryId = benefiaryId;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public Long getBeneficiaryAccountNo() {
		return beneficiaryAccountNo;
	}
	public void setBeneficiaryAccountNo(Long beneficiaryAccountNo) {
		this.beneficiaryAccountNo = beneficiaryAccountNo;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	private Beneficiary(String beneficiaryName, Long beneficiaryAccountNo, Account account, Long accountNo) {
	
		this.beneficiaryName = beneficiaryName;
		this.beneficiaryAccountNo = beneficiaryAccountNo;
		this.account = account;
	
	}
	public Beneficiary() {
		
	}
	@Override
	public String toString() {
		return "Beneficiary [benefiaryId=" + benefiaryId + ", beneficiaryName=" + beneficiaryName
				+ ", beneficiaryAccountNo=" + beneficiaryAccountNo + ", account=" + account + "]";
	}
	

}
