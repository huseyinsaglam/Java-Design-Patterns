package _02_factory.solution.factory;

import _02_factory.solution.pojo.EmployeeRandomizer;
import _02_factory.solution.pojo.Employees;
import _02_factory.solution.pojo.Manager;

public class ManagerFactory implements Factory{

    @Override
    public Employees create() {
        String department = EmployeeRandomizer.createDepartment();
        Manager manager = new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
                EmployeeRandomizer.createYear(), department, department);
        return manager;
    }
}
