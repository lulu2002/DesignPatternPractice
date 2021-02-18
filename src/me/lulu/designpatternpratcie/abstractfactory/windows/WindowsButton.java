package me.lulu.designpatternpratcie.abstractfactory.windows;

import me.lulu.designpatternpratcie.abstractfactory.Button;

public class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("Windows button clicked!");
    }

}
