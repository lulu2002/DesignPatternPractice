package me.lulu.designpatternpratcie.abstractfactory.windows;

import me.lulu.designpatternpratcie.abstractfactory.Menu;

public class WindowsMenu implements Menu {

    @Override
    public void display() {
        System.out.println("Win menu displayed!");
    }

}
