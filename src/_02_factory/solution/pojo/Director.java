package _02_factory.solution.pojo;

public class Director extends Manager{

    protected double bonus;

    public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
        super(no, name, year, workingDepartment, managingDepartment);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Director is working!");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    public void Manage() {
        System.out.println("Director manages whole company!");
        makeAStrategicPlan();
    }

    public void makeAStrategicPlan()
    {
        System.out.println("Director makes a strategic plan for the company!");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
