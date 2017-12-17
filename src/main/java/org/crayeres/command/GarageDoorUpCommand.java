package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class GarageDoorUpCommand implements Command{

    private GarageDoor door;

    public GarageDoorUpCommand(GarageDoor door) {
        this.door = door;
    }

    public void execute() {
        door.up();
    }

    public void undo() {
        door.down();
    }
}
