package org.headfirst.strategyDesignPattern.strategies.quacking;

public class Squeak implements QuackingBehavior{
    @Override
    public void quack() {
        System.out.println("This duck can only squeak");
    }
}
