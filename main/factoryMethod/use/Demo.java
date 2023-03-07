package factoryMethod.use;

import factoryMethod.impl.SamsungFactory;
import factoryMethod.impl.ScreenFactory;
import factoryMethod.model.Screen;

public class Demo {

    public static void main(String[] args) {
        ScreenFactory screenFactory = new SamsungFactory();
        Screen screen = screenFactory.createScreen();
    }
}
