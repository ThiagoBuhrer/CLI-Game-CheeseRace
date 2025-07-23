package CheeseRace.Items;

public abstract class RaceItem {
    protected String name;
    protected int cheesePrice;

    //constructor method
    public RaceItem(String name, int cheesePrice) {
        this.name = name;
        this.cheesePrice = cheesePrice;
    }


    /**
     * abstract method to display item's details
     * still empty, but filled later on in the "Modification" and "Skill" subclasses
     */
    public void raceItemDetails() {
        System.out.println("\n\u001B[33m" + this.name + "\u001B[0m");
        System.out.println("Price in cheese pieces: \u001B[33m" + this.cheesePrice + "\u001B[0m");
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
    public int getCheesePrice() {
        return cheesePrice;
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
     * @param cheesePrice
     */
    public void setCheesePrice(int cheesePrice) {
        this.cheesePrice = cheesePrice;
    }
}
