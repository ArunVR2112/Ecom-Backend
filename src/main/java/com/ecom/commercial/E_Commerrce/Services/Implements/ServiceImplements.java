package com.ecom.commercial.E_Commerrce.Services.Implements;

import org.springframework.stereotype.Service;

import com.ecom.commercial.E_Commerrce.Model.UserInfo;
import com.ecom.commercial.E_Commerrce.Repository.Repository;
import com.ecom.commercial.E_Commerrce.Services.ServiceClass;

@Service
public class ServiceImplements implements ServiceClass{
	
	private Repository repo;

	public ServiceImplements(Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public UserInfo saveUsers(UserInfo userInfo) {
		return repo.save(userInfo);
	}
	

	@Override
	public UserInfo checkLogin(String email,String password) {
		return this.repo.getUser(email, password);
	}
	

}
