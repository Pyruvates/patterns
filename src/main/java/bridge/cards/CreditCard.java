package bridge.cards;
/*
 * Created by Koshkarov Vitaliy on 05.12.2019
 */

import bridge.paymentsystem.PaymentSystem;

public class CreditCard extends Card {
    public CreditCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    protected void cardType() {
        System.out.println("Credit card");
    }
}
