package me.lulu.designpatternpratcie.adapter;

public class DuckAdapter implements Duck {
    private Car car;

    public DuckAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void quack() {
        car.run();
    }

    @Override
    public void fly() {
        car.stop();
    }
}
