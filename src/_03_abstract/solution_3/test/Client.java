package _03_abstract.solution_3.test;

import _03_abstract.solution_3.factory.GUIFactory;
import _03_abstract.solution_3.pojo.Component;

public class Client {
    public Client(GUIFactory factory){
        Component button = factory.createButton();
        button.paint();

        Component list = factory.createList();
        list.paint();

        Component table = factory.createTable();
        table.paint();
    }
}
