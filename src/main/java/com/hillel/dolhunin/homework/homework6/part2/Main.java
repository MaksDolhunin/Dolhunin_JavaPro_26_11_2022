package com.hillel.dolhunin.homework.homework6.part2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String word;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        int number = random.nextInt(words.length);
        System.out.println(words[number]);
        System.out.println("Програма загадала слово, вгадайте його!");
        char[] wordCharArray = words[number].toCharArray();
        char[] chCmp = new char[16];
        for (int i = 0; i < 16; i++) {
            chCmp[i] = '#';
        }

        while (true) {
            System.out.print("Введіть слово: ");
            word = scanner.nextLine();
            if (word.equals(words[number])) {
                System.out.println("Ви вгадали");
                break;
            } else {
                System.out.println("Ви не вгадали");
                char[] chWord = word.toCharArray();

                for (int i = 0; i < wordCharArray.length; i++) {
                    if (i >= chWord.length) {
                        break;
                    }
                    if (wordCharArray[i] == chWord[i]) {
                        chCmp[i] = wordCharArray[i];
                    }
                }
                System.out.println(String.valueOf(chCmp));
            }
        }
    }
}
