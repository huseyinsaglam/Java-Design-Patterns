package structural._09_decorator.decoratorPattern;

import structural._09_decorator.pojo.Shape;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        setRedBorder(shapeDecorator);
    }

    public void setRedBorder(Shape shape){
        System.out.println("Red Shape Border");
    }
}
