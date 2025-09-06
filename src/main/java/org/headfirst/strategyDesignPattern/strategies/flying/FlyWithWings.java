package org.headfirst.strategyDesignPattern.strategies.flying;

public class FlyWithWings implements FlyingBehavior{
    @Override
    public void fly() {
        System.out.println("This duck can fly");
    }
}
