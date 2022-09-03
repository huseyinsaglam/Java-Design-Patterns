package creational._03_abstractFactory.test;

import creational._03_abstractFactory.CircleFactory;
import creational._03_abstractFactory.SquareFactory;
import creational._03_abstractFactory.pattern.AbstractFactory;

public class TestAbstractFactory {

    public static void main(String[] args) {

        CircleFactory circleFactory = new CircleFactory();
        circleFactory.getShapeDraw().draw();

        SquareFactory squareFactory = new SquareFactory();
        squareFactory.getShapeDraw().draw();
    }
}
