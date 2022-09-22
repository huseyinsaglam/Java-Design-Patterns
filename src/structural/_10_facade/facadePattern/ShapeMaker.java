package structural._10_facade.facadePattern;

import structural._10_facade.pojo.Circle;
import structural._10_facade.pojo.Rectangle;
import structural._10_facade.pojo.Shape;

public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;

    // coupling
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
