package com.ecom.commercial.E_Commerrce.Services;

import org.springframework.stereotype.Service;

import com.ecom.commercial.E_Commerrce.Model.CartItem;

@Service
public interface CartItemService 
{
	
	//Get cart Items
	CartItem getItems(Long cartId);
	
	
	//Delete Cart
	void deleteItem(Long cartId);
	
	//Add Cart to database
	CartItem saveToCart(CartItem cartItem);
	
	//Update CartItem's	
	CartItem updateCart(CartItem cartItem);
}
