package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Serv;

public interface ServRepo  extends JpaRepository<Serv, Integer> {
	
	 
  // List findbyAdmin(Integer id);
  //  Serv findByService(Serv ser);
	Serv findByService(Serv ser);

}
