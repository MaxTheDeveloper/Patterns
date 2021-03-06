package TemplateMethod.FirstProj;

/**
 * Created by Maxim on 04.06.2017.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling water");
    }
    void  pourInCup(){
        System.out.println("Pouring into cup");
    }
    boolean customerWantsCondiments(){
        return true;
    }
}
