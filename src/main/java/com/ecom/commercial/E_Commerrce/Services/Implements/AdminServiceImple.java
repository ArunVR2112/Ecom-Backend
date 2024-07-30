package com.ecom.commercial.E_Commerrce.Services.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecom.commercial.E_Commerrce.Model.Admin;
import com.ecom.commercial.E_Commerrce.Model.UserInfo;
import com.ecom.commercial.E_Commerrce.Repository.AdminRepository;
import com.ecom.commercial.E_Commerrce.Services.AdminServices;

public class AdminServiceImple implements AdminServices{
	
	
	
	
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfo> getAllUSerINfo(UserInfo info) {
		// TODO Auto-generated method stub
		return null;
	}

}
