package org.example;

public class Human implements MedicalIssues {
    private String name;
    private Gender gender;
    private BloodGroup bloodGroup;
    private RightsForCar rightsForCar;

    public Human() {
    }

    public Human(RightsForCar rightsForCar) {
    }

    public enum Gender {MALE, FEMALE}

    public enum RightsForCar {PROPERTY, NORIGHTS}

    public enum BloodGroup {FIRST, SECOND, THIRD, FOURTH}


    public Human(String name, Gender gender, BloodGroup bloodGroup, RightsForCar rightsForCar) {
        this.name = name;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.rightsForCar = rightsForCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public RightsForCar getRightsForCar() {
        return rightsForCar;
    }

    public void setRightsForCar(RightsForCar rightsForCar) {
        this.rightsForCar = rightsForCar;
    }

    @Override
    public String name() {
        return name;
    }


    @Override
    public BloodGroup bloodGroup() {
        return bloodGroup;
    }

    @Override
    public Gender gender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", bloodGroup=" + bloodGroup +
                ", rightsForCar=" + rightsForCar +
                '}';
    }
}
