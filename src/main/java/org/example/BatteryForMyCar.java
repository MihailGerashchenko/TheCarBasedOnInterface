package org.example;

public class BatteryForMyCar {
    private BatterySuplement butterySuplement;
    private AutoMechanic autoMechanic;

    public BatteryForMyCar(BatterySuplement butterySuplement, AutoMechanic autoMechanic) {
        this.butterySuplement = butterySuplement;
        this.autoMechanic = autoMechanic;
    }

    public BatteryForMyCar(Battery.KindOfBettery kindOfBettery, int i, int i1, Battery.KindOfCars kindOfCars, AutoMechanic autoMechanic) {
    }

    public BatterySuplement getButterySuplement() {
        return butterySuplement;
    }

    public void setButterySuplement(BatterySuplement butterySuplement) {
        this.butterySuplement = butterySuplement;
    }

    public AutoMechanic getAutoMechanic() {
        return autoMechanic;
    }

    public void setAutoMechanic(AutoMechanic autoMechanic) {
        this.autoMechanic = autoMechanic;
    }

    @Override
    public String toString() {
        return "BatteryForMyCar{" +
                "butterySuplement=" + butterySuplement +
                ", autoMechanic=" + autoMechanic +
                '}';
    }
}
