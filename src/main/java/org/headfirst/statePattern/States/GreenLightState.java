package org.headfirst.statePattern.States;

import org.headfirst.statePattern.Context.TrafficLightContext;
import org.headfirst.statePattern.Enums.TrafficLightColor;

public class GreenLightState implements TrafficLightState {

    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Changing to Yellow. All cars watch!");
        context.setState(new YellowLightState());
    }

    @Override
    public TrafficLightColor getColor() {
        return TrafficLightColor.GREEN;
    }
}
