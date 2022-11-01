package me.somaan.farmapp;

import java.sql.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FarmMe {

    public static ArrayList<Cow> cows = new ArrayList<Cow>();
    public static ArrayList<Veterinary> vets = new ArrayList<Veterinary>();

    public static void main(String[] args) {
        menuSelection:
        while (true) {
            menu();
            int input = takeMenuInput();

            try {
                switch (input) {
                    case 1:
                        addCow();
                        break;

                    case 2:
                        deleteCow(takeTagInput());
                        break;
                    case 3:
                        getCowDetails(takeTagInput());
                        break;
                /*
                case 4:
                    addVet();
                    break;
                case 5:
                    deleteVet(takeVetIDInput());
                    break;
                case 6:
                    getVetDetails(takeVetIDInput());
                    break;
                case 7:
                    addTreatment(takeVetIDInput(), takeTagInput());
                    break;
                case 8:
                    getCowTreatment(takeTagInput());
                    break;
                case 9:
                    getCowTreatment(takeTagInput(), takeDateInput());
                    break;
                case 10:
                    listCows();
                    break;
                case 11:
                    listVet();
                    break;

                     */
                    case 12:
                        break menuSelection;


                }
            } catch (Exception e) {
                println(e.getMessage());
            }
        }
    }


    public static void addCow() {
        int tagNo = takeIntInput("Enter cow tagNo: ");
        String gender = takeGenderInput();
        LocalDate dateOfBirth = takeDateInput();
        boolean isPurchased = takeBooleanInput("Enter true if the cow is purchased, false if farm-raised: ");


        Cow cowObject = new Cow(tagNo, gender, dateOfBirth, isPurchased);

        addCow(cowObject);
    }

    //TODO: Change for arrayList
    private static void deleteCow(int tagNo) {
        cows.remove(tagNo);
    }

    private static void getCowDetails(int tagNo) {
        getCow(tagNo).printDetails();
    }


    public static void menu() {
        println("\n1. Add a new cow.");
        println("2. Delete a cow.");
        println("3. Print a cow's details.");
        println("4. Add a new vet.");
        println("5. Delete a vet.");
        println("6. Print a vet details.");
        println("7. Add a treatment.");
        println("8. Print a cow's treatments.");
        println("9. Print a cow's treatments on a given date.");
        println("10. List all cows.");
        println("11. List all vets.");
        println("12. Exit the application.\n");
    }


    private static int takeMenuInput() {
        int input;

        do
            input = takeIntInput("Enter the menu input (1-12): ");
        while (input < 1 || input > 12);

        println("");
        return input;
    }

    private static int takeTagInput() throws Exception {
        int tagNo = takeIntInput("Enter cow's tag number: ");
        if (getCow(tagNo) != null)
            return tagNo;
        throw new Exception("Invalid cow tag number.");
    }

    private static LocalDate takeDateInput() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = null;

        Scanner scanner = new Scanner(System.in);
        boolean hasError;

        do {
            hasError = false;
            try {
                print("Enter the date (dd/mm/yyyy): ");
                date = LocalDate.parse(scanner.next(), formatter);
            } catch (Exception e) {
                hasError = true;
            }
        }
        while (hasError);

        return date;
    }

    private static String takeGenderInput() {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            print("Enter gender (male or female): ");
            input = scanner.next();
        }
        while (!(input.equalsIgnoreCase("male") || input.equalsIgnoreCase("female")));

        return input;
    }

    private static boolean takeBooleanInput(String inputPrompt) {
        Scanner scanner = new Scanner(System.in);
        boolean input = false;
        boolean hasError;
        do {
            hasError = false;

            print(inputPrompt);
            if (scanner.hasNextBoolean())
                input = scanner.nextBoolean();
            else {
                println("Please enter true or false.");
                scanner.next();
                hasError = true;
            }
        }
        while (hasError);

        return input;
    }

    private static int takeIntInput(String inputPrompt) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean hasError;
        do {
            hasError = false;

            print(inputPrompt);
            if (scanner.hasNextInt())
                input = scanner.nextInt();
            else {
                println("Please enter an int.");
                scanner.next();
                hasError = true;
            }
        }
        while (hasError);

        return input;
    }

    public static void print(String toPrint) {
        System.out.print(toPrint);
    }

    public static void println(String toPrint) {
        System.out.println(toPrint);
    }


    public static Cow getCow(int tagNo) {
        for (Cow cow : cows)
            if (cow.getTagNo() == tagNo)
                return cow;
        return null;
    }

    public static Veterinary getVet(int vetID) {
        for (Veterinary vet : vets)
            if (vet.getVetID() == vetID)
                return vet;
        return null;
    }

    private static void addCow(Cow cowObject) {
        cows.add(cowObject);
    }

    private static void addVet(Veterinary vetObject) {
        vets.add(vetObject);
    }

}