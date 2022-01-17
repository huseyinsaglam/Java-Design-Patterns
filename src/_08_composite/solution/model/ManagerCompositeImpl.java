package _08_composite.solution.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerCompositeImpl implements ManagerComposite {

    List<Employee> employeeList = new ArrayList<Employee>();
    String managerName = "";

    public ManagerCompositeImpl(String manager) {
        managerName = manager;
    }

    @Override
    public void save(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void delete(long id) {
        for (int i = 0; i <= employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.remove(i);
            }
        }
    }

    @Override
    public Employee findEmployee(long id) {
        for (int i = 0; i <= employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                return employeeList.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Employee> listEmployee() {
        System.out.println("*******************" + this.managerName + "*******************");
        return employeeList;
    }
}
