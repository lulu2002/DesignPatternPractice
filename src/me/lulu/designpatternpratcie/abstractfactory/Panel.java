package me.lulu.designpatternpratcie.abstractfactory;

public class Panel {
    private Menu menu;
    private Button button;

    public Panel(Menu menu, Button button) {
        this.menu = menu;
        this.button = button;
    }

    public void test() {
        System.out.println("Displaying menu...");
        menu.display();
        System.out.println("Test clicking button...");
        button.click();
    }
}
