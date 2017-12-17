package org.crayeres.command;

import org.junit.Test;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class SimpleRemoteControlTest {

    @Test
    public void testButtonPresse() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand command = new LightOnCommand(light);
        remote.setCommand(command);
        remote.buttonWasPressed();

        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(door);
        remote.setCommand(doorOpenCommand);
        remote.buttonWasPressed();
    }
}
