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
@Table(name = "policy_holder")
public class PolicyHolder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "policy_holder_id")
	private int policyHolderId;
	
	@Column(name = "policy_holder_name")
	private String policyHolderName;
	
	@Column(name = "policy_name")
	private String policyName;
	
	@Column(name = "premium_type")
	private String premiumType;
	
	@Column(name = "creditcard")
	private String creditCard;
	
	private String dob;
	private String occupation;
	
	@Column(name = "annual_income")
	private double annualIncome;
	
	@Column(name = "retire_status")
	private String isRetired;
	
	private String ssn;
	
	@Column(name = "email")
	private String emailId;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private HomeAddress address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "p_holder_id_fk", referencedColumnName = "policy_holder_id")
	private List<Policy> policies = new ArrayList<>();
	
	

	
	
	
	
}
