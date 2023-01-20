package com.hillel.dolhunin.homework.homework9;

public class CalculateTread extends Thread {

    private final float[] array;

    public CalculateTread(final float[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for(int i = 0; i < array.length; i++) {
            array[i] =  (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
