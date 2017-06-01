package Command.SecProj;

import Command.FirstProj.LightOnCommand;
import Command.Light;
import Command.Stereo;
import Command.ThirdProj.CeilingFanHighCommand;
import Command.ThirdProj.CeilingFanMediumCommand;

/**
 * Created by Maxim on 31.05.2017.
 * RemoteLoader cоздает несколько объектов команд, которые загружаются в слоты RemoteControl. Каждый объект команды инкапсулирует запрос устройства домашней автоматизации
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0,ceilingFanMediumCommand,ceilingFanOffCommand);
        remoteControl.setCommand(1,ceilingFanHighCommand,ceilingFanOffCommand);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
