package com.hillel.dolhunin.homework.homework7;

public class ArrayDataException extends Exception {

    String myMessage;

    public ArrayDataException(String message) {
        super(message);
        this.myMessage = message;
    }
}
