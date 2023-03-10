package structural.adapter.model;

import structural.adapter.model.Socket;

public class AmericanSocket extends Socket {


    public AmericanSocket() {
        super(4);
    }

    @Override
    public boolean fits(Adapter adapter) {
        return this.size == adapter.size;
    }
}
