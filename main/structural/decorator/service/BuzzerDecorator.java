package structural.decorator.service;

import structural.decorator.model.Car;
import structural.decorator.service.CarDecorator;

public class BuzzerDecorator extends CarDecorator {

    public BuzzerDecorator(Car car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("buzzer...");
    }
}
