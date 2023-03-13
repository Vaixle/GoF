package structural.bridge.use;

import structural.bridge.model.Refrigerator;
import structural.bridge.model.Sensor;
import structural.bridge.model.impl.BigRefrigerator;
import structural.bridge.model.impl.TemperatureSensor;

public class Demo {
    public static void main(String[] args) {
        Sensor temperatureSensor = new TemperatureSensor();
        Refrigerator refrigerator = new BigRefrigerator(temperatureSensor);
        refrigerator.setTemperature(20);
    }
}
