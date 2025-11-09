package patternMaching.domain;

public final class CreditCard implements PaymentMethod {

    private final String cardNumber;
    private final double amount;

    public CreditCard(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getAmount() {
        return amount;
    }
}
