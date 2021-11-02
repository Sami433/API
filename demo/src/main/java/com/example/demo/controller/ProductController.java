package com.example.demo.controller;

import java.util.*;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping("/products")
    public List<Product> list() {
        return service.listAll();
    }
}