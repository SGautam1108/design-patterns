package org.headfirst.observerDesignPatternImproved.observable;

import java.util.Observable;

public class WeatherStation extends Observable {
    //data properties
    float temperature;
    float humidity;
    float pressure;

    /*
    Observable provides the following-
    1. List of Observers
    2. addObserver(o)
    3. removeObserver(o)
    4. notifyObserver(Object obj) -> push, provide the relevant data
    or notifyObserver() -> pull i.e observer will pull the required data
    5. setChanged -> keeps a flag that current state has changed
    6. clearChange/hasChange
     */

    /*
    When creating own Implementation -> skip setChanged, and just keep pull based notifyObserver -> send the object of weatherstation
     */

    //region WeatherStation methods
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        //Now need to set change, only then notify works
        setChanged();
        //pull method to notify observers
        notifyObservers();

        System.out.println("All notified");
        System.out.println();
    }
    //endRegion

    //Getters adn Setters -> need to implement this so we can support pull
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
