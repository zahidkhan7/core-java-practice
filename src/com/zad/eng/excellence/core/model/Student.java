package com.zad.eng.excellence.core.model;

public class Student implements Comparable<Student> {

    private int studentId;
    private String studentName;
    private int age;
    private double grade;

    public Student(int id, String name, int age, double grade) {
        this.studentId = id;
        this.studentName = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student student) {
        return this.getStudentId() > student.getStudentId() ? 1 : -1;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return "Student ID: " + this.studentId + ": Student Name: "
                + this.studentName;
    }

}
