package _01_singletonn.test;

import _01_singletonn.LazySingleton;

public class LazySingletonTest extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            LazySingletonTest lazySingletonTest = new LazySingletonTest();
            lazySingletonTest.start();

        }
    }

    public void run() {
        LazySingleton s1 = LazySingleton.getLazySingleton();
        s1.printName();
    }
}
