package patternMaching.service;

import patternMaching.domain.Cash;
import patternMaching.domain.CreditCard;
import patternMaching.domain.PaymentMethod;
import patternMaching.domain.Pix;

public class PaymentCalculatorService {

    /*
    * When can use switch with sealed interfaces to guarantee exhaustiveness
    * This 'switch' works because PaymentMethod is sealed, so the compiler knows all possible types
    * */
    public double calculateFee(PaymentMethod method) {
        return switch (method) {
            case CreditCard cc -> cc.getAmount() * 0.03;
            case Pix pc -> pc.getAmount() * 0.00;
            case Cash cash -> cash.getAmount() * 0.01;
        };
    }

}
