package _02_factory.solution;

import _02_factory.solution.factory.DirectorFactory;
import _02_factory.solution.factory.EmployeeFactory;
import _02_factory.solution.factory.Factory;
import _02_factory.solution.factory.ManagerFactory;
import _02_factory.solution.pojo.HR;

public class Test {

    public static void main(String[] args) {
        HR hr = new HR();

        Factory employeeFactory = new EmployeeFactory();
        Factory managerFactory = new ManagerFactory();
        Factory directorFactory = new DirectorFactory();

        // Add more employees
        hr.addNewEmployee(employeeFactory.create());
        hr.addNewEmployee(employeeFactory.create());
        hr.addNewEmployee(employeeFactory.create());
        hr.addNewEmployee(managerFactory.create());
        hr.addNewEmployee(managerFactory.create());
        hr.addNewEmployee(managerFactory.create());
        hr.addNewEmployee(directorFactory.create());
        hr.addNewEmployee(directorFactory.create());

        hr.listEmployees();

    }
}
