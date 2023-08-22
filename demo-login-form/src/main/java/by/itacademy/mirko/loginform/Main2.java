package by.itacademy.mirko.loginform;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student("Vladimir", 2);
        Student student2 = new Student("Artem", 5);
        Student[] studentsArr = {student1, student2};
        Students.toString(studentsArr);
        Students.toString(studentsArr, 2);

    }
}
