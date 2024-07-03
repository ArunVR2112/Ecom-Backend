package com.ecom.commercial.E_Commerrce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    @PostMapping("/cart/items")
    public ResponseEntity<CartItem> addToCart(@RequestBody CartItem cartItem) {
        CartItem savedCartItem = cartItemService.saveToCart(cartItem);
        return ResponseEntity.ok(savedCartItem);
    }

    @GetMapping("/cart/items/{userId}")
    public ResponseEntity<List<CartItem>> getAllCartItems(@PathVariable Long userId) {
        List<CartItem> cartItems = cartItemService.getAllCartItems(userId);

        return ResponseEntity.ok(cartItems);
    }
}
