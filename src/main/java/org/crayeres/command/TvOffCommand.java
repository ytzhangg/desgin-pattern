package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class TvOffCommand implements Command{

    Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }

    public void undo() {
        tv.on();
    }
}
