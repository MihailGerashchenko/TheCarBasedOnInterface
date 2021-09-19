package org.example;

import org.example.example.Lamp;
import org.example.example.Radio;
import org.example.example.Switcher;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        MedicalIssues Petr = new Human("Petr", Human.Gender.MALE,
                Human.BloodGroup.SECOND, Human.RightsForCar.NORIGHTS);
        DrivingLicence fordriverPetr = new CategoriesForDriver(5,
                LocalDate.of(2019, 5, 26),
                LocalDate.of(2024, 9, 22),
                CategoriesForDriver.TypesOfCategories.B,
                CategoriesForDriver.TypesOfTransmission.MECHANIC);
        Driver driverPetr = new Driver(Petr, fordriverPetr);
        System.out.println(driverPetr);
        System.out.println("---------------------------------------------------");

        Human Denis = new Human("Denis", Human.Gender.MALE,
                Human.BloodGroup.FOURTH, Human.RightsForCar.NORIGHTS);
        MechanicRequirements DenisRequirements = new MechanicRequirements(12,
                MechanicRequirements.VehicleCategoriesToRestore.SUPERCAR);
        AutoMechanic DenisMechanic = new AutoMechanic(Denis, DenisRequirements);
        System.out.println(DenisMechanic);
        System.out.println("----------------------------------------------------");
        BatterySuplement batteryForMercedes = new Battery(Battery.KindOfBettery.ELECTRONIC, 5, 24, Battery.KindOfCars.MERCEDES);
        System.out.println(batteryForMercedes);
        System.out.println("----------------------------------------------------");
        Human human = new Human("Mihail", Human.Gender.MALE,
                Human.BloodGroup.THIRD, Human.RightsForCar.PROPERTY);
      //  CarsOwner Mihail = new CarsOwner();
    //    Car Mercedes = new Car(batteryForMercedes, driverPetr, DenisMechanic, Mihail);
    //    System.out.println(Mercedes);
    }
}
