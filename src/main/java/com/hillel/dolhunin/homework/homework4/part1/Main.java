package com.hillel.dolhunin.homework.homework4.part1;

public class Main {
    public static void main(String[] args) {

        Figure[] array = {
                new Quadrate(2),
                new Circle(3),
                new Triangle(3,3)
        };

        System.out.println(sumArea(array));
    }

    public static double sumArea(Figure[] array) {
        double sum = 0;
        for (Figure arr: array) {
            sum += arr.getSquare();
        }
        return sum;
    }
}
