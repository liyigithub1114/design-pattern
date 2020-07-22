package com.liyi.design.pattern.behavior.observer.improve;

public interface Subject {

    boolean registryObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void notifyObserver();
}
