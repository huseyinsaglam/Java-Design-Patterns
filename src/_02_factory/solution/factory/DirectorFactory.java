package _02_factory.solution.factory;

import _02_factory.solution.pojo.Director;
import _02_factory.solution.pojo.EmployeeRandomizer;
import _02_factory.solution.pojo.Employees;

public class DirectorFactory implements Factory{


    @Override
    public Employees create() {
        Director director = new Director(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
                EmployeeRandomizer.createYear(), "Management", "Management", 5000);
        return director;
    }
}
