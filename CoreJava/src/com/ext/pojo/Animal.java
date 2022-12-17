package com.ext.pojo;

class Animal {
    String name;
    public Animal() {
        super();
        this.name = "Default Name";
    }
    // This is called a one argument constructor.
    public Animal(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}