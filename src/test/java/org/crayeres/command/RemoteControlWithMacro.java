package org.crayeres.command;

import org.junit.Test;

import static javafx.scene.input.KeyCode.L;

/**
 * Created by Administrator on 2017/12/17 0017.
 */
public class RemoteControlWithMacro {

    @Test
    public void testMacro() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        Tv tv = new Tv("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand livingRoomLightOn = new LightOnCommand(light);
        StereoOnWithCDCommand livingRoomStereoOn = new StereoOnWithCDCommand(stereo);
        TvOnCommand livingRoomTvOn = new TvOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand livingRoomLightOff = new LightOffCommand(light);
        StereoOffCommand livingRoomStereoOff = new StereoOffCommand(stereo);
        TvOffCommand livingRoomTvOff = new TvOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);


        Command[] patryOn = {livingRoomLightOn, livingRoomStereoOn, livingRoomTvOn, hottubOn};
        Command[] partyOff = {livingRoomLightOff, livingRoomStereoOff, livingRoomTvOff, hottubOff};
        MacroCommand macroOn = new MacroCommand(patryOn);
        MacroCommand macroOff = new MacroCommand(partyOff);
        remoteControl.setCommand(0, macroOn, macroOff);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Marcro Off--");
        remoteControl.offButtonWasPushed(0);
        System.out.println("--- Pushing Marcro Undo---");
        remoteControl.undoButtonWasPushed();
    }
}
