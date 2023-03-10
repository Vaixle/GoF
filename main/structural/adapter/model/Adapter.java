package structural.adapter.model;

public abstract class Adapter {

    protected final int size;

    public Adapter(int size) {
        this.size = size;
    }

    public abstract int getSize();
}
