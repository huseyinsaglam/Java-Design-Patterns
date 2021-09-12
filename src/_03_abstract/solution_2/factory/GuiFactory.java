package _03_abstract.solution_2.factory;

import _03_abstract.solution_2.pojo.Component;

public interface GuiFactory {

    public Component createButton();

    public Component createList();

    public Component createTable();
}
