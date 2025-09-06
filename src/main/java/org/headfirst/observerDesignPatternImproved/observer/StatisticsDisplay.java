package org.headfirst.observerDesignPatternImproved.observer;


import org.headfirst.observerDesignPatternImproved.observable.WeatherStation;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    //data properties
    float minTemp;
    float maxTemp;
    float tempSum;
    int numberOfReadings;

    public StatisticsDisplay() {
        minTemp = 200F;
        maxTemp = 0F;
        tempSum = 0F;
        numberOfReadings = 0;
    }

    //

    //region Display Methods
    public void display(){
        System.out.println("Avg/Min/Max Temp are: " + (tempSum/numberOfReadings) + " " + minTemp + " " + maxTemp);
    }

    public void calculateStats(float temperature){
        minTemp = Math.min(minTemp, temperature);
        maxTemp = Math.max(maxTemp, temperature);
        tempSum += temperature;
        numberOfReadings++;
    }
    //endregion

    //region Observer Methods
    @Override
    public void update(Observable o, Object args) {
        if(o instanceof WeatherStation weatherStation) {
            calculateStats(weatherStation.getTemperature());
            display();
        }
    }
    //endregion
}
