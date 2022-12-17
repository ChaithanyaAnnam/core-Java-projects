package com;

import java.util.*;


class SortEmployee{
    public static void main(String[] args) {
        TreeSet<Employees> employeeTreeSet = new TreeSet<>();
        List<Employees> employeesList;
        Employees employee1 = new Employees("aithanya", 1, "chaiti.annm");
        Employees employee2 = new Employees("stam", 2, "tam.annm");
        Employees employee3 = new Employees("shanti", 3, "shanti.annm");
        Employees employee4 = new Employees("dev", 4, "dev.annm");
        Employees employee5 = employee1;
        System.out.println(employee5.name);
        employee1.setName("Chaitanya");
        employeeTreeSet.add(employee1);
        employeeTreeSet.add(employee2);
        employeeTreeSet.add(employee3);
        employeeTreeSet.add(employee4);
        employeeTreeSet.forEach(System.out::println);

        //Sorting list of employees.
        employeesList = Arrays.asList(employee1, employee2, employee3, employee4);
        System.out.println("Sorting by Id");
        employeesList.stream().sorted(Comparator.comparingInt(Employees::getId)).forEach(System.out::println);
        System.out.println("Sorting by Name");
        employeesList.stream().sorted(Comparator.comparing(Employees::getName)).forEach(System.out::println);
        System.out.println("Sorting by Id and then Name");
        employeesList.stream().sorted(Comparator.comparingInt(Employees::getId)
                .thenComparing(Employees::getName)).forEach(System.out::println);

        System.out.println(employeesList.stream().max(Comparator.comparingInt(Employees::getId)));

        System.out.println(employee1.name);
        System.out.println(employee2.name);
        System.out.println(employee3.name);
        System.out.println(employee4.name);
        System.out.println(employee5.name);

        System.out.println("Distinct employees :");
        findDistinctEmployee();
    }
    public static void findDistinctEmployee(){
        List<Employees> employeesList;
        Employees employee1 = new Employees("aithanya", 1, "chaiti.annm");
        Employees employee2 = new Employees("stam", 2, "tam.annm");
        Employees employee3 = new Employees("shanti", 3, "shanti.annm");
        Employees employee4 = new Employees("dev", 4, "dev.annm");
        Employees employee5 = new Employees("dev", 5, "dev.ananm");
        Employees employee6 = new Employees("dev", 6, "dev.ananm");
        employeesList = Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6);

        employeesList.stream().distinct().forEach(System.out::println);

    }
}
