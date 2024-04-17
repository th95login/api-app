package com.apispring.apispring.services;

import com.apispring.apispring.entities.Orders;
import com.apispring.apispring.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServices implements IOrdersServices{

    @Autowired
    private OrdersRepository repository;

    @Override
    public List<Orders> getAll(){
        return (List<Orders>)repository.findAll();
    }
}
