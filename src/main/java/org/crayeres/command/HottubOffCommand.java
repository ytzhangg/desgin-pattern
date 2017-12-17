package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class HottubOffCommand implements Command{

    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.off();
    }

    public void undo() {
        hottub.on();
    }
}
