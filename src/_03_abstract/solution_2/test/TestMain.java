package _03_abstract.solution_2.test;

import _03_abstract.solution_2.factory.GuiFactoryImpl;

public class TestMain {
    public static void main(String[] args) {
        new Client(new GuiFactoryImpl());
    }
}
