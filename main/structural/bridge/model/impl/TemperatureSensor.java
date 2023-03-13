package structural.bridge.model.impl;

import structural.bridge.model.Sensor;

public class TemperatureSensor implements Sensor {

    private int temperature = 25;

    @Override
    public int getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
