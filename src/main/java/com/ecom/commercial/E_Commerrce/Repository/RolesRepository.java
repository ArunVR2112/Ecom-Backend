package com.ecom.commercial.E_Commerrce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.commercial.E_Commerrce.Model.Roles;

public interface RolesRepository extends JpaRepository<Roles, Integer> {
	
	Roles findByRoleName(String name);

}
