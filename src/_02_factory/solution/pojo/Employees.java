package _02_factory.solution.pojo;

public class Employees {

    public int no;
    public String name;
    public int year;
    public String department;
    public double salary;

    public static final int BASE_SALARY = 500;

    public Employees(int no, String name, int year, String department)
    {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public void work()
    {
        System.out.println("Employee is working!");
    }

    public double calculateSalary()
    {
        salary = year * BASE_SALARY;
        return salary;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getBaseSalary() {
        return BASE_SALARY;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
