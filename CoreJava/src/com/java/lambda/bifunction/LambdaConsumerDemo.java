package com.java.lambda.bifunction;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class LambdaConsumerDemo {

    public static void main(String[] args) {
        //Using anonymous class
        BiConsumer<Integer,Integer> biConsumer = new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer a, Integer b) {
                System.out.println(a + b);
            }
        };
        biConsumer.accept(10,20);
        System.out.println("*******************************");
        //Converting from anonymous to lambda
        BiConsumer<Integer,Integer> biConsumer1 = (a, b) -> System.out.println(a + b);
        BiConsumer<Integer,Integer> sub = (a, b) -> System.out.println(a - b);
        BiConsumer<Integer,Integer> multi = (a, b) -> System.out.println(a * b);
        BiConsumer<Integer,Integer> div = (a, b) -> System.out.println(a / b);
        biConsumer1.accept(10,20);
        sub.accept(10,20);
        multi.accept(10,20);
        div.accept(10,20);

        //Map foreach uses BiConsumer interface here is the example

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"Chaitanya");
        map.put(2,"Anil");
        map.put(3,"Anu");
        map.put(4,"Anusha");

        map.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });
    }
}
