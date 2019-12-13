package bridge.cards;
/*
 * Created by Koshkarov Vitaliy on 05.12.2019
 */

import bridge.paymentsystem.PaymentSystem;

public class DebitCard extends Card {
    public DebitCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    protected void cardType() {
        System.out.println("Debit card");
    }
}
