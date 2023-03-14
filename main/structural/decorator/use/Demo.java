package structural.decorator.use;

import structural.decorator.model.Car;
import structural.decorator.model.impl.BMW;
import structural.decorator.service.BuzzerDecorator;

public class Demo {

    public static void main(String[] args) {
        Car car = new BuzzerDecorator(new BMW());
        car.move();
    }
}
