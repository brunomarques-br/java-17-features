package patternMaching.service;

import patternMaching.domain.Cash;
import patternMaching.domain.CreditCard;
import patternMaching.domain.PaymentMethod;
import patternMaching.domain.Pix;

public class PaymentService {

    public double calculateFee(PaymentMethod method) {

        // PATTERN MATCHING USING INSTANCEOF (Java 8)
        if (method instanceof CreditCard cc) {
            System.out.println("Processing Credit Card: " + cc.getCardNumber());
            return cc.getAmount() * 0.03; // 3% TAX
        }

        if (method instanceof Pix pix) {
            System.out.println("Processing PIX: " + pix.getPixKey());
            return pix.getAmount() * 0.00; // 0% TAX
        }

        if (method instanceof Cash cash) {
            System.out.println("Processing Cash: " + cash.getAmount());
            return cash.getAmount() * 0.01; // 1% TAX
        }

        // If case any future implementation appears
        throw new UnsupportedOperationException("Payment not supported yet. " + method);

    }
}
