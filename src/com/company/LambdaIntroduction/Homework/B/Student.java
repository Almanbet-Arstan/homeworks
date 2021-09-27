package com.company.LambdaIntroduction.Homework.B;

public class Student implements Testable{
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void passTest() {
        System.out.println("Student " + name + " passing test");
    }
}
