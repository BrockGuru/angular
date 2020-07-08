package com.demobank.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demobank.dto.BeneficiaryDTO;
import com.demobank.dto.BeneficiaryResponseDTO;
import com.demobank.dto.ResponseDTO;
import com.demobank.service.BeneficiaryService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/beneficiaries")
public class BankController {
	@Autowired
	private BeneficiaryService beneficiaryService;

	@PostMapping(value = "/")
	public ResponseEntity<ResponseDTO> addBeneficiary(@RequestBody BeneficiaryDTO beneficiaryDTO) {
		ResponseDTO response = beneficiaryService.addBenificiary(beneficiaryDTO);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

	}
	@GetMapping("/beneficiary/")
	public ResponseEntity<List<BeneficiaryResponseDTO>> listBeneficiary(
			@RequestParam("accountId") Long accountId) {
		List<BeneficiaryResponseDTO>response=beneficiaryService.listBeneficiary(accountId);
		return new ResponseEntity<>(response,HttpStatus.OK);

	}
	@GetMapping(path = "beneficiary/demo")
	public String print()
			 {
		
		return "hello";

	}
}
