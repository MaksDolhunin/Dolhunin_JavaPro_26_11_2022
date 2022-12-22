package com.hillel.dolhunin.homework.homework7;

public class ArrayValueCalculator {

    public static void main(String[] args) {

        String[][] array = new String[3][4];
        array[0][0] = "1";
        array[0][1] = "2";
        array[0][2] = "d";
        array[0][3] = "2";
        array[1][0] = "2";
        array[1][1] = "2";
        array[1][2] = "2";
        array[1][3] = "2";
        array[2][0] = "2";
        array[2][1] = "2";
        array[2][2] = "2";
        array[2][3] = "2";
//        array[3][0] = "2";
//        array[3][1] = "2";
//        array[3][2] = "2";
//        array[3][3] = "1";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        try {
            int sum = doCalc(array);
            System.out.println(sum);
        } catch (ArraySizeException e) {
            e.printStackTrace();
        } catch (ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int doCalc(String[][] arr) throws ArraySizeException, ArrayDataException {

        int sum = 0;

        if(arr.length == 4 && arr[0].length ==4) {
            System.out.println("Size is correct!");
        } else {
            throw new ArraySizeException("Size is not correct");
        }

        if (arr.length != 4) {
            throw new ArraySizeException("Size is not correct");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new ArraySizeException("Size is not correct");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Cannot convert cell " + i + " x " + j);
                }
            }
        }
        return sum;
    }
}
