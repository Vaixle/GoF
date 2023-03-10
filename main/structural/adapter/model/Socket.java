package structural.adapter.model;

public abstract class Socket {

    protected final int size;

    public Socket(int size) {
        this.size = size;
    }

    public abstract boolean fits(Adapter adapter);
}
