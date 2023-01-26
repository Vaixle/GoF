package AbstractFactory;

public class Customer {

    private Soda soda;

    public Customer(SodaFactory sodaFactory) {
        this.soda = sodaFactory.create();
    }
}
