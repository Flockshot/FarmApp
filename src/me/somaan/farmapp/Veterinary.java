package me.somaan.farmapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Veterinary {
    private int vetID;
    private String gender;
    private LocalDate dateOfBirth;
    private double salary;


    public Veterinary(int vetID, String gender, LocalDate dateOfBirth) {
        this(vetID, gender, dateOfBirth, 0.0); //Assuming probation or intern vet
    }

    public Veterinary(int vetID, String gender, LocalDate dateOfBirth, double salary) {
        setVetID(vetID);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
        setSalary(salary);
    }


    public int getVetID() {
        return vetID;
    }
    private void setVetID(int vetID) {
        this.vetID = vetID;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void printDetails() {
        System.out.println("Veterinary's ID: " + getVetID());
        System.out.println("Veterinary's gender: " + getGender());
        System.out.println("Veterinary's date of birth: " + getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Veterinary's Salary: " + getSalary());
    }
}
