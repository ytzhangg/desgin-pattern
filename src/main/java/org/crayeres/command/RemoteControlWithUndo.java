package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class RemoteControlWithUndo {

    Command[] onCommands;

    Command[] offCommands;

    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoComand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot ").append(i).append("] ");
            sb.append(onCommands[i].getClass().getName()).append("    ");
            sb.append(offCommands[i].getClass().getName()).append("\n");
        }
        sb.append("[undo] ").append(undoCommand.getClass().getName()).append("\n");
        return sb.toString();
    }
}
