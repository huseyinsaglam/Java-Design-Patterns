package _05_builder.solution.test;

import _05_builder.solution.pojo.Employee;

public class TestMain {

    public static void main(String[] args) {

        Employee employee = new Employee.EmployeeBuilder("huseyin", "saglam").build();

        System.out.println(employee);



        Employee employee1 = new Employee.EmployeeBuilder("huseyin", "saglam").age(30).build();

        System.out.println(employee1);
    }

}
