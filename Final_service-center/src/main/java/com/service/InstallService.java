package com.service;

import java.util.List;

import com.model.Installation;

public interface InstallService {

	Installation saveInstallation(Installation install);
	Installation getInstallation(int id);
	List<Installation> getallinstall();

}
