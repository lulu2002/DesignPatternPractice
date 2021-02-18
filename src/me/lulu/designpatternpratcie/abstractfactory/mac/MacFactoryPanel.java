package me.lulu.designpatternpratcie.abstractfactory.mac;

import me.lulu.designpatternpratcie.abstractfactory.Button;
import me.lulu.designpatternpratcie.abstractfactory.Menu;
import me.lulu.designpatternpratcie.abstractfactory.PanelAbstractFactory;

public class MacFactoryPanel implements PanelAbstractFactory {

    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public Menu getMenu() {
        return new MacMenu();
    }
}
