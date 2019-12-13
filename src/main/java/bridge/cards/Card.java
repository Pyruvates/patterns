package bridge.cards;
/*
 * Created by Koshkarov Vitaliy on 05.12.2019
 */

import bridge.paymentsystem.PaymentSystem;

public abstract class Card {
    private PaymentSystem paymentSystem;

    Card(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void info() {
        paymentSystem.printNamePS();
        cardType();
    }

    protected abstract void cardType();
}
