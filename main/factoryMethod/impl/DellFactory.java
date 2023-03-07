package factoryMethod.impl;

import factoryMethod.impl.ScreenFactory;
import factoryMethod.model.DellScreen;
import factoryMethod.model.Screen;

public class DellFactory extends ScreenFactory {
    @Override
    public Screen createScreen() {
        return new DellScreen();
    }
}
