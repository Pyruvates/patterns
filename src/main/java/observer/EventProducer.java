package observer;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

import java.util.List;
import java.util.ArrayList;

class EventProducer {
    private List<Listener> listeners = new ArrayList<>();

    void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    void event(String event) {
        this.listeners.forEach(listener -> listener.onUpdate(event));
    }
}
