package com.apispring.apispring.services;

import com.apispring.apispring.entities.Orders;

import java.util.List;

public interface IOrdersServices {
    List<Orders> getAll();
}
