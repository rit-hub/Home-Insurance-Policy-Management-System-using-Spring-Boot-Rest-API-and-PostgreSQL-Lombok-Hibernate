package com.cg.ritam.HomeInsurance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ritam.HomeInsurance.entities.Property;

@Service
public interface IPropertyService {
	public Property addProperty(Property property);

	public List<Property> viewProperty();

}
