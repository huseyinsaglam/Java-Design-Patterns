package _01_singletonn.test;

import _01_singletonn.BasicSingleton;

public class BasicSingletonTest {
    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            BasicSingleton singleton = BasicSingleton.getBasicSingleton();
            singleton.printName();

        }

        BasicSingleton s1 = BasicSingleton.getBasicSingleton();
        BasicSingleton s2 = BasicSingleton.getBasicSingleton();

        if (s1.hashCode() == s2.hashCode()) {
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
            System.out.println("s1 ve s2 objeleri aynidir");
        } else {
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
            System.out.println("s1 ve s2 objeleri farkidir");

        }

    }
}
