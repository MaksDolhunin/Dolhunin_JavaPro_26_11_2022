package com.hillel.dolhunin.homework.homework4.part2;

public abstract class Participant {

    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;


    public Participant(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public abstract void run();

    public abstract void jump();
}
