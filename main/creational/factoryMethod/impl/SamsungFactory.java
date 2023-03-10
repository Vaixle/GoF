package creational.factoryMethod.impl;

import creational.factoryMethod.model.SamsungScreen;
import creational.factoryMethod.model.Screen;

public class SamsungFactory extends ScreenFactory {


    @Override
    public Screen createScreen() {
        return new SamsungScreen();
    }
}
