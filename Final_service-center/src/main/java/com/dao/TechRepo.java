package com.dao;


import com.model.Technician;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechRepo extends JpaRepository<Technician, Integer> {
	
	Technician findByTemail(String e);
	
	Technician findByTname(String name);


	
     
}
