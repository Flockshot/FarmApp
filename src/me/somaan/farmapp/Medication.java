package me.somaan.farmapp;

import java.time.LocalDate;

public class Medication {

    private String details;
    private int duration;
    private LocalDate startDate;
    private double dosage;
    private String notes;


    public Medication(String details, int duration, LocalDate startDate, double dosage) {
        this(details, duration, startDate, dosage, "");
    }

    public Medication(String details, int duration, LocalDate startDate, double dosage, String notes) {
        setDetails(details);
        setDuration(duration);
        setStartDate(startDate);
        setDosage(dosage);
        setNotes(notes);
    }


    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public int getDuration() {
        return duration;
    }
    private void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
    private void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public double getDosage() {
        return dosage;
    }

    private void setDosage(double dosage) {
        this.dosage = dosage;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void printDetails() {
        System.out.println("Medication details: " + getDetails());
        System.out.println("Medication duration: " + getDuration());
        System.out.println("Medication start date: " + getStartDate());
        System.out.println("Medication dosage: " + getDosage());
        System.out.println("Medication notes: " + getNotes());
        System.out.println("");
    }
}
