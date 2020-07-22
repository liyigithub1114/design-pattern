package com.liyi.design.pattern.behavior.observer.improve;

public class MyObserver implements Observer {
    private float temperature;

    private float pressure;

    private float humidity;

    @Override
    public boolean update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
        return true;
    }

    @Override
    public void display() {
        System.out.println("temperature : " + temperature);
        System.out.println("pressure : " + pressure);
        System.out.println("humidity : " + humidity);
    }
}
