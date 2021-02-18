package me.lulu.designpatternpratcie.abstractfactory;

public class PanelFactory {

    public static Panel createPanel(PanelAbstractFactory panelAbstractFactory) {
        return new Panel(panelAbstractFactory.getMenu(), panelAbstractFactory.getButton());
    }

}
