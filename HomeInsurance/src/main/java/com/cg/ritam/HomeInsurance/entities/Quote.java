package com.cg.ritam.HomeInsurance.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "qoute")
public class Quote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "qoute_id")
	private int quoteId;
	
	@Column(name = "premium_type")
	private String premiumType;
	
	@Column(name = "premium")
	private double premium;
	
	@Column(name = "dwelling_coverage")
	private double dwellingCoverage;
	
	@Column(name = "detached_structure_coverage")
	private double detachedStructureCoverage;
	
	@Column(name = "personal_property_coverage")
	private double personalPropertyCoverage;
	
	@Column(name = "additional_living_expense")
	private double additionalLivingExpense;
	
	@Column(name = "medical_expense")
	private double medicalExpense;
	
	@Column(name = "deductible_amount")
	private double deductibleAmount;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="property_id")
	private Property property;
}
