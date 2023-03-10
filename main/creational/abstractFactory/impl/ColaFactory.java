package creational.abstractFactory.impl;

import creational.abstractFactory.model.Chocolate;
import creational.abstractFactory.model.Soda;
import creational.abstractFactory.model.impl.Cola;
import creational.abstractFactory.model.impl.ColaChocolate;

public class ColaFactory implements Factory {

    @Override
    public Soda createSoda() {
        return new Cola();
    }

    @Override
    public Chocolate createChocolate() {
        return new ColaChocolate();
    }
}
