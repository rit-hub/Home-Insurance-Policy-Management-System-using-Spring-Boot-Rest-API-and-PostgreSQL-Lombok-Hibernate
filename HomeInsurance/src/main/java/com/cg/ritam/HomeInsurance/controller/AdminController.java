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

import com.cg.ritam.HomeInsurance.entities.Agent;
import com.cg.ritam.HomeInsurance.entities.Policy;
import com.cg.ritam.HomeInsurance.entities.PolicyHolder;
import com.cg.ritam.HomeInsurance.service.IAgentService;
import com.cg.ritam.HomeInsurance.service.IPolicyHolderService;
import com.cg.ritam.HomeInsurance.service.IPolicyService;


@RestController
public class AdminController {
	@Autowired
	private IAgentService iAgentService;
	@Autowired
	private IPolicyService iPolicyService;
	@Autowired
	private IPolicyHolderService iPolicyHolderService;
	
	//15
	
//	-------------------------- Policy Management -------------------------------------
	
	@PostMapping("/admin/policymanagement")
	public Policy addPolicy(@RequestBody Policy p) {
		return this.iPolicyService.addPolicy(p);
	}
	
	@PutMapping("/admin/policymanagement")
	public Policy updatePolicy(@RequestBody Policy p) {
		return this.iPolicyService.updatePolicy(p);
	}
	
	@GetMapping("/admin/policymanagement/{id}")
	public Policy findPolicyById(@PathVariable String id) {
		return this.iPolicyService.findPolicyById(Integer.parseInt(id));
	}
	
	@DeleteMapping("/admin/policymanagement/{id}")
	public Policy removePolicy(@PathVariable String id) {
		return this.iPolicyService.removePolicy(Integer.parseInt(id));
	}
	
	@GetMapping("/admin/policymanagement")
	public List<Policy> showAllPolicies() {
		return this.iPolicyService.showAllPolicies();
	}
	
	
	
	
//	-------------------------- Agent Management -------------------------------------
	
	

	
	@PostMapping("/admin/agentmanagement")
	public Agent addAgent(@RequestBody Agent a) {
		return this.iAgentService.addAgent(a);
	}
	
	@PutMapping("/admin/agentmanagement")
	public Agent updateAgent(@RequestBody Agent a) {
		return this.iAgentService.updateAgent(a);
	}
	
	@GetMapping("/admin/agentmanagement/{id}")
	public Agent findAgentById(@PathVariable String id) {	
		return this.iAgentService.findAgentById(Integer.parseInt(id));
	}
		
	
	
	@DeleteMapping("/admin/agentmanagement/{id}")
	public Agent removeAgent(@PathVariable String id) {
		return this.iAgentService.removeAgent(Integer.parseInt(id));
	}
	
	@GetMapping("/admin/agentmanagement")
	public List<Agent> showAllAgents() {
		return iAgentService.viewAllAgents();
	}
	
	
//	--------------------------   Policy Holder Management -------------------------------------
	
	@PostMapping("/admin/policyholdermanagement")
	public PolicyHolder addPHolder(@RequestBody PolicyHolder ph) {
		return this.iPolicyHolderService.addPolicyHolder(ph);
	}
	
	@PutMapping("/admin/policyholdermanagement")
	public PolicyHolder updatePolicyHolder(@RequestBody PolicyHolder ph) {
		return this.iPolicyHolderService.updatePolicyHolder(ph);
	}
	
	@GetMapping("/admin/policyholdermanagement/{id}")
	public PolicyHolder findPolicyHolderById(@PathVariable String id) {
		return this.iPolicyHolderService.findPolicyHolderById(Integer.parseInt(id));
	}
	
	@DeleteMapping("/admin/policyholdermanagement/{id}")
	public PolicyHolder removePolicyHolder(@PathVariable String id) {
		return this.iPolicyHolderService.removePolicyHolder(Integer.parseInt(id));
	}
	
	@GetMapping("/admin/policyholdermanagement")
	public List<PolicyHolder> showAllPolicyHolders() {
		return this.iPolicyHolderService.showAllPolicyHolders();
	}
	
}
