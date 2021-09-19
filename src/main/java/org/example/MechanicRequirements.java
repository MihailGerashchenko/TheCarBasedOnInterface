package org.example;

import java.time.LocalDate;

public class MechanicRequirements implements MechanicLicence {
    private int workingExperience;
    private MechanicRequirements.VehicleCategoriesToRestore category;


    public enum VehicleCategoriesToRestore {
        TRUCK, SPORTCAR, SUPERCAR;
    }

    public MechanicRequirements(int workingExperience, VehicleCategoriesToRestore category) {
        this.workingExperience = workingExperience;
        this.category = category;
    }

    public int getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(int workingExperience) {
        this.workingExperience = workingExperience;
    }

    public VehicleCategoriesToRestore getCategory() {
        return category;
    }

    public void setCategory(VehicleCategoriesToRestore category) {
        this.category = category;
    }

    @Override
    public int WorkingExperience() {
        return workingExperience;
    }

    @Override
    public VehicleCategoriesToRestore category() {
        return category;
    }

    @Override
    public String toString() {
        return "MechanicRequirements{" +
                "workingExperience=" + workingExperience +
                ", category=" + category +
                '}';
    }
}
