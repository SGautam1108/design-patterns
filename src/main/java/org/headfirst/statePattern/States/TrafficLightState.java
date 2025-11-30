package org.headfirst.statePattern.States;

import org.headfirst.statePattern.Context.TrafficLightContext;
import org.headfirst.statePattern.Enums.TrafficLightColor;

public interface TrafficLightState {
    public void next(TrafficLightContext context);
    public TrafficLightColor getColor();
}
