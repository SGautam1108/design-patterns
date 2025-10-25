package org.headfirst.observerDesignPatternImproved;


import org.headfirst.observerDesignPatternImproved.observable.WeatherStation;
import org.headfirst.observerDesignPatternImproved.observer.CurrentConditionsDisplay;
import org.headfirst.observerDesignPatternImproved.observer.ForecastDisplay;
import org.headfirst.observerDesignPatternImproved.observer.HeatIndexDisplay;
import org.headfirst.observerDesignPatternImproved.observer.StatisticsDisplay;

public class ObserverDemo {
    public static void main(String[] args) {
        /*
        All this is still the same even with Java observable API
         */
        WeatherStation weatherStation = new WeatherStation();

        //create and register the new observer
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay();
        weatherStation.addObserver(conditionsDisplay);
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        weatherStation.addObserver(forecastDisplay);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        weatherStation.addObserver(statisticsDisplay);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay();
        weatherStation.addObserver(heatIndexDisplay);

        //change measurements and notify
        weatherStation.setMeasurements(80, 65, 30.4f);
        weatherStation.setMeasurements(82, 70, 29.2f);
        weatherStation.setMeasurements(78, 90, 29.2f);

        weatherStation.deleteObserver(conditionsDisplay);
        weatherStation.setMeasurements(83, 50, 30.2f);

        weatherStation.deleteObserver(statisticsDisplay);
        weatherStation.deleteObserver(forecastDisplay);
        weatherStation.deleteObserver(heatIndexDisplay);

    }
}
