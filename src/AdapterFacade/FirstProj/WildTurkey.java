package AdapterFacade.FirstProj;

import AdapterFacade.FirstProj.Turkey;

/**
 * Created by Maxim on 02.06.2017.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
