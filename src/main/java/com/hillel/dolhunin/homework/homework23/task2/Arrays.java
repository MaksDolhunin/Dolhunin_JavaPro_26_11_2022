package com.hillel.dolhunin.homework.homework23.task2;

public class Arrays {

    public static int[] checkArrays(int [] array) {

        if(array == null) {
            return null;
        }

        int a = 0;
        int[] newArray = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                a = array[i];
                newArray = new int[array.length - 1 - i];
                for (int j = i + 1, k = 0; j < array.length; j++, k++) {
                    if (array[j] == 4) {
                        continue;
                    }
                    newArray[k] = array[j];
                }
            }
        }try {
            a = 1 / a;
        } catch (ArithmeticException e) {
            throw new RuntimeException("Нет 4-ки в массиве");
        }
        return newArray;
    }

    public static boolean checkArrayForOneAndFour(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int j : arr) {
            if (j != 1 && j != 4) return false;
        }
        return true;
    }
}
