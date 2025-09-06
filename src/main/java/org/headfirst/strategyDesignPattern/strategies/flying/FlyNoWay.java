package org.headfirst.strategyDesignPattern.strategies.flying;

public class FlyNoWay implements FlyingBehavior{
    @Override
    public void fly() {
        System.out.println("This duck can't fly");
    }
}
