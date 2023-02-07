package com.cg.ritam.HomeInsurance.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "property")
public class Property {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "property_id")
	private int propertyId;
	
	@Column(name = "market_value")
	private int marketValue;
	
	@Column(name = "year_built")
	private int yearBuilt;
	
	@Column(name = "square_footage")
	private int squareFootage;
	
	@Column(name = "dwelling_style")
	private double dwellingStyle;
	
	@Column(name = "roof_material")
	private String roofMaterial ;
	
	@Column(name = "garage_type")
	private String garageType;
	
	@Column(name = "full_batch_count")
	private int fullBathCount;
	
	@Column(name = "half_batch_count")
	private int halfBathCount;
	
	@Column(name = "has_swimming_pool")
	private boolean hasSwimmingPool;
}
