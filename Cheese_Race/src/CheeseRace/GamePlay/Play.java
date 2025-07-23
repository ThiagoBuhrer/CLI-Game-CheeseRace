package CheeseRace.GamePlay;

import CheeseRace.GameDesign.Design;
import CheeseRace.GameDesign.Text;
import CheeseRace.GameDesign.UserInteraction;
import CheeseRace.Items.MechanicShop;
import CheeseRace.Items.ProduceItem;
import CheeseRace.Items.RaceItem;
import CheeseRace.Pilots.CreatePilot;
import CheeseRace.Pilots.Rat;
import CheeseRace.Tracks.BuildTrack;
import CheeseRace.Tracks.SewerTrack;
import CheeseRace.Vehicles.CreateVehicle;
import CheeseRace.Vehicles.Vehicle;

import java.util.ArrayList;

public class Play {

    /**
     * Starts the game - Timeline of methods
     */
    public static void gameOn() {


        //GAME TIMELINE:


        //___________________________________________________________________



        //ACT 1
        System.out.println();
        Design.Bar();
        Text.Dialogue01(); //Dialogue number 01 - "Introduction to the Sewer World".
        System.out.println();
        Design.Racers();
        System.out.println();
        UserInteraction.Confirm();



        //___________________________________________________________________



        //ACT 2
        Design.Bar();
        System.out.println();
        Text.Dialogue02(); //Dialogue number 02 - "Registering a new rat pilot".
        Rat newPilot = CreatePilot.Create(); //Instantiate a new rat pilot.
        UserInteraction.Confirm();



        //___________________________________________________________________



        //ACT 3
        Design.Bar();
        Text.Dialogue03(); //Dialogue number 03 - "The goal".
        System.out.println();
        Design.Racers();
        System.out.println();
        UserInteraction.Confirm();



        //___________________________________________________________________



        //ACT 4
        Design.Bar();
        System.out.println();
        Design.Bounty();
        System.out.println();
        //Dialogue number 04 - "Special bounty: the cheese pieces".
        //Dialogue number 04 also increments an initial amount of cheese pieces to newPilot depending on the user's response to interactions.
        Text.Dialogue04(newPilot);
        System.out.println();
        UserInteraction.Confirm();
        newPilot.ratStats(); //prints current stats of the rat pilot after receiving an initial amount of cheese pieces.
        System.out.println();
        UserInteraction.Confirm();



        //___________________________________________________________________



        //ACT 5
        Design.Bar();
        System.out.println();
        Text.Dialogue05(); //Dialogue number 05 - "Your first vehicle".
        System.out.println();
        Design.Racers();
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        Design.Bar();
        System.out.println();
        Design.Mozzorato();
        Text.Dialogue06(); //Dialogue number 06 - "First time at the mechanic shop".
        UserInteraction.Confirm();
        System.out.println();
        Design.Bar();
        System.out.println();
        MechanicShop mechanicShop = new MechanicShop(new ArrayList<Vehicle>(), new ArrayList<RaceItem>());
        //Instantiate new 16 vehicles (08 Cars and 08 Motorcycles) + adds them to the garage.
        CreateVehicle.Create(mechanicShop);
        mechanicShop.showGarage(); //Show the player all the vehicles available at the Mechanic Shop.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        Design.Bar();
        System.out.println();
        Design.Mozzorato();
        Text.Dialogue07(); //Dialogue number 07 - "Mozzorato wants to sell a car".
        //Ask the user to choose a first vehicle for free from the shuffled vehicles of the current garage.
        UserInteraction.chooseVehicle(newPilot, mechanicShop);
        Design.newVehicle();
        System.out.println();
        UserInteraction.Confirm();
        Text.showAmountCheese(newPilot); //Print remaining cheese.
        UserInteraction.Confirm();



        //___________________________________________________________________



        //ACT 6
        Design.Bar();
        System.out.println();
        Design.Mozzorato();
        System.out.println();
        Text.Dialogue08(); //Dialogue number 08 - "Introduction to Special Items".
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        Design.Bar();
        System.out.println();
        ProduceItem.Produce(mechanicShop); //Instantiate 12 new items (6 for cars, 6 for motorcycles).
        Design.gem();
        System.out.println();
        mechanicShop.showStock(); //Display 06 random Race Items (gems) in stock at the mechanic shop at the moment + alongside price and description.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();



        //___________________________________________________________________



        //ACT 7
        Design.Bar();
        System.out.println();
        Text.Dialogue09(); //Dialogue number 09 - "Your very first race".
        Design.Racers();
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        Design.Bar();
        System.out.println();
        ArrayList<SewerTrack> tracks = BuildTrack.Build(); //Instantiate new Moments (08) and new Sewer Tracks (10).
        SewerTrack chosenTrack = UserInteraction.chooseTrack(newPilot, tracks); //User choose a Sewer Track.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        Design.Bar();
        System.out.println();
        double totalTime = newPilot.firstCheeseRace(chosenTrack); //Start the 1st race on the chosen Sewer Track (no special items handled yet).
        //firstCheeseRace returns the total time that the rat pilot took to complete the entire race. This value is later passed as a parameter to timeCompare().
        newPilot.timeCompare(totalTime, chosenTrack, tracks); //Check if total time is bellow the value of chosen track's current record. Then prints a message of either success or failure.
        //timeCompare() send as a parameters 1) the total time to complete first track 2) the track that was chosen by the player and 3) the ArrayList containing all the tracks and their respective moments.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();



        //___________________________________________________________________



        //ACT 8
        Design.Bar();
        System.out.println();
        Text.Dialogue10(); //Dialogue number 10 - "Ready for your 2nd race?".
        Design.Racers();
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        UserInteraction.goToMechanicShop(newPilot); //Ask the user if he wants to visit the mechanic shop or move on to the next race. If so, calls the method mechanicShopMenu();
        //Rat.useItem(); //Ask the user if he wants to use an item before the next race.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();



        //___________________________________________________________________



        //ACT 9
        //Design.Bar();
        //System.out.println();
        //Text.Dialogue11(); //Dialogue number 11 - "Ready for your 3rd race?"
        //Design.Racers();
        //System.out.println();
        //UserInteraction.Confirm();
        //System.out.println();
        //UserInteraction.goToMechanicShop(newPilot);
        //Rat.useItem(); //Ask the user if he wants to use an item before the next race.
        //System.out.println();
        //Design.Bar();
        //double totalTime = newPilot.CheeseRace(chosenTrack); //User plays the regular Cheese Race (takes items into account).
        //newPilot.timeCompare(totalTime, chosenTrack, tracks);
        //System.out.println();
        //UserInteraction.Confirm();
        //System.out.println();



        //___________________________________________________________________



        //ACT 10
        //Design.Bar();
        //System.out.println();
        //Text.Dialogue11(); //Dialogue number 11 - "Ready for your 4th race?"
        //Design.Racers();
        //System.out.println();
        //UserInteraction.Confirm();
        //System.out.println();
        //UserInteraction.goToMechanicShop(newPilot);
        //Rat.useItem(); //Ask the user if he wants to use an item before the next race.
        //System.out.println();
        //Design.Bar();
        //double totalTime = newPilot.CheeseRace(chosenTrack); //User plays the regular Cheese Race (takes items into account).
        //newPilot.timeCompare(totalTime, chosenTrack, tracks);
        //System.out.println();
        //UserInteraction.Confirm();
        //System.out.println();



        //___________________________________________________________________



        //ACT 11
        //Final 5000m Race
        //Final Results
        //Final Dialogue
        //Credits



        //___________________________________________________________________



        //PROVISORY ACT BEFORE COMPLETE IMPLEMENTATION:


        // ---------------- 2nd race ----------------
        Design.Bar();
        System.out.println();
        Text.Dialogue11(); // "Ready for your 2nd race?".
        Design.Racers();
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        SewerTrack chosenTrack2 = UserInteraction.chooseTrack(newPilot, tracks); //User choose a Sewer Track.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        Design.Bar();
        System.out.println();
        double totalTime2 = newPilot.firstCheeseRace(chosenTrack2); //Start the 1st race on the chosen Sewer Track (no special items handled yet).
        //firstCheeseRace returns the total time that the rat pilot took to complete the entire race. This value is later passed as a parameter to timeCompare().
        newPilot.timeCompare(totalTime, chosenTrack, tracks); //Check if total time is bellow the value of chosen track's current record. Then prints a message of either success or failure.
        //timeCompare() send as a parameters 1) the total time to complete first track 2) the track that was chosen by the player and 3) the ArrayList containing all the tracks and their respective moments.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        UserInteraction.goToMechanicShop(newPilot); //Ask the user if he wants to visit the mechanic shop or move on to the next race. If so, calls the method mechanicShopMenu();
        //Rat.useItem(); //Ask the user if he wants to use an item before the next race.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();


        // ---------------- 3rd race ----------------
        Design.Bar();
        System.out.println();
        Text.Dialogue11(); // "Ready for your 3rd race?".
        Design.Racers();
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        SewerTrack chosenTrack3 = UserInteraction.chooseTrack(newPilot, tracks); //User choose a Sewer Track.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        Design.Bar();
        System.out.println();
        double totalTime3 = newPilot.firstCheeseRace(chosenTrack3); //Start the 1st race on the chosen Sewer Track (no special items handled yet).
        //firstCheeseRace returns the total time that the rat pilot took to complete the entire race. This value is later passed as a parameter to timeCompare().
        newPilot.timeCompare(totalTime, chosenTrack, tracks); //Check if total time is bellow the value of chosen track's current record. Then prints a message of either success or failure.
        //timeCompare() send as a parameters 1) the total time to complete first track 2) the track that was chosen by the player and 3) the ArrayList containing all the tracks and their respective moments.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        UserInteraction.goToMechanicShop(newPilot); //Ask the user if he wants to visit the mechanic shop or move on to the next race. If so, calls the method mechanicShopMenu();
        //Rat.useItem(); //Ask the user if he wants to use an item before the next race.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();


        // ---------------- 4th race ----------------
        Design.Bar();
        System.out.println();
        Text.Dialogue11(); // "Ready for your 4th race?".
        Design.Racers();
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        SewerTrack chosenTrack4 = UserInteraction.chooseTrack(newPilot, tracks); //User choose a Sewer Track.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();
        Design.Bar();
        System.out.println();
        double totalTime4 = newPilot.firstCheeseRace(chosenTrack4); //Start the 1st race on the chosen Sewer Track (no special items handled yet).
        //firstCheeseRace returns the total time that the rat pilot took to complete the entire race. This value is later passed as a parameter to timeCompare().
        newPilot.timeCompare(totalTime, chosenTrack, tracks); //Check if total time is bellow the value of chosen track's current record. Then prints a message of either success or failure.
        //timeCompare() send as a parameters 1) the total time to complete first track 2) the track that was chosen by the player and 3) the ArrayList containing all the tracks and their respective moments.
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();



        // ---------------- END ----------------
        Design.Bar();
        System.out.println();
        System.out.println("\nCONGRATULATIONS, you have passed the last race!\n");
        Design.imageFinal();
        System.out.println();
        UserInteraction.Confirm();
        System.out.println();



        //___________________________________________________________________



    }
}




