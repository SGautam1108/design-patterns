package org.headfirst.decoratorDesignPattern.decorator;

import org.headfirst.decoratorDesignPattern.CoffeeSize;
import org.headfirst.decoratorDesignPattern.components.Beverage;

public class Mocha extends CondimentsDecorator {

    public Mocha(Beverage beverage){
        this.decoratedBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + decoratedBeverage.cost();
    }
}
