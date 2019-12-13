package proxy;
/*
 * Created by Koshkarov Vitaliy on 05.12.2019
 */

public class Main {
    public static void main(String[] args) {
        SecurityAccess securityAccess = new SecurityAccessImpl();
        securityAccess.action();

        System.out.println();

        SecurityAccess accessProxy = new SecurityAccessProxy(new SecurityAccessImpl());
        accessProxy.action();

        System.out.println();

        SecurityAccess accessProxyLog = new SecurityAccessLoggingProxy(new SecurityAccessProxy(new SecurityAccessImpl()));
        accessProxyLog.action();
    }
}
