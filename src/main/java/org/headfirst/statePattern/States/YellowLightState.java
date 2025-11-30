package org.headfirst.statePattern.States;

import org.headfirst.statePattern.Context.TrafficLightContext;
import org.headfirst.statePattern.Enums.TrafficLightColor;

public class YellowLightState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Changing to Red. All cars stop!");
        context.setState(new RedLightState());
    }

    @Override
    public TrafficLightColor getColor() {
        return TrafficLightColor.YELLOW;
    }
}
