package me.lulu.designpatternpratcie.abstractfactory;

import me.lulu.designpatternpratcie.abstractfactory.mac.MacFactoryPanel;

public class AbstractFactoryExecute {

    public static void main(String[] args) {
        Panel panel = PanelFactory.createPanel(new MacFactoryPanel());
        panel.test();
    }

}
