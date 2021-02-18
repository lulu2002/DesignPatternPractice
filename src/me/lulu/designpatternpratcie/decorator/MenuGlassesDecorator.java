package me.lulu.designpatternpratcie.decorator;

public class MenuGlassesDecorator extends AbstractMenuDecorator {

    public MenuGlassesDecorator(Menu menu) {
        super(menu);
    }

    @Override
    public void display() {
        makeEmptySlotToGlass();
        menu.display();
    }

    private void makeEmptySlotToGlass() {
        String[] items = menu.getItems();

        for (int i = 0; i < items.length; i++) {
            items[i] = (items[i] == null ? "G" : items[i]);
        }
    }
}
