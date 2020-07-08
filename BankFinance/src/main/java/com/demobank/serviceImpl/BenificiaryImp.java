package com.demobank.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demobank.dto.BeneficiaryDTO;
import com.demobank.dto.BeneficiaryResponseDTO;
import com.demobank.dto.ResponseDTO;
import com.demobank.entity.Account;
import com.demobank.entity.Beneficiary;
import com.demobank.repository.AccountRepository;
import com.demobank.repository.BenificiaryRepository;
import com.demobank.service.BeneficiaryService;


@Service
public class BenificiaryImp implements BeneficiaryService{
	@Autowired
	private BenificiaryRepository repository;
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public ResponseDTO addBenificiary(BeneficiaryDTO beneficiaryDTO) {
		Optional<Account> account=accountRepository.findById(beneficiaryDTO.getAccountNo_Id());
		ResponseDTO responseDTO=new ResponseDTO();
		responseDTO.setMessage("added successfully");
		if(!account.isPresent())
		{
			System.out.println("account not found");
		}
		else {
		Beneficiary beneficiary=new Beneficiary();
		beneficiary.setBeneficiaryName(beneficiaryDTO.getBeneficiaryName());
		beneficiary.setAccount(account.get());
		beneficiary.setBeneficiaryAccountNo(beneficiaryDTO.getBeneficiaryccountNo());
		repository.save(beneficiary);
		}
		return responseDTO;
	}

	@Override
	public List<BeneficiaryResponseDTO> listBeneficiary(Long accountno) {
		List<Beneficiary>beneficiaries=repository.findAllByAccountAccountId(accountno);
		List<BeneficiaryResponseDTO>listBeneficiaryDto=beneficiaries.stream().map(beneficiary->{
			BeneficiaryResponseDTO beneficiaryResponseDTO=new BeneficiaryResponseDTO();
			beneficiaryResponseDTO.setAccountNo(beneficiary.getBeneficiaryAccountNo());
			beneficiaryResponseDTO.setBeneficiaryname(beneficiary.getBeneficiaryName());
			//BeanUtils.copyProperties(beneficiary, beneficiaryResponseDTO);
			System.out.println(beneficiaryResponseDTO.getBeneficiaryname());
			return beneficiaryResponseDTO;
			
		}).collect(Collectors.toList());
		
		return listBeneficiaryDto;
	}
	
	
	
	

}
