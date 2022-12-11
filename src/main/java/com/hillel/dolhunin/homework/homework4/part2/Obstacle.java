package com.hillel.dolhunin.homework.homework4.part2;

public abstract class Obstacle {

    private double height;
    private double distance;
    private String name;
    private int counter = 0;
    public Obstacle(double height, double distance, String name) {
        this.height = height;
        this.distance = distance;
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter++;
    }

    public void setCounter() {
        this.counter = 0;
    }

    public abstract void overcome(Participant participant);
}
