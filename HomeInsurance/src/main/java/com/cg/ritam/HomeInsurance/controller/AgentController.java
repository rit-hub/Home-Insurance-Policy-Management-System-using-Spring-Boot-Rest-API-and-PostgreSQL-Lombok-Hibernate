package com.cg.ritam.HomeInsurance.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ritam.HomeInsurance.entities.Agent;
import com.cg.ritam.HomeInsurance.entities.Policy;
import com.cg.ritam.HomeInsurance.entities.PolicyHolder;
import com.cg.ritam.HomeInsurance.entities.Property;
import com.cg.ritam.HomeInsurance.entities.Quote;
import com.cg.ritam.HomeInsurance.entities.User;
import com.cg.ritam.HomeInsurance.service.IAgentService;
import com.cg.ritam.HomeInsurance.service.IUserService;


@RestController
public class AgentController {
	@Autowired
	private IAgentService iAgentService;
	@Autowired
	private IUserService iUserService;
	
	@GetMapping("/agent/{username}/{password}/policies")
	public List<Policy> viewAllpolicies(@PathVariable String username, @PathVariable String password){
		User u = this.iUserService.signIn(username, password);
		if(u==null) return null;
		else if(u.getRole().equalsIgnoreCase("agent")) {
			for(Agent a : this.iAgentService.viewAllAgents()) {
				if(a.getUser().getUserId() == Integer.parseInt(username)) {
					return a.getPolicies();
				}
			}
		}
		return null;
	}
	
	@GetMapping("/agent/{username}/{password}/policyholders")
	public List<PolicyHolder> viewAllpolicyHolders(@PathVariable String username, @PathVariable String password){
		User u = this.iUserService.signIn(username, password);
		if(u==null) return null;
		else if(u.getRole().equalsIgnoreCase("agent")) {
			for(Agent a : this.iAgentService.viewAllAgents()) {
				if(a.getUser().getUserId() == Integer.parseInt(username)) {
					return a.getPolicyHoldersList();
				}
			}
		}
		return null;
	}
	
	@GetMapping("/agent/{username}/{password}/properties")
	public List<Property> viewProperties(@PathVariable String username, @PathVariable String password){
		List<Property> properties = new ArrayList<>();
		User u = this.iUserService.signIn(username, password);
		if(u==null) return null;
		else if(u.getRole().equalsIgnoreCase("agent")) {
			for(Agent a : this.iAgentService.viewAllAgents()) {
				if(a.getUser().getUserId() == Integer.parseInt(username)) {
					for(Policy p: a.getPolicies()) {
						properties.add(p.getQuoteId().getProperty());
					}
					return properties;
				}
			}
		}
		return null;
	}
	
	
	// view qoutes
	@GetMapping("/agent/{username}/{password}/quotes")
	public List<Quote> viewQuotes(@PathVariable String username, @PathVariable String password) {
		List<Quote> quotes = new ArrayList<>();
		User u = this.iUserService.signIn(username, password);
		if(u==null) return null;
		else if(u.getRole().equalsIgnoreCase("agent")) {
			for(Agent a : this.iAgentService.viewAllAgents()) {
				if(a.getUser().getUserId() == Integer.parseInt(username)) {
					for(Policy p: a.getPolicies()) {
						quotes.add(p.getQuoteId());
					}
					return quotes;
				}
			}
		}
		return null;
	}
	
	
//	public Quote updateQuote() {
//		return null;
//	}
	
	
	
	
	
}
