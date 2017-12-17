package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class Light {

    private String location;

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is On");
    }

    public void off() {
        System.out.println(location + " light is Off");
    }
}
