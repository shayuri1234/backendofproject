package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dao.TechRepo;
import com.model.Technician;


@Service
public class TechServiceImpl implements TechService{
	
	@Autowired
    TechRepo techrepo;
	
	

	

	/*@Override
	public List<Technician> addAllTechn(List<Technician> cust) {
		
		return techrepo.saveAll(cust);
	}*/

	@Override
	public Technician getTechnByTname(String name) {
		
		return techrepo.findByTname(name);
	}

	@Override
	public Technician addTechnal1(Technician tech) {
		// TODO Auto-generated method stub
		return techrepo.save(tech);
	}


	
}
