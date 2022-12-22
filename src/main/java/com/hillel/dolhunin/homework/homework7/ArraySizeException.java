package com.hillel.dolhunin.homework.homework7;

public class ArraySizeException extends Exception {

    String myMessage;

    public ArraySizeException(String message) {
        super(message);
        this.myMessage = message;
    }
}
