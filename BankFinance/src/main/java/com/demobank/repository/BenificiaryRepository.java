package com.demobank.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demobank.entity.Beneficiary;

@Repository
public interface BenificiaryRepository extends JpaRepository<Beneficiary,Long> {
	List<Beneficiary> findAllByAccountAccountId(Long accountId);

}
