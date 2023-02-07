package com.cg.ritam.HomeInsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ritam.HomeInsurance.entities.Property;
import com.cg.ritam.HomeInsurance.repository.IPropertyRepository;

@Service
public class PropertyServiceImpl implements IPropertyService {
	
	@Autowired
	IPropertyRepository iPropertyRepository;
	
	@Override
	public Property addProperty(Property property) {
		
		return this.iPropertyRepository.save(property);
	}
	

	@Override
	public List<Property> viewProperty() {
		return this.iPropertyRepository.findAll();
	}

}
