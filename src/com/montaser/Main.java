package com.montaser;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Choose code for year:\n1- Freshman.\n2- Sophomore.\n3- Junior.\n4- Senior.");
        int year = scanner.nextInt();



    }
}

//    Your application should do the following:
//        Ask the user how many new students will be added to the database
//        The user should be prompted to enter the name and year for each student
//        The student should have a 5-digit unique ID, with the first number being their grade level
//        A student can enroll in the following courses:
//          History 101
//          Mathematics 101
//          English 101
//          Chemistry 101
//          Computer Science 101
//        Each course costs $600 to enroll
//        The student should be able to view their balance and pay the tuition
//        To see the status of the student, we should see their name, ID, courses enrolled, and balance