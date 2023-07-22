package com.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserLoginRepo;
import com.model.UserLogin;

@Service
public class UserLoginServImple  implements UserLoginService {

	 @Autowired
	 UserLoginRepo loginrepo;

	@Override
	public UserLogin saveLogin(UserLogin log) {
		// TODO Auto-generated method stub
		return loginrepo.save(log);
	}

	@Override
	public UserLogin getLoginById(int id) {
		// TODO Auto-generated method stub
		return loginrepo.findById(id).orElse(null);
	}

	}
