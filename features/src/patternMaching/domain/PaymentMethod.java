package patternMaching.domain;

public sealed interface PaymentMethod permits CreditCard, Pix, Cash {
}
