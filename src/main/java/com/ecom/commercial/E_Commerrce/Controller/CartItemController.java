package com.ecom.commercial.E_Commerrce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.commercial.E_Commerrce.Model.CartItem;
import com.ecom.commercial.E_Commerrce.Services.CartItemService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;
    
    
//    I have to edit this later on for now living as it is
    
    @PostMapping("/cart/items")
    public ResponseEntity<CartItem> addToCart(@RequestBody CartItem cartItem) {
       if(cartItem.getCartItemId()==0) {
    	   CartItem savedCartItem = cartItemService.saveToCart(cartItem);
           return ResponseEntity.ok(savedCartItem);
       }
       return (ResponseEntity<CartItem>) ResponseEntity.badRequest();
    }

    @GetMapping("/cart/items/{userId}")
    public ResponseEntity<List<CartItem>> getAllCartItems(@PathVariable Long userId) {
        List<CartItem> cartItems = cartItemService.getAllCartItems(userId);

        return ResponseEntity.ok(cartItems);
    }
    
    
//    Deleting the one item entirly from table
    @DeleteMapping("/del/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") long id){
    	cartItemService.deleteCartItems(id);
		return new ResponseEntity<String>("cart item Deleted Succesfully",HttpStatus.OK);
	}
}
