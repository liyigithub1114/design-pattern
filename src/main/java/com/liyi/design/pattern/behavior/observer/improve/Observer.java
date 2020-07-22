package com.liyi.design.pattern.behavior.observer.improve;

public interface Observer {

    boolean update(float temperature, float pressure, float humidity);

    void display();
}
