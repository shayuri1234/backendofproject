package com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepos;
import com.model.Admin;


@Service
public class AdminImplement implements AdminService {
	
	@Autowired
	private AdminRepos adminrepo;
	
	

	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminrepo.save(admin);
	}



	




	@Override
	public Admin getAdminById(long id) {
		// TODO Auto-generated method stub
		return adminrepo.findById(id);
	}






}
