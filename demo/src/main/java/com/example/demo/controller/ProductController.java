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

@GetMapping ("/products/{id}")
    public Product get(@PathVariable Integer id){
return service.get (id);
}


@PostMapping ("/products")
    public void add (@RequestBody Product product){
        service.save (product);

}

@PutMapping ("/products/{id}")
    public void update (@RequestBody Product product, @PathVariable Integer id){
        service.save (product);

}

@DeleteMapping ("/products/{id}")
public void delete (@PathVariable Integer id) {
        service.delete (id);
}

}