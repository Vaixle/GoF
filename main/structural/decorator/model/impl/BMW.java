package structural.decorator.model.impl;

import structural.decorator.model.Car;

public class BMW implements Car {


    @Override
    public void move() {
        System.out.println("moving...");
    }
}
