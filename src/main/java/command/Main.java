package command;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

class Main {
    public static void main(String[] args) {
        Executor executor = new Executor();

        executor.addCommand(new CommandOne());
        executor.addCommand(new CommandTen());
        executor.addCommand(new CommandOne());
        executor.addCommand(new CommandFour());

        executor.executeCommands();
    }
}
