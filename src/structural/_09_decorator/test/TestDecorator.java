package structural._09_decorator.test;

import structural._09_decorator.decoratorPattern.RedShapeDecorator;
import structural._09_decorator.pojo.Circle;

public class TestDecorator {

    public static void main(String[] args) {

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(new Circle());

        redShapeDecorator.draw();
    }
}
