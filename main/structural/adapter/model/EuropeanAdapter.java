package structural.adapter.model;

public class EuropeanAdapter extends Adapter {

    public EuropeanAdapter() {
        super(5);
    }

    @Override
    public int getSize() {
        return size;
    }
}
