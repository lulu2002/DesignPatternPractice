package me.lulu.designpatternpratcie.decorator;

public class DecoratorExecute {

    public static void main(String[] args) {
        Menu menu = MenuBuilder.from(new SimpleMenu("Hello", 6))
                .withScrollbar()
                .fillEmptyWithGlasses()
                .withScrollbar()
                .build();

        menu.display();
    }

}
