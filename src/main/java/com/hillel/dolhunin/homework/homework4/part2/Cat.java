package com.hillel.dolhunin.homework.homework4.part2;

public class Cat extends Participant {

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run() {
        System.out.println("Кіт " + getName() + "бігає");
    }

    @Override
    public void jump() {
        System.out.println("Кіт " + getName() + " стрибає");
    }




}
