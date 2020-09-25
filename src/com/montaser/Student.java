package com.montaser;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentId;
    private ArrayList<Course> courses = new ArrayList<>();
    private int studentsCount = 1000;
    private int balance = 0;

    public Student(String firstName, String lastName, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.studentId = generateStudentId();
    }

    private String generateStudentId() {
        String stuID = year + "" + studentsCount;
        studentsCount++;
        return stuID;
    }

    public void addCourse (Course course) {
        courses.add(course);
        balance = balance + course.getCost();
    }

    private String printCourses() {
        return "courses \n Hello";
    }

    public void makePayment(int payment) {
        balance = balance - payment;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "\n"
        + studentId + "\n"
        + printCourses() + "\n"
        + "$" + balance;
    }
}
