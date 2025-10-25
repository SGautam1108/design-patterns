package org.headfirst.observerDesignPatternImproved.observer;


import org.headfirst.observerDesignPatternImproved.observable.WeatherStation;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    //data properties
    float currentPressure = 29.92f;
    float lastPressure;

    public ForecastDisplay(){

    }

    @Override
    public void update(Observable o, Object args) {
        if(o instanceof WeatherStation weatherStation){
            lastPressure = currentPressure;
            currentPressure = weatherStation.getPressure();

            display();
        }

    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}