package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.UserSignUp;
import com.service.UserSignUpService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserSignUpController {
	
	@Autowired
	UserSignUpService userservice;
	
	@PostMapping("saveuser")
	public UserSignUp saveUser(@RequestBody UserSignUp user) {
		
		return userservice.saveUser(user) ;
	}
	
	
	
	
	@GetMapping("/getby/{id}")
	public UserSignUp getUserById(@PathVariable int id) {
		
		return userservice.getUserById(id);
	}
	
	@GetMapping("/getAll")
	public List<UserSignUp> getAllUser(){
		return userservice.getAllUser();
	}
	
	
	
	public  Map<String, Boolean>deleteuser(@PathVariable int id){
		userservice.deleteUser(1);
		Map<String,Boolean> response=new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return (response);
	}

}
