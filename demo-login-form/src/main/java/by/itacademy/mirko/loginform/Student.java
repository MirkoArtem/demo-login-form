package by.itacademy.mirko.loginform;

import java.util.Date;

public class Student {
     private static int idCounter;
     private int id = 0;
     private String firstName;
     private String secondName;
     private String thirtName;
     private String birthday;
     private String address;
     private String telNumber;
     private String faculty;
     private String course;
     private String group;

    public Student(int id, String firstName, String secondName, String thirtName, String birthday, String address, String telNumber, String faculty, String course, String group) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirtName = thirtName;
        this.birthday = birthday;
        this.address = address;
        this.telNumber = telNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.id = ++idCounter;
    }

    public Student(String secondName, String course) {
        this.secondName = secondName;
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirtName() {
        return thirtName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirtName='" + thirtName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
