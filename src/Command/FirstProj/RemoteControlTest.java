package Command.FirstProj;
import Command.*;
/**
 * Created by Maxim on 31.05.2017.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("light");
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);

    }
}
