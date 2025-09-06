package org.headfirst.strategyDesignPattern;

import org.headfirst.strategyDesignPattern.entities.Duck;
import org.headfirst.strategyDesignPattern.entities.MallardDuck;
import org.headfirst.strategyDesignPattern.entities.ModelDuck;
import org.headfirst.strategyDesignPattern.strategies.flying.FlyWithWings;

import java.sql.SQLOutput;

public class StrategyPatternDemo {
    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        //change the strategy algo
        System.out.println("Changing the implementation ------");
        modelDuck.setFlyingBehavior(new FlyWithWings());
        modelDuck.performFly();
    }
}
