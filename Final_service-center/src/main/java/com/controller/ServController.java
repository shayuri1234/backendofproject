package com.controller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Serv;
import com.service.ServService;


@RestController
//@RequestMapping("/api/posts")
public class ServController {
	
	@Autowired
	 ServService servservice;
	
	
	@PostMapping("/addbyservice")
	public Serv saveOrder(@RequestBody Serv or) {
		
		return servservice.saveOrder(or);
	}
	
	/*@GetMapping("/getbyservice/{service}")
	public Serv getServByService(@PathVariable Serv or) {
		
		return servservice.getServByService(or);
		
	}*/
	
	@GetMapping("/getallservby")
	public List<Serv> getAllServ() {
		// TODO Auto-generated method stub
		return servservice.getAllServ();
	}
	
	
}
