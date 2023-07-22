package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Installation;

public interface InstallRepository extends JpaRepository<Installation,Integer>{
	
	Installation findById(int id);

	List<Installation> findAll(); 

}
