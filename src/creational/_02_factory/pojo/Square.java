package creational._02_factory.pojo;

import creational._02_factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square...");
    }
}
