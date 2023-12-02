package com.yaman.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//If you want to modify data, we use rest so here we have rest controller
//which is ready to accept request from client to fetch data as required


public class ProductController {

    @Autowired
    ProductService service;

    //this is for products requests
    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return service.getAllProducts();
    }

    @GetMapping("/products/{name}")
    public Product getProduct(@PathVariable String name){
        return service.getProduct(name);
    }

    @PostMapping("/product")
    //to get data we use getMapping and when we send data we use postmapping
    public void addProduct(@RequestBody Product p){
        //request body to post data using postman
        service.addProduct(p);
    }
}
