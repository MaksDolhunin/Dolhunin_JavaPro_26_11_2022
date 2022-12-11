package com.hillel.dolhunin.homework.homework4.part1;

public class Circle implements Figure{
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        if (radius > 0) {
           return Math.PI * Math.pow(radius, 2);
        } else {
            System.out.println("Радіус кола повинен бути більше 0!");
        }
        return radius;
    }
}
