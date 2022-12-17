package com.java.features;

import com.ext.pojo.Client;

public class EqualsInString {


    public static void main(String[] args) {
        Client client1 = new Client(25);
        Client client2 = new Client(25);

        Client client3 = client1;

        Client client4 = null;

        System.out.println(client1==client2);
        System.out.println(client1==client3);

        //When equals method override to compare contents of class this returns true.
        System.out.println(client1.equals(client2));
        System.out.println(client1.equals(client3));

        System.out.println(client1.equals(client4));
    }
}
