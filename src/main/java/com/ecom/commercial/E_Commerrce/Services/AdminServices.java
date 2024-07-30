package com.ecom.commercial.E_Commerrce.Services;

import org.springframework.stereotype.Service;

import com.ecom.commercial.E_Commerrce.Model.Admin;

@Service
public interface AdminServices {

//	Save Admin Data in db
	Admin createAdmin(Admin admin);
	
	
//	get admin data from db
	
	Admin getAdmin(Admin admin);
	
	
}
