package AbstractFactory;

public class ColaSodaFactory implements SodaFactory {

    @Override
    public Soda create() {
        return new Cola();
    }
}
