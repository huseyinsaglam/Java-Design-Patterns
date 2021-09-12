package _01_singleton.test;

import _01_singleton.BillPughSingleton;

public class BillPughSingletonTest extends Thread {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            BillPughSingletonTest billPughSingletonTest = new BillPughSingletonTest();
            billPughSingletonTest.start();

        }
    }

    public void run() {
        BillPughSingleton s1 = BillPughSingleton.getBillPughSingleton();
        s1.printName();
    }
}
