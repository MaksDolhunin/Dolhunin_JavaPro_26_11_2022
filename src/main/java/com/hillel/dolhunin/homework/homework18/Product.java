package com.hillel.dolhunin.homework.homework18;

import java.time.LocalDate;

public class Product {

    private TypeOfProducts typeOfProducts;
    private double price;
    private boolean isDiscount;
    private LocalDate localDate;
    private int id;

    public Product(TypeOfProducts typeOfProducts, double price, boolean isDiscount, LocalDate localDate, int id) {
        this.typeOfProducts = typeOfProducts;
        this.price = price;
        this.isDiscount = isDiscount;
        this.localDate = localDate;
        this.id = id;
    }

    public TypeOfProducts getType() {
        return typeOfProducts;
    }

    public void setType(TypeOfProducts type) {
        this.typeOfProducts = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "typeOfProducts = " + typeOfProducts +
                ", price = " + price +
                ", isDiscount = " + isDiscount +
                ", localDate = " + localDate +
                ", id = " + id +
                '}';
    }
}
