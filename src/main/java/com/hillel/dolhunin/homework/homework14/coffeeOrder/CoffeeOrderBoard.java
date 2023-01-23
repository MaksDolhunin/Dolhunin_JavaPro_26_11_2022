package com.hillel.dolhunin.homework.homework14.coffeeOrder;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class CoffeeOrderBoard {

    private Queue<Order> queueOrder;
    private int counter = 1;

    public CoffeeOrderBoard() {
        queueOrder = new LinkedList<>();
    }

    public void add(String name) {
        Order order = new Order(counter, name);
        queueOrder.add(order);
        counter++;
    }

    public void deliver() {
        queueOrder.remove();
    }

    public void deliver(int number) {
        for(Order order : queueOrder) {
            if(Objects.equals(order.getNumber(), number)) {
                queueOrder.remove(order);
                return;
            }
        }
    }

    public void draw() {
        System.out.println("============");
        System.out.println("Num | Name");
        for(Order order : queueOrder) {
            String str = order.getNumber() + " | " + order.getName();
            System.out.println(str);
        }

    }
}
