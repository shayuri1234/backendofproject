package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Installation;
import com.service.InstallService;

@RestController
@CrossOrigin(origins="http://localhost:4200")

public class InstallController {

	@Autowired
	InstallService installservice;
	
	@PostMapping("saveinstall")
	public Installation saveInstallation(@RequestBody Installation install) {
      return  installservice.saveInstallation(install);
      
	}
	
	@GetMapping("getinstall/{id}")
	public  Installation getInstallation(@PathVariable int id) {
		return installservice.getInstallation(id);
	}

	@GetMapping("getall")
	public  List<Installation> getInstallation(){
	return installservice.getallinstall();
	
	}
	
}
