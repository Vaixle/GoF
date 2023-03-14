package structural.decorator.service;

import structural.decorator.model.Car;

public class CarDecorator implements Car {

    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
