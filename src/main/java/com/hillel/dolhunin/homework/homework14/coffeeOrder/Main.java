package com.hillel.dolhunin.homework.homework14.coffeeOrder;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Anton");
        coffeeOrderBoard.add("Maria");
        coffeeOrderBoard.add("Ivan");
        coffeeOrderBoard.add("Petro");

        coffeeOrderBoard.deliver(3);
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
    }
}
