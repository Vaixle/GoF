package factoryMethod.impl;

import factoryMethod.model.Screen;

public abstract class ScreenFactory {

    public void showBrand() {
        createScreen().printBrand();
    }

    public abstract Screen createScreen();
}
