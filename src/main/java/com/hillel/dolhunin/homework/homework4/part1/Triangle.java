package com.hillel.dolhunin.homework.homework4.part1;

public class Triangle implements Figure{

    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getSquare() {
        if (side > 0 && height > 0) {
            return side * height / 2;
        } else {
            System.out.println("Значення повинні бути більше 0!");
        }
        return side;
    }
}
