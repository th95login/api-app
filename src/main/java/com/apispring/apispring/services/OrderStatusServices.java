package com.apispring.apispring.services;

import com.apispring.apispring.entities.OrderStatus;
import com.apispring.apispring.repository.OrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderStatusServices implements IOrderStatusServices {

    @Autowired
    private OrderStatusRepository repository;

    @Override
    public List<OrderStatus> getAll() {
        return (List<OrderStatus>) repository.findAll();
    }

    @Override
    public OrderStatus getById(Long id) {

        return (OrderStatus)repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(OrderStatus status) {
        repository.save(status);
    }
}
