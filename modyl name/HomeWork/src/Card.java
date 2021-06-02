public class Card {

    private String name="Ivan";
    private long number=123456;
    private long balans=654321;

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
}


