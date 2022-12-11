package com.hillel.dolhunin.homework.homework5;

public class HomeWorkApp {
    public static void main(String[] args) {
//        printThreeWords();
//        checkSumSign(2, -2);
//        printColor(101);
//        compareNumbers(5,4);
//        System.out.println(printSum(1, 19));
//        printValue(0);
//        System.out.println(printPositiveOrNegative(0));
//        printString("Maks", 5);
//        System.out.println(isYearIntercalary(400));


    }

    public static void  printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        // 0 вважатимемо позитивним числом
        if ( (a + b) >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void  printColor(int value) {
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean printSum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void printValue(int value) {
        if (value < 0) {
            System.out.println("Value is negative");
        } else {
            System.out.println("Value is positive");
        }
    }

    public static boolean printPositiveOrNegative(int a) {
        // 0 вважатимемо позитивним числом
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printString(String str, int numb) {
        for (int i = 0; i < numb; i++) {
            System.out.println(str);
        }
    }

    public static boolean isYearIntercalary(int value) {
        return (value % 4 == 0 && value % 100 != 0) || (value % 400 == 0) ? true : false;
    }


}


