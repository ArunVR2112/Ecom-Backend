package com.ecom.commercial.E_Commerrce.Services;

import com.ecom.commercial.E_Commerrce.Model.UserInfo;

public interface ServiceClass {
	
	UserInfo saveUsers(UserInfo userInfo);
	UserInfo checkLogin(String email, String password);

}
