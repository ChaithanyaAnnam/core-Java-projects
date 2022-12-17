package com.java.lambda.defaultstatic;

public interface Vehicle {
    String getBrand();

    String getSpeed();

    String slowDown();

    default String turnAlarmOn(){
        return "turning vehicle alarm on";
    }

    default String turnAlarmOff(){
        return "turning vehicle alarm off";
    }

    static String getCompany(){
        return "BMW";
    }
}
