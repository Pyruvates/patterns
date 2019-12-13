package bridge.paymentsystem;
/*
 * Created by Koshkarov Vitaliy on 05.12.2019
 */

public class MastercardPS implements PaymentSystem {
    @Override
    public void printNamePS() {
        System.out.println("MastercardPS");
    }
}
