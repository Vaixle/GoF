package abstractFactory.use;

import abstractFactory.impl.SpriteFactory;

public class Demo {


    public static void main(String[] args) {
        Shop shop = new Shop(new SpriteFactory());
    }

}
