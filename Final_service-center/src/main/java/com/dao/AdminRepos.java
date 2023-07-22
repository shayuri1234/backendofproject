package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.model.Admin;


public interface AdminRepos extends JpaRepository<Admin, Long>  {


	//Admin updateAdmin(Admin admin);

	Admin findById(long id);

//	Admin deleteAdmin(int id);

	
   
	
	
	

}
