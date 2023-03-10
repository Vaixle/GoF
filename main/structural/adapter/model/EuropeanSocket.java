package structural.adapter.model;

import structural.adapter.model.Socket;

public class EuropeanSocket extends Socket {


    public EuropeanSocket() {
        super(5);
    }

    @Override
    public boolean fits(Adapter adapter) {
        return this.size == adapter.size;
    }
}
