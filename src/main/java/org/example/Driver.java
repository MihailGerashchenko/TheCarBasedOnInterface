package org.example;

public class Driver {
    private MedicalIssues medicalIssues;
    private DrivingLicence drivingLicence;

    public MedicalIssues getMedicalIssues() {
        return medicalIssues;
    }

    public void setMedicalIssues(MedicalIssues medicalIssues) {
        this.medicalIssues = medicalIssues;
    }

    public DrivingLicence getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(DrivingLicence drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public Driver(MedicalIssues medicalIssues, DrivingLicence drivingLicence) {
        this.medicalIssues = medicalIssues;
        this.drivingLicence = drivingLicence;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "medicalIssues=" + medicalIssues +
                ", drivingLicence=" + drivingLicence +
                '}';
    }
}
