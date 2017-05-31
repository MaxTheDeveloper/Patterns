package Command.FirstProj;


/**
 * Created by Maxim on 31.05.2017.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
class Light{
    void on(){
        System.out.println("Light is on");
    };
    void off(){
        System.out.println("Light is off");
    };
}
