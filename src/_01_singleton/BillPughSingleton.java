package _01_singleton;

public class BillPughSingleton {

    private int count = 0;
    private String name = "";
    private BillPughSingleton() {
        count++;
        name = "Singleton = " +getCount();
    }

    private static class SingletonHelper{

        private static BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getBillPughSingleton() {
        return SingletonHelper.INSTANCE;
    }
    public int getCount(){
        return count;
    }

    public void printName() {
        System.out.println(name);
    }
}
