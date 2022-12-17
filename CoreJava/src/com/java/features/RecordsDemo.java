package com.java.features;

import java.util.LinkedList;
import java.util.List;

public class RecordsDemo {
    public static void main(String[] args) {
        Product p1 = new Product("book",20,true);
        Product p2 = new Product("book",20,true);
        Product p3 = new Product("pen",30,true);
        System.out.println(p1);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        /*List<Product> products = new LinkedList<>();
        products.add(p1);
        products.add(p3);*/
        List<Product> products = List.of(p1,p3);
        record DiscountProduct(List<Product> products,boolean discounted){}
        System.out.println(new DiscountProduct(products,true));
    }
}
