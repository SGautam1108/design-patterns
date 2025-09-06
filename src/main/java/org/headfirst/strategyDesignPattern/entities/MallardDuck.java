package org.headfirst.strategyDesignPattern.entities;

import org.headfirst.strategyDesignPattern.strategies.flying.FlyWithWings;
import org.headfirst.strategyDesignPattern.strategies.quacking.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        this.flyingBehavior = new FlyWithWings();
        this.quackingBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }
}
