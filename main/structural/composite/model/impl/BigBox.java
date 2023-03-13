package structural.composite.model.impl;

import structural.composite.model.Box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BigBox implements Box {

    private int weight = 15;

    List<Box> boxes = new ArrayList<>();

    public BigBox(Box... boxes) {
        this.boxes.addAll(Arrays.asList(boxes));
    }

    @Override
    public long getItemWeight() {
        return boxes.stream().mapToInt(b -> (int) b.getItemWeight()).sum() + weight;
    }
}
