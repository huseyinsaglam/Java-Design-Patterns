package structural._10_facade.test;

import structural._10_facade.facadePattern.ShapeMaker;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
