public class Card {
    private String name ;
    private long number ;
    private long balans;

    public Card() {
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setBalans(long balans) {
        this.balans = balans;
    }

    public long getBalans() {
        return balans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String convertToCurrency(Currency currency) {
        return "valuta" + currency.getCurrencyName() + ":" + balans.
    }