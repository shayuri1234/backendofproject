package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.InstallRepository;
import com.model.Installation;

@Service
public class InstallServiceImple implements InstallService{
	
	@Autowired
	InstallRepository installrepo;

	@Override
	public Installation saveInstallation(Installation install) {
		// TODO Auto-generated method stub
		return installrepo.save(install);
	}

	@Override
	public Installation getInstallation(int id) {
		// TODO Auto-generated method stub
		return installrepo.findById(id);
	}

	@Override
	public List<Installation> getallinstall() {
		// TODO Auto-generated method stub
		return installrepo.findAll();
	}

}
