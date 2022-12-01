package com.hillel.dolhunin.homework.homework3;

public class Cat extends Animal{
    static int counterCat;

    public Cat() {
        counterCat++;
    }

    @Override
    void run(int distance) {
        if (distance > 0 && distance <= 200) {
            System.out.println("Кіт пробіг " + distance + " м");
        } else {
            System.out.println("Кіт не біжить");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("Kіт не вміє плавати");
    }
}
