package _06_flyweight.solution.flyweight.PenFactory;

import _06_flyweight.solution.flyweight.MediumPen;
import _06_flyweight.solution.flyweight.Pen;
import _06_flyweight.solution.flyweight.ThickPen;
import _06_flyweight.solution.flyweight.ThinPen;

import java.util.HashMap;
import java.util.Map;

public class PenFactory{

    private static final Map<String, Pen> pensMap = new HashMap<>();

    public static Pen getThickPen(String color) {

        String key = color + "-THICK";

        Pen pen = pensMap.get(key);

        if(pen != null) {
            return pen;
        } else {
            pen = new ThickPen();
            pen.setColor(color);
            pensMap.put(key, pen);
        }

        return pen;
    }

    public static Pen getMediumPen(String color) {
        String key = color + "-MEDIUM";

        Pen pen = pensMap.get(key);

        if(pen != null) {
            return pen;
        } else {
            pen = new MediumPen();
            pen.setColor(color);
            pensMap.put(key, pen);
        }

        return pen;
    }


    public static Pen getThinPen(String color) {
        String key = color + "-THIN";

        Pen pen = pensMap.get(key);

        if(pen != null) {
            return pen;
        } else {
            pen = new ThinPen();
            pen.setColor(color);
            pensMap.put(key, pen);
        }

        return pen;
    }

    public static void getPensMap() {
        for (Map.Entry<String, Pen> pens: pensMap.entrySet()) {
            System.out.format("key: %s, value: %s", pens.getKey(), pens.getValue().getClass());
        }
    }
}
