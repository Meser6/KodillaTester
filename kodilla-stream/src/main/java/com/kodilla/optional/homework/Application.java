package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Teacher teacher1 = new Teacher("Jerzy");
        Teacher teacher2 = new Teacher("Bożena");

        list.add(new Student("Kuba", teacher1));
        list.add(new Student("Gosia", teacher1));
        list.add(new Student("Beata", teacher2));
        list.add(new Student("Robek", null));
        list.add(new Student("Bartek", teacher2));
        list.add(new Student("Igor", null));

        for (Student student : list){
            System.out.println("Student " + student.getName() + ", Teacher: " + student.getTeacherName());
        }
    }
}

