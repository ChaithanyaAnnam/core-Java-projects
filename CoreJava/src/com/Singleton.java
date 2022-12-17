package com;

import org.w3c.dom.ls.LSOutput;

public class Singleton {

    private static Singleton singleton = null;
    private Singleton(){};
    public synchronized static Singleton getSingleton(){
        if(singleton == null)
            singleton =  new Singleton();

        return singleton;
    }
}


class SingletonExample{

    public Singleton getSingleton(){
        return Singleton.getSingleton();
    }

    public static void main(String[] args) {
        SingletonExample singletonExample = new SingletonExample();
        Singleton singleton = singletonExample.getSingleton();
        System.out.println(singleton);
        System.out.println(Singleton.getSingleton());
    }

}
