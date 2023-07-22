package com.dao;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.model.UserSignUp;

public interface UserSignUpRepo extends  JpaRepository<UserSignUp, Integer> {

	UserSignUp findUserById(int id);

	

	
	

}
