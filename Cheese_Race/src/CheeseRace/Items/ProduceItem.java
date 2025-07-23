package CheeseRace.Items;

import CheeseRace.Vehicles.CarType;
import java.util.ArrayList;
import java.util.List;

public class ProduceItem {

    /**
     * Factory of Race Items
     * @param mechanicShop
     */
    public static void Produce(MechanicShop mechanicShop) {



        //instantiate 06 new car Modifications:
        //5% to 15% in weight reduction using a weightDecrease buff is reasonable for a balanced game.
        //wear reduction ranging between 0-4.
        Modification turboBoost = new Modification("Turbo Boost", 50, 3, 120, new ArrayList<>(
                List.of(CarType.F1, CarType.RALLY)));

        Modification aerodynamicKit = new Modification("Aerodynamic Kit", 40, 2, 70, new ArrayList<>(
                List.of(CarType.GT, CarType.F1)));

        Modification lightweightWheels = new Modification("Lightweight Wheels", 30, 1, 40, new ArrayList<>(
                List.of(CarType.RALLY, CarType.GT)));

        Modification reinforcedBrakes = new Modification("Reinforced Brakes", 45, 0, 90, new ArrayList<>(
                List.of(CarType.F1, CarType.GT)));

        Modification highPerformanceExhaust = new Modification("High Performance Exhaust", 35, 1, 50, new ArrayList<>(
                List.of(CarType.RALLY, CarType.GT)));

        Modification carbonFiberBody = new Modification("Carbon Fiber Body", 60, 4, 250, new ArrayList<>(
                List.of(CarType.F1, CarType.RALLY, CarType.GT)));




        //instantiate 06 new motorcycle Skills:
        //for the horsePowerBuff, a 5% to 20% increase is a boost that can be noticeable but not game-breaking.
        Skill nitroInjection = new Skill("Nitro Injection", 50, 25);
        Skill supercharger = new Skill("Supercharger", 40, 15);
        Skill improvedHandling = new Skill("Improved Handling", 30, 10);
        Skill raceTires = new Skill("Race Tires", 35, 15);
        Skill weightReduction = new Skill("Weight Reduction", 45, 20);
        Skill performanceChip = new Skill("Performance Chip", 55, 35);



        //add all instantiated items to the mechanic shop's stock arraylist
        mechanicShop.getStock().add(turboBoost);
        mechanicShop.getStock().add(aerodynamicKit);
        mechanicShop.getStock().add(lightweightWheels);
        mechanicShop.getStock().add(reinforcedBrakes);
        mechanicShop.getStock().add(highPerformanceExhaust);
        mechanicShop.getStock().add(carbonFiberBody);
        mechanicShop.getStock().add(nitroInjection);
        mechanicShop.getStock().add(supercharger);
        mechanicShop.getStock().add(improvedHandling);
        mechanicShop.getStock().add(raceTires);
        mechanicShop.getStock().add(weightReduction);
        mechanicShop.getStock().add(performanceChip);

    }
}
