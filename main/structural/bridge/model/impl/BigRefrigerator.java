package structural.bridge.model.impl;

import structural.bridge.model.Refrigerator;
import structural.bridge.model.Sensor;


public class BigRefrigerator implements Refrigerator {

    private Sensor sensor;

    private int setTemperature = 25;

    public BigRefrigerator(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void setTemperature(int temperature) {
        setTemperature = temperature;
        while (this.sensor.getTemperature() > temperature)
            freeze();
    }

    @Override
    public void freeze() {
        System.out.println("Freezing...");
        sensor.setTemperature(sensor.getTemperature() - 1);
    }
}
