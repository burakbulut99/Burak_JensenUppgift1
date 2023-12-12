package org.example;

import org.w3c.dom.ls.LSOutput;

import java.time.Year;
import java.util.Scanner;

public class AgeCalculation {

    int birthYear;

    int currentYear= Year.now().getValue();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AgeCalculation ageCalculation = new AgeCalculation();

        System.out.println("Please enter your name");

        String name = scanner.nextLine();

        System.out.println("Please enter your age");

        String age = scanner.nextLine();

        System.out.println(ageCalculation.ageCalculation(name,age));

        scanner.close();

    }

    public boolean isCountable(String age) {

        age=age.trim();

        if (!age.matches("-?\\d+")){
            System.out.println("Invalid age | Entered age is : " + age);
        }

        try {

            if (age.matches("-?\\d+")) {
                    int ageInt = Integer.parseInt(age);

                    if (ageInt > 0 && ageInt < 200) {
                        birthYear = currentYear - ageInt;
                        return true;
                    } else {
                        System.out.println("Invalid age | Entered age is : " + age);
                    }
                }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    public boolean isNameable(String name) {

        if (name != null) {
            name = name.trim();
            try {
                name=name.replace(" ","");
                if (!name.isEmpty()) {
                    if (name.matches("[a-zA-Z]+")) {
                        return true;
                    } else {
                        throw new IllegalArgumentException("Invalid characters in the name | Entered name is: " + name);
                    }
                } else {
                    throw new IllegalArgumentException("Error: Name cannot be empty");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                return false;
            }
        } else {
            System.out.println("Error: Name cannot be null");
            return false;
        }
    }

    public String ageCalculation (String name, String age){

            boolean isAgeValid = isCountable(age);

            boolean isNameValid = isNameable(name);

            if (isAgeValid && isNameValid) {
                return "Hej " + name.trim() + ", du är född år " + birthYear;
            } else if (isAgeValid) {
                return "Name is invalid";
            } else if (isNameValid) {
                return "Age is invalid";
            } else {
                return "Both age and name is invalid";
            }
        }
    }

