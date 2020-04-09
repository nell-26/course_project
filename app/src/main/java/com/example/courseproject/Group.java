package com.example.courseproject;

import java.util.ArrayList;

public class Group {
    private String name;
    private String schedule;
    private int nb;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<String> studentNames = new ArrayList<>();
    private ArrayList<Float> rate = new ArrayList<>();

    public Group (){}

    public Group (String name, String schedule, ArrayList<Student> students) {
        this.name = name;
        this.schedule = schedule;
        this.students = students;
        int nbCount = 0;

        for (Student student : this.students){
            this.studentNames.add(student.getName());
        }

        for (Student student : this.students){
            nbCount = nbCount + student.getNb();
        }
        this.nb = nbCount;

        for (Student student : this.students) {
            this.rate.add(student.getRate());
        }
    }

    public String getName () {return this.name;}

    public void setName (String name) {this.name = name;}

    public String getSchedule () {return this.schedule;}

    public void setSchedule (String schedule) {this.schedule = schedule;}

    public  int getNb () {return this.nb;}

    public  void setNb (int nb) {this.nb = nb;}

    public  ArrayList<Student> getStudents () {return this.students;}

    public void setStudents (ArrayList<Student> students) {this.students = students;}

    public ArrayList<String> getStudentNames () {return this.studentNames;}

    public void setStudentNames (ArrayList<String> studentNames) {this.studentNames = studentNames;}

    public ArrayList<Float> getRate () {return this.rate;}

    public void setRate (ArrayList<Float> rate) {this.rate = rate;}

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", schedule='" + schedule + '\'' +
                ", nb=" + nb +
                ", students=" + students +
                ", studentNames=" + studentNames +
                ", rate=" + rate +
                '}';
    }
}