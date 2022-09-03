package creational._02_factory.test;

import creational._02_factory.Shape;
import creational._02_factory.pattern.FactoryPattern;

public class TestFactory {

    public static void main(String[] args) {

        Shape circleShape = FactoryPattern.getShapeDraw("circle");
        circleShape.draw();

        Shape squareShape = FactoryPattern.getShapeDraw("square");
        squareShape.draw();

    }
}
