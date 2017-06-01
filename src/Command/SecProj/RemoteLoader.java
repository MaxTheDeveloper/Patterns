package Command.SecProj;

import Command.FirstProj.LightOnCommand;
import Command.Light;
import Command.Stereo;

/**
 * Created by Maxim on 31.05.2017.
 * RemoteLoader cоздает несколько объектов команд, которые загружаются в слоты RemoteControl. Каждый объект команды инкапсулирует запрос устройства домашней автоматизации
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
