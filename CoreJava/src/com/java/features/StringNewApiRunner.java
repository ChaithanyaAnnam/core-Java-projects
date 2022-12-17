package com.java.features;

class SampleClass{
    String str =null;
}

public class StringNewApiRunner {


    public static void main(String[] args) {
        //Introduced in java 11
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println(" LR ".strip().replace(" ","@"));
        System.out.println(" LR ".stripLeading().replace(" ","@"));
        System.out.println(" LR ".stripTrailing().replace(" ","@"));
        "Line 1\nLine 2\nLine 3\nLine 4\n".lines().forEach(System.out::println);

        //Introduced in java12
        System.out.printf("UPPER".transform(s -> s.toLowerCase()));

        //Introduced in Java 13
        System.out.println("My Name is %s. My Age is %d".formatted("Chaitanya",39));

        //In java 14
        //Helpful Nullpointer Exceptions were introduced
        String str = null;
        //System.out.println(str.isBlank());// This throws exception
        //Exception in thread "main" java.lang.NullPointerException:
        //Cannot invoke "String.isBlank()" because "str" is null
        //at com.java.features.StringNewApiRunner.main(StringNewApiRunner.java:24)

        SampleClass sampleClass = new SampleClass();
        System.out.println(sampleClass.str.isBlank());
        //Exception in thread "main" java.lang.NullPointerException:
        // Cannot invoke "String.isBlank()" because "sampleClass.str" is null
        // at com.java.features.StringNewApiRunner.main(StringNewApiRunner.java:34)
    }
}
