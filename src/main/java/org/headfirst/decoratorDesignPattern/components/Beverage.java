package org.headfirst.decoratorDesignPattern.components;

import org.headfirst.decoratorDesignPattern.CoffeeSize;

public abstract class Beverage {

    String description;
    CoffeeSize size;

    public Beverage(){
        description = "Unknown Beverage";
        size = CoffeeSize.MEDIUM;
    }

    public String getDescription(){
        return description;
    }

    public CoffeeSize getSize(){
        return size;
    }

    public void setSize(CoffeeSize size){
        this.size = size;
    }

    public abstract double cost();

}
