package com.hillel.dolhunin.homework.homework18;

public class Main {
    public static void main(String[] args) {

        ClassOfProduct classOfProduct = new ClassOfProduct();
        classOfProduct.setProductList();

        System.out.println(classOfProduct.listBookPriceMore250());
        System.out.println();
        System.out.println(classOfProduct.listBookIsDiscount());
        System.out.println();
        System.out.println(classOfProduct.listOfCheapBook(TypeOfProducts.Book));
        System.out.println();
        System.out.println(classOfProduct.listOfTreeLastProduct());
        System.out.println();
        System.out.println(classOfProduct.sum(2023));
        System.out.println();
        System.out.println(classOfProduct.listToTypeProduct());


    }
}
