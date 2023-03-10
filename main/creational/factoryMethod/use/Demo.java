package creational.factoryMethod.use;

import creational.factoryMethod.impl.SamsungFactory;
import creational.factoryMethod.impl.ScreenFactory;
import creational.factoryMethod.model.Screen;

public class Demo {

    public static void main(String[] args) {
        ScreenFactory screenFactory = new SamsungFactory();
        Screen screen = screenFactory.createScreen();
    }
}
