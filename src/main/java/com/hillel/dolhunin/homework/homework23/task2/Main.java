package com.hillel.dolhunin.homework.homework23.task2;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 4, 6, 7, 1, 7};
//        int[] arr2 = {1, 2, 3, 5, 9, 7};
        int[] arr3 = null;
        int [] arr4 = {1, 4};
        int [] arr5 = {2, 3, 5, 6};

        System.out.println(java.util.Arrays.toString(Arrays.checkArrays(arr1)));
//        System.out.println(java.util.Arrays.toString(Arrays.checkArrays(arr2)));
        System.out.println(java.util.Arrays.toString(Arrays.checkArrays(arr3)));
        System.out.println(Arrays.checkArrayForOneAndFour(arr4));
        System.out.println(Arrays.checkArrayForOneAndFour(arr5));
    }

}
