package Command.FirstProj;

/**
 * Created by Maxim on 31.05.2017.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
