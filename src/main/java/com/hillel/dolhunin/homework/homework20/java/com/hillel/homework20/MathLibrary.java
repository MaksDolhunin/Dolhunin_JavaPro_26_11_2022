package com.hillel.dolhunin.homework.homework20.java.com.hillel.homework20;

public class MathLibrary implements MathLibraryInterface {

    @Override
    public float sum(float a, float b) {
        return a + b;
    }

    @Override
    public float difference(float a, float b) {
        return a - b;
    }

    @Override
    public float multi(float a, float b) {
        return a * b;
    }

    @Override
    public float division(float a, float b) {
        return a / b;
    }
}
