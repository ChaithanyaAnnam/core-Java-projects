package com.java.streams;

import com.ext.pojo.Product;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {

    private static List<Product> getProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "HP Laptop", 25000f));
        products.add(new Product(2, "Dell Laptop", 30000f));
        products.add(new Product(3, "Lenovo Laptop", 28000f));
        products.add(new Product(4, "Sony Laptop", 28000f));
        products.add(new Product(5, "Apple Laptop", 90000f));
        return products;
    }
    public static void main(String[] args) {

        List<Product> products =getProducts().stream().filter((product) -> product.getPrice()>25000f).toList();
        products.forEach(System.out::println);

        System.out.println("**************");
        getProducts().stream().filter((product) -> product.getPrice()>25000f).forEach(System.out::println);

    }

}
