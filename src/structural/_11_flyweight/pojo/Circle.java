package structural._11_flyweight.pojo;

public class Circle implements Shape {  // daire/cember

    private String color;

    public Circle(String color){
        this.color = color;
    }


    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color);
    }
}
