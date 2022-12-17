package com.java.lambda.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaFunctionEx {
    public static void main(String[] args) {
        //Using anonymous class
        /*BiFunction<Integer, Integer, Integer> biFunction = new  BiFunction<Integer, Integer, Integer>(){

            @Override
            public Integer apply(Integer t, Integer u) {
                return (t + u);
            }
        };*/
        //converting anonymous class to lambda
        BiFunction<Integer, Integer, Integer> addition = (t, u) -> (t + u);
        BiFunction<Integer, Integer, Integer> subtraction = (t, u) -> (t - u);
        BiFunction<Integer, Integer, Integer> multiplication = (t, u) -> (t * u);

        System.out.println(addition.apply(10,20));
        System.out.println(subtraction.apply(50,20));
        System.out.println(multiplication.apply(50,20));


        //converting lambda to method reference
        BiFunction<Integer, Integer, Integer> add = Integer::sum;

        System.out.println(add.apply(10,20));


        //Using bifunction andThen method.
        Function<Integer, Integer> function = (number)  -> (number * number);
        Integer integer = addition.andThen(function).apply(10,20);
        System.out.println("Bi function then "+integer);

    }
}
