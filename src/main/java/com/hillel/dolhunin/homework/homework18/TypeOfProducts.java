package com.hillel.dolhunin.homework.homework18;

public enum TypeOfProducts {

    Book("Book"),
    Toy("Toy"),
    Pen("Pen"),
    Pencil("Pencil"),
    CopyBook("Copybook");


    private String name;

    TypeOfProducts(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
