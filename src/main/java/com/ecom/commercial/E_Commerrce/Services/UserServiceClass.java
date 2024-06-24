package com.ecom.commercial.E_Commerrce.Services;

import com.ecom.commercial.E_Commerrce.Model.UserInfo;

public interface UserServiceClass {
	
	UserInfo saveUsers(UserInfo userInfo);
	UserInfo checkLogin(String email, String password);
	
	UserInfo getUser(long id);
	
	void deleteUser(long id);
	

}
