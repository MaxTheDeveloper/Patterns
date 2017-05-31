package Command.SecProj;

import Command.FirstProj.Command;
import Command.*;

/**
 * Created by Maxim on 31.05.2017.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}

