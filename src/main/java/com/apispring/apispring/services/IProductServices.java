package com.apispring.apispring.services;


import com.apispring.apispring.entities.Product;

import java.util.List;

public interface IProductServices {
    List<Product> getAll();

    Product getById(Long id);

    void remove (Long id);

    void save(Product product);
}
