package CheeseRace.Items;

import CheeseRace.Vehicles.CarType;
import java.util.ArrayList;

public class Modification extends RaceItem{
    protected int wearDecrease;
    protected double weightDecrease;
    protected ArrayList<CarType> allowedCar;


    /**
     * constructor method
     * @param name
     * @param cheesePrice
     * @param wearDecrease
     * @param weightDecrease
     * @param allowedCar
     */
    public Modification(String name, int cheesePrice, int wearDecrease, double weightDecrease, ArrayList<CarType> allowedCar) {
        super(name, cheesePrice);
        this.name = name;
        this.wearDecrease = wearDecrease;
        this.weightDecrease = weightDecrease;
        this.allowedCar = allowedCar;
    }


    /**
     * show the modifcation's details
     */
    @Override
    public void raceItemDetails() {
        super.raceItemDetails();

        System.out.println("Wear levels decrease ammount: \u001B[33m" + this.wearDecrease + "\u001B[0m | Weight decrease ammount: \u001B[33m" + this.weightDecrease + "\u001B[0m");

        //print details of each AllowedCar object in the allowedCar list
        System.out.println("Allowed Cars for this modification: ");
        if (allowedCar != null && !allowedCar.isEmpty()) {
            for (CarType carType : allowedCar) {
                //assuming AllowedCars class has a useful toString() method
                System.out.println("\t---> " + carType);  //or you can use car.toString() if you want to call that directly
            }
        //if the list is empty
        } else {
            System.out.println("No cars are allowed for this modification.");
        }

        System.out.println("\n✧･ﾟ: *✧･ﾟ:*  *:･ﾟ✧*:･ﾟ✧\n");
        }



    /**
     * setters
     */
    public void setWearDecrease(int wearDecrease) {
        this.wearDecrease = wearDecrease;
    }

    /**
     * setters
     * @param weightDecrease
     */
    public void setWeightDecrease(double weightDecrease) {
        this.weightDecrease = weightDecrease;
    }


    /**
     * getters
     * @return
     */
    public int getWearDecrease() {
        return wearDecrease;
    }

    /**
     * getters
     * @return
     */
    public double getWeightDecrease() {

        return weightDecrease;
    }
}

