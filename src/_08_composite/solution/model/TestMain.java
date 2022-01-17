package _08_composite.solution.model;

public class TestMain {
    public static void main(String[] args) {
        ManagerCompositeImpl managerComposite1 = new ManagerCompositeImpl("Developer");
        Employee employee1 = new Employee("sebo","guclu",16541905);
        Employee employee2 = new Employee("huso","saglam",16541906);
        managerComposite1.save(employee1);
        managerComposite1.save(employee2);

        ManagerCompositeImpl managerComposite2 = new ManagerCompositeImpl("Test Otomasyon");
        Employee employee3 = new Employee("okan","karahan",16541907);
        Employee employee4 = new Employee("merve","saglam",16541908);
        managerComposite2.save(employee3);
        managerComposite2.save(employee4);

        System.out.println(managerComposite1.listEmployee());
        System.out.println(managerComposite2.listEmployee());

    }
}
