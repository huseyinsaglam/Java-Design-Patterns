package _08_composite.solution.model;

import java.util.List;

public interface ManagerComposite {

    public void save(Employee employee);

    public void delete(long id);

    public Employee findEmployee(long id);

    public List<Employee> listEmployee();

}
