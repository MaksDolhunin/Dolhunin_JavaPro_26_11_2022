package com.hillel.dolhunin.homework.homework10.task2;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3);

        PetrolStation petrolStation = new PetrolStation(semaphore, 1000);

        Thread thread1 = new Thread(petrolStation);
        Thread thread2 = new Thread(petrolStation);
        Thread thread3 = new Thread(petrolStation);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
