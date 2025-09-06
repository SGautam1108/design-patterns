package org.headfirst.observerDesignPatternImproved.observer;

import org.headfirst.observerDesignPatternImproved.observable.WeatherStation;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    //data properties to show
    float temperature;
    float humidity;

    public CurrentConditionsDisplay() {
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
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherStation weatherStation){
            setData(weatherStation.getTemperature(), weatherStation.getHumidity());
            display();
        }
    }
    //endregion
}
