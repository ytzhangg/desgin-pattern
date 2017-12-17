package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class MacroCommand implements Command{

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
