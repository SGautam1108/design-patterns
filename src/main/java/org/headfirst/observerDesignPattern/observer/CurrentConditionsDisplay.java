package org.headfirst.observerDesignPattern.observer;

import org.headfirst.observerDesignPattern.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    //data properties to show
    float temperature;
    float humidity;

    //Subject to observe
    Subject weatherStation;

    public CurrentConditionsDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    //region Display Methods
    public void display(){
        System.out.println("Current temperature is " + temperature + ", humidity: " + humidity);
    }

    public void setData(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
    }
    //endregion

    //region Observer Methods
    @Override
    public void update(float temperature, float humidity, float pressure) {
        setData(temperature, humidity);
        display();
    }
    //endregion
}
