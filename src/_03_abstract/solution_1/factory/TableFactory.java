package _03_abstract.solution_1.factory;

import _03_abstract.solution_1.pojo.Component;
import _03_abstract.solution_1.pojo.Table;

public class TableFactory implements GuiFactory{
    @Override
    public Component create() {
        return new Table();
    }
}
