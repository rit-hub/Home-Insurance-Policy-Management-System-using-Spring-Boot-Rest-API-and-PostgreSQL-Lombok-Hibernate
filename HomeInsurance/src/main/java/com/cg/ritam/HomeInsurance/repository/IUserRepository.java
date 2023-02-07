package com.cg.ritam.HomeInsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ritam.HomeInsurance.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, String>{
//	public User addNewUser(User user);
//	public User signIn(User user);
//	public User signOut(User user);
//	
//	
////	--------------- custom jpa named queries----------------
//	
	public User findUserByUserIdAndPassword(int userId, String password);
	
}
