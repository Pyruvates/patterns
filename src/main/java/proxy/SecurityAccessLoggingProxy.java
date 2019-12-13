package proxy;
/*
 * Created by Koshkarov Vitaliy on 05.12.2019
 */

public class SecurityAccessLoggingProxy implements SecurityAccess {
    private SecurityAccess securityAccess;

    public SecurityAccessLoggingProxy(SecurityAccess securityAccess) {
        this.securityAccess = securityAccess;
    }

    @Override
    public void action() {
        log();
        securityAccess.action();
    }

    private void log() {
        System.out.println("Logging");
    }
}
