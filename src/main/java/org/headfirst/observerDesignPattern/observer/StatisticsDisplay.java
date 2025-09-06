package org.headfirst.observerDesignPattern.observer;

import org.headfirst.observerDesignPattern.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement{
    //data properties
    float minTemp;
    float maxTemp;
    float tempSum;
    int numberOfReadings;

    Subject weatherStation;

    public StatisticsDisplay(Subject weatherStation) {
        minTemp = 200F;
        maxTemp = 0F;
        tempSum = 0F;
        numberOfReadings = 0;

        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    //

    //region Display Methods
    public void display(){
        System.out.println("Statistics: ");
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
    public void update(float temperature, float humidity, float pressure) {
        calculateStats(temperature);
        display();
    }
    //endregion
}
