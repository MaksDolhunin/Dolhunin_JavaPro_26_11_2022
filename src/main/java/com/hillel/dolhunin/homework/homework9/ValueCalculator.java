package com.hillel.dolhunin.homework.homework9;

public class ValueCalculator {

    private final int fullLength = 1_000_000;
    private final int halfLength = fullLength / 2;
    private float [] fullArray = new float[fullLength];

    public long calculate() {
        long start = System.currentTimeMillis();

        for (int i = 0; i < fullLength; i++) {
            fullArray[i] = 1;
        }
        float[] firstPart = new float[halfLength];
        float[] secondPart = new float[halfLength];

        System.arraycopy(fullArray, 0 , firstPart, 0, halfLength);
        System.arraycopy(fullArray, halfLength, secondPart, 0, halfLength);

        CalculateTread tread1 = new CalculateTread(firstPart);
        CalculateTread tread2 = new CalculateTread(secondPart);

        tread1.start();
        tread2.start();

        final float[] result = new float[fullLength];

        while (tread1.isAlive() || tread2.isAlive());

        System.arraycopy(firstPart, 0 , result, 0, halfLength);
        System.arraycopy(secondPart, 0, result, halfLength, halfLength);

        return System.currentTimeMillis() - start;
    }

}
