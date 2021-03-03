package me.lulu.designpatternpratcie.factory;

import me.lulu.designpatternpratcie.factory.pizza.*;

public class PizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza;

        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                throw new RuntimeException("Can not find pizza with type " + type);
        }

        return pizza;
    }

}
