package com.cg.ritam.HomeInsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ritam.HomeInsurance.entities.PolicyHolder;
import com.cg.ritam.HomeInsurance.exceptions.PolicyHolderNotFoundException;
import com.cg.ritam.HomeInsurance.repository.IPolicyHolderRepository;

@Service
public class PolicyHolderServiceImpl implements IPolicyHolderService{
	
	@Autowired
	IPolicyHolderRepository iPolicyHolderRepository;

	@Override
	public PolicyHolder addPolicyHolder(PolicyHolder policyHolder) {
		return this.iPolicyHolderRepository.save(policyHolder);
	}

	@Override
	public PolicyHolder updatePolicyHolder(PolicyHolder policyHolder) throws PolicyHolderNotFoundException {
		
		return this.iPolicyHolderRepository.save(policyHolder);
	}

	@Override
	public PolicyHolder findPolicyHolderById(int id) throws PolicyHolderNotFoundException {
		
		return this.iPolicyHolderRepository.findById(id).get();
	}

	@Override
	public PolicyHolder removePolicyHolder(int id) throws PolicyHolderNotFoundException {
		PolicyHolder entity = this.iPolicyHolderRepository.findById(id).get();
		this.iPolicyHolderRepository.delete(entity);
		return entity;
	}

	@Override
	public List<PolicyHolder> showAllPolicyHolders() {
		
		return this.iPolicyHolderRepository.findAll();
	}

}
