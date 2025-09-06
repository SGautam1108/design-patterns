package org.headfirst.strategyDesignPattern.strategies.quacking;

public class Quack implements QuackingBehavior{
    @Override
    public void quack() {
        System.out.println("This duck can really quack");
    }
}
