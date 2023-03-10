package creational.prototype.use;

import creational.prototype.impl.Prototype;

public class Demo {

    public static void main(String[] args) {
        Prototype prototype = new Prototype("name", "value");
        Prototype prototype1 = prototype.clone();
    }
}
