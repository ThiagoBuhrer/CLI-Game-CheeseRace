package CheeseRace.Tracks;

import CheeseRace.Tracks.MakeMoment;
import java.util.ArrayList;

public class BuildTrack {

    /**
     * Factory of tracks
     * @return
     */
    public static ArrayList<SewerTrack> Build() {

        //call MakeMoment.Make() to instantiate the moments before using them
        MakeMoment.Make(); //instantiate moments


        //instantiate 10 Sewer Tracks + assign 02 Moments to each one of them

        //track 01
        SewerTrack track1 = new SewerTrack("The Rat Maze", 120, 25, 3, 1500);
        track1.moment = new ArrayList<>();
        track1.moment.add(new Moment("U-turn", 0.2, 0));  // Added U-turn moment
        track1.moment.add(new Moment("Gravel", 0.25, 0.1));  // Added Gravel moment

        //track 02
        SewerTrack track2 = new SewerTrack("Sewer Slalom", 130, 30, 4, 1600);
        track2.moment = new ArrayList<>();
        track2.moment.add(new Moment("S-curve", 0.15, 0.05));  // Added S-curve moment
        track2.moment.add(new Moment("Rubber", -0.1, -0.05));  // Added Rubber moment

        //track 03
        SewerTrack track3 = new SewerTrack("Mucky Mice Mile", 140, 35, 5, 1700);
        track3.moment = new ArrayList<>();
        track3.moment.add(new Moment("Slippery Track", 0.4, 0));  // Added Slippery Track moment
        track3.moment.add(new Moment("Oil Puddles", 0.3, 0));  // Added Oil Puddles moment

        //track 04
        SewerTrack track4 = new SewerTrack("The Bumpy Drain", 110, 25, 2, 1400);
        track4.moment = new ArrayList<>();
        track4.moment.add(new Moment("Bumpy Track", 0.1, 0.05));  // Added Bumpy Track moment
        track4.moment.add(new Moment("Mud Track", 0.35, 0));  // Added Mud Track moment

        //track 05
        SewerTrack track5 = new SewerTrack("The Rat Runoff", 125, 32, 3, 1550);
        track5.moment = new ArrayList<>();
        track5.moment.add(new Moment("Gravel", 0.25, 0.1));  // Added Gravel moment
        track5.moment.add(new Moment("Oil Puddles", 0.3, 0));  // Added Oil Puddles moment

        //track 06
        SewerTrack track6 = new SewerTrack("The Pipe Pit", 135, 30, 4, 1650);
        track6.moment = new ArrayList<>();
        track6.moment.add(new Moment("S-curve", 0.15, 0.05));  // Added S-curve moment
        track6.moment.add(new Moment("Slippery Track", 0.4, 0));  // Added Slippery Track moment

        //track 07
        SewerTrack track7 = new SewerTrack("Grimy Gouge", 145, 33, 5, 1750);
        track7.moment = new ArrayList<>();
        track7.moment.add(new Moment("Mud Track", 0.35, 0));  // Added Mud Track moment
        track7.moment.add(new Moment("Rubber", -0.1, -0.05));  // Added Rubber moment

        //track 08
        SewerTrack track8 = new SewerTrack("Underground Squeeze", 115, 23, 2, 1450);
        track8.moment = new ArrayList<>();
        track8.moment.add(new Moment("Bumpy Track", 0.1, 0.05));  // Added Bumpy Track moment
        track8.moment.add(new Moment("U-turn", 0.2, 0));  // Added U-turn moment

        //track 09
        SewerTrack track9 = new SewerTrack("Grand Chase", 150, 33, 6, 1800);
        track9.moment = new ArrayList<>();
        track9.moment.add(new Moment("Oil Puddles", 0.3, 0));  // Added Oil Puddles moment
        track9.moment.add(new Moment("Gravel", 0.25, 0.1));  // Added Gravel moment

        //track 10
        SewerTrack track10 = new SewerTrack("Rat Tunnel Twist", 160, 36, 7, 1900);
        track10.moment = new ArrayList<>();
        track10.moment.add(new Moment("Slippery Track", 0.4, 0));  // Added Slippery Track moment
        track10.moment.add(new Moment("Mud Track", 0.35, 0));  // Added Mud Track moment


        //create a list with all the available tracks instantiated
        ArrayList<SewerTrack> tracks = new ArrayList<>();


        //adds all tracks to the list
        tracks.add(track1);
        tracks.add(track2);
        tracks.add(track3);
        tracks.add(track4);
        tracks.add(track5);
        tracks.add(track6);
        tracks.add(track7);
        tracks.add(track8);
        tracks.add(track9);
        tracks.add(track10);

        return tracks;
    }
}
