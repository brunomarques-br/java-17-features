package patternMaching.domain;

public final class Pix implements PaymentMethod {

    private final String pixKey;
    private final double amount;

    public Pix(String pixKey, double amount) {
        this.pixKey = pixKey;
        this.amount = amount;
    }

    public String getPixKey() {
        return pixKey;
    }

    public double getAmount() {
        return amount;
    }
}
