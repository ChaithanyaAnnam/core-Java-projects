package com.java.lambda.bifunction;

import java.util.function.BiFunction;

public class TraditionalFunctionEx implements BiFunction<Integer, Integer, Integer> {


    @Override
    public Integer apply(Integer t, Integer u) {
        return t + u;
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = new  TraditionalFunctionEx();
        System.out.println(biFunction.apply(10,20));
    }
}
