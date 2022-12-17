package com.java.lambda.defaultstatic.impl;

import com.java.lambda.defaultstatic.Vehicle;

public class Car implements Vehicle {

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String getSpeed() {
        return "The car is speeding up";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down";
    }
}


