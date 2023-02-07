package com.cg.ritam.HomeInsurance.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.cg.ritam.HomeInsurance.entities.Agent;


@Repository
public interface IAgentRepository extends JpaRepository<Agent, Integer>{
	
//	@Query("select a from Agent a where a.user.userName=?")
//	public Agent getAgentByUsername(String username);
	
	
}
