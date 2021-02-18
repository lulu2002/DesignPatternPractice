package me.lulu.designpatternpratcie.abstractfactory.windows;

import me.lulu.designpatternpratcie.abstractfactory.Button;
import me.lulu.designpatternpratcie.abstractfactory.Menu;
import me.lulu.designpatternpratcie.abstractfactory.PanelAbstractFactory;

public class WindowsFactoryPanel implements PanelAbstractFactory {

    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public Menu getMenu() {
        return new WindowsMenu();
    }
}
