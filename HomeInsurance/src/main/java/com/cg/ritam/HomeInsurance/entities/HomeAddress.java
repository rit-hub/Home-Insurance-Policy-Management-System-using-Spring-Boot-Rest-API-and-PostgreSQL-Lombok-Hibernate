package com.cg.ritam.HomeInsurance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "home_address")
public class HomeAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "home_id")
	private int homeId;
	
	@Column(name = "residence_type")
	private String residenceType;
	
	@Column(name = "address_line_1")
	private String addressLine1;
	
	@Column(name = "address_line_2")
	private String addressLine2;
	
	private String city;
	private String state;
	private String zip;
	
	@Column(name = "residence_use")
	private String residenceUse;
	
	
	
}
