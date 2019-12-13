package observer;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

class ConsumerB {
    /*
     * Big class with many fields and methods
     * */
    private final String name = "ConsumerB";
    private final Listener listener = data -> System.out.println(name + ": " + data);

    Listener getListener() {
        return listener;
    }
}
