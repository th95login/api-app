package com.apispring.apispring.controllers;

import com.apispring.apispring.entities.OrderStatus;
import com.apispring.apispring.services.IOrderStatusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderStatusControllers {

    @Autowired
    private IOrderStatusServices services;

    @GetMapping("/api/order-status")
    public List<OrderStatus> getOrderStatusAll(){
        return services.getAll();
    }

    @GetMapping("/api/order-status/{id}")
    public OrderStatus getById(@PathVariable String id){
        return services.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/order-status/{id}")
    public void remove(@PathVariable String id){
        services.remove(Long.parseLong(id));
    }

    @PostMapping("/api/order-status")
    public void save(@RequestBody OrderStatus status){
        services.save(status);
    }
}
