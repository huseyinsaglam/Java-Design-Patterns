package _03_abstract.solution_3.factory.winFactory;

import _03_abstract.solution_3.factory.GUIFactory;
import _03_abstract.solution_3.pojo.Component;
import _03_abstract.solution_3.pojo.button.WinButton;
import _03_abstract.solution_3.pojo.list.WinList;
import _03_abstract.solution_3.pojo.table.WinTable;

public class WinFactory implements GUIFactory {
    @Override
    public Component createButton() {
        return new WinButton();
    }

    @Override
    public Component createList() {
        return new WinList();
    }

    @Override
    public Component createTable() {
        return new WinTable();
    }
}
