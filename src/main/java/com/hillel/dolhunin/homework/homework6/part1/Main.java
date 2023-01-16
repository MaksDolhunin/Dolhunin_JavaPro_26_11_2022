package com.hillel.dolhunin.homework.homework6.part1;

public class Main {

    public static void main(String[] args) {
//        System.out.println(findSymbolOccurance("hello", 'l'));
//        findWordPosition("hello", "llo");
//        System.out.println(stringReverse("String"));
//        System.out.println(isPalindrome("hohdff"));

    }

    public static int findSymbolOccurance(String str, char ch) {
        int value = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch == arr[i]) {
                value++;
            }

        }
        return value;
    }

    public static void findWordPosition(String source, String target) {
        if (source.contains(target)) {
            System.out.println( "Source: " + source + "\n" +
                                "Target: " + target + "\n" +
                                "Result: " + source.indexOf(target));
        }
    }

    public static String stringReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        return  new StringBuilder(str).reverse().toString().equals(str) ? true : false;
    }

}
