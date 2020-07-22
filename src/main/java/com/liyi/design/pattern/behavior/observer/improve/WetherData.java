package com.liyi.design.pattern.behavior.observer.improve;

import java.util.ArrayList;
import java.util.List;

public class WetherData implements  Subject{

    private float temperature;

    private float pressure;

    private float humidity;

    private List<Observer> observers;

    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObserver();
    }

    public WetherData(){
        this.observers = new ArrayList<>();
    }

    @Override
    public boolean registryObserver(Observer observer) {
        observers.add(observer);
        return true;
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if(!observers.isEmpty()){
            for(int i = 0; i < observers.size(); i++){
                observers.get(i).update(getTemperature(),getPressure(),getHumidity());
            }
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

}

