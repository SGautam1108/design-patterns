package org.headfirst.statePattern;

import org.headfirst.statePattern.Context.TrafficLightContext;
import org.headfirst.statePattern.Context.TrafficLightTraditional;

public class TrafficLightController {
    public static void main(String... args){
        TrafficLightTraditional trafficLightTraditional = new TrafficLightTraditional();
        trafficLightTraditional.next();
        trafficLightTraditional.next();
        trafficLightTraditional.next();

        TrafficLightContext trafficLight = new TrafficLightContext();
        trafficLight.next();
        trafficLight.next();
        trafficLight.next();
    }
}
