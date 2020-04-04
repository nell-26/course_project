package com.example.courseproject;

import java.util.ArrayList;

public class Container {

    private static ArrayList<Student> studentsOfGroupP_31 = new ArrayList<>();
    private static ArrayList<Student> studentsOfGroupP_32 = new ArrayList<>();
    private static ArrayList<Group> groups = new ArrayList<>();


    public static void addStudentP_31InList (Student student) {
        studentsOfGroupP_31.add(student);
    }

    public static void addStudentP_32InList (Student student) {
        studentsOfGroupP_32.add(student);
    }

    public static void createGroup ( String name, String schedule) {
        groups.add(new Group(name, schedule,getStudentsByGroupName(name)));
    }

    private static ArrayList<Student> getStudentsByGroupName (String name) {
        switch (name) {
            case "P_31": {
                return studentsOfGroupP_31;
            }
            case"P_32":{
                return studentsOfGroupP_32;
            }
            default: {
                return null;
            }
        }
    }

    public static ArrayList<Group> getGroups() {
        return groups;
    }
}
