package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class HottubOnCommand implements Command{

    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
    }

    public void undo() {
        hottub.off();
    }
}
