package com.hillel.dolhunin.homework.homework3;

public class Animal {
    static int counter;
    public Animal() {
        counter++;
    }

    void run(int distance) {
        if (distance > 0) {
            System.out.println("Тварина біжить");
        } else {
            System.out.println("Тварина не біжить");
        }
    }

    void swim(int distance) {
        System.out.println("Тварина плаває");
    }

}
