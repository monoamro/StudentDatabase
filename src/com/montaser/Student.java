package com.montaser;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentId;
    private List<Course> courses = null;
    private int studentsCount = 1000;
    private int balance = 0;

    public Student(String firstName, String lastName, int year, String studentId) {
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
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "\n"
        + printCourses() + "\n"
        + "$" + balance;
    }

    private String printCourses() {
        return "courses \n Hello";
    }
}
