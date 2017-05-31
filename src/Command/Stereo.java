package Command;

/**
 * Created by Maxim on 31.05.2017.
 */
public class Stereo {
    public Stereo(String string) {
        System.out.println("Stereo in the " + string);
    }

    public void on(){};
    public void off(){};
    public void setCd(){};
    public void setDvd(){};
    public void setRadio(){};
    public void setVolume(int i){};
}
