package com.cg.ritam.HomeInsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ritam.HomeInsurance.entities.Agent;
import com.cg.ritam.HomeInsurance.exceptions.AgentNotFoundException;
import com.cg.ritam.HomeInsurance.repository.IAgentRepository;

@Service
public class AgentServiceImpl implements IAgentService{
	
	@Autowired
	private IAgentRepository iAgentRepository;

	@Override
	public Agent addAgent(Agent agent) {
		return this.iAgentRepository.save(agent);
	}

	@Override
	public Agent updateAgent(Agent agent) throws AgentNotFoundException {
		return this.iAgentRepository.save(agent);
	}

	@Override
	public Agent removeAgent(int agentId) throws AgentNotFoundException {
		Agent entity = this.iAgentRepository.findById(agentId).get();
		this.iAgentRepository.delete(entity);
		return entity;
	}

	@Override
	public Agent findAgentById(int agentId) throws AgentNotFoundException {
		
		return this.iAgentRepository.findById(agentId).get();
	}

	@Override
	public List<Agent> viewAllAgents() {
		
		return this.iAgentRepository.findAll();
	}

	

}
