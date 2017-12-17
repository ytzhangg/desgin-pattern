package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class StereoOnWithCDCommand implements Command{

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    public void undo() {
        stereo.off();
    }
}
