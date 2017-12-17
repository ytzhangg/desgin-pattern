package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public interface Command {

    public void execute();

    public void undo();
}
