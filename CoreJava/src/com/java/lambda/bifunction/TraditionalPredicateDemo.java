package com.java.lambda.bifunction;

import java.util.function.BiPredicate;

public class TraditionalPredicateDemo implements BiPredicate<String,String> {
    @Override
    public boolean test(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        BiPredicate<String,String> biPredicate = new TraditionalPredicateDemo();
        System.out.println(biPredicate.test("Ramesh" , "Ramesh"));
        System.out.println(biPredicate.test("Ramesh" , "Mahesh"));
    }
}
