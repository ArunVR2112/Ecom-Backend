package com.ecom.commercial.E_Commerrce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ecom.commercial.E_Commerrce.Services.CartItemService;

@Controller
public class CartItemController 
{
	@Autowired
	private CartItemService cartItemService;
   @Autowired
    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

	
}
