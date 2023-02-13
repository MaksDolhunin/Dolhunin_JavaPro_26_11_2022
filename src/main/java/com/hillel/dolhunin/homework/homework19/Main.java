package com.hillel.dolhunin.homework.homework19;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Lambda lambda = new Lambda();

        System.out.println(lambda.isOdd().test(2));
        System.out.println(lambda.isPrime().test(103));
        System.out.println(lambda.isPalindrome().test(545));

    }
}
