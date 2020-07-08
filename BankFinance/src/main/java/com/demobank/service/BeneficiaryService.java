package com.demobank.service;

import java.util.List;

import com.demobank.dto.BeneficiaryDTO;
import com.demobank.dto.BeneficiaryResponseDTO;
import com.demobank.dto.ResponseDTO;

public interface BeneficiaryService {
	ResponseDTO addBenificiary(BeneficiaryDTO beneficiaryDTO);

	List<BeneficiaryResponseDTO> listBeneficiary(Long accountno);

}
