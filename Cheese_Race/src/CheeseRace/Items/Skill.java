package CheeseRace.Items;

public class Skill extends RaceItem {
    protected int horsePowerBuff;

    /**
     * constructor method
     * @param name
     * @param cheesePrice
     * @param horsePowerBuff
     */
    public Skill(String name, int cheesePrice, int horsePowerBuff) {
        super(name, cheesePrice);
        this.horsePowerBuff = horsePowerBuff;
    }


    /**
     * shows skill's details
     */
    @Override
    public void raceItemDetails() {
        super.raceItemDetails();

        System.out.println("Horsepower buff ammount: \u001B[33m" + this.horsePowerBuff + " \u001B[0m");
        System.out.println("\n✧･ﾟ: *✧･ﾟ:*  *:･ﾟ✧*:･ﾟ✧\n");
    }


    /**
     * getter
     * @return
     */
    public int getHorsePowerBuff() {
        return horsePowerBuff;
    }


    /**
     * setter
     * @param horsePowerBuff
     */
    public void setHorsePowerBuff(int horsePowerBuff) {
        this.horsePowerBuff = horsePowerBuff;
    }

}
