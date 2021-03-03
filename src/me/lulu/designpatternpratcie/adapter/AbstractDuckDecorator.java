package me.lulu.designpatternpratcie.adapter;

public class AbstractDuckDecorator implements Duck {

    private Duck duck;

    public AbstractDuckDecorator(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
