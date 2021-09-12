package _03_abstract.solution_2.test;

import _03_abstract.solution_2.pojo.Component;
import _03_abstract.solution_2.factory.GuiFactory;

public class Client {

    public Client(GuiFactory guiFactory) {
        Component button = guiFactory.createButton();
        button.paint();

        Component list = guiFactory.createList();
        list.paint();

        Component table = guiFactory.createTable();
        table.paint();
    }
}
