package com.ecom.commercial.E_Commerrce.Services.Implements;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecom.commercial.E_Commerrce.CustomException.ResourceNotFoundExecption;
import com.ecom.commercial.E_Commerrce.Model.UserInfo;
import com.ecom.commercial.E_Commerrce.Repository.UserRepository;
import com.ecom.commercial.E_Commerrce.Services.UserServiceClass;

@Service
public class UserServiceImplements implements UserServiceClass{
	
	private UserRepository repo;

	public UserServiceImplements(UserRepository repo) {
		super();
		this.repo = repo;
	}
	
//	Save The data of user

	@Override
	public UserInfo saveUsers(UserInfo userInfo) {
		return repo.save(userInfo);
	}
	
	
//	Login Validation using email and [password

	@Override
	public UserInfo checkLogin(String email,String password) {
		return this.repo.getUser(email, password);
	}
	
//	Get User Details By Id

	@Override
	public UserInfo getUser(long id) {
		// TODO Auto-generated method stubs
		Optional<UserInfo> userOpentional= repo.findById(id);
		if (userOpentional.isPresent()) {
			return userOpentional.get();
		} else {
			 throw new ResourceNotFoundExecption("User Not Found", "Id", id);
		}

	}

//	Delete User Permantely
	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		
	}
	

}
