package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class GarageDoorDownCommand implements Command{

    private GarageDoor door;

    public GarageDoorDownCommand(GarageDoor door) {
        this.door = door;
    }

    public void execute() {
        door.down();
    }

    public void undo() {
        door.up();
    }
}
