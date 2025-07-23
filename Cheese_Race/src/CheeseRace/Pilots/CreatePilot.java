package CheeseRace.Pilots;

import CheeseRace.GameDesign.Design;
import CheeseRace.Vehicles.Vehicle;

import java.util.Scanner;

public class CreatePilot {

    /**
     * Factory of Rat Pilots
     * @return
     */
    public static Rat Create() {
        Scanner sc = new Scanner(System.in);

        //ask the name of your new rat
        System.out.println("\n\nEnter your rat pilot name: ");
        String name = sc.nextLine();

        //default initial values
        int cheesePieces = 0;
        Vehicle currentVehicle = null;
        int victories = 0;

        //create a new Rat object using user input
        Rat newPilot = new Rat(name, cheesePieces, currentVehicle, victories);

        //confirmation
        Design.NewPilot();  //image of new rat pilot
        System.out.println("\nPilot created successfully! GO! GO! GO!");
        System.out.println("Name: \u001B[33m" + newPilot.getName() + "\u001B[0m");

        return newPilot;

    }
}
