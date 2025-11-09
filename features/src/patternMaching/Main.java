package patternMaching;

import patternMaching.domain.Cash;
import patternMaching.domain.CreditCard;
import patternMaching.domain.PaymentMethod;
import patternMaching.domain.Pix;
import patternMaching.service.PaymentCalculatorService;
import patternMaching.service.PaymentService;

public class Main {

    public static void main(String[] args) {

        PaymentService service = new PaymentService();
        PaymentCalculatorService calc = new PaymentCalculatorService();

        PaymentMethod cc = new CreditCard("1234-5678-9012", 100.0);
        PaymentMethod pix = new Pix("bruno@pix.com", 200.0);
        PaymentMethod cash = new Cash(50.0);

        // using INSTANCEOF validation Java 8+
        System.out.println("\n-- using instanceof expression --");
        System.out.println("Credit Card Payment TAX: " + service.calculateFee(cc));
        System.out.println("Pix Payment TAX: " + service.calculateFee(pix));
        System.out.println("Cash Payment TAX: " + service.calculateFee(cash));

        // using SWITCH validation Java 17+
        System.out.println("\n-- using switch expression --");
        System.out.println("Credit Card Payment TAX: " + calc.calculateFee(cc));
        System.out.println("Pix Payment TAX: " + calc.calculateFee(pix));
        System.out.println("Cash Payment TAX: " + calc.calculateFee(cash));

    }

}
