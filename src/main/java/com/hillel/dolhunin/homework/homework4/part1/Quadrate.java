package com.hillel.dolhunin.homework.homework4.part1;

public class Quadrate implements Figure{

    private double side;

    public Quadrate(double side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        if (side > 0) {
            return Math.pow(side, 2);
        } else {
            System.out.println("Сторона квадрата повинна бути більше 0!");
        }
        return side;
    }
}
