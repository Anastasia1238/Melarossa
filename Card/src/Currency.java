public class Currency {
    private String currencyName;
    private double conversionRate;

    public Currency(String currencyName,double conversionRate){
        this.currencyName=currencyName;
        this.conversionRate=conversionRate;

    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }
}
