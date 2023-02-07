package com.cg.ritam.HomeInsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ritam.HomeInsurance.entities.PolicyHolder;
import com.cg.ritam.HomeInsurance.exceptions.PolicyHolderNotFoundException;

@Repository
public interface IPolicyHolderRepository extends JpaRepository<PolicyHolder, Integer>{
	
//	public PolicyHolder addPolicyHolder(PolicyHolder policyHolder);
//
//	public PolicyHolder updatePolicyHolder(PolicyHolder policyHolder) throws PolicyHolderNotFoundException;
//
//	public PolicyHolder findPolicyHolderById(int id) throws PolicyHolderNotFoundException;
//
//	public PolicyHolder removePolicyHolder(int id) throws PolicyHolderNotFoundException;
//
//	public List<PolicyHolder> showAllPolicyHolders();
//	
	
	//public  void makePayment();

}
