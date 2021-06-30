package _02_factory.solution.factory;

import _02_factory.solution.pojo.EmployeeRandomizer;
import _02_factory.solution.pojo.Employees;

public class EmployeeFactory implements Factory{

    @Override
    public Employees create() {
        Employees employee = new Employees(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
                EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
        return employee;
    }
}
