package me.lulu.designpatternpratcie.abstractfactory.linux;

import me.lulu.designpatternpratcie.abstractfactory.Button;
import me.lulu.designpatternpratcie.abstractfactory.Menu;
import me.lulu.designpatternpratcie.abstractfactory.PanelAbstractFactory;

public class LinuxFactoryPanel implements PanelAbstractFactory {

    @Override
    public Button getButton() {
        return new LinuxButton();
    }

    @Override
    public Menu getMenu() {
        return new LinuxMenu();
    }
}
