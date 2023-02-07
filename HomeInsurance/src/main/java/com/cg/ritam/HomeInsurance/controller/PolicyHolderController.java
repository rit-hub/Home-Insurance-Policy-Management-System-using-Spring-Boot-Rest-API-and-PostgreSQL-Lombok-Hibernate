package com.cg.ritam.HomeInsurance.controller;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ritam.HomeInsurance.entities.Policy;
import com.cg.ritam.HomeInsurance.entities.PolicyHolder;
import com.cg.ritam.HomeInsurance.entities.User;
import com.cg.ritam.HomeInsurance.service.IPolicyHolderService;
import com.cg.ritam.HomeInsurance.service.IUserService;

@RestController
public class PolicyHolderController {
	@Autowired
	private IPolicyHolderService iPolicyHolderService;
	
	@Autowired
	private IUserService iUserService;
	
	
	@GetMapping("/customer/{username}/{password}/policies")
	public List<Policy> viewPolicies(@PathVariable String username, @PathVariable String password){
		User u = this.iUserService.signIn(username, password);
		if(u==null) return null;
		else if(u.getRole().equalsIgnoreCase("customer")) {
			for(PolicyHolder ph : this.iPolicyHolderService.showAllPolicyHolders()) {
				if(ph.getUser().getUserId() == Integer.parseInt(username)) {
					return ph.getPolicies();
				}
			}
		}
		return null;
		
		
	}
	@GetMapping("/customer/{username}/{password}/profile")
	public PolicyHolder viewPersonalDetails(@PathVariable String username, @PathVariable String password) {
		
		User u = this.iUserService.signIn(username, password);
		if(u==null) return null;
		else if(u.getRole().equalsIgnoreCase("customer")) {
			for(PolicyHolder ph : this.iPolicyHolderService.showAllPolicyHolders()) {
				if(ph.getUser().getUserId() == Integer.parseInt(username)) {
					return ph;
				}
			}
		}
		return null;
	}
	

	// make payment method
	
	

}
