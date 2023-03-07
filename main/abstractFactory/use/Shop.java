package abstractFactory.use;

import abstractFactory.impl.Factory;
import abstractFactory.model.Chocolate;
import abstractFactory.model.Soda;

public class Shop {

    private Soda soda;

    private Chocolate chocolate;

    public Shop(Factory factory) {
        this.soda = factory.createSoda();
        this.chocolate = factory.createChocolate();
    }

}
