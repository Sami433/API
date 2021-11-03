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
    public Product add (@RequestBody Product product){
        return service.save (product);}


    @PutMapping ("/products/{id}")
    public Product update (@RequestBody Product product, @PathVariable Integer id){
        return service.save (product);}


    @DeleteMapping ("/products/{id}")
     public void deleteById (@PathVariable Integer id) {
        service.delete (id);
}


     @DeleteMapping ("/products")
     public void deleteAll (){
        service.deleteAll();

}

}