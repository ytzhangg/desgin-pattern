package org.crayeres.command;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class Stereo {

    private String location;

    public Stereo() {
    }

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is On");
    }

    public void off() {
        System.out.println(location + " stereo is Off");
    }

    public void setCd() {
        System.out.println(location + " stereo is set for CD input");
    }

    public void setDvd() {
        System.out.println(location + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(location + " stereo is set for RADIO input");
    }

    public void setVolume(int volume) {
        System.out.println(location + " stereo volume set to " + volume);
    }
}
