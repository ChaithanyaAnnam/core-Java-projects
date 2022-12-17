package com.java.sorting;

public class Employee {
    String firstName;
    String LastName;
    int id;
    String email;

    public Employee(String firstName, String lastName, int id, String email) {
        this.firstName = firstName;
        LastName = lastName;
        this.id = id;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
