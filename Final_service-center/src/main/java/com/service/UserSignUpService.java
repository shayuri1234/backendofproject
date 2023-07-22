package com.service;

import java.util.List;
import java.util.Map;



import com.model.UserSignUp;



public interface UserSignUpService {
	
    //User adduseral1(User user);
	
	
	
	

	
	//User getUserByTname(String name);

	
	
	UserSignUp saveUser(UserSignUp user);
	UserSignUp getUserById(int id);
    Map<String, Boolean> deleteUser(int id);
	//List<User> getAllUser();
	
	List<UserSignUp> getAllUser();
	
	
}
