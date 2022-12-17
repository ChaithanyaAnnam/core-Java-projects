package com.java.features;

class Animal {
    public Animal() {
        System.out.println("Animal Constructor");
    }
}
class Dog extends Animal {
    public Dog() {
        System.out.println("Dog Constructor");
    }
}
class Labrador extends Dog {
    public Labrador() {
        System.out.println("Labrador Constructor");
    }
}
public class ConstructorRunner {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();

        for (int i = 0,j = 0; i < 10; i++,j--) {
            System.out.print(j);
        }
    }



}
