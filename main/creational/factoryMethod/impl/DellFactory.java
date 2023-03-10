package creational.factoryMethod.impl;

import creational.factoryMethod.model.DellScreen;
import creational.factoryMethod.model.Screen;

public class DellFactory extends ScreenFactory {
    @Override
    public Screen createScreen() {
        return new DellScreen();
    }
}
