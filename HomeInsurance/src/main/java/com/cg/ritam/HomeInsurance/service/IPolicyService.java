package com.cg.ritam.HomeInsurance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ritam.HomeInsurance.entities.Policy;
import com.cg.ritam.HomeInsurance.exceptions.PolicyNotFoundException;

@Service
public interface IPolicyService {
	
	public Policy addPolicy(Policy policy);

	public Policy updatePolicy(Policy policy) throws PolicyNotFoundException;

	public Policy findPolicyById(int policyId) throws PolicyNotFoundException;

	public Policy removePolicy(int policyId) throws PolicyNotFoundException;

	public List<Policy> showAllPolicies();

	

}
