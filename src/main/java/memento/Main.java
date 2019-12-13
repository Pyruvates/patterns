package memento;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

public class Main {
    public static void main(String[] args) {
        State abc = new State(new String[] {"a0", "b0", "c0"});
        Originator originator = new Originator();

        originator.saveState(abc);
        System.out.println(abc);

        abc.getArray()[2] = "c1";
        originator.saveState(abc);
        System.out.println(abc);

        abc.getArray()[1] = "b1";
        originator.saveState(abc);
        System.out.println(abc);

        abc.getArray()[1] = "b2";
        originator.saveState(abc);
        System.out.println(abc);

        System.out.println("   Undo changes");

        abc = originator.restoreState();
        System.out.println(abc);

        abc = originator.restoreState();
        System.out.println(abc);

        abc = originator.restoreState();
        System.out.println(abc);

        abc = originator.restoreState();
        System.out.println(abc);
    }
}
