package structural.adapter.model;

import structural.adapter.model.AmericanSocket;
import structural.adapter.model.EuropeanSocket;

public class AmericanSocketAdapter extends EuropeanAdapter {

    private AmericanAdapter americanAdapter;

    public AmericanSocketAdapter(AmericanAdapter americanAdapter) {

        this.americanAdapter = americanAdapter;
    }

}
