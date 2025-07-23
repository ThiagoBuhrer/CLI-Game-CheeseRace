package CheeseRace.Vehicles;

import CheeseRace.Items.Skill;

import java.util.ArrayList;

//Motorcycle subclass
public class Motorcycle extends Vehicle {
    protected ArrayList<Skill> skill;

    /**
     * constructor method
     * @param brand
     * @param model
     * @param horsepower
     * @param weightKG
     * @param wear
     * @param price
     */
    public Motorcycle(String brand, String model, int horsepower, int weightKG, int wear, int price) {
        super(brand, model, horsepower, weightKG, wear, price);
        this.skill = new ArrayList<>();  //initialize an empty list
    }

    /**
     * add more details to the superclass Vehicle's method "showDetails()"
     */
    @Override
    public void showDetails() {
        super.showDetails();

        //check if the skill list is empty before displaying it
        if (skill.isEmpty()) {
            System.out.println("No skills available.");
        } else {
            System.out.println("\n<> List of skills:");
            for (Skill skill : skill) {
                System.out.println(" - " + skill);
            }
        }
        System.out.println("\uD83C\uDFCD\uFE0F (Motorcycle)");
        System.out.println("\n");
    }

    /**
     * getter
     * @return
     */
    public ArrayList<Skill> getSkills() {

        return skill;
    }

    /**
     * setter
     * @param skills
     */
    public void setSkills(ArrayList<Skill> skills) {

        this.skill = skills;
    }
}
