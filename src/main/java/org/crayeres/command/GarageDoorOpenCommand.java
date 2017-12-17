package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class GarageDoorOpenCommand implements Command{

    private GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    public void execute() {
        door.up();
    }

    public void undo() {
        door.down();
    }
}
