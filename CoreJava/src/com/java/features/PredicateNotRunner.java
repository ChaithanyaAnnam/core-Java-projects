package com.java.features;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {
    public static boolean isEven(Integer number){
        return number%2==0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(11,45,7,6,8);
        // This is using Predicate class
        Predicate<Integer> evenNumberPredicate = num -> num%2==0;
        System.out.println("List of even Numbers");
        numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
        System.out.println("List of odd Numbers");
        numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);

        // When we are using a static method to do the same logic using method
        System.out.println("List of even Numbers using method reference");
        numbers.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);
        System.out.println("List of odd Numbers using method reference");
        numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
    }

}
