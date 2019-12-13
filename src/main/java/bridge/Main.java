package bridge;
/*
 * Created by Koshkarov Vitaliy on 05.12.2019
 */

import bridge.cards.Card;
import bridge.cards.CreditCard;
import bridge.cards.DebitCard;
import bridge.paymentsystem.VisaPS;
import bridge.paymentsystem.MastercardPS;

public class Main {
    public static void main(String[] args) {
        Card debitVisa = new DebitCard(new VisaPS());
        debitVisa.info();

        Card creditVisa = new CreditCard(new VisaPS());
        creditVisa.info();

        Card debitMastercard = new DebitCard(new MastercardPS());
        debitMastercard.info();

        Card creditMastercard = new CreditCard(new MastercardPS());
        creditMastercard.info();
    }
}
