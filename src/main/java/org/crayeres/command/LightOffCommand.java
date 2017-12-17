package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class LightOffCommand implements Command{

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }


    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
