package org.headfirst.observerDesignPattern.subject;

import org.headfirst.observerDesignPattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    //data properties
    float temperature;
    float humidity;
    float pressure;

    //List of observers
    List<Observer> observerList;

    public WeatherStation(){
        observerList = new ArrayList<>();
    }

    //region Subject methods
    @Override
    public boolean registerObserver(Observer o) {
        try{
            if(!observerList.contains(o)) {
                observerList.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean unregisterObserver(Observer o) {
        try{
            observerList.remove(o);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean notifyObservers() {
        try{
            for(Observer o: observerList){
                o.update(temperature, humidity, pressure);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    //endregion

    //region WeatherStation Methods
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }
    //endregion
}
