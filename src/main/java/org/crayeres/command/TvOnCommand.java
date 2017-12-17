package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class TvOnCommand implements Command{

    Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }

    public void undo() {
        tv.off();
    }
}
