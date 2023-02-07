package com.cg.ritam.HomeInsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ritam.HomeInsurance.entities.Policy;
import com.cg.ritam.HomeInsurance.service.IPolicyService;

@RestController
public class PolicyController {
	
	@Autowired
	private IPolicyService iPolicyService;
	

	@PostMapping("/policymanagement")
	public Policy addPolicy(@RequestBody Policy p) {
		return this.iPolicyService.addPolicy(p);
	}
	
	@PutMapping("/policymanagement")
	public Policy updatePolicy(@RequestBody Policy p) {
		return this.iPolicyService.updatePolicy(p);
	}
	
	@GetMapping("/policymanagement/{id}")
	public Policy findPolicyById(@PathVariable String id) {
		return this.iPolicyService.findPolicyById(Integer.parseInt(id));
	}
	
	@DeleteMapping("/policymanagement/{id}")
	public Policy removePolicy(@PathVariable String id) {
		return this.iPolicyService.removePolicy(Integer.parseInt(id));
	}
	
	@GetMapping("/policymanagement")
	public List<Policy> showAllPolicies() {
		return this.iPolicyService.showAllPolicies();
	}
	

}
