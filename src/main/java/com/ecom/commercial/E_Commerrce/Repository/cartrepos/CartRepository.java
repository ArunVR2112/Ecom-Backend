package com.ecom.commercial.E_Commerrce.Repository.cartrepos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.commercial.E_Commerrce.Model.CartItem;

@Repository
public interface CartRepository extends JpaRepository<CartItem, Long> 
{

}
