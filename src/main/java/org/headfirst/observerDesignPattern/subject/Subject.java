package org.headfirst.observerDesignPattern.subject;

import org.headfirst.observerDesignPattern.observer.Observer;

public interface Subject {
    //register
    public boolean registerObserver(Observer o);
    //unregister
    public boolean unregisterObserver(Observer o);
    //notify
    public boolean notifyObservers();
}
