import com.ext.pojo.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingUsingStreams {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(10,"Ramesh",30,400000));
        employeeList.add(new Employee(11,"San",13,700000));
        employeeList.add(new Employee(12,"Sue",15,500000));
        employeeList.add(new Employee(9,"Alisa",67,423000));

        List<Employee> sortedList = employeeList.stream().sorted(new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).toList();
        System.out.println("Sorted List by Salary:: "+sortedList);

        List<Employee> sortedList1 = employeeList.stream().sorted((Employee o1,Employee o2)->(int)(o1.getSalary() - o2.getSalary())).toList();
        System.out.println("Sorted List by Salary:: "+sortedList1);

        List<Employee> sortedList2 = employeeList.stream().sorted(Comparator.comparingLong(Employee::getSalary)).toList();
        System.out.println("Sorted List by Salary "+sortedList2);

        List<Employee> sortedList3 = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).toList();
        System.out.println("Sorted List by Age "+sortedList3);

        List<Employee> sortedList4 = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).toList();
        System.out.println("Sorted List by Age in descending order "+sortedList4);
    }

}
