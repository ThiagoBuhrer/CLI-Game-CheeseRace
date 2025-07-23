package CheeseRace.Tracks;

import java.util.ArrayList;

public class SewerTrack {
    protected String name;
    protected double time;
    protected double trackRecord;
    protected int lapNumber;
    protected double singleLapDistanceM;
    public ArrayList<Moment> moment;


    /**
     * constructor
     * @param name
     * @param time
     * @param trackRecord
     * @param lapNumber
     * @param singleLapDistanceM
     */
    public SewerTrack(String name, double time, double trackRecord, int lapNumber, double singleLapDistanceM) {
        this.name = name;
        this.time = time;
        this.trackRecord = trackRecord;
        this.lapNumber = lapNumber;
        this.singleLapDistanceM = singleLapDistanceM; //in meters
    }


    /**
     * getter for moments
     * @return
     */
    public ArrayList<Moment> getMoment() {
        return moment;
    }

    /**
     * method to add moments to this track
     * @param moment
     */
    public void addMoment(Moment moment) {

        this.moment.add(moment);
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
    public double getTime() {
        return time;
    }

    /**
     * getters
     * @return
     */
    public double getTrackRecord() {

        return trackRecord;
    }

    /**
     * getters
     * @return
     */
    public int getLapNumber() {

        return lapNumber;
    }

    /**
     * getters
     * @return
     */
    public double getSingleLapDistanceM() {

        return singleLapDistanceM;
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
     * @param time
     */
    public void setTime(double time) {

        this.time = time;
    }

    /**
     * setters
     * @param trackRecord
     */
    public void setTrackRecord(double trackRecord) {

        this.trackRecord = trackRecord;
    }

    /**
     * setters
     * @param lapNumber
     */
    public void setLapNumber(int lapNumber) {

        this.lapNumber = lapNumber;
    }

    /**
     * setters
     * @param singleLapDistanceM
     */
    public void setSingleLapDistanceM(double singleLapDistanceM) {

        this.singleLapDistanceM = singleLapDistanceM;
    }

}
