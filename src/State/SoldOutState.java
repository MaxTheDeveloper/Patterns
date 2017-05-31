package State;

/**
 * Created by MUtemov on 31.05.2017.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert the quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getSoldOutState());
    }

    @Override
    public void turnCrank() {
        System.out.println("There's no need to turn the crank");
    }

    @Override
    public void dispense() {
        if(gumballMachine.getCount() == 0){
            System.out.println("There's no things to dispense");
        }
    }
}
