package structural.composite.model.impl;

import structural.composite.model.Box;

public class SmallBox implements Box {

    private int weight = 5;

    @Override
    public long getItemWeight() {
        return weight;
    }
}
