package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.UserLogin;
import com.service.UserLoginService;

@RestController
@CrossOrigin(origins="http://localhost:4200")

public class UserLoginController {

	@Autowired
	UserLoginService loginservice;
	
	@PostMapping("savelogin")
	public UserLogin saveLogin(@RequestBody UserLogin log) {
		// TODO Auto-generated method stub
		return loginservice.saveLogin(log);
	}
	
	
	@GetMapping("/getbyiiid/{id}")
	public UserLogin getLoginById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return loginservice.getLoginById(id);	}
	
	}
