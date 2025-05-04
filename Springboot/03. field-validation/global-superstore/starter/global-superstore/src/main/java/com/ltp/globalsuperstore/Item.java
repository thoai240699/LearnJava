package com.ltp.globalsuperstore;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotNull;

public class Item {
    @NotBlank(message = "Vui lòng chọn loại hàng.")
    private String category;

    @NotBlank(message = "Tên không thể để trống.")
    private String name;

    @NotNull(message = "Giá hàng không được để trống.")
    @Min(value = 0, message = "Giá hàng không thể âm")
    private Double price;

    @NotNull(message = "Discount không được để trống.")
    @Min(value = 0, message = "Discount không thể âm.")
    private Double discount;

    @Past(message = "Ngày phải là ngày quá khứ.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String id;


    public Item() {
        this.id = UUID.randomUUID().toString();
    }
    @NotBlank


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

}
