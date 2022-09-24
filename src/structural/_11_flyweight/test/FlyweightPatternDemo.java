package structural._11_flyweight.test;

import structural._11_flyweight.flyweightPattern.ShapeFactory;
import structural._11_flyweight.pojo.Circle;

public class FlyweightPatternDemo {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
}
