package memento;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

class Memento {
    private final State state;

    Memento(State state) {
        this.state = new State(state);
    }

    State getState() {
        return state;
    }
}
