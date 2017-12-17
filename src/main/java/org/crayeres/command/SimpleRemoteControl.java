package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class SimpleRemoteControl {

    private Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
