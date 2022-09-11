package structural._08_composite.example1.testComposite;

import structural._08_composite.example1.pojo.CompositePatternEmployee;

public class TestComposite {

    public static void main(String[] args) {

        // CEO
        CompositePatternEmployee CEO = new CompositePatternEmployee("John","CEO", 30000);

        // Satis Muduru
        CompositePatternEmployee headSales = new CompositePatternEmployee("Robert","Head Sales", 20000);

        // Market Muduru
        CompositePatternEmployee headMarketing = new CompositePatternEmployee("Michel","Head Marketing", 20000);

        // Calisan
        CompositePatternEmployee clerk1 = new CompositePatternEmployee("Laura","Marketing", 10000);
        CompositePatternEmployee clerk2 = new CompositePatternEmployee("Bob","Marketing", 10000);

        // Satış Yöneticisi
        CompositePatternEmployee salesExecutive1 = new CompositePatternEmployee("Richard","Sales", 10000);
        CompositePatternEmployee salesExecutive2 = new CompositePatternEmployee("Rob","Sales", 10000);

        // CEO-SATIS MUDURU && CEO-MARKET MUDURU
        CEO.add(headSales);
        CEO.add(headMarketing);

        // SATIS MUDURU- SATIS YONETICISI
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        // MARKET MUDURU- CALISAN
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO);

        for (CompositePatternEmployee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (CompositePatternEmployee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
