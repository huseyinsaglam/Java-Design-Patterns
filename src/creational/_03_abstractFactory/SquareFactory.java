package creational._03_abstractFactory;

import creational._03_abstractFactory.pattern.AbstractFactory;
import creational._03_abstractFactory.pojo.Shape;
import creational._03_abstractFactory.pojo.Square;

public class SquareFactory implements AbstractFactory {
    @Override
    public Shape getShapeDraw() {
        return new Square();
    }
}
