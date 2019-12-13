package proxy;
/*
 * Created by Koshkarov Vitaliy on 05.12.2019
 */

public class SecurityAccessProxy implements SecurityAccess {
    private SecurityAccess securityAccess;

    public SecurityAccessProxy(SecurityAccess securityAccess) {
        this.securityAccess = securityAccess;
    }

    @Override
    public void action() {
        before();
        securityAccess.action();
        after();
    }

    private void before() {
        System.out.println("Action before");
    }

    private void after() {
        System.out.println("Action after");
    }
}
