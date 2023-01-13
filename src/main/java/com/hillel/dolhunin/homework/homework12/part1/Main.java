package com.hillel.dolhunin.homework.homework12.part1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Myrzik");
        list.add("Myrzik");
        list.add("Myrzik");
        list.add("Myrzik");
        list.add("Kotik");
        list.add("Tolik");
        list.add("Myrzik");
        list.add("Myrzik");

//        String str = "Myrzik";
//        System.out.println(countOccurrence(list, str));
//
//        String[] arr = new String[] {"hello", "world"};
//        System.out.println(toList(arr));
//
//        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,1,1,3,4,5,4));
//        System.out.println(findUnique(list1));

//        calcOccurrence(list);

//        System.out.println(findOccurrence(list));

    }

    public static int countOccurrence(List<String> list, String str) {
        int counter = 0;
        for (String myList : list) {
            if (str.equals(myList)) {
                counter++;
            }
        }
        return counter;
    }

    public static  <T> List <T> toList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (T i: arr) {
            list.add(i);
        }
        return (List<T>) list;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }

    public static void calcOccurrence(List<String> list) {
        Map<String, Integer> wordToNumberMap = new HashMap<>();
        for (String str : list) {
            if(wordToNumberMap.get(str) == null) {
                wordToNumberMap.put(str, 1);
            } else {
                wordToNumberMap.put(str, wordToNumberMap.get(str) + 1);
            }
        }
        System.out.println(wordToNumberMap);
    }

    public static List<String>  findOccurrence(List<String> list) {
        Map<String, Integer> wordToNumberMap = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (String str : list) {
            if(wordToNumberMap.get(str) == null) {
                wordToNumberMap.put(str, 1);
            } else {
                wordToNumberMap.put(str, wordToNumberMap.get(str) + 1);
            }
        }

        for (String name : wordToNumberMap.keySet()) {
            res.add("{name: } " + name + ", occurrence: " + wordToNumberMap.get(name));
        }
        return res;
    }
}
