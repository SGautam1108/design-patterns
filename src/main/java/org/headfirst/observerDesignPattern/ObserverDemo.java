package org.headfirst.observerDesignPattern;


import org.headfirst.observerDesignPattern.observer.CurrentConditionsDisplay;
import org.headfirst.observerDesignPattern.observer.ForecastDisplay;
import org.headfirst.observerDesignPattern.observer.HeatIndexDisplay;
import org.headfirst.observerDesignPattern.observer.StatisticsDisplay;
import org.headfirst.observerDesignPattern.subject.WeatherStation;

public class ObserverDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        //create and register the new observer
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherStation);
        ForecastDisplay pressureDisplay = new ForecastDisplay(weatherStation);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);
        HeatIndexDisplay  heatIndexDisplay = new HeatIndexDisplay(weatherStation);

        //change measurements and notify
        weatherStation.setMeasurements(80, 65, 30.4f);
        weatherStation.setMeasurements(82, 70, 29.2f);
        weatherStation.setMeasurements(78, 90, 29.2f);
    }
}
