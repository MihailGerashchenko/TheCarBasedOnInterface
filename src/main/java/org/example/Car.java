package org.example;

import java.time.LocalDate;

public class Car {
    private BatterySuplement batterySuplement;
    private Driver driver;
    private AutoMechanic autoMechanic;
    private CarsOwner owner;


    public Car(BatterySuplement batterySuplement, Driver driver, AutoMechanic autoMechanic, CarsOwner owner) {
        this.batterySuplement = batterySuplement;
        this.driver = driver;
        this.autoMechanic = autoMechanic;
        this.owner = owner;
    }

    public BatterySuplement getBatterySuplement() {
        return batterySuplement;
    }

    public void setBatterySuplement(BatterySuplement batterySuplement) {
        this.batterySuplement = batterySuplement;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public AutoMechanic getAutoMechanic() {
        return autoMechanic;
    }

    public void setAutoMechanic(AutoMechanic autoMechanic) {
        this.autoMechanic = autoMechanic;
    }

    public CarsOwner getOwner() {
        return owner;
    }

    public void setOwner(CarsOwner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "batterySuplement=" + batterySuplement +
                ", driver=" + driver +
                ", autoMechanic=" + autoMechanic +
                ", owner=" + owner +
                '}';
    }
}
