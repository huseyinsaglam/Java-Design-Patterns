package _03_abstract.solution_1.factory;

import _03_abstract.solution_1.pojo.Component;
import _03_abstract.solution_1.pojo.Button;

public class ButtonFactory implements GuiFactory{
    @Override
    public Component create() {
        return new Button();
    }
}
