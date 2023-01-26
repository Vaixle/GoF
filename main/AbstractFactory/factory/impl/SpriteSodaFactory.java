package AbstractFactory;

public class SpriteSodaFactory implements SodaFactory {

    @Override
    public Soda create() {
        return new Sprite();
    }
}
