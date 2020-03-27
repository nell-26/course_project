package com.example.courseproject;

public class Student {
    private String name;
    private String surName;

    public Student () {}

    public Student (String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName () {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName () {
        return this.surName;
    }

    public void setSurName (String surName) {
        this.surName = surName;
    }
}
