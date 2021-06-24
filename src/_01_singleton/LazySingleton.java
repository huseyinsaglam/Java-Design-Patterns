package _01_singleton;

public class LazySingleton {

    private static LazySingleton lazySingleton;
    private int count = 0;
    String name = "";

    private LazySingleton() {
        count++;
        name = "Singleton = " + getCount();
    }

    ;

    public static LazySingleton getLazySingleton() {

        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();

        }
        return lazySingleton;
    }

    public int getCount(){
        return count;
    }

    public void printName() {
        System.out.println(name);
    }

}
