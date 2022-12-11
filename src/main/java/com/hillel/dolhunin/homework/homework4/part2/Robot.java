package com.hillel.dolhunin.homework.homework4.part2;

public class Robot extends Participant {

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run() {
        System.out.println("Робот " + getName() + "бігає");
    }

    @Override
    public void jump() {
        System.out.println("Робот " + getName() + " стрибає");
    }
}
