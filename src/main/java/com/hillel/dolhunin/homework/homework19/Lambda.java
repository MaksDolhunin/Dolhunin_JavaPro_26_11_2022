package com.hillel.dolhunin.homework.homework19;

import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda {
    public Predicate<Integer> isOdd() {
        // нуль будемо вважати парним числом
        return x -> x % 2 == 0;
    }

    public Predicate<Integer> isPrime() {
        return x -> (!((x % 2 == 0) && (x > 2) || (x % 3 == 0)));
    }

    public Predicate<Integer> isPalindrome() {
        return x -> x == Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
    }



}
