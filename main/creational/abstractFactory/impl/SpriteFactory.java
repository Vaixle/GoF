package creational.abstractFactory.impl;


import creational.abstractFactory.model.Chocolate;
import creational.abstractFactory.model.Soda;
import creational.abstractFactory.model.impl.Sprite;
import creational.abstractFactory.model.impl.SpriteChocolate;

public class SpriteFactory implements Factory {

    @Override
    public Soda createSoda() {
        return new Sprite();
    }

    @Override
    public Chocolate createChocolate() {
        return new SpriteChocolate();
    }
}
