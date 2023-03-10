package structural.adapter.use;

import structural.adapter.model.*;

public class Demo {

    public static void main(String[] args) {
        EuropeanSocket europeanSocket = new EuropeanSocket();
        AmericanAdapter americanAdapter = new AmericanAdapter();
        AmericanSocketAdapter americanSocketAdapter = new AmericanSocketAdapter(americanAdapter);
        System.out.println(europeanSocket.fits(americanSocketAdapter));
    }
}
