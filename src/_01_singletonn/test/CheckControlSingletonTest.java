package _01_singletonn.test;

import _01_singletonn.CheckControlSingleton;

public class CheckControlSingletonTest extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            CheckControlSingletonTest checkControlSingletonTest = new CheckControlSingletonTest();
            checkControlSingletonTest.start();

        }
    }

    public void run() {
        CheckControlSingleton s1 = CheckControlSingleton.getLazySingleton();
        s1.printName();
    }
}
