package org.headfirst.observerDesignPattern.observer;

import org.headfirst.observerDesignPattern.subject.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement{
    //data properties to show
    float heatIndex;

    //Subject to observe
    Subject weatherStation;

    public HeatIndexDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    //region Display Methods
    public void display(){
        System.out.println("Heat Index is: " + heatIndex);
    }

    public void calculateHeatIndex(float t, float rh){
        heatIndex = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }
    //endregion

    //region Observer Methods
    @Override
    public void update(float temperature, float humidity, float pressure) {
        calculateHeatIndex(temperature, humidity);
        display();
    }
    //endregion
}
