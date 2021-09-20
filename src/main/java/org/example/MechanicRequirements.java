package org.example;

import java.time.LocalDate;

public class MechanicRequirements implements MechanicLicence {
    private String name;
    private int workingExperience;
    private MechanicRequirements.VehicleCategoriesToRestore category;

    public enum VehicleCategoriesToRestore {
        TRUCK, SPORTCAR, SUPERCAR;
    }

    public MechanicRequirements(String name, int workingExperience, VehicleCategoriesToRestore category) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "MechanicRequirements{" +
                "name='" + name + '\'' +
                ", workingExperience=" + workingExperience +
                ", category=" + category +
                '}';
    }
}
