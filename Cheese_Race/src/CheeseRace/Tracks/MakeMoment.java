package CheeseRace.Tracks;

public class MakeMoment {

    /**
     * Factory of moments
     */
    public static void Make() {


        //instantiate 08 different Moments to be assigned to the Sewer Tracks:

        Moment uTurn = new Moment("U-turn", 0.2, 0); //U-turn increases weight delay (difficulty with turning).

        Moment sCurve = new Moment("S-curve", 0.15, 0.05); //S-curve affects both weight and horsepower.

        Moment gravel = new Moment("Gravel", 0.25, 0.1); //Gravel affects weight (slows down heavier cars) and horsepower.

        Moment rubber = new Moment("Rubber", -0.1, -0.05); //Rubber helps with speed, reduces weight delay.

        Moment slippery = new Moment("Slippery Track", 0.4, 0); //Slippery conditions add weight delay but not horsepower.

        Moment oilPuddles = new Moment("Oil Puddles", 0.3, 0); //Oil puddles add weight delay but no horsepower loss.

        Moment bumpy = new Moment("Bumpy Track", 0.1, 0.05); //Bumpy track increases weight delay and minor horsepower loss.

        Moment mud = new Moment("Mud Track", 0.35, 0); //Mud causes heavyweight delay but no horsepower loss.


    }
}
