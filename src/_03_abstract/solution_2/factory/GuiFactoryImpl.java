package _03_abstract.solution_2.factory;

import _03_abstract.solution_2.pojo.Button;
import _03_abstract.solution_2.pojo.Component;
import _03_abstract.solution_2.pojo.List;
import _03_abstract.solution_2.pojo.Table;

public class GuiFactoryImpl implements GuiFactory{
    @Override
    public Component createButton() {
        return new Button();
    }

    @Override
    public Component createList() {
        return new List();
    }

    @Override
    public Component createTable() {
        return new Table();
    }
}
