package abstractFactory.impl;

import abstractFactory.model.Chocolate;
import abstractFactory.model.Soda;
import abstractFactory.model.impl.Cola;
import abstractFactory.model.impl.ColaChocolate;

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
