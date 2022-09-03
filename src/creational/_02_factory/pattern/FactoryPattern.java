package creational._02_factory.pattern;

import creational._02_factory.pojo.Circle;
import creational._02_factory.Shape;
import creational._02_factory.pojo.Square;

public class FactoryPattern {

    public static Shape getShapeDraw(String shape){

        if (!shape.isEmpty()){
            if (shape.equalsIgnoreCase("Circle")){
                return new Circle();
            }
            else if (shape.equalsIgnoreCase("Square")){
                return new Square();
            }
            else {
                System.out.println("Lutfen gecerli bir sekil giriniz");
            }
        }
        return null;
    }
}
