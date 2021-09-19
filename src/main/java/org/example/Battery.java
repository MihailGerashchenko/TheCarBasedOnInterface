package org.example;

public class Battery implements BatterySuplement {
    private Battery.KindOfBettery kindOfBettery;
    private int WarrantyYears;
    private int HoursToRecharge;
    private Battery.KindOfCars kindOfCars;

    @Override
    public KindOfBettery kindOfBettery() {
        return kindOfBettery;
    }

    @Override
    public int WarrantyYears() {
        return WarrantyYears;
    }

    @Override
    public int HoursToRecharge() {
        return HoursToRecharge;
    }

    @Override
    public KindOfCars kindOfCars() {
        return kindOfCars;
    }

    public enum KindOfBettery {
        SUNLIGHT, ELECTRONIC,
    }

    public enum KindOfCars {
        FERRARI, MERCEDES, BMW, TESLA
    }

    public Battery(KindOfBettery kindOfBettery,
                   int warrantyYears, int hoursToRecharge, KindOfCars kindOfCars) {
        this.kindOfBettery = kindOfBettery;
        WarrantyYears = warrantyYears;
        HoursToRecharge = hoursToRecharge;
        this.kindOfCars = kindOfCars;
    }

    public KindOfBettery getKindOfBettery() {
        return kindOfBettery;
    }

    public void setKindOfBettery(KindOfBettery kindOfBettery) {
        this.kindOfBettery = kindOfBettery;
    }

    public int getWarrantyYears() {
        return WarrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        WarrantyYears = warrantyYears;
    }

    public int getHoursToRecharge() {
        return HoursToRecharge;
    }

    public void setHoursToRecharge(int hoursToRecharge) {
        HoursToRecharge = hoursToRecharge;
    }

    public KindOfCars getKindOfCars() {
        return kindOfCars;
    }

    public void setKindOfCars(KindOfCars kindOfCars) {
        this.kindOfCars = kindOfCars;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "kindOfBettery=" + kindOfBettery +
                ", WarrantyYears=" + WarrantyYears +
                ", HoursToRecharge=" + HoursToRecharge +
                ", kindOfCars=" + kindOfCars +
                '}';
    }
}
