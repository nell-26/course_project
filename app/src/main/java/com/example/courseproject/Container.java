package com.example.courseproject;

import java.util.ArrayList;

public class Container {
    private static ArrayList<Student> students_P31 = new ArrayList<>();

    private static ArrayList<Group> groups = new ArrayList<>();

    // додаємо нового студена до списку
    public static void addStudentInP31 (Student student) {
        students_P31.add(student);
    }

    // додаємо нову групу до списку
    public static void addGroupInList (Group group) {
        groups.add(group);
    }

    // отримуємо групу по імені
    public static Group getGroupByName (String name) {
        for (Group temp : groups) {
            if (temp.getName().equals(name)) {
                return temp;
            }
        }
        return new Group();
    }

    // отримуємо групу P-31
    public static ArrayList<Student> getStudents_P31 () {
        return students_P31;
    }

    //
    public static ArrayList<String> getGroupNames () {
        ArrayList<String> names = new ArrayList<>();
        for (Group temp : groups) {
            names.add(temp.getName());
        }
        return  names;
    }
}
