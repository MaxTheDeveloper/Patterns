package AdapterFacade.FirstProj;

import AdapterFacade.FirstProj.Duck;

/**
 * Created by Maxim on 02.06.2017.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
