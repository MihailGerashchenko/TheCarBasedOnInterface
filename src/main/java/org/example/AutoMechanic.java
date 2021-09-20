package org.example;

public class AutoMechanic {
    private MechanicLicence mechanicLicence;

    public AutoMechanic(MechanicLicence mechanicLicence) {
        this.mechanicLicence = mechanicLicence;
    }

    public MechanicLicence getMechanicLicence() {
        return mechanicLicence;
    }

    public void setMechanicLicence(MechanicLicence mechanicLicence) {
        this.mechanicLicence = mechanicLicence;
    }

    @Override
    public String toString() {
        return "AutoMechanic{" +
                "mechanicLicence=" + mechanicLicence +
                '}';
    }
}
