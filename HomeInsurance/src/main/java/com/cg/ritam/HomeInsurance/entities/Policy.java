package com.cg.ritam.HomeInsurance.entities;

import java.util.Objects;

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
@Table(name = "policy")
public class Policy {
	@Id
	@Column(name = "policy_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policyId;
	
	@Column(name = "policy_effective_date")
	private String policyEffectiveDate;
	
	@Column(name = "policy_end_date")
	private String policyEndDate;
	
	@Column(name = "policy_term")
	private int policyTerm;
	
	@Column(name = "policy_status")
	private String policyStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "quote_id")
	private Quote quoteId;
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Policy) 
//			return (this.policyId == ((Policy) obj).policyId);
//		return false;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(policyId);
//	}


	
	
	
}
