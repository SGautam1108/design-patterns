package org.headfirst.decoratorDesignPattern.decorator;

import org.headfirst.decoratorDesignPattern.CoffeeSize;
import org.headfirst.decoratorDesignPattern.components.Beverage;

public class Whip extends CondimentsDecorator{

    public Whip(Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + decoratedBeverage.cost();
    }
}
