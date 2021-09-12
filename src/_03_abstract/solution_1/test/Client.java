package _03_abstract.solution_1.test;

import _03_abstract.solution_1.pojo.Component;
import _03_abstract.solution_1.factory.GuiFactory;

public class Client {
    public Client(GuiFactory factory){
        Component component = factory.create();
        component.paint();
    }
}
