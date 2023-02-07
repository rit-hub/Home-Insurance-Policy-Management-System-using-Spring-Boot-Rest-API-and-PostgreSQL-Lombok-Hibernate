package com.cg.ritam.HomeInsurance.service;

import org.springframework.stereotype.Service;

import com.cg.ritam.HomeInsurance.entities.User;

@Service
public interface IUserService {
	public User addNewUser(User user);

	public User signIn(String username, String password);

}
