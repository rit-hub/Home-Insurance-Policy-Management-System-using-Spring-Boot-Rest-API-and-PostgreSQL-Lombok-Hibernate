package com.cg.ritam.HomeInsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cg.ritam.HomeInsurance.entities.User;
import com.cg.ritam.HomeInsurance.service.IUserService;

@RestController
public class LoginController {
	
	@Autowired
	private IUserService iUserService;
	
	@GetMapping("/login/{userId}/{password}")
	public User doLogin(@PathVariable String userId, @PathVariable String password) {
		if(iUserService.signIn(userId, password) == null) return null;
		return this.iUserService.signIn(userId, password);
	}
	
	
}
