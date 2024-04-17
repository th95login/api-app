package com.apispring.apispring.controllers;

import com.apispring.apispring.dto.DetailOrderDTO;
import com.apispring.apispring.entities.OrderDetail;
import com.apispring.apispring.services.IOrderDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderDetailContollers {

    @Autowired
    private IOrderDetailServices services;

    @GetMapping("/api/order-detail")
    private List<DetailOrderDTO> getOrderDetailAll(){
        return services.getAll();
    }
}
