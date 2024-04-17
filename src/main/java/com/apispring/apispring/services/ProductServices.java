package com.apispring.apispring.services;

import com.apispring.apispring.entities.Product;
import com.apispring.apispring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices implements IProductServices{

    @Autowired
    ProductRepository repository;

    @Override
    public List<Product> getAll() {
        return (List<Product>)repository.findAll();
    }

    @Override
    public Product getById(Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void save(Product product) {

    }
}
