package me.lulu.designpatternpratcie.decorator;

public class MenuScrollableDecorator extends AbstractMenuDecorator {

    public MenuScrollableDecorator(Menu menu) {
        super(menu);
    }

    @Override
    public void display() {
        addScrollbarIfNeed();

        menu.display();
    }

    private void addScrollbarIfNeed() {
        System.out.println("Scollbar added!");
    }
}
