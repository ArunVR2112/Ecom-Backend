package com.ecom.commercial.E_Commerrce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.commercial.E_Commerrce.Model.UserInfo;

public interface Repository extends JpaRepository<UserInfo, Long>,CustomUserInfoRepository{


}
