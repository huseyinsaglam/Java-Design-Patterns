package structural._11_flyweight.flyweightPattern;

import structural._11_flyweight.pojo.Circle;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<String,Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color){
        Circle circle = circleMap.get(color);

        if (circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
        }

        return circle;
    }

}
