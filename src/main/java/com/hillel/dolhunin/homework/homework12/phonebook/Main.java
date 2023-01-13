package com.hillel.dolhunin.homework.homework12.phonebook;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.add("Maks", "12345678");
        phonebook.add("Anton", "12345678");
        phonebook.add("Vasya", "12345678");
        phonebook.add("Tolik", "12345678");
        phonebook.add("Petya", "12345678");
        phonebook.add("Maks", "5635345");

        System.out.println(phonebook.find("Maks"));
        System.out.println(phonebook.find("Kuryl"));
        System.out.println(phonebook.findAll("Maks"));


    }
}