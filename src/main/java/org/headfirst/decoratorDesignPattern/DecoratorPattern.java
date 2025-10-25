package org.headfirst.decoratorDesignPattern;

import org.headfirst.decoratorDesignPattern.components.Beverage;
import org.headfirst.decoratorDesignPattern.components.Espresso;
import org.headfirst.decoratorDesignPattern.components.HouseBlend;
import org.headfirst.decoratorDesignPattern.decorator.Mocha;
import org.headfirst.decoratorDesignPattern.decorator.Soy;
import org.headfirst.decoratorDesignPattern.decorator.Whip;

public class DecoratorPattern {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(CoffeeSize.SMALL);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        System.out.println(beverage.getSize());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.cost());
        System.out.println(beverage2.getSize());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(CoffeeSize.LARGE);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription());
        System.out.println(beverage3.cost());
        System.out.println(beverage3.getSize());

        Beverage beverage4 = new HouseBlend();
        beverage4.setSize(CoffeeSize.MEDIUM);
        beverage4 = new Soy(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Whip(beverage4);
        System.out.println(beverage4.getDescription());
        System.out.println(beverage4.cost());
        System.out.println(beverage4.getSize());
    }
}