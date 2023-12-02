package com.yaman.ProductSpringWeb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity

@Data
//this is a feature of lombok, where it will generate getters and setters
//for these declared variables below so that we dont have to manually code them up
public class Product {

    @Id
    //speacifying primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //means id is primary key and auto generated
    private int id;
    private String name;
    private String type;
    private String place;
    private int warranty;

    //we can access these properties through getters and setters outside this class


    public Product() {
    }

    public Product(String name, String type, String place, int warranty) {
        this.name = name;
        this.type = type;
        this.place = place;
        this.warranty = warranty;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getPlace() {
//        return place;
//    }
//
//    public void setPlace(String place) {
//        this.place = place;
//    }
//
//    public int getWarranty() {
//        return warranty;
//    }
//
//    public void setWarranty(int warranty) {
//        this.warranty = warranty;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                ", place='" + place + '\'' +
//                ", warranty=" + warranty +
//                '}';
//    }
    //In Java, the @Override annotation is used to indicate that a method in a
    // subclass is intended to override a method with the same signature in its
    // superclass. This annotation helps the compiler catch errors at compile-time by
    // ensuring that the method annotated with @Override is indeed an override of a
    // method in its superclass.
}
