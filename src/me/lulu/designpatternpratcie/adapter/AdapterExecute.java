package me.lulu.designpatternpratcie.adapter;

public class AdapterExecute {

    public static void main(String[] args) {
        Car car = new Car();
        Duck duck = new DuckAdapter(car);
        duck = new DoubleQuackDecorator(duck);


        duck.quack();
    }

}
