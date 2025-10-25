package org.headfirst.decoratorDesignPattern.decorator;

import org.headfirst.decoratorDesignPattern.CoffeeSize;
import org.headfirst.decoratorDesignPattern.components.Beverage;

//TypeMatching since CondimentsDecorator extends Beverage (Still a beverage)
public abstract class CondimentsDecorator extends Beverage {
    //Composition to wrap the previous decorated beverage (Still a Beverage)
    Beverage decoratedBeverage;

    public CoffeeSize getSize(){
        return decoratedBeverage.getSize();
    }

    public abstract String getDescription();
}
