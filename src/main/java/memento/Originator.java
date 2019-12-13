package memento;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

import java.util.Deque;
import java.util.ArrayDeque;

class Originator {
    private final Deque<Memento> stackStates = new ArrayDeque<>();

    void saveState(State state) {
        stackStates.push(new Memento(state));
    }

    State restoreState() {
        return stackStates.pop().getState();
    }
}
