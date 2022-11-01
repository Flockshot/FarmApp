package me.somaan.farmapp;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;

public class Cow {
    private int tagNo;
    private String gender;
    private LocalDate dateOfBirth;
    private boolean isPurchased;
    private ArrayList<Treatment> treatmentsReceived;


    public Cow(int tagNo, String gender, LocalDate dateOfBirth, boolean isPurchased) {
        this(tagNo, gender, dateOfBirth, isPurchased, new ArrayList<Treatment>());
    }

    public Cow(int tagNo, String gender, LocalDate dateOfBirth, boolean isPurchased, ArrayList<Treatment> treatmentsReceived) {
        setTagNo(tagNo);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
        setPurchased(isPurchased);
        setTreatmentsReceived(treatmentsReceived);
    }


    public int getAge() {
        Period period = Period.between(getDateOfBirth(), LocalDate.now());
        return period.getYears();
    }

    public void printDetails() {
        System.out.println("Cow's tag number: " + getTagNo());
        System.out.println("Cow's gender: " + getGender());
        System.out.println("Cow's date of birth: " + getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Cow's age: " + getAge());
        System.out.println(isPurchased() ? "Cow is purchased" : "Cow is farm-raised");

        System.out.println("Treatments Received:");
        if (getTreatmentsReceived().size() > 0)
            System.out.println("None");
        else
            getTreatmentsReceived().forEach(treatment -> treatment.printDetails());

        System.out.println("");
    }


    public int getTagNo() {
        return tagNo;
    }

    public void setTagNo(int tagNo) {
        this.tagNo = tagNo;
    }

    public String getGender() {
        return gender;
    }
    private void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    private void setPurchased(boolean isPurchased) {
        this.isPurchased = isPurchased;
    }

    public ArrayList<Treatment> getTreatmentsReceived() {
        return treatmentsReceived;
    }

    private void setTreatmentsReceived(ArrayList<Treatment> treatmentsReceived) {
        this.treatmentsReceived = treatmentsReceived;
    }


}
