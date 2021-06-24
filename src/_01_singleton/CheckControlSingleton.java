package _01_singleton;

public class CheckControlSingleton {

    private static CheckControlSingleton controlSingleton;
    private int count = 0;
    String name = "";

    private CheckControlSingleton() {
        count++;
        name = "Singleton = " +getCount();
    }


    public static CheckControlSingleton getLazySingleton() {

        if (controlSingleton == null) {
            synchronized (CheckControlSingleton.class) {

                if (controlSingleton == null) {
                    controlSingleton = new CheckControlSingleton();

                }
            }
        }
        return controlSingleton;
    }

    public int getCount() {
        return count;
    }

    public void printName() {
        System.out.println(name);
    }

}
