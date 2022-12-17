package com.java.sorting;

import com.Employees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortUsingLambdas {
    public static void main(String[] args) {
        Employee employee1= new Employee("Caithanya","Annam",1,"chaiti.annm");
        Employee employee2= new Employee("stam","John",2,"tam.annm");
        Employee employee3= new Employee("shanti","Swaroop",3,"shanti.annm");
        Employee employee4= new Employee("dev","Kumar",4,"dev.annm");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);employeeList.add(employee2);
        employeeList.add(employee3);employeeList.add(employee4);

        employeeList.stream().sorted(Comparator.comparing(Employee::getLastName))
                .sorted(Comparator.comparing(Employee::getFirstName))
                .toList().forEach(System.out::println);
        System.out.println("=====================");
        employeeList.stream().sorted(Comparator.comparing(Employee::getLastName)
                        .thenComparing(Employee::getFirstName))
                .toList().forEach(System.out::println);
        System.out.println("=====================");
    }
}
