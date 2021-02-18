package me.lulu.designpatternpratcie.abstractfactory.mac;

import me.lulu.designpatternpratcie.abstractfactory.Menu;

public class MacMenu implements Menu {

    @Override
    public void display() {
        System.out.println("Mac menu displayed!");
    }

}
