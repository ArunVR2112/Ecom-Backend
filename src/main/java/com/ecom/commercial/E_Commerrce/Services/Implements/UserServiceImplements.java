package com.ecom.commercial.E_Commerrce.Services.Implements;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.commercial.E_Commerrce.CustomException.ResourceNotFoundExecption;
import com.ecom.commercial.E_Commerrce.Model.Roles;
import com.ecom.commercial.E_Commerrce.Model.UserInfo;
import com.ecom.commercial.E_Commerrce.Repository.RolesRepository;
import com.ecom.commercial.E_Commerrce.Repository.UserRepository;
import com.ecom.commercial.E_Commerrce.Services.UserServiceClass;
import com.ecom.commercial.quickcart.constants.QuickCartConstants;

@Service
public class UserServiceImplements implements UserServiceClass{
	
	@Autowired
	private UserRepository repo;

	
	@Autowired
	private RolesRepository rolesRepository;
	
	public UserServiceImplements(UserRepository repo) {
		super();
		this.repo = repo;
	}
	
//	Save The data of user

	@Override
	public UserInfo saveUsers(UserInfo userInfo) {
		
		Roles roles =rolesRepository.findByRoleName(QuickCartConstants.USER_ROLE);
		String passwordEncode = userInfo.getPassword();
//		add the method to convert password into endcoded or hash format and save it in table
		userInfo.setRoles(roles);
		if (roles.getRoleId()>0) {
			return repo.save(userInfo);
		}
		return repo.save(null);
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
	@Override
	public Optional<UserInfo> getUserInfoById(long id) {
        return repo.findById(id);
    }

	@Override
	public UserInfo updateUserInfo(UserInfo userInfo) {
		
		
		repo.save(userInfo);
		return null;
	}
}
