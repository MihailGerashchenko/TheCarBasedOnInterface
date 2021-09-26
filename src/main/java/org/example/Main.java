package org.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Human Petr = new Human("Petr", Human.Gender.MALE,
                Human.BloodGroup.SECOND, Human.RightsForCar.NORIGHTS);
        CategoriesForDriver fordriverPetr = new CategoriesForDriver(5,
                LocalDate.of(2019, 5, 26),
                LocalDate.of(2024, 9, 22),
                CategoriesForDriver.TypesOfCategories.B,
                CategoriesForDriver.TypesOfTransmission.MECHANIC);
        CreateDriver createDriver = Driver::new;
        Driver driverPetr = createDriver.create(Petr, fordriverPetr);
        System.out.println(driverPetr);
        System.out.println("---------------------------------------------------");
        MechanicRequirements requirements = new MechanicRequirements("Sasha", 5, MechanicRequirements.VehicleCategoriesToRestore.SUPERCAR);
        CreateMechanic createMechanic = AutoMechanic::new;
        AutoMechanic mechanicSasha = createMechanic.create(requirements);
        System.out.println(mechanicSasha);
        System.out.println("---------------------------------------------------");
        Battery batteryForMercedes = new Battery(Battery.KindOfBettery.ELECTRONIC, 5, 24, Battery.KindOfCars.MERCEDES);
        CreateBattery createBattery = BatteryForMyCar::new;
        BatteryForMyCar forMercedes = createBattery.create(batteryForMercedes, mechanicSasha);
        System.out.println(forMercedes);
        System.out.println("----------------------------------------------------");
        CreateCar car = Car::new;
        Car myCar = car.create(forMercedes, driverPetr, mechanicSasha);
        System.out.println(myCar);
    }
}
