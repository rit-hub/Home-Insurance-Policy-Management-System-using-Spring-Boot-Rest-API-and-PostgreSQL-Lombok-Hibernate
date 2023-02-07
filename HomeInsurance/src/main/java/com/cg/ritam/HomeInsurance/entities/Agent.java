package com.cg.ritam.HomeInsurance.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "agent")
public class Agent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "agent_id")
	private int agentId;
	
	@Column(name = "agent_name")
	private String agentName;
	
	private String designation;
	private String salary; 
	private String address;
	private String email;
	
	@Column(name = "mobile")
	private String mobileNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "agent_id_fk", referencedColumnName = "agent_id")
	private List<PolicyHolder> policyHoldersList = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "agent_id_fk", referencedColumnName = "agent_id")
	private List<Policy> policies = new ArrayList<>();
}
