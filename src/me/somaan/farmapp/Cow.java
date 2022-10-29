package me.somaan.farmapp;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;

public class Cow {
    private int tagNo;
    private String gender;
    private LocalDate dateOfBirth;
    private boolean purchased;
    private Collection<Treatment> treatmentsReceived;


    public Cow(int tagNo, String gender, LocalDate dateOfBirth, boolean purchased) {
        this(tagNo, gender, dateOfBirth, purchased, new ArrayList<Treatment>());
    }

    public Cow(int tagNo, String gender, LocalDate dateOfBirth, boolean purchased, Collection<Treatment> treatmentsReceived) {
        setTagNo(tagNo);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
        setPurchased(purchased);
        setTreatmentsReceived(treatmentsReceived);
    }


    public int getAge() {
        Period period = Period.between(LocalDate.now(), getDateOfBirth());
        return period.getYears();
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
        return purchased;
    }

    private void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    public Collection<Treatment> getTreatmentsReceived() {
        return treatmentsReceived;
    }

    private void setTreatmentsReceived(Collection<Treatment> treatmentsReceived) {
        this.treatmentsReceived = treatmentsReceived;
    }
}
