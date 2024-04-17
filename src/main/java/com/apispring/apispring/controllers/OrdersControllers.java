package com.apispring.apispring.controllers;

import com.apispring.apispring.entities.Orders;
import com.apispring.apispring.services.IOrdersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class OrdersControllers {

    @Autowired
    private IOrdersServices service;
    @GetMapping("/api/orders")
    public List<Orders> getOrdersAll(){
        return service.getAll();
    }
}
