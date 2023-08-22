package by.itacademy.mirko.loginform;

import java.util.Arrays;

public class Students {
    public static void toString(Student[] students){
        for (Student student: students){
            System.out.println(student.getSecondName() + " " + student.getCourse());
        }
    }
    public static void toString(Student[] students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getSecondName() + " " + student.getCourse());
            }
        }
    }

}
