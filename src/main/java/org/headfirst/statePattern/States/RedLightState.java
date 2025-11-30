package org.headfirst.statePattern.States;

import org.headfirst.statePattern.Context.TrafficLightContext;
import org.headfirst.statePattern.Enums.TrafficLightColor;

public class RedLightState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Changing to Green. All cars go!");
        context.setState(new GreenLightState());
    }

    @Override
    public TrafficLightColor getColor() {
        return TrafficLightColor.RED;
    }
}
