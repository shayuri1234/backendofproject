package com.service;

import java.util.List;

//import org.springframework.stereotype.Service;


import com.model.Technician;


public interface TechService  {
	
	Technician addTechnal1(Technician tech);
	
	
	//List<Technician> addAllTechn(List<Technician> cust);
	

	
	Technician getTechnByTname(String name);

}
