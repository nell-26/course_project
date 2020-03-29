package com.example.courseproject;

public class Student {
    private String name;
    private String surName;
    private String birthData;
    private String number;
    private float rate;
    private int nb;

    public Student () {}

    public Student (String name, String surName, String birthData, String number, float rate, int nb) {
        this.name = name;
        this.surName = surName;
        this.birthData = birthData;
        this.number = number;
        this.rate = rate;
        this.nb = nb;
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

    public  String getBirthData () {return this.birthData;}

    public void setBirthData (String birthData) {this.birthData = birthData;}

    public String getNumber () {return this.number;}

    public void setNumber (String number) {this.number = number;}

    public float getRate () {return this.rate;}

    public void setRate (float rate) {this.rate = rate;}

    public int getNb () {return this.nb;}

    public void setNb (int nb) {this.nb = nb;}
}
