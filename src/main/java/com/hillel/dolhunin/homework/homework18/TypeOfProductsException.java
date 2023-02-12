package com.hillel.dolhunin.homework.homework18;

public class TypeOfProductsException extends RuntimeException {

    String message;

    public TypeOfProductsException(TypeOfProducts typeOfProducts) {
        this.message = "Продукт категорії " + typeOfProducts + " не знайдено.";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
