package factoryMethod.impl;

import factoryMethod.impl.ScreenFactory;
import factoryMethod.model.SamsungScreen;
import factoryMethod.model.Screen;

public class SamsungFactory extends ScreenFactory {


    @Override
    public Screen createScreen() {
        return new SamsungScreen();
    }
}
