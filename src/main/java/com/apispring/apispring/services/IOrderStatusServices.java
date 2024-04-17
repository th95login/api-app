package com.apispring.apispring.services;

import com.apispring.apispring.entities.OrderStatus;

import java.util.List;

public interface IOrderStatusServices {
    List<OrderStatus> getAll();
    OrderStatus getById(Long id);
    void remove(Long id);
    void save(OrderStatus status);
}
