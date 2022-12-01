package com.hillel.dolhunin.homework.homework3;

public class Dog extends Animal{
    static int counterDog;

    public Dog() {
        counterDog++;
    }

    @Override
    void run(int distance) {
        if (distance > 0 && distance <= 500) {
            System.out.println("Собака пробіг " + distance + " м");
        } else {
            System.out.println("Собака не біжить");
        }
    }

    @Override
    void swim(int distance) {
        if (distance > 0 && distance <= 10) {
            System.out.println("Собака проплив " + distance + " м");
        } else {
            System.out.println("Собака не пливе");
        }
    }
}
