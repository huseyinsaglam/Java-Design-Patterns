package creational._03_abstractFactory;

import creational._03_abstractFactory.pattern.AbstractFactory;
import creational._03_abstractFactory.pojo.Circle;
import creational._03_abstractFactory.pojo.Shape;

public class CircleFactory implements AbstractFactory {
    @Override
    public Shape getShapeDraw() {
        return new Circle();
    }
}
