package com.cg.ritam.HomeInsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ritam.HomeInsurance.entities.Policy;
import com.cg.ritam.HomeInsurance.exceptions.PolicyNotFoundException;
import com.cg.ritam.HomeInsurance.repository.IPolicyRepository;


@Service
public class PolicyServiceImpl implements IPolicyService{
	
	@Autowired
	IPolicyRepository iPolicyRepository;
	
	@Override
	public Policy addPolicy(Policy policy) {
		return this.iPolicyRepository.save(policy);
	}

	@Override
	public Policy updatePolicy(Policy policy) throws PolicyNotFoundException {
		
		return this.iPolicyRepository.save(policy);
	}

	@Override
	public Policy findPolicyById(int policyId) throws PolicyNotFoundException {
		return this.iPolicyRepository.findById(String.valueOf(policyId)).get();
	}
	
	@Override
	public Policy removePolicy(int policyId) throws PolicyNotFoundException {
		Policy entity = this.iPolicyRepository.findById(String.valueOf(policyId)).get();
		this.iPolicyRepository.delete(entity);
		return entity;
	}

	@Override
	public List<Policy> showAllPolicies() {
		return this.iPolicyRepository.findAll();
	}

}
