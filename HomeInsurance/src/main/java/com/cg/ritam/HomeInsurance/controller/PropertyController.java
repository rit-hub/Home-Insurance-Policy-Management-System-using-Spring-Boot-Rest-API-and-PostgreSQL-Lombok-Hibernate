package com.cg.ritam.HomeInsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ritam.HomeInsurance.entities.Property;

import com.cg.ritam.HomeInsurance.service.IPropertyService;

@RestController
public class PropertyController {
	
	@Autowired
	private IPropertyService iPropertyService;
	
	
	@PostMapping("/propertymanagement")
	public Property addProperty(@RequestBody Property p) {
		return this.iPropertyService.addProperty(p);
	}
	
	
	@GetMapping("/propertymanagement")
	public List<Property> showAllProperties() {
		return this.iPropertyService.viewProperty();
	}

}
