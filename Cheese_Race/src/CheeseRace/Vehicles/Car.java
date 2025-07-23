package CheeseRace.Vehicles;

import CheeseRace.Items.Modification;

import java.util.ArrayList;

//Car subclass
public class Car extends Vehicle {
    protected CarType carType;
    protected ArrayList<Modification> modification;

    /**
     * constructor method
     * @param brand
     * @param model
     * @param horsepower
     * @param weightKG
     * @param wear
     * @param price
     * @param carType
     */
    public Car(String brand, String model, int horsepower, int weightKG, int wear, int price, CarType carType) {
        super(brand, model, horsepower, weightKG, wear, price);
        this.carType = carType;
        this.modification = new ArrayList<>();  //initializes an empty list
    }

    /**
     * add more details to the superclass Vehicle's method "showDetails()"
     */
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Car type: \u001B[33m" + this.carType + "\u001B[0m");
        //print all modifications listed in raceKit

        //check if the modification list is empty before displaying it
        if (modification.isEmpty()) {
            System.out.println("No modifications available.");
        } else {
            //print all modifications listed in raceKit
            System.out.println("\n<> List of modifications:");
            for (Modification modification : modification) {
                System.out.println(" - " + modification);
            }
        }
        System.out.println("\uD83D\uDE97 (Car)");
        System.out.println("\n");
    }


    /**
     * getter
     * @return
     */
    public CarType getCarType() {
        return carType;
    }

    /**
     * setter
     * @param carType
     */
    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
