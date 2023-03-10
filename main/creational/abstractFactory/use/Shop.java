package creational.abstractFactory.use;

import creational.abstractFactory.impl.Factory;
import creational.abstractFactory.model.Chocolate;
import creational.abstractFactory.model.Soda;

public class Shop {

    private Soda soda;

    private Chocolate chocolate;

    public Shop(Factory factory) {
        this.soda = factory.createSoda();
        this.chocolate = factory.createChocolate();
    }

}
