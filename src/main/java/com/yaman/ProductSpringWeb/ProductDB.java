package com.yaman.ProductSpringWeb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//because we are working with repo here
public interface ProductDB extends JpaRepository<Product, Integer> {
    //Product is class here we are dealing with and Integer type is primary key of sql query

    Product findByName(String name);

}
