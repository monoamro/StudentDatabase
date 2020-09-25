package com.montaser;

public class Course {

    private String name;
    private int cost;

    public Course(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name;
    }
}
