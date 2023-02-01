package com.hillel.dolhunin.homework.homework15;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        QuickSort quick = new QuickSort();
        ShakeSort shake = new ShakeSort();

        final int length = 100_000;
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
//            System.out.print(arr[i] + " ");
        }

        long startTimeQuickSort = System.currentTimeMillis();
        quick.quickSort(arr, 0, length - 1);
        long finishTimeQuickSort = System.currentTimeMillis();
        System.out.println(finishTimeQuickSort - startTimeQuickSort);
        System.out.println(Arrays.toString(arr));
        long startTimeShakeSort = System.currentTimeMillis();
        shake.shakeSort(arr);
        long finishTimeShakeSort = System.currentTimeMillis();
        System.out.println(finishTimeShakeSort - startTimeShakeSort);
//        System.out.println(Arrays.toString(arr));

    }
}
