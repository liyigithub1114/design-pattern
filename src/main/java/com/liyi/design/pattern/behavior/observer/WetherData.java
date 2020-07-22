package com.liyi.design.pattern.behavior.observer;

public class WetherData {

    private float temperature;

    private float pressure;

    private float humidity;

    //若有多个第三方，这里面将会集成很多类，不符合OCP
    private CurrentConditions currentConditions;

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public WetherData(CurrentConditions currentConditions){
        this.currentConditions = currentConditions;
    }


    public void update(float temperature, float pressure, float humidity){
        currentConditions.update(temperature, pressure, humidity);
    }
}
