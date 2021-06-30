package _02_factory.solution.pojo;

public class Manager extends Employees {

    protected String departmentManaged;

    public static final int MANAGEMENT_PAYMENT = 3000;

    public Manager(int no, String name, int year, String workingDepartment, String departmentManaged) {

        super(no,name,year,workingDepartment);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public void work() {
        System.out.println("Manager is working!");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary()+MANAGEMENT_PAYMENT;
    }

    public String getDepartmentManaged() {
        return departmentManaged;
    }

    public void Manage()
    {
        System.out.println("Manager manages department: " + departmentManaged);
    }

    public void setDepartmentManaged(String departmentManaged) {
        this.departmentManaged = departmentManaged;
    }
}
