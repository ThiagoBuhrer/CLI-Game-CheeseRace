package CheeseRace.GameDesign;

import CheeseRace.Items.MechanicShop;
import CheeseRace.Pilots.Rat;
import CheeseRace.Tracks.Moment;
import CheeseRace.Tracks.SewerTrack;
import CheeseRace.Vehicles.Vehicle;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInteraction {

    /**
     * asks the user to Press ENTER in order to move on
     */
    public static void Confirm() {

        Scanner sc = new Scanner(System.in);
        String input;

        //asks the player to press ENTER to continue
        while (true) {
            System.out.println("\n\t\t\u001B[33m◯\u001B[0m Press \u001B[33mENTER\u001B[0m to continue. \uD83C\uDFC1");

            input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println();
                return; //exit the method if Enter is pressed
            }
        }
    }


    /**
     * asks the user to choose a vehicle
     * @param newPilot
     * @param mechanicShop
     */
    public static void chooseVehicle(Rat newPilot, MechanicShop mechanicShop) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        //choose a vehicle by number (1-12)
        while (true) {
            System.out.println("\nChoose a vehicle from the garage by entering the vehicle's code (1-12): ");

            //check if input is an integer
            if (sc.hasNextInt()) {
                choice = sc.nextInt();

                //check if the choice is between 1 and 12
                if (choice >= 1 && choice <= 12) {

                    Vehicle chosenVehicle = mechanicShop.getGarage().get(choice - 1); //access value in the garage
                    newPilot.setCurrentVehicle(chosenVehicle); //set chosen vehicle as the pilot's current vehicle
                    System.out.println("\nYou have chosen the \u001B[33m" + chosenVehicle.getBrand() + "\u001B[0m! 🏁");

                    //decrement the cheese pieces by 10 after choosing the first vehicle
                    int currentCheese = newPilot.getCheesePieces(); //get current ammount of cheese
                    newPilot.setCheesePieces(currentCheese - 10); //decrease 10 cheese pieces
                    break;

                } else {
                    System.out.println("\nSelect a code between 1 and 12. See GARAGE above. \uD83D\uDE97 \uD83C\uDFCD\uFE0F\n");
                }
            } else {
                System.out.println("\nInvalid input. Please enter a number. See GARAGE above. \uD83D\uDE97 \uD83C\uDFCD\uFE0F\n");
                sc.next(); //clear invalid input
            }
        }
    }

    /**
     * Player chooses a raceItem
     * @param newPilot
     * @param mechanicShop
     */
    public static void chooseRaceItem(Rat newPilot, MechanicShop mechanicShop) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        //ask if the user wants to buy a new item:
        while (true) {
            System.out.println("\nDo you want to buy a new \u001B[33mRace Item \u001B[0m\uD83D\uDC8E ? (yes or no)\n");

            if (sc.hasNextInt()) { //check if input is a number
                System.out.println("\nThat's not a valid answer. Please enter 'yes' or 'no'.\n");
                sc.next(); //clear invalid input
                continue;
            }

            String answer = sc.next().trim().toLowerCase();

            if (answer.equals("yes")) {
                break; //continue to choosing a race item
            } else if (answer.equals("no")) {
                System.out.println("\nOkay, maybe next time! Exiting...\n");
                return; //exit
            } else {
                System.out.println("\nThat's not a valid answer. Please enter 'yes' or 'no'.\n");
            }
        }
    }


    /**
     * player chooses the track he wants after seeing a list of names.
     * @param newPilot
     * @param tracks
     * @return
     */
    public static SewerTrack chooseTrack(Rat newPilot, ArrayList<SewerTrack> tracks) {

        //show available tracks + associated moments
        System.out.println("\n\n\t\t\t\t\t\u001B[33m1... 2... 3... TIME TO CHOOSE A TRACK! GO!\u001B[0m \uD83C\uDFC1\n");
        Design.prepareToRace();
        System.out.println("\n\n|  TRACKS DESCRIPTION:  |\n");
        for (int i = 0; i < tracks.size(); i++) {
            System.out.println((i + 1) + ". \uD83D\uDEE3\uFE0F \u001B[33m" + tracks.get(i).getName() + "\u001B[0m");
            System.out.println("Moments associated with this track: ");

            for (Moment moment : tracks.get(i).moment) {
                System.out.println("- " + moment.getName());
            }
            System.out.println();
        }

        //prints a series of notes that help the player have a better understanding of "Moments" + advise player to be strategic about his/her choices moving forward.
        System.out.println("\n\uD83D\uDD0E NOTE: ");
        System.out.println("- Each \u001B[33mMoment\u001B[0m ⛔ has certain attributes that will represent a delay that the Vehicle will suffer at a given moment on the track.");
        System.out.println("- Some \u001B[33mMoments\u001B[0m ⛔ will favor lighter vehicles, others will favor more powerful vehicles.");
        System.out.println("- So be mindful when choosing the tracks you want to try out and take into account your current vehicle and special items attached.\n\n");

        System.out.println("|  MOMENTS DESCRIPTION:  |");
        System.out.println("⛔ \u001B[33mU-turn\u001B[0m - increases weight delay (difficulty with turning).");
        System.out.println("⛔ \u001B[33mS-curve\u001B[0m - affects both weight and horsepower.");
        System.out.println("⛔ \u001B[33mGravel\u001B[0m - affects weight (slows down heavier cars) and horsepower.");
        System.out.println("⛔ \u001B[33mRubber\u001B[0m - helps with speed, reduces weight delay.");
        System.out.println("⛔ \u001B[33mSlippery\u001B[0m - conditions add weight delay but not horsepower.");
        System.out.println("⛔ \u001B[33mOil puddles\u001B[0m - add weight delay but no horsepower loss.");
        System.out.println("⛔ \u001B[33mBumpy track\u001B[0m - increases weight delay and minor horsepower loss.");
        System.out.println("⛔ \u001B[33mMud\u001B[0m - causes heavyweight delay but no horsepower loss.\n\n");


        //show available tracks
        System.out.println("\n\nNow, choose a Sewer Track \uD83C\uDFC1 to race:\n");
        for (int i = 0; i < tracks.size(); i++) {
            System.out.println((i + 1) + ". \u001B[33m" + tracks.get(i).getName() + "\u001B[0m");
        }

        //get the user's choice
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        //keep asking until the user enters a valid choice
        while (choice < 1 || choice > tracks.size()) {
            System.out.print("\nEnter the number of the track: \n");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 1 || choice > tracks.size()) {
                    System.out.println("\nInvalid choice. Please choose a valid track.\n");
                }
            } else {
                System.out.println("\nInvalid input. Please enter a number.\n");
                scanner.next(); //clear the invalid input
            }
        }

        //once a valid choice is made, start the cheese race
        SewerTrack chosenTrack = tracks.get(choice - 1);
        System.out.println("\n");
        Design.Bar();
        System.out.println("\n");
        Design.raceCar();
        System.out.println();
        System.out.println("\nYou chose: \u001B[33m" + chosenTrack.getName() + "\u001B[0m \uD83C\uDFC1 \uD83D\uDE97 \n");

        //return the selected track
        return chosenTrack;

    }


    /**
     * ask the user if he wants to visit the mechanic shop or move on to the next race
     * @param newPilot
     */
    public static void goToMechanicShop(Rat newPilot) {

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        //loop until the user provides a valid input (1 or 2)
        while (choice != 1 && choice != 2) {
            System.out.println("\n");
            Design.Bar();
            System.out.println();
            Design.toolBox();
            System.out.println("\nWould you like to visit \u001B[33mMozzorato's mechanic shop\u001B[0m or move forward?\n");
            System.out.println("1. Yep, go to mechanic shop \uD83E\uDDF0\uD83D\uDD29\uD83D\uDEDE");
            System.out.println("2. Nope, next race! \uD83C\uDFC1");

            //check if the input is an integer
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                //validate if the input is 1 or 2
                if (choice == 1) {
                    mechanicShopMenu(newPilot); //opens the mechanic shop menu of options
                } else if (choice == 2) {
                    System.out.println("\nYou chose to move forward. \uD83C\uDFC1");
                    break;
                } else {
                    System.out.println("\nInvalid option. Please enter 1 or 2.");
                }
            } else {
                System.out.println("\nInvalid input. Please enter a number.");
                scanner.next(); //clear input
            }
        }

    }



    /**
     * opens the mechanic shop's menu of options:
     * 1 - Change current special items
     * 2 - Buy vehicle
     * 3 - Buy special items
     * 4 - Leave mechanic shop
     * @param newPilot
     */
    public static void mechanicShopMenu(Rat newPilot) {


        Scanner scanner = new Scanner(System.in);
        int choice = -1;


        while (choice < 1 || choice > 4) {
            System.out.println("\n");
            Design.Bar();
            System.out.println();
            Design.Mozzorato();
            System.out.println("\n\n\t\t\u001B[33m◯\u001B[0m MOZZORATO: Yo, what would you like, homie? How can I help?\n");

            System.out.println("1. Change Special Items \uD83D\uDD29");
            System.out.println("2. Buy Vehicle \uD83D\uDE97 \uD83C\uDFCD\uFE0F");
            System.out.println("3. Buy Special Items \uD83D\uDC8E");
            System.out.println("4. Leave mechanic shop\n");
            System.out.println("\tENTER option:");

            //check if integer
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                //validate if the input is between 1 and 4
                if (choice >= 1 && choice <= 4) {
                    switch (choice) {
                        case 1:
                            //change Special Items
                            System.out.println("\nYou chose: Change Special Items");
                            Rat.useItem();
                            break;
                        case 2:
                            //buy Vehicle
                            System.out.println("\nYou chose: Buy Vehicle.");
                            MechanicShop.sellVehicle(newPilot);
                            break;
                        case 3:
                            //buy Special Items
                            System.out.println("\nYou chose: Buy Special Items");
                            MechanicShop.sellItem();
                            break;
                        case 4:
                            //leave mechanic shop
                            System.out.println("\n * leaving the mechanic shop... *\n");
                            break;
                    }
                } else {
                    System.out.println("\nInvalid option. Please enter a number from 1 to 4. \uD83D\uDC00");
                }
            } else {
                System.out.println("\nInvalid input. Please enter a number.");
                scanner.next(); //clear input
            }
        }
    }



}










