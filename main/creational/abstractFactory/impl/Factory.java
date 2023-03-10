package creational.abstractFactory.impl;

import creational.abstractFactory.model.Chocolate;
import creational.abstractFactory.model.Soda;

public interface Factory {
    Soda createSoda();

    Chocolate createChocolate();


}
