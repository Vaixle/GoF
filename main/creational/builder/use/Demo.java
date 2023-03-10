package creational.builder.use;

import creational.builder.impl.ComputerBuilder;
import creational.builder.impl.Director;

public class Demo {

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Director director = new Director();
        director.buildGameComputer(computerBuilder);
        System.out.println(computerBuilder.build());
    }
}
