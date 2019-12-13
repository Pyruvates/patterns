package proxy;
/*
 * Created by Koshkarov Vitaliy on 05.12.2019
 */

public class SecurityAccessImpl implements SecurityAccess {
    @Override
    public void action() {
        System.out.println("Access to bank account");
    }
}
