package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dao.ServRepo;

import com.model.Serv;

@Service
public class ServServiceImpl implements ServService{
	
	@Autowired
	 private ServRepo servrepo;
	
	
	@Override
	public Serv saveOrder(Serv or) {
		// TODO Auto-generated method stub
		return servrepo.save(or);
	}

	/*@Override
	public Serv getServByService(Serv orr) {
		
		return servrepo.findByService(orr);
	*/

	@Override
	public List<Serv> getAllServ() {
		// TODO Auto-generated method stub
		return servrepo.findAll();
	}

	/*@Override
	public Serv getServByid(Serv serv) {
		// TODO Auto-generated method stub
		return servrepo.findById(serv);
	}*/

	
}
