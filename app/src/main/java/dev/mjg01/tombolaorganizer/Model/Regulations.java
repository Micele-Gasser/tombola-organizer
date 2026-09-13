public class Regulations {

    private double countryRegulationWinningChancePerTicket;
    private double countryRegulationInvestToSalesRatio;

    public Regulations(double countryRegulationWinningChancePerTicket, double countryRegulationInvestToSalesRatio) {
        this.countryRegulationWinningChancePerTicket = countryRegulationWinningChancePerTicket;
        this.countryRegulationInvestToSalesRatio = countryRegulationInvestToSalesRatio;
    }

    public double getCountryRegulationWinningChancePerTicket() {
        return countryRegulationWinningChancePerTicket;
    }

    public double getCountryRegulationInvestToSalesRatio() {
        return countryRegulationInvestToSalesRatio;
    }
}
