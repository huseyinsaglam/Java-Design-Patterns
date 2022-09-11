package structural._08_composite.example1.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompositePatternEmployee {

    private String name;
    private String dept;
    private int salary;
    private List<CompositePatternEmployee> subordinates;

    // constructor
    public CompositePatternEmployee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<CompositePatternEmployee>();
    }

    public void add(CompositePatternEmployee e) {
        subordinates.add(e);
    }

    public void remove(CompositePatternEmployee e) {
        subordinates.remove(e);
    }

    public List<CompositePatternEmployee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("CompositePatternEmployee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}
