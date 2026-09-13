package dev.mjg01.tombolaorganizer.Model;

import java.util.List;

public class PricesList {

    private List<Price> prices;

    public PricesList(List<Price> prices) {
        this.prices = prices;
    }

    public List<Price> getPrices() {
        return prices;
    }
}
