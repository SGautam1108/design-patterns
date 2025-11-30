package org.headfirst.statePattern.Context;

import org.headfirst.statePattern.Enums.TrafficLightColor;

import java.sql.SQLOutput;

public class TrafficLightTraditional {
    private TrafficLightColor color;

    public TrafficLightTraditional(){
        color = TrafficLightColor.RED;
    }


    public void next(){
        if(color.equals(TrafficLightColor.RED)){
            color = TrafficLightColor.GREEN;
            System.out.printf("Changing to %s. All Cars go!%n", getColor().name());
        } else if(color.equals(TrafficLightColor.GREEN)){
            color = TrafficLightColor.YELLOW;
            System.out.printf("Changing to %s. Wait and Watch%n", getColor().name());
        } else if(color.equals(TrafficLightColor.YELLOW)){
            color = TrafficLightColor.RED;
            System.out.printf("Changing to %s. Stop!%n", getColor().name());
        }
        System.out.println("Current color is: " + this.getColor());
    }

    public TrafficLightColor getColor(){
        return this.color;
    }

}
