package com.java.strings;

public class StingConcatination {
    public static void main(String[] args) {
        String str = "";
        long startTime = System.nanoTime();
        for (int i=0; i<10; i++){
            str = str +i;
        }
        long endTime = System.nanoTime();
        System.out.printf("String operation with operator symbol took [%d] nano seconds%n", (endTime-startTime));

        StringBuilder builder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i=0; i<10; i++){
            builder.append(i);
        }
        endTime = System.nanoTime();
        System.out.printf("String operation with String builder took [%d] nano seconds%n", (endTime-startTime));

        StringBuffer buffer = new StringBuffer();
        startTime = System.nanoTime();
        for (int i=0; i<10; i++){
            buffer.append(i);
        }
        endTime = System.nanoTime();
        System.out.printf("String operation with String buffer took [%d] nano seconds%n", (endTime-startTime));

    }
}
