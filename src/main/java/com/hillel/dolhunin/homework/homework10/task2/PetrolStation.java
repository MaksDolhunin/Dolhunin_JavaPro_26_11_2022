package com.hillel.dolhunin.homework.homework10.task2;

import java.util.concurrent.Semaphore;

public class PetrolStation implements Runnable, Station{

    private Semaphore semaphore;
    private volatile int amount;

    public PetrolStation(Semaphore semaphore, int amount) {
        this.semaphore = semaphore;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void doRefuel() throws InterruptedException {
        int amountFuel = (int) ((Math.random() * 70) + 10);
        if(amountFuel >= amount) {
            amountFuel = amount;
        }

        semaphore.acquire();
        setAmount(amount - amountFuel);
        semaphore.release();
        System.out.println("Авто " + Thread.currentThread().getName() + " заправилось на " + amountFuel + " літрів");

        Thread.sleep((long) (Math.random() * 7000) + 3000);
        System.out.println("Залишок бензину після заправки авто " + Thread.currentThread().getName() + " = " + amount);

    }

    @Override
    public void run() {
        while (amount > 0) {
            try {
                doRefuel();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
