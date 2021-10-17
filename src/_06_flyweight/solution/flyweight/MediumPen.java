package _06_flyweight.solution.flyweight;

import _06_flyweight.solution.pojo.BrushSize;

public class MediumPen implements Pen{

    BrushSize thick = BrushSize.MEDIUM;      // intrinsic state  = degismeyen, immutable
    String color = null;                    // extrinsic state  = client tarafindan dis tarafindan set edilebilen

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing MEDIUM content in color : " + color);
    }
}
