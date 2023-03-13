package structural.composite.use;

import structural.composite.model.Box;
import structural.composite.model.impl.BigBox;
import structural.composite.model.impl.SmallBox;

public class Demo {
    public static void main(String[] args) {
        Box bigBox = new BigBox(new SmallBox(), new SmallBox());
        System.out.println(bigBox.getItemWeight());
    }
}
