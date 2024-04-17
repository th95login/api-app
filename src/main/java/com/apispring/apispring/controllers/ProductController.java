package com.apispring.apispring.controllers;

import com.apispring.apispring.entities.Product;
import com.apispring.apispring.services.IProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductServices services;

    @GetMapping("/api/Product")
    public List<Product> getProductAll(){
        return services.getAll();
    }
}
