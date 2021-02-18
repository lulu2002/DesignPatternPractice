package me.lulu.designpatternpratcie.decorator;

public abstract class AbstractMenuDecorator extends Menu {

    protected Menu menu;

    public AbstractMenuDecorator(Menu menu) {
        super(menu.getTitle(), menu.getRows());
        this.menu = menu;
    }

}
