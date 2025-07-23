package CheeseRace.Vehicles;

import CheeseRace.Items.MechanicShop;
import CheeseRace.Items.RaceItem;

import java.util.ArrayList;

public class CreateVehicle {


    /**
     * Vehicle factory
     * @param mechanicShop
     */
    public static void Create(MechanicShop mechanicShop) {


        //create and add 08 car for the mechanic shop (adds them to the garage ArrayList)
        Car c1 = new Car("Cheese-rrari", "F1-2025", 1000, 800, 5, 150, CarType.F1); // Ferrari
        Car c2 = new Car("Lamb-or-gouda", "Rally-X", 850, 750, 3, 140, CarType.RALLY); // Lamborghini
        Car c3 = new Car("Paw-sche", "GT-2025", 900, 700, 4, 130, CarType.GT); // Porsche
        Car c4 = new Car("Brie-MW", "M-2025", 950, 710, 2, 160, CarType.F1); // BMW
        Car c5 = new Car("Squeakudi", "RS7", 875, 740, 3, 120, CarType.RALLY); // Audi
        Car c6 = new Car("McCheddar", "720S", 850, 780, 4, 170, CarType.GT); // McLaren
        Car c7 = new Car("Cheddar-lac", "Escalade-V", 650, 1100, 4, 180, CarType.RALLY); // Cadillac
        Car c8 = new Car("Gouda-Ti", "Aventador", 950, 750, 3, 190, CarType.F1); // Lamborghini Aventador


        //add the cars to the mechanic shop's garage
        mechanicShop.getGarage().add(c1);
        mechanicShop.getGarage().add(c2);
        mechanicShop.getGarage().add(c3);
        mechanicShop.getGarage().add(c4);
        mechanicShop.getGarage().add(c5);
        mechanicShop.getGarage().add(c6);
        mechanicShop.getGarage().add(c7);
        mechanicShop.getGarage().add(c8);


        //create and add 08 motorcycles for the mechanic shop (adds them to the garage ArrayList)
        Motorcycle m1 = new Motorcycle("Yamouseha", "YZF-R1", 200, 190, 2, 110); // Yamaha
        Motorcycle m2 = new Motorcycle("Honda-Mice", "CBR1000RR", 210, 185, 3, 120); // Honda
        Motorcycle m3 = new Motorcycle("Kaw-Mouser", "Ninja H2", 230, 200, 1, 130); // Kawasaki
        Motorcycle m4 = new Motorcycle("Ducat-cheese", "Panigale V4", 250, 195, 4, 140); // Ducati
        Motorcycle m5 = new Motorcycle("Squeekzuki", "GSX-R1000", 220, 210, 2, 150); // Suzuki
        Motorcycle m6 = new Motorcycle("BMW-Mouse", "S1000RR", 240, 220, 3, 160); // BMW
        Motorcycle m7 = new Motorcycle("Ratsuki", "Hayabusa", 280, 230, 1, 170); // Suzuki Hayabusa
        Motorcycle m8 = new Motorcycle("Mice-Ti", "Ducati Monster", 240, 215, 2, 180); // Ducati Monster


        //add the motorcycles to the mechanic shop's garage
        mechanicShop.getGarage().add(m1);
        mechanicShop.getGarage().add(m2);
        mechanicShop.getGarage().add(m3);
        mechanicShop.getGarage().add(m4);
        mechanicShop.getGarage().add(m5);
        mechanicShop.getGarage().add(m6);
        mechanicShop.getGarage().add(m7);
        mechanicShop.getGarage().add(m8);

    }
}
