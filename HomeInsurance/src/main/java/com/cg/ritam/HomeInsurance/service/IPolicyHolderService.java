package com.cg.ritam.HomeInsurance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ritam.HomeInsurance.entities.PolicyHolder;
import com.cg.ritam.HomeInsurance.exceptions.PolicyHolderNotFoundException;

@Service
public interface IPolicyHolderService {
	public PolicyHolder addPolicyHolder(PolicyHolder policyHolder);

	public PolicyHolder updatePolicyHolder(PolicyHolder policyHolder) throws PolicyHolderNotFoundException;

	public PolicyHolder findPolicyHolderById(int id) throws PolicyHolderNotFoundException;

	public PolicyHolder removePolicyHolder(int id) throws PolicyHolderNotFoundException;

	public List<PolicyHolder> showAllPolicyHolders();
	
	//public void makePayment();
}
