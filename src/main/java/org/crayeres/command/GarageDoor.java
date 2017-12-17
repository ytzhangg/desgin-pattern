package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class GarageDoor {
    private String location;

    public GarageDoor() {
    }

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " garage Door is Open");
    }

    public void down() {
        System.out.println(location + " garage Door is Close");
    }

    public void stop() {
        System.out.println(location + " garage Door is Stop");
    }

    public void lightOn(){
        System.out.println(location + " garage Door is On");
    }

    public void lightOff() {
        System.out.println(location + " garage Door is Off");
    }
}
