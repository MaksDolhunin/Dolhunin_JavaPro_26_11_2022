package com.hillel.dolhunin.homework.homework14.coffeeOrder;

import java.util.Objects;

public class Order {

    private int number;
    private  String name;

    public Order(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return number == order.number && name.equals(order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
