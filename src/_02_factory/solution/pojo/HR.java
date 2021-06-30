package _02_factory.solution.pojo;

import java.util.ArrayList;
import java.util.List;

public class HR {

    private List<Employees> employees = new ArrayList<>();

    public List<Employees> getEmployees()
    {
        return employees;
    }

    public int getNumberOfEmployees()
    {
        return employees.size();
    }

    public void addNewEmployee(Employees employee)
    {
        employees.add(employee);
    }

    public void listEmployees()
    {
        System.out.println("All Employees");

        for (Employees employee : employees) {
            System.out.println(employee);
        }
    }

}
