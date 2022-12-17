package com.java.lambda.defaultstatic;

import com.java.lambda.defaultstatic.impl.Car;

public class DefaultDemo{
    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getSpeed());
        System.out.println(vehicle.slowDown());

        //default method call
        System.out.println(vehicle.turnAlarmOn());
        System.out.println(vehicle.turnAlarmOff());

        //static method call
        System.out.println(Vehicle.getCompany());
    }
}