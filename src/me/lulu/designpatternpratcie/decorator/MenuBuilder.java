package me.lulu.designpatternpratcie.decorator;

public class MenuBuilder {

    private Menu menu;

    public MenuBuilder(Menu menu) {
        this.menu = menu;
    }

    public static MenuBuilder from(Menu menu) {
        return new MenuBuilder(menu);
    }

    public MenuBuilder fillEmptyWithGlasses() {
        this.menu = new MenuGlassesDecorator(menu);
        return this;
    }

    public MenuBuilder withScrollbar() {
        this.menu = new MenuScrollableDecorator(menu);
        return this;
    }

    public Menu build() {
        return menu;
    }

}
