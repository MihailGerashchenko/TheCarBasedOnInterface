package org.example;

import java.time.LocalDate;

public class Car {
    private BatteryForMyCar batteryForMyCar;
    private Driver driver;
    private AutoMechanic autoMechanic;

    public Car(BatteryForMyCar batteryForMyCar, Driver driver, AutoMechanic autoMechanic) {
        this.batteryForMyCar = batteryForMyCar;
        this.driver = driver;
        this.autoMechanic = autoMechanic;
    }

    public BatteryForMyCar getBatteryForMyCar() {
        return batteryForMyCar;
    }

    public void setBatteryForMyCar(BatteryForMyCar batteryForMyCar) {
        this.batteryForMyCar = batteryForMyCar;
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

    @Override
    public String toString() {
        return "Car{" +
                "batteryForMyCar=" + batteryForMyCar +
                ", driver=" + driver +
                ", autoMechanic=" + autoMechanic +
                '}';
    }
}
