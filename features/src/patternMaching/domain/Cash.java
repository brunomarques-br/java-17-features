package patternMaching.domain;

public final class Cash implements PaymentMethod {

    private final double amount;

    public Cash(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
