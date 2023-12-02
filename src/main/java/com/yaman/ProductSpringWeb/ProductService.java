package com.yaman.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//means we are telling spring to create object
public class ProductService {

    @Autowired
            //means search and give me the below object
    ProductDB db;

    public void show(){
        System.out.println("in show");
    }



    //List<Product> products = new ArrayList<>();

    public void addProduct(Product p){

        //products.add(p);
        db.save(p);
    }
//
    public List<Product> getAllProducts() {

        return db.findAll();
        //no need to write code and sql query to fetch all products, this is what data JPA is doing for us
        //behind the scene there are queries involved but we dont have to write them

    }

    public Product getProduct(String name){
        return db.findByName(name);
    }


}
