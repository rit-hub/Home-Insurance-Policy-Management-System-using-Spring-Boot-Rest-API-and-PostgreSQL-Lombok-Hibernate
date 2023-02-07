package com.cg.ritam.HomeInsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ritam.HomeInsurance.entities.Property;

@Repository
public interface IPropertyRepository extends JpaRepository<Property, Integer>{
//	public Property addProperty(Property property);
//
//	public Property viewProperty();
}
