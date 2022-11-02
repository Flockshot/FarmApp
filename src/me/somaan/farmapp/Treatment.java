package me.somaan.farmapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Treatment {

    private Veterinary givenBy;
    private LocalDate dateOfTreatment;
    private String details;
    private ArrayList<Medication> medications;


    public Treatment(Veterinary givenBy, LocalDate dateOfTreatment, String details, Medication medication) {
        this(givenBy, dateOfTreatment, details);

        ArrayList<Medication> medicationList = new ArrayList<Medication>();
        medicationList.add(medication);
        setMedications(medicationList);
    }

    public Treatment(Veterinary givenBy, LocalDate dateOfTreatment, String details, ArrayList<Medication> medicationList) {
        this(givenBy, dateOfTreatment, details);
        setMedications(medicationList);
    }

    //Only exists to avoid repetition of code.
    private Treatment(Veterinary givenBy, LocalDate dateOfTreatment, String details) {
        setGivenBy(givenBy);
        setDateOfTreatment(dateOfTreatment);
        setDetails(details);
    }


    public Veterinary getGivenBy() {
        return givenBy;
    }

    public void setGivenBy(Veterinary givenBy) {
        this.givenBy = givenBy;
    }

    public LocalDate getDateOfTreatment() {
        return dateOfTreatment;
    }
    public void setDateOfTreatment(LocalDate dateOfTreatment) {
        this.dateOfTreatment = dateOfTreatment;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public ArrayList<Medication> getMedications() {
        return medications;
    }

    public void setMedications(ArrayList<Medication> medications) {
        this.medications = medications;
    }


    public void printDetails() {
        System.out.println("Treatment given by vet: ");
        getGivenBy().printDetails();
        System.out.println("Treatment's date: " + getDateOfTreatment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Treatment's details: " + getDetails());
        System.out.println("Treatment's medications: ");
        for (Medication medication : getMedications())
            medication.printDetails();

        System.out.println("");

    }
}
