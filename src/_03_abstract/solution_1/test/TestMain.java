package _03_abstract.solution_1.test;

import _03_abstract.solution_1.factory.ButtonFactory;

public class TestMain {
    public static void main(String[] args) {
        new Client(new ButtonFactory());
    }
}
