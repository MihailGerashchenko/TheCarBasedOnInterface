package org.example;

public interface CreateCar {
    Car create(BatteryForMyCar batteryForMyCar,
               Driver driver,
               AutoMechanic autoMechanic);
}
