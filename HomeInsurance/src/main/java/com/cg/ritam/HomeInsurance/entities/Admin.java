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
@Table(name = "admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")
	private int adminId;
	
	@Column(name = "admin_name")
	private String adminName;
	
	private String contact;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_name")
	private User user;
}

	
