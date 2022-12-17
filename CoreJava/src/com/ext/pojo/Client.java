package com.ext.pojo;

public class Client{
    private int id;
    public Client(int id) {
        this.id = id;
    }

    /*@Override
    public boolean equals(Object obj) {
        Client client = (Client) obj;
        if(id != client.id)
            return false;
        return true;
    }*/

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if(this.id != other.id)
            return false;
        return true;
    }
}