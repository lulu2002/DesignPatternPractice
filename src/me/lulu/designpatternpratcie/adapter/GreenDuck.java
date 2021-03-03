package me.lulu.designpatternpratcie.adapter;

public class GreenDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Green Duck Quack");
    }

    @Override
    public void fly() {
        System.out.println("Green Duck Fly");
    }
}
