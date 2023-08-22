package by.itacademy.mirko.loginform;

public class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student("Vladimir", "Java Basic");
        Student student2 = new Student("Artem", "Java Basic");
        Student[] studentsArr = new Student[] {student1, student2};
        System.out.println(studentsArr[0]);
        System.out.println(studentsArr[1]);
    }
}
