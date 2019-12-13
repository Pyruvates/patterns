package command;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

public class CommandOne implements Command {
    @Override
    public void execute(String value) {
        System.out.println("CommandOne is executing " + value);
    }
}
