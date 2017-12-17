package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class Tv {

    private String location;

    public Tv(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Tv is on");
    }

    public void off() {
        System.out.println(location + " Tv is off");
    }
}
