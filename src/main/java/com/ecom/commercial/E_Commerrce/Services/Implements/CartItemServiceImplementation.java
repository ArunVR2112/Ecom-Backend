package com.ecom.commercial.E_Commerrce.Services.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.commercial.E_Commerrce.Model.CartItem;
import com.ecom.commercial.E_Commerrce.Repository.cartrepos.CartRepository;
import com.ecom.commercial.E_Commerrce.Services.CartItemService;

@Service
public class CartItemServiceImplementation implements CartItemService{
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public CartItem getItems(Long cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteItem(Long cartId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CartItem saveToCart(CartItem cartItem) {
		return cartRepository.save(cartItem);
	}

	@Override
	public CartItem updateCart(CartItem cartItem) {
		// TODO Auto-generated method stub
		return null;
	}

}
