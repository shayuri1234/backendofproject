package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.model.Admin;

import com.service.AdminService;

//import com.service.TechService;
//import com.service.UserService;


@RestController
@CrossOrigin(origins="http://localhost:4200")

public class AdminController {
	
	@Autowired
	 AdminService adminservice;
	
	
	@PostMapping("save")
	public Admin saveAdmin(@RequestBody Admin admin) {
      return  adminservice.saveAdmin(admin);
	
    }
	
	@GetMapping("get/{id}")
	public Admin getAdminByid(@PathVariable long id) {
		return adminservice.getAdminById(id);
	}
	
	
	
	
	
}





	
	
	
	
	
	
	
	


