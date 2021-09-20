package org.example;

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
        MechanicRequirements requirements = new MechanicRequirements("Sasha", 5, MechanicRequirements.VehicleCategoriesToRestore.SUPERCAR);
        AutoMechanic mechanicSasha = new AutoMechanic(requirements);
        System.out.println(mechanicSasha);
        System.out.println("---------------------------------------------------");
        Battery batteryForMercedes = new Battery(Battery.KindOfBettery.ELECTRONIC, 5, 24, Battery.KindOfCars.MERCEDES);
        BatteryForMyCar forMercedes = new BatteryForMyCar(batteryForMercedes, mechanicSasha);
        System.out.println(forMercedes);
        System.out.println("----------------------------------------------------");
        Car myCar = new Car(forMercedes, driverPetr, mechanicSasha);
        System.out.println(myCar);
    }
}
