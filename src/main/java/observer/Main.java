package observer;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

public class Main {
    public static void main(String[] args) {
        EventProducer eventProducer = new EventProducer();

        ConsumerA consumerA = new ConsumerA(1);
        ConsumerB consumerB = new ConsumerB();

        eventProducer.addListener(consumerA);
        eventProducer.addListener(consumerB.getListener());

        eventProducer.event("EventA");
        System.out.println();
        eventProducer.event("EventB");

        eventProducer.removeListener(consumerA);

        System.out.println();

        eventProducer.event("EventC");
    }
}
