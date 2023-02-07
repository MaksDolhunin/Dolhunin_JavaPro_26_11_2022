package com.hillel.dolhunin.homework.homework17.task2;

import java.util.Objects;

public class Box <T extends Fruit> {

    private final T type;
    private int amount;

    public Box(T type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void addOneFruit() {
        setAmount(getAmount() + 1);
    }

    public void addManyFruit(int number) {
        setAmount(getAmount() + number);
    }

    public float getBoxWeight() {
        return getAmount() * type.getWeight();
    }

    public boolean compare(Box box) {
        return getBoxWeight() == box.getBoxWeight();
    }

    public void merge(Box box) {
        if(Objects.equals(box.type.getName(), type.getName())) {
            this.addManyFruit(box.getAmount());
            box.setAmount(0);
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "type=" + type +
                ", amount=" + amount +
                '}';
    }
}
