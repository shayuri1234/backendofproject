package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserSignUpRepo;

import com.model.UserSignUp;

@Service
public class UserSignUpServiceImple implements UserSignUpService{

	@Autowired
	UserSignUpRepo userrepo;
	
	
	
	@Override
	public UserSignUp saveUser(UserSignUp user) {
		// TODO Auto-generated method stub
		return userrepo.save(user);
	}

	@Override
	public UserSignUp getUserById(int id) {
		// TODO Auto-generated method stub
		return userrepo.findUserById(id);
	}

	

	@Override
	public Map<String, Boolean> deleteUser(int id) {
		// TODO Auto-generated method stub
		userrepo.deleteById(id);
		Map<String,Boolean> response=new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return (response);
		
	}

	@Override
	public List<UserSignUp> getAllUser() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}

	

	

}
