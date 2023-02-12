package com.hillel.dolhunin.homework.homework17.task2;

public class Main {
    public static void main(String[] args) {

        Box<Apple> box1 = new Box(new Apple());
        Box<Orange> box2 = new Box(new Orange());
        Box<Apple> box3 = new Box(new Apple());
        Box<Orange> box4 = new Box(new Orange());

        box1.addOneFruit();
        System.out.println(box1);

        box2.addManyFruit(5);
        System.out.println(box2);

        box3.addManyFruit(3);
        System.out.println(box3);

        System.out.println(box2.getBoxWeight());

        box4.addManyFruit(5);
        box4.merge(box2);
        System.out.println(box4);

        box4.addManyFruit(3);
        box4.merge(box1);
        System.out.println(box4);


    }
}
