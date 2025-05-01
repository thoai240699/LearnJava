package com.ltp.globalsuperstore;

import java.util.Date;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

public class Item {
    private String category;
    private String name;
    private Double price;
    private Double discount;
    
    //Parse date string (yyyy-mm-dd) from the form into date objects. ensures correct date parsing from the form.

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    //unique ID for each item. unique ID is created when a new Item is instantiated
    private String id;
    //Contructor that generates a unique ID by default
    public Item(){
        this.id = UUID.randomUUID().toString();
    }
    //Getter and setter
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
