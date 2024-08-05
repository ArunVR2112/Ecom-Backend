package com.ecom.commercial.E_Commerrce.Services.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.commercial.E_Commerrce.Model.Admin;
import com.ecom.commercial.E_Commerrce.Model.Roles;
import com.ecom.commercial.E_Commerrce.Model.UserInfo;
import com.ecom.commercial.E_Commerrce.Repository.AdminRepository;
import com.ecom.commercial.E_Commerrce.Repository.RolesRepository;
import com.ecom.commercial.E_Commerrce.Services.AdminServices;
import com.ecom.commercial.quickcart.constants.QuickCartConstants;

@Service
public class AdminServiceImple implements AdminServices{
	
	
	@Autowired
	private AdminRepository adminRepository;
	
	
	@Autowired
	private RolesRepository rolesRepository;

	@Override
	public boolean createAdmin(Admin admindto) {
		boolean isValid=false;
		Roles roles =rolesRepository.findByRoleName(QuickCartConstants.ADMIN_ROLE);
		
		
		
		admindto= adminRepository.save(admindto);
		if (null!=admindto && roles.getRoleId()>0) {
			isValid=true;
		}
		
		return isValid;
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
