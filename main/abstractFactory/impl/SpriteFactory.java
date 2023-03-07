package abstractFactory.impl;


import abstractFactory.model.Chocolate;
import abstractFactory.model.Soda;
import abstractFactory.model.impl.Sprite;
import abstractFactory.model.impl.SpriteChocolate;

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
