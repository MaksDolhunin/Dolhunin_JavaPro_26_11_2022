package com.hillel.dolhunin.homework.homework15;

public class QuickSort {
    public void quickSort(int[] array, int left, int right) {
        if (array.length == 0)
            return;

        if (left >= right)
            return;

        int middle = left + (right - left) / 2;
        int opora = array[middle];

        int i = left, j = right;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j)
            quickSort(array, left, j);

        if (right > i)
            quickSort(array, i, right);
    }

}
