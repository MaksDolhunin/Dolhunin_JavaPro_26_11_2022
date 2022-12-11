package com.hillel.dolhunin.homework.homework4.part2;

public class Person extends Participant{

    public Person(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }


    @Override
    public void run() {
        System.out.println("Людина" + getName() + " бігає");
    }


    @Override
    public void jump() {
        System.out.println("Людина " + getName() +  " стрибає");
    }
}
