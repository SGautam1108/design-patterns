package org.headfirst.decoratorDesignPattern.decorator;

import org.headfirst.decoratorDesignPattern.CoffeeSize;
import org.headfirst.decoratorDesignPattern.components.Beverage;

public class Soy extends CondimentsDecorator {
    public Soy(Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double soyCost = switch(decoratedBeverage.getSize()){
            case CoffeeSize.SMALL -> 0.10;
            case CoffeeSize.MEDIUM -> 0.15;
            case CoffeeSize.LARGE -> 0.2;
        };
        return soyCost + decoratedBeverage.cost();
    }
}
