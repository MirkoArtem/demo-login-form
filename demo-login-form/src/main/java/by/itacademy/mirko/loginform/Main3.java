package by.itacademy.mirko.loginform;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        //Student student1 = new Student("Ivanov", 3);
        //students.add(student1);

        students.add(new Student("Ivanov", 3));
        students.add(new Student("Petrov", 4));

        System.out.println(students);
        System.out.println(students.size());
        System.out.println(students.get(1));

        students.add(1, new Student("Sidorov", 3));
        printStudents(students);

        students.set(0, new Student("John", 5));
        printStudents(students);
    }

    public static void printStudents (ArrayList<Student> students){
        for (Student student : students){
            System.out.println(student);
        }
    }
}
