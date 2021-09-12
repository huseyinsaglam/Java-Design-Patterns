package _03_abstract.solution_3.factory.osxFactory;

import _03_abstract.solution_3.factory.GUIFactory;
import _03_abstract.solution_3.pojo.Component;
import _03_abstract.solution_3.pojo.button.OSXButton;
import _03_abstract.solution_3.pojo.list.OSXList;
import _03_abstract.solution_3.pojo.table.OSXTable;

public class OSXFactory implements GUIFactory {

    public Component createButton() {
        return new OSXButton();
    }

    @Override
    public Component createList() {
        return new OSXList();
    }

    @Override
    public Component createTable() {
        return new OSXTable();
    }
}