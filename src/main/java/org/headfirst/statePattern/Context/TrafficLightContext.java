package org.headfirst.statePattern.Context;

import org.headfirst.statePattern.Enums.TrafficLightColor;
import org.headfirst.statePattern.States.RedLightState;
import org.headfirst.statePattern.States.TrafficLightState;

public class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext(){
        state = new RedLightState();
    }

    public void next(){
        state.next(this);
        System.out.println("Current color is: " + this.getColor());
    }

    public TrafficLightColor getColor(){
        return state.getColor();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }
}
