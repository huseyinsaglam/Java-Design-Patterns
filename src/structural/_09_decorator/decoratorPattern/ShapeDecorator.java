package structural._09_decorator.decoratorPattern;

import structural._09_decorator.pojo.Shape;

public abstract class ShapeDecorator implements Shape{

    protected Shape shapeDecorator;

    public ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
    }
}
