package me.lulu.designpatternpratcie.adapter;

public class DoubleQuackDecorator extends AbstractDuckDecorator {

    public DoubleQuackDecorator(Duck duck) {
        super(duck);
    }


    @Override
    public void quack() {
        for (int i = 0; i < 2; i++) {
            super.quack();
        }
    }
}
