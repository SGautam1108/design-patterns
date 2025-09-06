package org.headfirst.strategyDesignPattern.entities;

import org.headfirst.strategyDesignPattern.strategies.flying.FlyNoWay;
import org.headfirst.strategyDesignPattern.strategies.quacking.Squeak;

public class ModelDuck extends Duck{
    public ModelDuck(){
        this.flyingBehavior = new FlyNoWay();
        this.quackingBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a Model Duck");
    }
}
