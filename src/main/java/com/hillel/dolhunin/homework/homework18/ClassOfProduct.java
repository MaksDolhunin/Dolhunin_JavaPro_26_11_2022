package com.hillel.dolhunin.homework.homework18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClassOfProduct {
    private List<Product> productList;

    public void setProductList() {
        productList = new ArrayList<>(List.of(
                new Product(TypeOfProducts.Book, 257, true, LocalDate.now(), 1),
                new Product(TypeOfProducts.Book, 200, true, LocalDate.now(), 2),
                new Product(TypeOfProducts.Toy, 600, true,  LocalDate.now(), 3),
                new Product(TypeOfProducts.Pen, 50, false,  LocalDate.now(),4),
                new Product(TypeOfProducts.Pencil, 70, true,  LocalDate.now(),5),
                new Product(TypeOfProducts.CopyBook, 100, true,  LocalDate.now(), 6),
                new Product(TypeOfProducts.Toy,450, false,  LocalDate.now(),7),
                new Product(TypeOfProducts.Book,40, false,  LocalDate.now(),8),
                new Product(TypeOfProducts.Book,60, false,  LocalDate.now(),9)
        ));
    }

    public List<Product> listBookPriceMore250() {
        return productList.stream().
                filter(product -> TypeOfProducts.Book.equals(product.getType())).
                filter(product -> product.getPrice() > 250).
                toList();
    }

    public List<Product> listBookIsDiscount() {
        return productList.stream().
                filter(product -> TypeOfProducts.Book.equals(product.getType())).
                filter(Product::isDiscount).
                map(product -> new Product(TypeOfProducts.Book, product.getPrice() * 0.9, product.isDiscount(), product.getLocalDate(), product.getId())).
                toList();
    }

    public double listOfCheapBook(TypeOfProducts typeOfProducts) {
        return productList.stream().
                filter(product -> typeOfProducts.equals(product.getType())).
                map(Product::getPrice).
                min(Comparator.naturalOrder()).
                orElseThrow(() -> new TypeOfProductsException(typeOfProducts));
    }

    public List<Product> listOfTreeLastProduct() {
        return productList.stream().
                skip(productList.size() - 3).
                toList();
    }

    public double sum(int date) {
        return productList.stream().
                filter(product -> TypeOfProducts.Book.equals(product.getType())).
                filter(product -> product.getLocalDate().getYear() == date).
                filter(product -> product.getPrice() < 75).
                mapToDouble(Product::getPrice).
                sum();
    }

    public Map<TypeOfProducts, List<Product>> listToTypeProduct() {
        return productList.stream().collect(Collectors.groupingBy(Product::getType));
    }
}
