package creational.factoryMethod.impl;

import creational.factoryMethod.model.Screen;

public abstract class ScreenFactory {

    public void showBrand() {
        createScreen().printBrand();
    }

    public abstract Screen createScreen();
}
