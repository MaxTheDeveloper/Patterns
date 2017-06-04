package TemplateMethod.SecProj;

import java.util.Arrays;

/**
 * Created by Maxim on 04.06.2017.
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy",8),
                new Duck("Dewey",2),
                new Duck("Daffy",7),
                new Duck("Daffy",2),
                new Duck("Daffy",10),
                new Duck("Daffy",2),
        };

        System.out.println("Before sorting\n");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("After sorting\n");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length ; i++) {
            System.out.println(ducks[i]);
        }
    }
}
