package org.example;

import java.time.LocalDate;

public class CategoriesForDriver implements DrivingLicence {
    private int workingExperience;
    private LocalDate fromDate;
    private LocalDate expires;
    private TypesOfCategories category;
    private TypesOfTransmission transmission;


    public enum TypesOfTransmission{
        MECHANIC, AUTOMATIC
    }

    public enum TypesOfCategories {
        A, B, C, D;
    }

    public CategoriesForDriver(int workingExperience, LocalDate fromDate,
                               LocalDate expires, TypesOfCategories category, TypesOfTransmission transmission) {
        this.workingExperience = workingExperience;
        this.fromDate = fromDate;
        this.expires = expires;
        this.category = category;
        this.transmission = transmission;
    }

    public TypesOfTransmission getTransmission() {
        return transmission;
    }

    public void setTransmission(TypesOfTransmission transmission) {
        this.transmission = transmission;
    }

    public int getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(int workingExperience) {
        this.workingExperience = workingExperience;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getExpires() {
        return expires;
    }

    public void setExpires(LocalDate expires) {
        this.expires = expires;
    }

    public TypesOfCategories getCategory() {
        return category;
    }

    public void setCategory(TypesOfCategories category) {
        this.category = category;
    }

    @Override
    public int WorkingExperience() {
        return workingExperience;
    }

    @Override
    public TypesOfCategories category() {
        return category;
    }

    @Override
    public LocalDate fromDate() {
        return fromDate;
    }

    @Override
    public LocalDate expires() {
        return expires;
    }

    @Override
    public TypesOfTransmission transmission() {
        return transmission;
    }

    @Override
    public String toString() {
        return "CategoriesForDriver{" +
                "workingExperience=" + workingExperience +
                ", fromDate=" + fromDate +
                ", expires=" + expires +
                ", category=" + category +
                ", transmission=" + transmission +
                '}';
    }
}
