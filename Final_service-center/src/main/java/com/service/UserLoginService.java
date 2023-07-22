package com.service;

import com.model.UserLogin;

public interface UserLoginService {
	UserLogin saveLogin(UserLogin log);
	  UserLogin getLoginById(int id);
}
