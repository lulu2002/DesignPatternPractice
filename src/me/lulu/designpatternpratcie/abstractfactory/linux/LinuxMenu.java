package me.lulu.designpatternpratcie.abstractfactory.linux;

import me.lulu.designpatternpratcie.abstractfactory.Menu;

public class LinuxMenu implements Menu {

    @Override
    public void display() {
        System.out.println("Linux menu displayed!");
    }

}
