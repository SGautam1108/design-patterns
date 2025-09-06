package org.headfirst.strategyDesignPattern.entities;

import org.headfirst.strategyDesignPattern.strategies.flying.FlyingBehavior;
import org.headfirst.strategyDesignPattern.strategies.quacking.QuackingBehavior;

public abstract class Duck {

    //Composition - Duck has a flying & quacking behaviour
    FlyingBehavior flyingBehavior;
    QuackingBehavior quackingBehavior;

    //This is not yet the best way of implementing
    public Duck() {
    }

    //region Behaviors
    public void swim(){
        System.out.println("All ducks can swim");
    }

    public abstract void display();

    public void performFly(){
        flyingBehavior.fly();
    }

    public void performQuack(){
        quackingBehavior.quack();
    }
    //endregion

    //region Getters and Setters
    public FlyingBehavior getFlyingBehavior() {
        return flyingBehavior;
    }

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public QuackingBehavior getQuackingBehavior() {
        return quackingBehavior;
    }

    public void setQuackingBehavior(QuackingBehavior quackingBehavior) {
        this.quackingBehavior = quackingBehavior;
    }
    //endregion

}
