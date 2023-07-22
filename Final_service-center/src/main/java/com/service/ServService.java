package com.service;

import java.util.List;

import com.model.Serv;

public interface ServService  {
	
	
	Serv saveOrder(Serv or);
	
	//Serv getServByService(Serv orr);
	
	List<Serv>  getAllServ();

	//Serv getServByid(Serv serv);
	
	

}
