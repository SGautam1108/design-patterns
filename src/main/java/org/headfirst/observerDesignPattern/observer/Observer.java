package org.headfirst.observerDesignPattern.observer;

public interface Observer {
    /*
      We are right now sending the data directly.
      However, in future if the data present in Observable/Subject changes, this signature will change, hence changing all signatures of Observers
     */
    void update(float temperature, float humidity, float pressure);
}
