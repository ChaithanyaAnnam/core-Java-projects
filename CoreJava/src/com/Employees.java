package com;

import com.ext.pojo.Employee;

import java.util.Objects;

public class Employees implements Comparable<Employees> {
    public String name;
    public int id;
    public String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Employees(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }
    @Override
    public int compareTo(Employees o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;
        Employees employees = (Employees) o;
        return Objects.equals(name, employees.name) && Objects.equals(email, employees.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,email);
    }
}