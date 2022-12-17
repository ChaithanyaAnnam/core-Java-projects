package com.java.lambda.bifunction;

import java.util.function.BiPredicate;

public class LambdaPredicateDemo {
    public static void main(String[] args) {
        //Using anonymous implementaion
        BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };
        System.out.println(biPredicate.test("Ramesh", "Ramesh"));
        System.out.println(biPredicate.test("Ramesh", "Mahesh"));
        System.out.println("**************************");
        //Using lambda
        BiPredicate<String, String> biPredicate1 = (s1, s2) -> s1.equals(s2);
        System.out.println(biPredicate1.test("Ramesh", "Ramesh"));
        System.out.println(biPredicate1.test("Ramesh", "Mahesh"));
        System.out.println("**************************");
        //BiPredicate and , or methods
        BiPredicate<Integer, Integer> biPredicate2 = (x,y) -> x > y;
        BiPredicate<Integer, Integer> biPredicate3 = (x, y) -> x == y;
        BiPredicate<Integer, Integer> biPredicate4 = (x1, y1) -> x1 >= y1;

        boolean result = biPredicate2.and(biPredicate3).test(10,20);
        System.out.println(result);

        boolean result1 = biPredicate2.or(biPredicate3).test(20,10);
        System.out.println(result1);

        boolean result2 = biPredicate4.and(biPredicate3).test(10,10);
        System.out.println(result2);
        boolean result3 = biPredicate4.or(biPredicate3).test(10,10);
        System.out.println(result3);

    }
}
