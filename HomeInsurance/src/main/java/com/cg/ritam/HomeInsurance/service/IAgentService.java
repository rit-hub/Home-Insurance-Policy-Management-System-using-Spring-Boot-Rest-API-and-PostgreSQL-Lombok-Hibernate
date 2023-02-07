package com.cg.ritam.HomeInsurance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ritam.HomeInsurance.entities.Agent;
import com.cg.ritam.HomeInsurance.exceptions.AgentNotFoundException;

@Service
public interface IAgentService {
	public Agent addAgent(Agent agent);
	public Agent updateAgent(Agent agent) throws AgentNotFoundException;

	public Agent removeAgent(int agentId) throws AgentNotFoundException;

	public Agent findAgentById(int agentId) throws AgentNotFoundException;

	public List<Agent> viewAllAgents();
	
//	public Agent findAgentByUsername(String username) throws AgentNotFoundException;

}
