package com.ecom.commercial.E_Commerrce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.commercial.E_Commerrce.CustomException.ResourceNotFoundExecption;
import com.ecom.commercial.E_Commerrce.Model.Order;
import com.ecom.commercial.E_Commerrce.Model.UserInfo;
import com.ecom.commercial.E_Commerrce.Model.Address;
import com.ecom.commercial.E_Commerrce.Services.AddressServices;
import com.ecom.commercial.E_Commerrce.Services.OrderServices;
import com.ecom.commercial.E_Commerrce.Services.UserServiceClass;


@RestController
public class OrderController {

    @Autowired
    private OrderServices orderServices;

    @Autowired
    private UserServiceClass userInfoService;

    @Autowired
    private AddressServices addressService;

    @PostMapping("/api/v1/user/order/placed/")
    public ResponseEntity<Order> placeOrder(@RequestBody Order order) {
        // Fetch and validate UserInfo
    	System.err.println(order.getUserInfo().getUserinfoid());
        UserInfo userInfo = userInfoService.getUserInfoById(order.getUserInfo().getUserinfoid())
                .orElseThrow(() -> new ResourceNotFoundExecption("UserInfo", "id", order.getUserInfo().getUserinfoid()));

        // Fetch and validate Address
        Address address = addressService.getAddressById(order.getAddress().getId())
                .orElseThrow(() -> new ResourceNotFoundExecption("Address", "id", order.getAddress().getId()));

        // Set fetched entities
        order.setUserInfo(userInfo);
        order.setAddress(address);

        // Save Order
        Order ordersaved;
        try {
            ordersaved = orderServices.placeOrder(order);
        } catch (Exception e) {
            throw new ResourceNotFoundExecption("Order", "details", e.getMessage());
        }

        return new ResponseEntity<>(ordersaved, HttpStatus.CREATED);
    }
}
