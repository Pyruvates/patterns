package command;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

import java.util.ArrayList;
import java.util.List;

class Executor {
    private List<Command> commands = new ArrayList<>();

    void addCommand(Command command) {
        commands.add(command);
    }

    void executeCommands() {
        commands.forEach( command -> command.execute("\"Exit\"") );
    }
}
