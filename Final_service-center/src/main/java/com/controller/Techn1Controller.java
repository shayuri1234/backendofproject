package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Technician;
import com.service.TechService;


@RestController
public class Techn1Controller {
	
	@Autowired
	TechService technservice;
	
	
	@PostMapping("/add")
	public Technician addTechnall(@RequestBody Technician tech) {
		return technservice.addTechnal1(tech);
	}
	
	/*@PostMapping("/addAll")
	public List<Technician> addAllTechn(@RequestBody List<Technician> cust){
		return technservice.addAllTechn(cust);
	}*/

	
	@GetMapping("/getbyname/{tname}")
	public Technician getTechnByTname(@PathVariable("tname") String name) {
		
		return technservice.getTechnByTname(name);
	}
	
	
	

}
