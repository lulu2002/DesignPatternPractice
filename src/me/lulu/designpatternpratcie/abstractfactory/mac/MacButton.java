package me.lulu.designpatternpratcie.abstractfactory.mac;

import me.lulu.designpatternpratcie.abstractfactory.Button;

public class MacButton implements Button {

    @Override
    public void click() {
        System.out.println("Mac button clicked!");
    }

}
