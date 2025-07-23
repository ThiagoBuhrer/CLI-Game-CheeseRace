package CheeseRace.Items;

import CheeseRace.Pilots.Rat;
import CheeseRace.Vehicles.Vehicle;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static CheeseRace.GameDesign.UserInteraction.goToMechanicShop;
import static CheeseRace.GameDesign.UserInteraction.mechanicShopMenu;


public class MechanicShop {
    protected static ArrayList<Vehicle> garage;
    protected ArrayList<RaceItem> stock;

    //constructor
    public MechanicShop(ArrayList<Vehicle> garage, ArrayList<RaceItem> stock) {
        this.garage = garage;
        this.stock = stock;
    }


    /**
     * display 06 race items available in the stock randomly
     */
    public void showStock() {

        //convert the stock list to an array
        RaceItem[] stockArray = stock.toArray(new RaceItem[0]);
        Random random = new Random();

        //shuffle the array manually
        for (int i = 0; i < stockArray.length; i++) {
            int randomIndex = random.nextInt(stockArray.length);

            //swap the current element with the randomly chosen one
            RaceItem temp = stockArray[i];
            stockArray[i] = stockArray[randomIndex];
            stockArray[randomIndex] = temp;
        }

        System.out.println("\n\n|✧･ﾟ: *✧･ﾟ:*  |  RACE ITEMS IN STOCK:  |  *:･ﾟ✧*:･ﾟ✧|\n\n");

        //loop through the first 06 race items
        for (int i = 0; i < 6 && i < stockArray.length; i++) {
            RaceItem raceitem = stockArray[i];
            System.out.println("\n\uD83D\uDC8E Item Code: " + (i + 1));
            raceitem.raceItemDetails();
            System.out.println();
        }
    }


    /**
     * display 12 vehicles available in the garage randomly
     */
    public void showGarage() {

        //convert  garage list to an array
        Vehicle[] garageArray = garage.toArray(new Vehicle[0]);
        Random random = new Random();

        //shuffle the array
        for (int i = 0; i < garageArray.length; i++) {
            int randomIndex = random.nextInt(garageArray.length);

            //change the current element with the randomly chosen one
            Vehicle temp = garageArray[i];
            garageArray[i] = garageArray[randomIndex];
            garageArray[randomIndex] = temp;
        }

        System.out.println("\n\n|  GARAGE VEHICLES:  |\n\n");

        //loop through the first 12 vehicles
        for (int i = 0; i < 12 && i < garageArray.length; i++) {
            Vehicle vehicle = garageArray[i];
            System.out.println("\u001B[33m◯\u001B[0m " + (i + 1));
            vehicle.showDetails();
            System.out.println();
        }
    }

    /**
     * sell a new item to the rat pilot
     * receive the pilot as a parameter, and checks whether the purchase can be made
     */
    public static void sellItem() {

        System.out.println("Not implemented yet.... :C");

        /*
         recebe o Piloto como parâmetro, e verifica se a compra pode ser efetuada, caso tal compra seja possível, deve acrescentar ao inventário do VeiculoAtual do Piloto o item, e decrementar as suas fichas de corrida.



        // Display all available items
        System.out.println("\nAvailable Items in Mozzorato's Shop:");
        mechanicShop.showStock();  //reuse the showStock() method


         */

    }

    /**
     * sell a new vehicle to the rat pilot
     * receive the pilot as a parameter, and checks whether the purchase can be made
     * @param newPilot
     */
    public static void sellVehicle(Rat newPilot) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        //show list of vehicles
        System.out.println("\n\n|  GARAGE VEHICLES:  |\n\n");
        for (int i = 0; i < 12 && i < garage.size(); i++) {
            Vehicle vehicle = garage.get(i);
            System.out.println("\u001B[33m◯\u001B[0m " + (i + 1));
            vehicle.showDetails();
            System.out.println();
        }

        //choose vehicle
        while (true) {
            System.out.println("\nChoose a vehicle from the garage by entering the vehicle's code (1-12): ");

            //validate input
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                //check if the choice is between 1 and 12
                if (choice >= 1 && choice <= 12) {
                    Vehicle chosenVehicle = garage.get(choice - 1); //access chosen vehicle

                    //check if the player has enough cheese pieces to pay for the vehicle
                    if (newPilot.getCheesePieces() >= chosenVehicle.getPrice()) {
                        newPilot.setCurrentVehicle(chosenVehicle); //make new vehicle the pilot's current vehicle
                        newPilot.setCheesePieces(newPilot.getCheesePieces() - chosenVehicle.getPrice()); //charges pilot
                        System.out.println("\nYou have chosen the \u001B[33m" + chosenVehicle.getBrand() + "\u001B[0m! 🏁");
                        System.out.println("Remaining cheese pieces: \u001B[33m" + newPilot.getCheesePieces() + "\u001B[0m 🧀");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("\nYou don't have enough cheese pieces to buy this vehicle. \uD83D\uDE97 \uD83C\uDFCD\uFE0F\n");
                        System.out.println("Price: \u001B[33m" + chosenVehicle.getPrice() + "\u001B[0m 🧀 | Your cheese pieces: \u001B[33m" + newPilot.getCheesePieces() + "\u001B[0m 🧀");
                        System.out.println();
                        return;
                    }
                } else {
                    System.out.println("\nSelect a code between 1 and 12. See GARAGE above. \uD83D\uDE97 \uD83C\uDFCD\uFE0F\n");
                }
            } else {
                System.out.println("\nInvalid input. Please enter a number. See GARAGE above. \uD83D\uDE97 \uD83C\uDFCD\uFE0F\n");
                scanner.next(); //clear invalid input
            }
        }
    }


    /**
     * getters
     * @return
     */
    public ArrayList<Vehicle> getGarage() {
        return garage;
    }

    /**
     * getters
     * @return
     */
    public ArrayList<RaceItem> getStock() {
        return stock;
    }


    /**
     * setters
     * @param garage
     */
    public void setGarage(ArrayList<Vehicle> garage) {

        this.garage = garage;
    }

    /**
     * setters
     * @param stock
     */
    public void setStock(ArrayList<RaceItem> stock) {
        this.stock = stock;
    }

}
