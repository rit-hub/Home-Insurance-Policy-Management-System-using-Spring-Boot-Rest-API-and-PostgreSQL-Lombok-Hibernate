package com.cg.ritam.HomeInsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ritam.HomeInsurance.entities.Policy;
import com.cg.ritam.HomeInsurance.exceptions.PolicyNotFoundException;

@Repository
public interface IPolicyRepository  extends JpaRepository<Policy, String>{
//	public Policy addPolicy(Policy policy);
//
//	public Policy updatePolicy(Policy policy) throws PolicyNotFoundException;
//
//	public Policy findPolicyById(int policyId) throws PolicyNotFoundException;
//
//	public Policy removePolicy(int policyId) throws PolicyNotFoundException;
//
//	public List<Policy> showAllPolicies();

}
