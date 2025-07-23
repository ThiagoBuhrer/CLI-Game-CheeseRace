package CheeseRace.Tracks;

/*

Chosen Moments:
- U-turn
- S-curve
- gravel on the track
- rubber on the track
- slippery track
- track with oil puddles
- bumpy track
- track with mud.

OBS: some moments will favor lighter vehicles, while others will favor more powerful vehicles.

 */

public class Moment {
    protected String name;
    protected double weightDelay;
    protected double horsepowerDelay;


    /**
     * constructor
     * @param name
     * @param weightDelay
     * @param horsepowerDelay
     */
    public Moment(String name, double weightDelay, double horsepowerDelay) {
        this.name = name;
        this.weightDelay = weightDelay;
        this.horsepowerDelay = horsepowerDelay;
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
    public double getWeightDelay() {
        return weightDelay;
    }

    /**
     * getters
     * @return
     */
    public double getHorsepowerDelay() {
        return horsepowerDelay;
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
     * @param horsepowerDelay
     */
    public void setHorsepowerDelay(double horsepowerDelay) {
        this.horsepowerDelay = horsepowerDelay;
    }

    /**
     * setters
     * @param weightDelay
     */
    public void setWeightDelay(double weightDelay) {
        this.weightDelay = weightDelay;
    }
}
