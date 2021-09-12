package _03_abstract.solution_3.factory;

import _03_abstract.solution_3.pojo.Component;

public interface GUIFactory {

    public Component createButton();

    public Component createList();

    public Component createTable();
}