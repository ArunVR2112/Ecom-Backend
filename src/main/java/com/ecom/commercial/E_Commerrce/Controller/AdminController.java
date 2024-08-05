package com.ecom.commercial.E_Commerrce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.commercial.E_Commerrce.Model.Admin;
import com.ecom.commercial.E_Commerrce.Repository.RolesRepository;
import com.ecom.commercial.E_Commerrce.Services.AdminServices;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

	
	@Autowired
	private AdminServices adminServices;
	
	@Autowired
	private RolesRepository rolesRepository;
	
	
	@PostMapping("/addAdmin")
	public String saveAdmin(@RequestBody Admin admin ) {
		
		
		boolean valid= adminServices.createAdmin(admin);
		if (valid) {
			return "admin added";
		}
		return "admin not successful";
	}
	
}
