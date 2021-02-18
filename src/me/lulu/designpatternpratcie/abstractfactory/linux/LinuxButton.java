package me.lulu.designpatternpratcie.abstractfactory.linux;

import me.lulu.designpatternpratcie.abstractfactory.Button;

public class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("Linux button clicked!");
    }

}
