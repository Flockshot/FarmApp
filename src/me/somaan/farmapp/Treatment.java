package me.somaan.farmapp;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

public class Treatment {

    private Veterinary givenBy;
    private LocalDate dateOfTreatment;
    private String details;
    private Collection<Medication> medications;


    public Treatment(Veterinary givenBy, LocalDate dateOfTreatment, String details, Medication medication) {
        //ArrayList<Medication> medicationList = new ArrayList<Medication>();

        //medicationList.add(medication);

        this(givenBy, dateOfTreatment, details, Collections.singleton(medication));
    }

    public Treatment(Veterinary givenBy, LocalDate dateOfTreatment, String details, Collection<Medication> medicationList) {
        setGivenBy(givenBy);
        setDateOfTreatment(dateOfTreatment);
        setDetails(details);
        setMedications(medicationList);
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

    public Collection<Medication> getMedications() {
        return medications;
    }

    public void setMedications(Collection<Medication> medications) {
        this.medications = medications;
    }


}
