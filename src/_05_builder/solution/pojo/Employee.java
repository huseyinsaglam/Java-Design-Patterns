package _05_builder.solution.pojo;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Employee(EmployeeBuilder employeeBuilder)
    {
        this.name = employeeBuilder.name;
        this.surname = employeeBuilder.surname;
        this.age = employeeBuilder.age;
        this.address = employeeBuilder.address;
    }




    @Override
    public String toString() {
        return "Employee : [name=" + name + ", surname=" + surname + ", age=" + age + ", address=" + address + "]";
    }




    public static class EmployeeBuilder
    {
        private String name;
        private String surname;
        private int age;
        private String address;

        public EmployeeBuilder(String name,String surname)
        {
            this.name=name;
            this.surname=surname;
        }

        public EmployeeBuilder age(int age)
        {
            this.age = age;
            return this;
        }

        public EmployeeBuilder address(String address)
        {
            this.address = address;
            return this;
        }
        public Employee build()
        {
            return new Employee(this);
        }
    }

}
