package _01_singleton;

public class BasicSingleton {

    private static BasicSingleton basicSingleton = new BasicSingleton();
    int count = 0;
    String name = "";
    private BasicSingleton(){
        count++;
        name = "Singleton = " +getCount();

    };

    public static BasicSingleton getBasicSingleton() {
        return basicSingleton;
    }

    public int getCount(){
        return count;
    }

    public void printName() {
        System.out.println(name);
    }

}
