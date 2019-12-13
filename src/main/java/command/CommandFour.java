package command;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

public class CommandFour implements Command {
    @Override
    public void execute(String value) {
        System.out.println("CommandFour: " + value);
    }
}
