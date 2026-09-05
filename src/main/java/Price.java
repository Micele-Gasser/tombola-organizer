public class Price {

    private String priceTitle;
    private String priceDescription;
    private double priceCost;

    public Price(String priceTitle, String priceDescription, double priceCost) {
        this.priceTitle = priceTitle;
        this.priceDescription = priceDescription;
        this.priceCost = priceCost;
    }

    public String getPriceTitle() {
        return priceTitle;
    }

    public String getPriceDescription() {
        return priceDescription;
    }

    public double getPriceCost() {
        return priceCost;
    }
}
