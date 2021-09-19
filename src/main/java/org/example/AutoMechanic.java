package org.example;

public class AutoMechanic {
    private MedicalIssues medicalIssues;
    private MechanicLicence mechanicLicence;

    public AutoMechanic(MedicalIssues medicalIssues, MechanicLicence mechanicLicence) {
        this.medicalIssues = medicalIssues;
        this.mechanicLicence = mechanicLicence;
    }

    public MedicalIssues getMedicalIssues() {
        return medicalIssues;
    }

    public void setMedicalIssues(MedicalIssues medicalIssues) {
        this.medicalIssues = medicalIssues;
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
                "medicalIssues=" + medicalIssues +
                ", mechanicLicence=" + mechanicLicence +
                '}';
    }
}
