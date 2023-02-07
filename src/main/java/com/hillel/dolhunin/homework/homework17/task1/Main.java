package com.hillel.dolhunin.homework.homework17.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] str = { "A", "B", "C", "D" };
        List<String> list = toList(str);
        System.out.println(list);
    }

    public static <T> List<T> toList(T [] array) {
        List<T> list = new ArrayList<>();
        for(T i : array) {
            list.add(i);
        }
        return list;
    }
}
