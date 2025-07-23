package CheeseRace.Vehicles;

//Vehicle superclass
public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int horsepower;
    protected double weightKG;
    protected int wear;
    protected int price;

    /**
     * constructor method
     * @param brand
     * @param model
     * @param horsepower
     * @param weightKG
     * @param wear
     * @param price
     */
    public Vehicle(String brand, String model, int horsepower, int weightKG, int wear, int price) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
        this.weightKG = weightKG;
        this.wear = wear;
        this.price = price;
    }


    /**
     * show details method
     */
    public void showDetails() {
        System.out.println("\n_*_*_*_*_*_*_*_*_*_*_*_ \u001B[33m" + this.model + "\u001B[0m _*_*_*_*_*_*_*_*_*_*_*_");
        System.out.println("Brand: \u001B[33m" + this.brand + "\u001B[0m | Horsepower: \u001B[33m" + this.horsepower + "\u001B[0m");
        System.out.println("Weight (in Kilograms): \u001B[33m" + this.weightKG + "\u001B[0m | Wear levels: \u001B[33m" + this.wear + "\u001B[0m");
        System.out.println("Price: \u001B[33m" + this.price + "\u001B[0m");
    }

    /**
     * getters
     * @return
     */
    public String getBrand() {

        return brand;
    }

    /**
     * getters
     * @return
     */
    public int getPrice() {

        return price;
    }

    /**
     * getters
     * @return
     */
    public int getWear() {

        return wear;
    }

    /**
     * getters
     * @return
     */
    public double getWeightKG() {

        return weightKG;
    }

    /**
     * getters
     * @return
     */
    public String getModel() {

        return model;
    }

    /**
     * getters
     * @return
     */
    public int getHorsepower() {

        return horsepower;
    }


    /**
     * setters
     * @param price
     */
    public void setPrice(int price) {

        this.price = price;
    }

    /**
     * setters
     * @param wear
     */
    public void setWear(int wear) {

        this.wear = wear;
    }

    /**
     * setters
     * @param model
     */
    public void setModel(String model) {

        this.model = model;
    }

    /**
     * setters
     * @param brand
     */
    public void setBrand(String brand) {

        this.brand = brand;
    }

    /**
     * setters
     * @param horsepower
     */
    public void setHorsepower(int horsepower) {

        this.horsepower = horsepower;
    }

    /**
     * setters
     * @param weightKG
     */
    public void setWeightKG(double weightKG) {

        this.weightKG = weightKG;
    }
}



