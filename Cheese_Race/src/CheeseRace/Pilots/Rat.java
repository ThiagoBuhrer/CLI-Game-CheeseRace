package CheeseRace.Pilots;

import CheeseRace.Tracks.Moment;
import CheeseRace.Tracks.SewerTrack;
import CheeseRace.Vehicles.Vehicle;
import CheeseRace.GameDesign.Design;

import java.util.ArrayList;

public class Rat {
    protected String name;
    protected int cheesePieces;
    protected Vehicle currentVehicle;
    protected int victories;


    /**
     * constructor
     * @param name
     * @param cheesePieces
     * @param currentVehicle
     * @param victories
     */
    public Rat(String name, int cheesePieces, Vehicle currentVehicle, int victories) {
        this.name = name;
        this.cheesePieces = cheesePieces;
        this.currentVehicle = currentVehicle;
        this.victories = victories;
    }


    /**
     * increments the amount of cheese pieces everytime the player earn some more (taking in consideration the pre-existing amount).
     * @param addedCheese
     */
    public void addCheese(int addedCheese) {
        this.cheesePieces += addedCheese;
    }


    /**
     * display the current stats of the rat
     */
    public void ratStats() {
        System.out.println("\n***********  Current Stats and Details:  ***********\n");
        System.out.println("\uD83D\uDC00 Name: " + name);
        System.out.println("\uD83E\uDDC0 Cheese Pieces: " + cheesePieces);
        if (currentVehicle == null) {
            System.out.println("\uD83D\uDE97 Current Vehicle: none");
        } else {
            System.out.println("\uD83D\uDE97 Current Vehicle: " + currentVehicle.getBrand());
        }
        System.out.println("\uD83C\uDFC6 Victories: " + victories + "\n");
    }


    /**
     * calculate the amount of time that player took to finish the race based on vehicle and moments in the track.
     * does not consider Items yet.
     * @param sewerTrack
     * @return
     */
    public double firstCheeseRace(SewerTrack sewerTrack) {

        //access the rat's current vehicle for the race
        Vehicle vehicleLapCalculations = getCurrentVehicle();
        System.out.println();
        System.out.println("|  RESULTS:  |");
        System.out.println();


        //access values from the track that we need for the record calculation
        int laps = sewerTrack.getLapNumber(); //number of laps on the track
        double singleLapDistance = sewerTrack.getSingleLapDistanceM(); //distance of a single lap
        double trackRecord = sewerTrack.getTrackRecord(); //current track record

        double totalTime = 0;
        double currentWear = vehicleLapCalculations.getWear(); //initialize the wear of the vehicle

        //get moments from the track
        ArrayList<Moment> trackMoments = sewerTrack.getMoment();  //returns the two moments on the track
        Moment moment1 = trackMoments.get(0);
        Moment moment2 = trackMoments.get(1);


        //loop through each lap
        for (int lap = 1; lap <= laps; lap++) {

            //calculate lap time
            //formula: singleLapDistanceM / ((1.6 * horsepower) - (0.2 * weightKG) - (0.5 * wear)
            double lapTime = singleLapDistance / ((1.6 * vehicleLapCalculations.getHorsepower()) - (0.2 * vehicleLapCalculations.getWeightKG()) - (0.5 * currentWear));

            //apply the delays from the Moments (weightDelay + horsepowerDelay for both moments) !!
            //formula: ( (weightKG * weightDelay) + (horsepower * horsepowerDelay) ) / 100
            double momentDelay1 = ((vehicleLapCalculations.getWeightKG() * moment1.getWeightDelay()) + (vehicleLapCalculations.getHorsepower() * moment1.getHorsepowerDelay())) / 100;
            double momentDelay2 = ((vehicleLapCalculations.getWeightKG() * moment2.getWeightDelay()) + (vehicleLapCalculations.getHorsepower() * moment2.getHorsepowerDelay())) / 100;

            //add the 02 Moment's delays to the lap time
            lapTime += momentDelay1 + momentDelay2;

            //add lap time to total amount of time
            totalTime += lapTime;

            //print the lap time
            System.out.println("Lap " + lap + ": " + lapTime + " seconds");

            //increment the vehicle's wear (20 values per lap)
            currentWear += 20;
        }

        //return total time to another method for comparison
        return totalTime;

    }


    /**
     * updates the rat' stats every time the player beats the track record and wins!
     */
    public void updatePilotStats() {
        // Increment victories and cheese pieces if the record is beaten
        this.victories += 1;
        this.cheesePieces += 80;  // Grant 80 cheese pieces for beating the track record
        System.out.println("You beat the record and earned 80 \u001B[33mcheese pieces\u001B[0m! \uD83E\uDDC0\n\n");
    }


    /**
     * check if total time is bellow the value of the chosen track's current record.
     * prints a message of success or failure.
     * @param totalTime
     * @param sewerTrack
     * @param tracks
     */
    public void timeCompare(double totalTime, SewerTrack sewerTrack, ArrayList<SewerTrack> tracks){

        //winning case:
        if (totalTime < sewerTrack.getTrackRecord()) {
            System.out.println("\n\u001B[33mThat's a new record!\u001B[0m \nPrevious record: " + sewerTrack.getTrackRecord() + "s  | Your new record: " + totalTime + "s");
            System.out.println("CONGRATULATIONS 🏆");
            tracks.remove(sewerTrack);
            System.out.println();
            Design.Earn();
            System.out.println();
            updatePilotStats(); //update pilot stats for breaking the record
            ratStats();

            //obs: the track's track record attribute is not updated with .setTrackRecord(totalTime); in case of a win.
            //instead, we eliminate the current track from the list of available tracks, so that the rat can never replay a track whose record he has already beaten.

        //losing case:
        } else {
            System.out.println("\nTotal time: " + totalTime + "s (Current record: " + sewerTrack.getTrackRecord() + "s)");
            System.out.println("FAIL. Better luck next time! \uD83D\uDC4E \n\n");
            ratStats();
        }

    }


    /**
     * 1) prints the current Vehicle's item inventory
     * 2) asks which one to use
     * 3) applies the effects to the Driver's Vehicle before race
     *  --------- not implemented just yet ----------
     */
    public static void useItem() {

        System.out.println("Not implemented yet... :(");

    }


    /**
     * method used for all races as from the 2nd race, now including the handling of special items.
     * --------- not implemented just yet ----------
     * @param sewerTrack
     */
    public void CheeseRace(SewerTrack sewerTrack) {


    }

    /**
     * getters
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * getters
     * @return
     */
    public int getCheesePieces() {
        return cheesePieces;
    }

    /**
     * getters
     * @return
     */
    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }

    /**
     * getters
     * @return
     */
    public int getVictories() {
        return victories;
    }


    /**
     * setters
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setters
     * @param cheesePieces
     */
    public void setCheesePieces(int cheesePieces) {
        this.cheesePieces = cheesePieces;
    }

    /**
     * setters
     * @param currentVehicle
     */
    public void setCurrentVehicle(Vehicle currentVehicle) {
        this.currentVehicle = currentVehicle;
    }

    /**
     * setters
     * @param victories
     */
    public void setVictories(int victories) {
        this.victories = victories;
    }

}
