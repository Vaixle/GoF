package abstractFactory.impl;

import abstractFactory.model.Chocolate;
import abstractFactory.model.Soda;

public interface Factory {
    Soda createSoda();

    Chocolate createChocolate();


}
