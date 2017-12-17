package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class CeilingFanOnCommand implements Command{

    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.on();
    }

    public void undo() {
        ceilingFan.off();
    }
}
