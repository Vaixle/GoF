package builder.use;

import builder.impl.Builder;
import builder.impl.ComputerBuilder;
import builder.impl.Director;

public class Demo {

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Director director = new Director();
        director.buildGameComputer(computerBuilder);
        System.out.println(computerBuilder.getResult());
    }
}
