package me.lulu.designpatternpratcie.factory;

import me.lulu.designpatternpratcie.factory.pizza.Pizza;

public class PizzaStore {

    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        return pizzaFactory.createPizza(type);
    }

}
