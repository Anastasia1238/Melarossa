public class ATM {
    public static void main(String[] args) {
        Card fCard = new Card("Sanchez", 1234_1234_1234_1234L, "12");
        Currency USD = new Currency("USD", 2);
        String s = fCard.convertToCurrency(USD);
        System.out.println(s);
    }
}
